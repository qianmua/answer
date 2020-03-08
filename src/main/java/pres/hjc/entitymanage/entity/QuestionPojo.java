package pres.hjc.entitymanage.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/15
 * Time: 0:15
 * To change this template use File | Settings | File Templates.
 */
@Data
@Component
@ApiModel
public class QuestionPojo {
    private int question_id;
    private String question_text;
    private String answer_a;
    private String answer_b;
    private String answer_c;
    private String answer_d;
    private String question_answer;
    private int question_sub;
}
