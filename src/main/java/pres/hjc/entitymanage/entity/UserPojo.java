package pres.hjc.entitymanage.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/8
 * Time: 13:00
 * To change this template use File | Settings | File Templates.
 */
@Component
@Data
@ApiModel
public class UserPojo {

    private String userId;
    private String userName;
    private String passWord;
    private String userNo;
    private String userClass;
    private String classroomID;
    private String tel;
    private String isLock;
    private String bak;
    private String isDel;
}
