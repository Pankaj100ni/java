import java.util.Scanner;
import java.lang.Math;
public class practiceset4 {
    public static int percentage(int gm,int tm){
        return gm*100/300;

    }

    public static int maxof(int a,int b){

        if (a>b) {
            return a;
        }
        else
        return b;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //  //Question 2
        // System.out.println("Enter subect 1 marks");
        // int s1 = sc.nextInt();
        // System.out.println("Enter subect 2 marks");
        // int s2 = sc.nextInt();
        // System.out.println("Enter subect 3 marks");
        // int s3 = sc.nextInt();

        // int getmark=s1+s2+s3;
        // int totper = percentage(getmark,300);

        // if (s1>=33&&s2>=33&&s3>=33&&totper>=40) {
        //     System.out.println("pass");
            
        // }
        // else

        // System.out.println("fail");


        // //Question 3
        // System.out.println("Enter income");
        // int income = sc.nextInt();
        // int tax =0;
        // if (income<250000) {
            
        //     System.out.println(" TAX is "+tax+ " rs");
        // }
        // else if (income>250000&&income<500000) {

        //     tax=income*5/100;
        //     System.out.println("5% TAX is "+tax+ " rs");
        // }
        // else if (income>500000&&income<1000000) {
        //     tax=income*20/100;
        //     System.out.println("20% TAX is "+tax+ " rs");
        // }
        // else {
        //     tax=income*30/100;
        //     System.out.println("30% TAX is "+tax+ " rs");
        // }
        

        // //Question 4
        // System.out.println("Entter day ");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //         case 2:
        //         System.out.println("Tuesday");
        //         break;
                
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
                
        //     case 4:
        //         System.out.println("Thursday");
        //         break;

        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        
        //     default:
        //     System.out.println("enter less than 7 or equal to 7");
        //         break;
        // }


    // //Question 5
    // System.out.print("Enter year : ");  
    // int year = sc.nextInt();
    // if (year%400==0) {
    //     System.out.println("Leap year");
    // } 
    // else if (year%100!= 0&&year%4==0) {
    //     System.out.println("leap year");
    // } 

    // else
    // System.out.println("Not Leap year");
    

    // //Question 6
    // System.out.println("Enter email : ");
    // String email= sc.next();
    // if (email.endsWith(".com")) {
    //     System.out.println("commercial website ");
        
    // }
    // else if(email.endsWith(".org")){
    //     System.out.println("organization website");
    // }
    // else if(email.endsWith(".in")){
    //     System.out.println("Indian website");
    // }
    // else{
    //     System.out.println("Other website ");
    // }


    // //Write a Program to Check Whether Number is Even or Odd
    // System.out.print("Enter number : ");
    // int num= sc.nextInt();
    // if (num%2==0) {
    //     System.out.println("Even");
    // }
    // else
    // System.out.println("Odd");



    // //Write a Program to Check Whether a Character is Vowel or Consonant.
    // System.out.print("Enter character : ");
    // char ch =sc.next().charAt(0);
    // if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    //     System.out.println("character is vowel");
    
    // }
    // else
    // System.out.println("Character is consonent");


    // // Write a Program to Find Largest Number Among Three Numbers entered by users
    // System.out.println("Enter number ");
    // int num1 =sc.nextInt();
    // System.out.println("Enter number ");
    // int num2 =sc.nextInt();
    // System.out.println("Enter number ");
    // int num3 =sc.nextInt();
    // //maxof is created above
    // int max = maxof(num1,num2);
    // max=maxof(max,num3);
    // System.out.println("max is : "+ max);

// //Program which accepts coefficients of a quadratic equation from the user and displays the roots
// System.out.println("Enter A ");
// double a=sc.nextFloat();
// System.out.println("Enter B ");
// double b=sc.nextFloat();
// System.out.println("Enter C ");
// double c=sc.nextFloat();

// double d=b*b-4*a*c;
// double r1,r2;
// if (d>0) {
//         r1= (-b+ Math.sqrt(d)/(2*a));
//         r2= (-b- Math.sqrt(d)/(2*a));
//         System.out.printf("%.2f and %.2f",r1,r2);
       
// }
// else if (d==0) {

//     r1=r2=-b/2*a;

//     System.out.printf("%.2f and %.2f",r1,r2);
// }

// else  {
//     double real = -b/(2*a);
//     double imag = Math.sqrt(-d)/(2*a);
//     System.out.format("%.2f + %.2fi and %.2f - %.2fi",real, imag,real, imag);
    

// }


//calculater
int numa=sc.nextInt();
char chr=sc.next().charAt(0);
int numb =sc.nextInt();
switch(chr){
    case('+'):
    {
        System.out.println(numa+numb);
        break;
    }
    case('-'):
    {
        System.out.println(numa-numb);
        break;
    }
    case('*'):
    {
        System.out.println(numa*numb);
        break;

    }
    case('/'):
    {
        System.out.println(numa/numb);
        break;
    }
    default:
    System.out.println("i am still learning");
}



}  
    
}
