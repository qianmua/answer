package pres.hjc.entitymanage.service;

import org.apache.ibatis.annotations.Param;
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
public interface StatisticsService {
    int statisInsert(StatisticsPojo statisticsProj);
    List<StatisticsPojo> queryStatic();
    List<StatisticsPojo> queryStaticById(@Param("uid") String uid);
    List<GetPaiPojo> query_pai();
}
