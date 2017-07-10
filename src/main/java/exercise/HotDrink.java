package exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by shaan on 5/7/17.
 */
@Component
public class HotDrink {
@Autowired
    Tea tea;

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
