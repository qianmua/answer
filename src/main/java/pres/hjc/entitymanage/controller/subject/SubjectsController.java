package pres.hjc.entitymanage.controller.subject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/3/14
 * @time 20:20
 */
@Controller
@RequestMapping("/sub")
public class SubjectsController {

    @RequestMapping("choose")
    public String choose(){
        return "";
    }
}
