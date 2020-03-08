package pres.hjc.entitymanage.service;

import org.apache.ibatis.annotations.Param;
import pres.hjc.entitymanage.entity.UserPojo;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    UserPojo user_login(@Param("uid") String uid, @Param("password") String password);
}
