package exercise;

import org.springframework.stereotype.Repository;

/**
 * Created by shaan on 5/7/17.
 */
@Repository
public class ExpressTea {
   String expressTeaname;

    public String getExpressTeaname() {
        return expressTeaname;
    }

    public void setExpressTeaname(String expressTeaname) {
        this.expressTeaname = expressTeaname;
    }


    public void prepareHotDrink()
    {
        System.out.println("Express Tea Name is :" + getExpressTeaname());
    }
}
