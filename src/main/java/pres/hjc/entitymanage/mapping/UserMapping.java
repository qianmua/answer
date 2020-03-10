package pres.hjc.entitymanage.mapping;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pres.hjc.entitymanage.entity.UserPojo;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 15:11
 * To change this template use File | Settings | File Templates.
 */
@Mapper
public interface UserMapping {

    @Select("SELECT userid, username, password, userno, userclass, classroomid, tel, islock, bak, isdel" +
            " FROM userbase " +
            "WHERE UserID = #{uid} and PassWord = #{password} ")
    UserPojo user_login(@Param("uid") String uid, @Param("password") String password);
}
