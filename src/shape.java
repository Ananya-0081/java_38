public class shape {
    public void draw(double l,double b){
        //compile time polymorphism
        double area=l*b;
        System.out.println("Area of Rectangle "+area);
    }

    public void draw(double l){
        double area=l*l;
        System.out.println("Area of square "+area);
    }

}
