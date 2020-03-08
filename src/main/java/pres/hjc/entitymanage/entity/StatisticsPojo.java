package pres.hjc.entitymanage.entity;


import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/17
 * Time: 17:46
 * To change this template use File | Settings | File Templates.
 */
@Component
@Data
@ApiModel
public class StatisticsPojo {
    private int tid;
    private String allTopic;
    private String correctAnswer;
    private String errorAnswer;
    private int fraction;
    private String uid;
    private String startTime;
    private String endTime;
    private int answerNumber;
    private String subject;
    private String sortId;
    private String allAnswer;
    private String returnJson;
    private UserPojo userPojo;
}
