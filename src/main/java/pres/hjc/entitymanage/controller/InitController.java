package pres.hjc.entitymanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pres.hjc.entitymanage.constant.PublicInterface;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/8
 * Time: 13:17
 * To change this template use File | Settings | File Templates.
 */
@Controller
//@RequestMapping("/init")
public class InitController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("suffer", PublicInterface.GET_SUFFER);
        return "index";
    }
}
