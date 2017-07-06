package exercise;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shaan on 5/7/17.
 */
public class HotDrink {
    @Autowired
    Tea tea;

    public HotDrink(Tea tea) {
        this.tea = tea;
    }

    public HotDrink() {
    }

    public Tea getTea() {
        return tea;
    }

    public void setTea(Tea tea) {
        this.tea = tea;
    }
    public void prepareHotDrink()
    {
        System.out.println("Tea name is :" + tea.getTeaName());}
}
