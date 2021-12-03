import com.offcn.bean.Person;
import com.offcn.bean.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import  java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    /**
     *增加用户
     **/
@Test

    public void test1( ) throws IOException {
        //读取mybatis的配置文件
       InputStream inputStream = Resources.getResourceAsStream("mybatiscfg.xml");
        //构建sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlSession对象执行sql语句
        SqlSession sqlSession =  sqlSessionFactory.openSession();
        //执行sql语句
        //设置参数
        Person person=new Person();
        person.setId(4);
        person.setPname("张三");
        person.setAge(21);
        person.setPaddress("仙桃");
        person.setBirthday(new Date());
        sqlSession.insert("com.offcn.dao.PersonMapper.addPerson",person);
        //提交事务
        sqlSession.commit();
        //关闭连接，释放资源
        sqlSession.close();
    System.out.println("添加成功");
    }


    /**
    *修改用户
    **/
    @Test
    public  void  test2() throws IOException{
        InputStream inputStream = Resources.getResourceAsStream("mybatiscfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Person person=new Person();
        person.setId(4);
        person.setPname("张三");
        person.setAge(14);
        person.setPaddress("武汉");
        person.setBirthday(new Date());
        sqlSession.insert("com.offcn.dao.PersonMapper.updatePerson",person);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("修改成功");

    }

    /**
     *删除用户
    **/
    @Test
    public  void test3() throws  IOException{
        InputStream inputStream = Resources.getResourceAsStream("mybatiscfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
             /**  Person person=new Person();
              person.setId(1);
             **/
        sqlSession.insert("com.offcn.dao.PersonMapper.deletePerson",4);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("删除成功");
    }

    /**
     *查询用户信息
     **/

    @Test
    public  void test4() throws  IOException{
        InputStream inputStream = Resources.getResourceAsStream("mybatiscfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Person person = sqlSession.selectOne("com.offcn.dao.PersonMapper.selectPersonById",3);
        System.out.println("查询结果：");
        System.out.println(person);
        sqlSession.commit();
        sqlSession.close();
    }


    //条件获取商品信息
    @Test
    public void test5() throws  IOException{
        InputStream inputStream = Resources.getResourceAsStream("mybatiscfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Product product=new Product();
        //product.setProductName("果");
        product.setCondition("PRICE");
        List<Product> products = sqlSession.selectList("com.offcn.dao.ProductMapper.findProductByCondition",product);
        products.forEach(System.out::println);
        sqlSession.commit();
        sqlSession.close();
    }

}
