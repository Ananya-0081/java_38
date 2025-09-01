public class Myexception {
    //compule time error
    public static void main(String[] args) {
        userdefinedexception obj1=new userdefinedexception();
        try {
            obj1.validate(19);
            obj1.validate(12);
        }
        catch (invalidageexception e){
            System.out.println(e.getMessage());
        }
    }
}
