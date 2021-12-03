import com.offcn.bean.*;
import com.offcn.dao.PersonMapper;
import com.offcn.bean.Person;
import com.offcn.dao.PersonMapper;
import com.offcn.dao.ProductMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

public class MybatisTest {
    private SqlSession sqlSession;
    private PersonMapper personMapper;
    private ProductMapper productMapper;

    @Before
    public  void before() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatiscfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        personMapper = sqlSession.getMapper(PersonMapper.class);
        productMapper = sqlSession.getMapper(ProductMapper.class);
    }


    @After
    public void affer(){
        sqlSession.commit();
        sqlSession.close();
    }


    /**
     *新增用户
     */
    @Test
    public  void test1(){
       // PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person=new Person();
        person.setPname("孙悟空");
        person.setAge(30);
        person.setPaddress("北京");
        person.setBirthday(new Date());
        personMapper.insert(person);
        System.out.println("新建数据成功");
    }

    /**
     * 查询用户
     */

    @Test
    private  void test2(){
        Person person=personMapper.selectByPrimaryKey(3);
        System.out.println(person);
        person.setPname("李四");
        person.setAge(12);
        personMapper.updateByPrimaryKey(person);

    }


    /**
     * 删除用户
     */
    /**
    @Test
    public void test3(){
        personMapper.deleteByPrimaryKey(3);
        System.out.println("删除成功");
    }
    */

    /**
     * 查询销售量大于40的商品信息
     */

    /**
    @Test
    public void test4(){
        PersonExample personExample=new PersonExample();
        ProductExample.Criteria
                criteria=ProductExample.createCriteria();
        criteria.andProductIdGreaterThan(40);
        List<Product> products=productMapper.selectByExample(productExample);
        products.forEach(Sysout.out::println);

    }
    */

}
