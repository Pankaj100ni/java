import java.util.Scanner;

class employee{
   
    String name ;
    int salary ;

    int getsalery(){
        return salary;
    }
     String getName() {
        return name;
    }
    void setName(String nam){
     name = nam;   
    }
   

}

 /**
     * cellphone
     */
    class cellphone {
        int id;
        void ringing(){
            System.out.println(id+" is ringing......");
        }
   
        void vibrating(){
            System.out.println(id + " is vibrating.....");

        }
       
   }
/**
 * square
 */
 class square {
    int side;
    int area(){
             return side*side;
    }
    int perameter(){
        return 4*side;
    }

    
}



//Rectangle
class rectangle {
    int leagth;
    int breath;
    int area(){
             return leagth*breath;
    }
    int perameter(){
        return 2*(leagth+breath);
    }

    
}


//Circle
class circle{
    int radius;
    float area(){
        return (3.14f*radius*radius);
    }
    float parameter(){
        return (2*22/7*radius);
    }
}

public class practiceset8 {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);

       // //Question 1
    //    employee p1=new employee();
       
    //    p1.name = "Pankaj";
    //    p1.salary = 20;
    //    System.out.println(p1.getName());
    //    System.out.println(p1.getsalery());
    //    p1.setName("Soni");
    //    System.out.println(p1.getName());



    //    //Question 2
    //    cellphone c1 =new cellphone();
    //    cellphone c2 =new cellphone();
    //    cellphone c3 =new cellphone();
    //    cellphone c4 =new cellphone();
    //    cellphone c5 =new cellphone();
    //    c1.id=1;
    //    c2.id=2;
    //    c3.id=3;
    //    c4.id=4;
    //    c5.id=5;

    //    c2.vibrating();
    //    c4.ringing();
    //    c5.ringing();





    // //Question 3

    // square s1=new square();
    // s1.side=sc.nextInt();
    // System.out.println(s1.perameter());
    // System.out.println("Area of side "+s1.side+" is "+ s1.area());




    // //Question 4

    // rectangle r1=new rectangle();
    // System.out.println("Enter leangth : ");
    // r1.leagth=sc.nextInt();
    // System.out.println("Enter Breath");
    // r1.breath=sc.nextInt();

    // System.out.println("Area = "+r1.area());
    // System.out.println("Parameter = "+r1.perameter());



    // //Question 6
    // circle c1=new circle();
    // System.out.println("Enter Radius : ");
    // c1.radius=sc.nextInt();
    // System.out.println("Area = "+c1.area());
    // System.out.println("Parameter = "+c1.parameter());
    






   } 
}
