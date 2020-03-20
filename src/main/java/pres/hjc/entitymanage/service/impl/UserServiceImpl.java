package pres.hjc.entitymanage.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import pres.hjc.entitymanage.constant.PublicConstant;
import pres.hjc.entitymanage.entity.UserPojo;
import pres.hjc.entitymanage.mapping.UserMapping;
import pres.hjc.entitymanage.service.UserService;
import pres.hjc.entitymanage.tools.CookieUtils;
import pres.hjc.entitymanage.tools.MD5Utils;
import pres.hjc.entitymanage.tools.PublicMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * @Author: HJC
 * Date: 2019/11/14
 * Time: 22:07
 * To change this template use File | Settings | File Templates.
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapping userMapping;
    @Autowired
    private MD5Utils md5Utils;
    @Autowired
    private RedisTemplate<Object, UserPojo> redisTemplate;

    @Override
    public UserPojo user_login(String uid, String password, HttpServletRequest request, HttpServletResponse response) {
        log.info("get login.");
        String token = CookieUtils.getUid(request,PublicConstant.TOKEN_NAME);
        UserPojo userPojo = null;
        password = md5Utils.getMD5(password,PublicConstant.PASSWORD_SLAT);
        if (token == null){
            userPojo = userMapping.user_login(uid,password);
        }else {
            userPojo = redisTemplate.opsForValue().get(token);
            if (userPojo == null){
                userPojo = userMapping.user_login(uid,password);
            }else {
                redisTemplate.delete(token);
            }
        }
        //flush
        if (userPojo != null){
            log.info("user -> redis");
            token = PublicMethod.getUUID();
            redisTemplate.opsForValue().set(token, userPojo);
            request.getSession().setAttribute(PublicConstant.SESSION_NAME,userPojo);
            CookieUtils.addCookie(response,PublicConstant.TOKEN_NAME,token,60*60*24*7);
        }
        return userPojo;
    }

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response){

    }
}
