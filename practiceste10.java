class circle{
float  pi = 3.14f;
int r;
public void setR(int r) {
    this.r = r;
}
public float area (){
return pi*r*r;
}
public float circumferance( ){
    return 2*pi*r;
}
}

class cylinder extends circle {
int h;
public void setH(int h) {
    this.h = h;
}
    public float area(){
        return (2*pi*r*h)+2*pi*r*r;
    }
    public float volume(){
        return (pi*r*r*h);
    }
}

public  class practiceste10 {
     public static void main(String[] args) {


    //     //Question 1
    //     circle ci = new circle();
    //     ci.setR(6);
    //     System.out.println(ci.area());
    //    cylinder cy =new cylinder();
    //    cy.setR(5);
    //    cy.setH(8); 
    //    System.out.println(cy.area());
    //    System.out.println(cy.volume());




    //Question 2
    
       
    }
    
}