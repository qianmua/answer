package pres.hjc.entitymanage.mapping;

import org.apache.ibatis.annotations.*;
import pres.hjc.entitymanage.entity.GetPaiPojo;
import pres.hjc.entitymanage.entity.StatisticsPojo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/17
 * Time: 17:52
 * To change this template use File | Settings | File Templates.
 */
@Mapper
public interface StatisticsMapping {
    @Insert("INSERT INTO t_statistics(allTopic, correctAnswer, errorAnswer, fraction, uid, startTime, endTime, answerNumber, Subject, sortId, allAnswer, returnJson)" +
            " VALUES (#{allTopic} ,#{correctAnswer } ,#{errorAnswer} ,#{fraction} ,#{uid} ,#{startTime} ,#{endTime} ," +
            " #{answerNumber} ,#{Subject} ,#{sortId} ,#{allAnswer} ,#{returnJson} )")
    @Options( useGeneratedKeys = true , keyProperty = "tid" , keyColumn = "tid")
    int statisInsert(StatisticsPojo statisticsPojo);

    @Select("SELECT tid, allTopic, correctAnswer, errorAnswer, fraction, uid, startTime, endTime, answerNumber, Subject, sortId, allAnswer, returnJson" +
            " FROM t_statistics")
    List<StatisticsPojo> queryStatic();

    @Select("SELECT tid, allTopic, correctAnswer, errorAnswer, fraction, uid, startTime, endTime, answerNumber, Subject, sortId, allAnswer, returnJson" +
            " FROM t_statistics WHERE uid = #{uid} ")
    List<StatisticsPojo> queryStaticById(@Param("uid") String uid);

    List<GetPaiPojo> query_pai();
}
