package pres.hjc.entitymanage.mapping;

import org.apache.ibatis.annotations.Mapper;
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
@Mapper
public interface QuestionMapping {
    List<QuestionPojo> queryQuestionId(@Param("subid") Integer subid[], @Param("count") int count);
}
