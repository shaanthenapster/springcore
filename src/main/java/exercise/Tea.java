package exercise;

/**
 * Created by shaan on 5/7/17.
 */
public class Tea implements HotDrink{
  String teaName;

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    @Override
 public void prepareHotDrink()
 {
    System.out.println("Tea name is :" + getTeaName());
 }
}
