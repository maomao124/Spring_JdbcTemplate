package t1;

/**
 * Project name(项目名称)：Spring_JdbcTemplate
 * Package(包名): t1
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/25
 * Time(创建时间)： 19:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class Student
{
    private Long no;
    private String name;
    private String sex;
    private Integer age;

    /**
     * Instantiates a new Student.
     */
    public Student()
    {
    }

    /**
     * Instantiates a new Student.
     *
     * @param no   the no
     * @param name the name
     * @param sex  the sex
     * @param age  the age
     */
    public Student(long no, String name, String sex, int age)
    {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * Gets no.
     *
     * @return the no
     */
    public long getNo()
    {
        return no;
    }

    /**
     * Sets no.
     *
     * @param no the no
     */
    public void setNo(long no)
    {
        this.no = no;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex()
    {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("no：").append(no).append('\t');
        stringbuilder.append("name：").append(name).append('\t');
        stringbuilder.append("sex：").append(sex).append('\t');
        stringbuilder.append("age：").append(age).append('\n');
        return stringbuilder.toString();
    }
}
