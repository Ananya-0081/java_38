public class Mybank {
    public static void main(String[] args) {
        Bank b=new Bank();
        try{
            b.withdraw(5000);
            b.withdraw(12000);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
