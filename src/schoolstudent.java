public class schoolstudent extends student{
    schoolstudent(int roll_no,String name) {
        super(roll_no, name);           //super:parent class ka constructor call ho gya
    }
    public void attend_class(){
        System.out.println(name+" is attending class offline");
    }
    public void give_exam(){
        System.out.println(name+" is giving exam on pen and paper");
    }
}
