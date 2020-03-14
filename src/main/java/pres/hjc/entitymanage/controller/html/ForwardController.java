package pres.hjc.entitymanage.controller.html;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pres.hjc.entitymanage.constant.PublicConstant;
import pres.hjc.entitymanage.constant.PublicInterface;
import pres.hjc.entitymanage.entity.CoursePojo;
import pres.hjc.entitymanage.service.impl.CourseServiceImpl;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/8
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Slf4j
@Api( tags = "页面转发接口")
@RequestMapping("/html")
public class ForwardController {

    @Autowired
    private CourseServiceImpl courseService;

    private static final String PAGE_PUBLIC_SUFFER = PublicInterface.GET_SUFFER;

    @RequestMapping("rg" + PAGE_PUBLIC_SUFFER)
    public String register(Model model){
        log.info(" get subject.");
        List<CoursePojo> list = courseService.queryAllCourse();
        model.addAttribute(PublicConstant.TABLE_COURSE,list);
        return "html/register";
    }

    @GetMapping("sg" + PAGE_PUBLIC_SUFFER)
    public String signup(){return "html/signup";}

    @GetMapping("lg" + PAGE_PUBLIC_SUFFER)
    public String login(){return "html/login";}

    @GetMapping("sr" + PAGE_PUBLIC_SUFFER)
    public String survey(){return "html/survey";}

    @GetMapping("al" + PAGE_PUBLIC_SUFFER)
    public String application() {return "html/application";}

    @RequestMapping("index" + PAGE_PUBLIC_SUFFER)
    public String index(){return "index";}

    @GetMapping("gh" + PAGE_PUBLIC_SUFFER)
    public String guchar(){
        return "html/guchar";
    }
}
