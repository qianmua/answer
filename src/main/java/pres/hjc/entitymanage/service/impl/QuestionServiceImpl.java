package pres.hjc.entitymanage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.hjc.entitymanage.entity.QuestionPojo;
import pres.hjc.entitymanage.mapping.QuestionMapping;
import pres.hjc.entitymanage.service.QuestionService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapping questionMapping;


    @Override
    public List<QuestionPojo> queryQuestionId(Integer[] subid, int count) {
        return questionMapping.queryQuestionId(subid,count);
    }
}
