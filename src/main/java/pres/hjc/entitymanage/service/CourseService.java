package pres.hjc.entitymanage.service;

import pres.hjc.entitymanage.entity.CoursePojo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public interface CourseService {
    List<CoursePojo> queryAllCourse();
}
