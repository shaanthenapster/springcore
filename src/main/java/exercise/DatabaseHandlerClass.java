package exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shaan on 5/7/17.
 */
public class DatabaseHandlerClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Database database = applicationContext.getBean("database",Database.class);
        database.Display();

    }
}
