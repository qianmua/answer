package pres.hjc.entitymanage.mapping;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pres.hjc.entitymanage.entity.CoursePojo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
@Mapper
public interface CourseMapping {
    @Select("SELECT courseNO, courseName, marks FROM t_course")
    List<CoursePojo> queryAllCourse();
}
