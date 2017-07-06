package exercise;

/**
 * Created by shaan on 5/7/17.
 */
public class Database {
     private String port;
     private String name;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void Display()
    {
        System.out.println("Database name is "+ getName() + " "+ "port no is :"+ getPort());
    }
}
