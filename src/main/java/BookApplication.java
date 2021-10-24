import com.sda.spring.beans.BookBean;
import com.sda.spring.configurations.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    applicationContext.register(ApplicationConfiguration.class);
    applicationContext.refresh();

    BookBean bookBean = applicationContext.getBean(BookBean.class);
    System.out.println(bookBean.getBookDetails());
  }
}
