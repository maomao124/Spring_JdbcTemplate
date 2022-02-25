package t1;

import java.util.List;

/**
 * Project name(项目名称)：Spring_JdbcTemplate
 * Package(包名): t1
 * Interface(接口名): StudentDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/25
 * Time(创建时间)： 19:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public interface StudentDao
{
    /**
     * Insert int.
     *
     * @param student the student
     * @return the int
     */
    public int insert(Student student);

    /**
     * Update int.
     *
     * @param student the student
     * @return the int
     */
    public int update(Student student);

    /**
     * Delete int.
     *
     * @param student the student
     * @return the int
     */
    public int delete(Student student);

    /**
     * Count int.
     *
     * @return the int
     */
    public int count();

    /**
     * Gets student list.
     *
     * @return the student list
     */
    public List<Student> getStudentList();

    /**
     * Gets student.
     *
     * @param no the no
     * @return the student
     */
    public Student getStudent(Long no);
}
