package exercise;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by shaan on 5/7/17.
 */
@Repository
public class Tea {
  String teaName;

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }
}
