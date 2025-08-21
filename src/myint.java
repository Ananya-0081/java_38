public class myint implements Printable,Showable {
    public void print(){
        System.out.println("I am in print");
    }
    public void show(){
        System.out.println("I am in show.");
    }
}

//java can implement more than one interface together(coz its only the blueprint we are providing the definition)
//but more than one class can not be inherited in java. (doesn't support multiple inheritance)
