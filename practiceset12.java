// package practiceset121.pankaj.calculater;



class calculater{
    public int a=2;
    private int b=2;
    int c=4;
    void sum(){

        System.out.println("calculater "+ a+b);
    }
   public void summ(){

        System.out.println("calculater summ "+ a+b);
    }

}
class sccalculater extends calculater{
   public  int d=5;
   void pri(){
    System.out.println("pankaj sc calculater");
    summ();
    // sum();   --- this can not be access
   }
}
public class practiceset12 {
    public static void main(String[] args) {
        System.out.println("pankaj");

        sccalculater sc1 =new sccalculater();
        // sc1.summ();
        sc1.pri();
        
    }
}
