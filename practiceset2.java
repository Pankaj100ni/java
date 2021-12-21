import java.util.Scanner;
public class practiceset2 {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);

        // //question1
        // float a = 7/4.0f*9/2.0f;
        // System.out.println(a);



    //   //Question 2
    //   System.out.println("Enter character : ");
    //   char grade = s.next().charAt(0);
    // // char grade = 'G';
    // System.out.print(grade+" + 8 = ");
    // grade= (char)(grade+8);
    // System.out.println(grade);
    // //decrypt
    // System.out.print(grade+" - 8 = ");
    // grade= (char)(grade-8);
    // System.out.println(grade);


        // //Question 3
        // int b=25;
        // System.out.println("Enter a number greater than 25 ");
        // int c = s.nextInt();
        // boolean d = c>b;
        // System.out.println(d);
       

        // //Question 4

        // System.out.println("Enter value of V  U  A S" );
        // float v =s.nextFloat();
        // float u =s.nextFloat();
        // float a =s.nextFloat();
        // float sa =s.nextFloat();

        // float ans = (v*v - u*u)/2*a*sa;
        // System.out.println(ans);





        // //sizeof program
        
        // System.out.println("size of int " + (Integer.SIZE/8));
        // System.out.println("size of float " + (Float.SIZE/8));
        // System.out.println("size of char " + (Character.SIZE/8));
        // System.out.println("size of double " + (Double.SIZE/8));
        // System.out.println("size of long " + (Long.SIZE/8));


        // //ASCII value
        // System.out.print("Enter Character : ");
        // char ch = s.next().charAt(0);
        // int ascii = (int ) ch;
        // System.out.println("ASCII value of "+ ch+" is "+ ascii);


        //swap
        System.out.print("Enter Number A : ");
        int n1 =s.nextInt();
        System.out.print("Enter Number B : ");
        int n2 =s.nextInt();

        int temp =n1;
        n1=n2;
        n2=temp;
        System.out.println("Swap of Number A : " + n1);
        System.out.println("Swap of Number B : " + n2);



    }
}
