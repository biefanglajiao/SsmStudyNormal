import Service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSmTest {
    @Test
    public void  testspring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
        BookService bookServiceImpl = applicationContext.getBean("bookServiceImpl", BookService.class);
//        如果bean的名称以大写开头，在getbean()里面使用必须将首字母换小写
        System.out.println(bookServiceImpl.findbyid(1));
    }
}
