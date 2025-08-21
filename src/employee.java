import java.net.StandardSocketOptions;

public class employee {
    int emp_id;
    String emp_name;
    double emp_sal;
    static String emp_org="Amazon";

    public employee(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public employee(int emp_id, String emp_name, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;

    }

    public void display(){
        System.out.println("EMP_ID "+emp_id);
        System.out.println("EMP_NAME "+emp_name);
        System.out.println("Emp_sal "+emp_sal);
    }

    public static void emp_info(){    //you can access the static method without even creating an object;
        System.out.println(emp_org);   //can not use non static variables
    }

    //static class sirf nested class me bnega

    //final keyword: can be initialized only once in main, if value not given it can be initialized only in constructor that too only once
    //if its static final keyword it can be initialized only once that too in a static block.
    //final variable:to create constant variable
    //final method: cannot overwrite
    //final class: cannot be inherited
}
