package pres.hjc.entitymanage.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
@Data
@Component
@ApiModel
public class CoursePojo {
    private int courseNO;
    private String courseName;
    private  int marks;
}
