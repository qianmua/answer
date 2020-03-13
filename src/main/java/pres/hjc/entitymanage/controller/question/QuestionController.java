package pres.hjc.entitymanage.controller.question;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pres.hjc.entitymanage.entity.QuestionPojo;
import pres.hjc.entitymanage.service.impl.QuestionServiceImpl;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: HJC
 * @date: 2020/3/13
 * @time: 21:05
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Api( tags = "选题接口")
@RequestMapping("/tq")
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;

    @RequestMapping("getq")
    @ResponseBody
    @ApiOperation("随机得到题")
    public List<QuestionPojo> getquestion(Model model,
                                          Integer[] lq,
                                          Integer count){
        List<QuestionPojo> list = null;
        //111
        lq = new Integer[]{402,401,403,501};
        count = 50;
        //111
        list = questionService.queryQuestionId(lq,count);
        list.forEach(System.out::println);
        return list;
    }
}
