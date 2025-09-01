//step 2 continue
public class userdefinedexception {
    public void validate(int age) throws invalidageexception{
        if(age<18){
            throw new invalidageexception("Not eligible to vote less than 18");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
