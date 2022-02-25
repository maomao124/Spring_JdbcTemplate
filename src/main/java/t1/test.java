package t1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Project name(项目名称)：Spring_JdbcTemplate
 * Package(包名): t1
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/25
 * Time(创建时间)： 20:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentDaoImpl studentDaoImpl = context.getBean("studentDaoImpl", StudentDaoImpl.class);
        List<Student> studentList = studentDaoImpl.getStudentList();
        for (Student student : studentList)
        {
            System.out.print(student);
        }

        System.out.println();
        System.out.println(studentDaoImpl.getStudent(4L));
    }
}
