import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test1(){
//获取spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//从容器中获取
        ZI zi=(ZI) applicationContext.getBean("zi");
        zi.ai();
        //Person person=(Person) applicationContext.getBean("person");
        //person.eat();
    }


    @Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);
    }



    }

