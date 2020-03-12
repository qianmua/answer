package pres.hjc.entitymanage.controller.html;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pres.hjc.entitymanage.constant.PublicConstant;
import pres.hjc.entitymanage.constant.PublicInterface;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/8
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Api( tags = "页面转发接口")
@RequestMapping("/html")
public class ForwardController {

    private static final String PAGE_PUBLIC_SUFFER = PublicInterface.GET_SUFFER;

    @RequestMapping("rg" + PAGE_PUBLIC_SUFFER)
    public String register(){return "html/register";}

    @GetMapping("sg" + PAGE_PUBLIC_SUFFER)
    public String signup(){return "html/signup";}

    @GetMapping("lg" + PAGE_PUBLIC_SUFFER)
    public String login(){return "html/login";}

    @GetMapping("sr" + PAGE_PUBLIC_SUFFER)
    public String survey(){return "html/survey";}

    @GetMapping("al" + PAGE_PUBLIC_SUFFER)
    public String application() {return "html/application";}

    @GetMapping("gh" + PAGE_PUBLIC_SUFFER)
    public String guchar(){
        return "html/guchar";
    }
}
