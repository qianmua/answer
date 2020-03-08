package pres.hjc.entitymanage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.hjc.entitymanage.entity.UserPojo;
import pres.hjc.entitymanage.mapping.UserMapping;
import pres.hjc.entitymanage.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:07
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapping userMapping;

    @Override
    public UserPojo user_login(String uid, String password, HttpServletRequest request, HttpServletResponse response) {
        return userMapping.user_login(uid,password);
    }
}
