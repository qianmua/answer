package pres.hjc.entitymanage.tools;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/8
 * Time: 13:09
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MD5Utils {

    /**
     * getMD5
     * @param password
     * @param slat
     * @return
     */
    public String getMD5(String password, String slat){
        String base = password + "/" + slat;
        String md5password = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5password;
    }
}
