package pres.hjc.entitymanage.service;

import org.apache.ibatis.annotations.Param;
import pres.hjc.entitymanage.entity.QuestionPojo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 15:11
 * To change this template use File | Settings | File Templates.
 */
public interface QuestionService {
    List<QuestionPojo> queryQuestionId(@Param("subid") Integer subid[], @Param("count") int count);
}
