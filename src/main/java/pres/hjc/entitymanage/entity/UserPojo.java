package pres.hjc.entitymanage.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty("用户ID")
    private String userId;
    @ApiModelProperty("姓名")
    private String userName;
    @ApiModelProperty("密码")
    private String passWord;
    @ApiModelProperty("编号")
    private String userNo;
    @ApiModelProperty("班级")
    private String userClass;
    @ApiModelProperty("班级ID")
    private String classroomID;
    @ApiModelProperty("联系方式")
    private String tel;
    private String isLock;
    private String bak;
    private String isDel;

}
