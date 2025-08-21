public class empmain {
    static {   /// static block main se pehle call ho skta h :)
        System.out.println("Static block called");
        employee.emp_info();
    }

    public static void main(String[] args){

        employee E1=new employee(1,"ABC",200000);
        E1.display();
        employee E2=new employee(2,"DEF");
        E2.emp_sal=550000;
        E2.display();



    }
}
