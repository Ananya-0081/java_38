public class college_stu1 extends student1{
    public int roll_no;

    public college_stu1(String address, int roll_no){
        super(address);
        this.roll_no=roll_no;
    }
    public void show_rno(){
        System.out.println("Roll no."+roll_no);
    }
}

