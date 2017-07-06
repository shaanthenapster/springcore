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
        Complex complex = (Complex) applicationContext.getBean("complexobject");
          System.out.println( " List elements are :" +complex.getList());
          System.out.println(" Set elements are :"+complex.getSet() );
          System.out.println(" Map elements are :"+complex.getMap() );

      }

}
