package exercise;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Created by shaan on 5/7/17.
 */
@Controller
public class Resturant {
        HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public static void main(String[] args){


          ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
       /* HotDrink hotDrink = (HotDrink) applicationContext.getBean("tea");
        hotDrink.prepareHotDrink();*/
         /* HotDrink hotDrink1 = (HotDrink) applicationContext.getBean("expreTea");
        hotDrink1.prepareHotDrink();*/
       /* Complex complex = (Complex) applicationContext.getBean("complexobject");
          System.out.println( " List elements are :" +complex.getList());
          System.out.println(" Set elements are :"+complex.getSet() );
          System.out.println(" Map elements are :"+complex.getMap() );*/
          HotDrink hotDrink = (HotDrink) applicationContext.getBean("teaResturant");
          hotDrink.prepareHotDrink();
      }

}
