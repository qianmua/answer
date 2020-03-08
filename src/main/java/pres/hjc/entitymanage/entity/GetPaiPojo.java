package pres.hjc.entitymanage.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/12/27
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
@Component
@ApiModel
@Data
public class GetPaiPojo {
    private String userName;
    private String sumnum;
}
