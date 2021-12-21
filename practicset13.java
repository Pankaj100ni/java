class greting1 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getState());
            System.out.println("good morining");
        } catch (Exception e) {
            System.out.println("e");
        }
        
    //         int n=0;
    //    while (n<=4000) {
    //     System.out.println("good morining");
    //     n++;
    //    }
            
        
    }
}
class greting2 extends Thread{
    public void run(){
        System.out.println("WELCOME");
    //     int j=0;
    //    while (j<=4000) {
    //     System.out.println("WELCOME");
    //     j++;
    //    }
    }
}



public class practicset13 {
    

    public static void main(String[] args) {
        //Question1
        greting1 g1 = new greting1();
        System.out.println(Thread.currentThread().getState());
        greting2 g2 = new greting2();
        g1.start();
        g2.start();
        // System.out.println(g2.getState());
        // System.out.println(Thread.currentThread().getState());

        // g1.setPriority(10);
        // g2.setPriority(5);


        // System.out.println(g1.getPriority());
        // System.out.println(g2.getPriority());



        

        //Questin 2



    }
}