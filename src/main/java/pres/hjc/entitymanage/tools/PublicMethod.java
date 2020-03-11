package pres.hjc.entitymanage.tools;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/8
 * Time: 13:10
 * To change this template use File | Settings | File Templates.
 */
@Component
public class PublicMethod {

    /**
     * getUUID
     * @return
     */
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().replace("'-","");
        return uuid;
    }

}
