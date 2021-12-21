abstract class pen{
    abstract void write();
    abstract void refile();
}
class cello extends pen{
    public void write(){
        System.out.println("writing cello");
    }
    public void refile(){
        System.out.println("refiling refile ");
    }
    void texting(){
        System.out.println("texting stamp");
    }
}




////
/**
 
 */
class monkey{
    void jump(){
        System.out.println("Jumping ..");
    }

    void bite(){
        System.out.println("Bitting ..");
    }
}
 interface basicanimal {
     void eat();
     void sleep();
} 
 class human extends monkey implements basicanimal{
     public void eat(){
         System.out.println("wheat eating");
     }
     public void sleep(){
         System.out.println("8 hour sleep");
     }
     public void bite(){
         System.out.println(" ma ma biting ");
     }



 }


//





//



public class practiceset11 {
    public static void main(String[] args){


        // //Question 1
        // cello p1=new cello();
        // p1.write();
        // p1.texting();


        // //Question 2
        // human h1 = new human();
        // h1.bite();
        // h1.eat();
        // h1.jump();
        // h1.sleep();



        // //Question 3
        // monkey m1= new human();
        // m1.bite();


        


    }
}
