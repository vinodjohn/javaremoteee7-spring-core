import com.sda.spring.beans.MyBean;
import com.sda.spring.beans.SecondName;
import com.sda.spring.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    applicationContext.register(ApplicationConfiguration.class);
    applicationContext.refresh();

    MyBean myBean = applicationContext.getBean(MyBean.class);
    System.out.println(myBean.sayHello());

    myBean.setName(new SecondName());
    System.out.println(myBean.sayHello());
  }
}
