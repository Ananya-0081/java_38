public class st_en {
    public int roll_no;
    public String name;
    private String grade;

    public st_en(int roll_no,String name,String grade) {
        this.roll_no = roll_no;
        this.name=name;
        this.grade=grade;
    }

    public void setGrade(String grade){
        this.grade=grade;
    }

    public String getGrade(){
        return grade;
    }
}
