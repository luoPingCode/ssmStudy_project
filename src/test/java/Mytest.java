import com.lp.pojo.Books;
import com.lp.service.BookService;
import com.lp.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest extends Thread {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = (BookServiceImpl) context.getBean("BookServiceImpl");
        for (Books books:bookServiceImpl.queryAllBooks()) {
            System.out.println(books);
        }
    }
//    @Test
//    public void testThread(){
//        int num = 1;
//        while (true) {
//            try {
//                Thread.sleep(1000);
//                System.out.println("喵喵，我是小喵---" + num + "次");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            num++;
//            if (num == 80){
//                break;
//            }
//        }
//        System.out.println("线程结束");
//    }
}
