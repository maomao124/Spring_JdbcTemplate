package t1;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project name(项目名称)：Spring_JdbcTemplate
 * Package(包名): t1
 * Class(类名): StudentDaoImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/25
 * Time(创建时间)： 19:35
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Repository("studentDaoImpl")
public class StudentDaoImpl implements StudentDao
{
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student)
    {
        String sql = "INSERT into `information`  VALUES(?,?,?,?);";
        int update = jdbcTemplate.update(sql, student.getNo(), student.getName(), student.getSex(), student.getAge());
        return update;
    }

    @Override
    public int update(Student student)
    {
        return 0;
    }

    @Override
    public int delete(Student student)
    {
        return 0;
    }

    @Override
    public int count()
    {
        return 0;
    }

    @Override
    public List<Student> getStudentList()
    {
        String sql = "SELECT * FROM `information`";
        List<Student> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return list;
    }

    @Override
    public Student getStudent(Long no)
    {
        String sql = "SELECT * FROM `information` where no=?";
        Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), no);
        return student;
    }
}
