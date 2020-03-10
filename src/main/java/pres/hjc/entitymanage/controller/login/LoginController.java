package pres.hjc.entitymanage.controller.login;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pres.hjc.entitymanage.constant.PublicConstant;
import pres.hjc.entitymanage.service.impl.UserServiceImpl;

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
@Api( tags = "登录相关接口")
@RequestMapping("/lg")
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * login
     * @param name
     * @param password
     * @param request
     * @param response
     * @param model
     * @return
     */
    @ApiOperation("登录接口")
    @PostMapping("login")
    public String index(@RequestParam("username")String name,
                        @RequestParam("password")String password,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        Model model){

        if (name != null && password != null){
            userService.user_login(name,password,request,response);
        }else {
            model.addAttribute(PublicConstant.MODEL_MESSAGE,"账号输入异常");
        }
        return "index";
    }

    /**
     * logout
     * @param request
     * @param response
     * @param model
     * @return
     */
    @GetMapping("logout")
    @ApiOperation("登出接口")
    public String logout(HttpServletRequest request,
                         HttpServletResponse response,
                         Model model){

        return "index";
    }
}
