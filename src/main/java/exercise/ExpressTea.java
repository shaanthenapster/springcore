package exercise;

/**
 * Created by shaan on 5/7/17.
 */
public class ExpressTea implements HotDrink{
   String expressTeaname;

    public String getExpressTeaname() {
        return expressTeaname;
    }

    public void setExpressTeaname(String expressTeaname) {
        this.expressTeaname = expressTeaname;
    }

    @Override
    public void prepareHotDrink()
    {
        System.out.println("Express Tea Name is :" + getExpressTeaname());
    }
}
