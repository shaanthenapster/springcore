package exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shaan on 5/7/17.
 */
public class Resturant {
   HotDrink hotDrink;

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public static void main(String[] args)
      {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        HotDrink hotDrink = (HotDrink) applicationContext.getBean("tea");
        hotDrink.prepareHotDrink();
          HotDrink hotDrink1 = (HotDrink) applicationContext.getBean("expreTea");
        hotDrink1.prepareHotDrink();
      }

}
