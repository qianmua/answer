package pres.hjc.entitymanage.controller.login;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public String index(@RequestParam("name")String name,
                        @RequestParam("password")String password,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        Model model){

        return "index";
    }
}
