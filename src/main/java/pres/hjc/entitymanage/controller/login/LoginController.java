package pres.hjc.entitymanage.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/8
 * Time: 13:18
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/lg")
public class LoginController {

    @PostMapping("login")
    public String index(){

        return "index";
    }
}
