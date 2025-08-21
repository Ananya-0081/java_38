public class mymain1 {
    public static void main(String[] args) {
        college_stu1 st=new college_stu1("Ghaziabad", 38 );
        st.show_rno();
        st.show_address();

        st.roll_no=40;
        System.out.println("Upadated rno.");
        st.show_rno();
    }
}
