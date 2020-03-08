package pres.hjc.entitymanage.entity;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/11/14
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
public class CoursePojo {
    private int courseNO;
    private String courseName;
    private  int marks;

    @Override
    public String toString() {
        return "CoursePojo{" +
                "courseNO=" + courseNO +
                ", courseName='" + courseName + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getCourseNO() {
        return courseNO;
    }

    public void setCourseNO(int courseNO) {
        this.courseNO = courseNO;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
