import java.util.*;
public abstract class student {
    int roll_no;
    String name;

    student(int roll_no,String name){
        this.name=name;
        this.roll_no=roll_no;
    }


    abstract void attend_class();
    abstract void give_exam();


    void register()
    {
        System.out.println("Name "+name+" is registered successfully with Roll no."+roll_no);
    }

}

