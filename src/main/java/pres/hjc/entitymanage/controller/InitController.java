package pres.hjc.entitymanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pres.hjc.entitymanage.constant.PublicConstant;
import pres.hjc.entitymanage.constant.PublicInterface;
import pres.hjc.entitymanage.tools.MD5Utils;

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

    /*@Autowired
    private MD5Utils md5Utils;
    */
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("suffer", PublicInterface.GET_SUFFER);
//        System.out.println(md5Utils.getMD5("666", PublicConstant.PASSWORD_SLAT));
        return "index";
    }
}
