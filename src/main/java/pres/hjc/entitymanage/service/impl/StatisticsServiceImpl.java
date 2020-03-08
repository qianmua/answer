package pres.hjc.entitymanage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.hjc.entitymanage.entity.GetPaiPojo;
import pres.hjc.entitymanage.entity.StatisticsPojo;
import pres.hjc.entitymanage.mapping.StatisticsMapping;
import pres.hjc.entitymanage.service.StatisticsService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/17
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    private StatisticsMapping statisticsMapping;

    @Override
    public int statisInsert(StatisticsPojo statisticsProj) {
        return statisticsMapping.statisInsert(statisticsProj);
    }

    @Override
    public List<StatisticsPojo> queryStatic() {
        return statisticsMapping.queryStatic();
    }

    @Override
    public List<StatisticsPojo> queryStaticById(String uid) {
        return statisticsMapping.queryStaticById(uid);
    }

    @Override
    public List<GetPaiPojo> query_pai() {
        return statisticsMapping.query_pai();
    }
}
