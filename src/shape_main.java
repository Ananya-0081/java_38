public class shape_main extends shape{
    public static void main(String[] args) {
        //compile time polymorphism: method overloading
        shape s=new shape();
        s.draw(34,56);
        s.draw(25);
        System.out.println();

        //runtime polymorphism: method overiding
        newshape sh=new newshape();
        sh.draw(34,56);
        sh.draw(25);
    }
}
