package pres.hjc.entitymanage.service;

import pres.hjc.entitymanage.entity.UserPojo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    UserPojo user_login(String uid, String password, HttpServletRequest request, HttpServletResponse response);
    void logout(HttpServletRequest request,HttpServletResponse response);
}
