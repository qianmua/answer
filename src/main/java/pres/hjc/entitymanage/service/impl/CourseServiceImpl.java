package pres.hjc.entitymanage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.hjc.entitymanage.entity.CoursePojo;
import pres.hjc.entitymanage.mapping.CourseMapping;
import pres.hjc.entitymanage.service.CourseService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapping courseMapping;
    @Override
    public List<CoursePojo> queryAllCourse() {
        return courseMapping.queryAllCourse();
    }
}
