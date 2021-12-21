import java.util.Scanner;



class Cylinder{

    private int radius;
    private int height;
    public Cylinder(int r,int h){
        radius=r;
        height=h;
    }
    public void setradius(int r){
        this.radius=r;
    }
    public void setheight(int h){
        this.height=h;
    }
    public int getradius(){
        return radius;
    }
    public int getheight(){
        return height;
    }
    public float tarea(){
        return (2*22/7*radius*height) +(2*22/7*radius*radius);
    }

    public float volume(){
        return 22/7*radius*radius*height;
    }
}
public class practiceset9 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Cylinder mycy =  new Cylinder(3,7);
    // mycy.setradius(4);
    // mycy.setheight(8);
    System.out.println(mycy.getheight());
    System.out.println(mycy.getradius());
    System.out.println(mycy.tarea());
    System.out.println(mycy.volume());
   }

    


    }

