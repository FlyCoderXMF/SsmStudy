import com.xmf.pojo.Books;
import com.xmf.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books.getBookId());
        }
    }
}
