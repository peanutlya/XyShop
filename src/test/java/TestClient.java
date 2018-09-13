import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ac.getBean("sqlSessionFactory");;
    @Test
    public void test(){
        
    }
}
