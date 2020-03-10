package pres.hjc.entitymanage.mapping;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

    @Select({
            "<script>",
            "select question_id, question_text, answer_a, answer_b, answer_c, answer_d, question_answer, question_sub " +
                    "FROM t_question " +
                    "where question_sub in",
                "<foreach item='id' collection='subid' open='(' separator=',' close=')' >" ,
                    "#{id}" ,
                "</foreach>" ,
                    "ORDER BY RAND() limit #{count}",
            "</script>"
    })
    List<QuestionPojo> queryQuestionId(@Param("subid") Integer subid[], @Param("count") int count);
}
