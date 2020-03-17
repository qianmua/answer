package pres.hjc.entitymanage.controller.question;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pres.hjc.entitymanage.constant.PublicConstant;
import pres.hjc.entitymanage.entity.QuestionPojo;
import pres.hjc.entitymanage.service.impl.QuestionServiceImpl;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @date 2020/3/13
 * @time 21:05
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Api( tags = "选题接口")
@RequestMapping("/tq")
@Slf4j
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;

    /**
     * 拿到题目
     * @param model
     * @param lq 题目
     * @param count 题目数量
     * @return lq
     */
    @RequestMapping("getq")
    @ApiOperation("随机得到题")
    public String getquestion(Model model,
                              Integer[] lq,
                              Integer count){
        List<QuestionPojo> list = null;
        //111
        /*for (Integer integer : lq) {
            System.out.println(integer);
        }*/
//        System.out.println(count);
        /*lq = new Integer[]{402,401,403,501};
        count = 20;*/
        //111
        list = questionService.queryQuestionId(lq,count);
        /*list.forEach(System.out::println);*/
        model.addAttribute(PublicConstant.TABLE_QUESTION,list);
        /*model.addAttribute(PublicConstant.TABLE_COUNT,count);*/
        return "html/survey";
    }
}
