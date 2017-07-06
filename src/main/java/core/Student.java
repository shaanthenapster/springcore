package core;

import org.springframework.stereotype.Component;

/**
 * Created by shaan on 29/6/17.
 */

public class Student {

    private Streamm streamm;

    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Streamm getStreamm() {
        return streamm;
    }

    public void setStreamm(Streamm streamm) {
        this.streamm = streamm;
    }

    private String name;
    void display()
    {
        System.out.println(id + " "+name);
        streamm.Sdisplay();
    }


}
