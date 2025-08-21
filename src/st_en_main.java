public class st_en_main {
    public static void main(String[] args) {
        st_en Student = new st_en(38,"Ananya","A");
        System.out.println("name:"+Student.name);
        System.out.println("Roll no:"+Student.roll_no);
        System.out.println("Grade "+Student.getGrade());
        Student.setGrade("A+");
        System.out.println("Updated Grade "+Student.getGrade());
    }
}
