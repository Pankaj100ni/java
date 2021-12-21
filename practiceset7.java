import java.util.Scanner;
import java.lang.Math;

class practiceset7 {
    // int pankaj(int a){
    //     return a+1;
    //  }


    static int recpow(int base ,int power){

        
        if (power!=0) {
            return  (base*recpow(base,power-1));
        }
        else
        return 1;
    }


    static boolean isprime(int num){

        boolean flag = true;
        if (num==0||num==1) {
            flag=false;
            
        }
        else
        {
            for (int i = 2; i < num/2; i++) {
                if (num%i==0) {
                    flag=false;
                    break;
                }
            }
        }

        return flag;
    }
    static void multiple(int num){
      
         for (int i = 1; i <= 10; i++) {
        System.out.println(num+" * "+i+" = "+num*i);
    }
    }


    static void pattern(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    static int  sumn(int num){
        if (num==1) {
            return 1;
        }

        int a=0;
        a=num+sumn(num-1);
        return a;
    }

    static void invertpattern(int num){

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("# ");
            }
            System.out.println("");
        }
    }

    static void  pattern_rec1(int num){
        if (num>0) {
            pattern_rec1(num-1);
            for (int i = 0; i < num; i++) {
                System.out.print("* ");
                
            }
            System.out.println("");
            
        }
    }

    static void  pattern_rec2(int num){
        if (num>0) {
            
            for (int i = 0; i < num; i++) {
                System.out.print("* ");
                
            }
            System.out.println("");
            pattern_rec2(num-1);
        }
    }


    static int ntfibonaci(int num){

        int i1=0;
        int i2=1;
        int i3=0;
        for (int i = 1; i < num; i++) {
            i3=i2+i1;
            i1=i2;
            i2=i3;
        }

        return i3;

    }

    static void fibonaci(int num){

        int i1=0;
        int i2=1;
        int i3=0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i3+" ");
            i3=i2+i1;
            i1=i2;
            i2=i3;
            
        }
        System.out.println("");
    }

    static int arrsum(int[] num){
        int sum=0;
        for (int element : num) {
            sum+=element;
        }
        return sum;
    }


    static float ctof(int num){
        return (num*9/5f)+32;
    }

    static int rec_sum(int num){
        if (num==0) {
            return 0;
        }
        return num+rec_sum( num-1);
    }


    static int btod(int num){
        int rem,ans=0,i=0;
        while (num!=0) {
            rem=num%10;
            num/=10; 
            ans+=rem*Math.pow(2, i);
            i++;
        }
       
        return ans;
    }
    static int dtob(int num){
        int rem=0,ans=0;
        while (num!=0) {
            rem=num%2;
            num/=2;
            ans+=rem*10;
            
            ;
        }
       
        return ans;
    }



    static int hcf(int n1,int n2){
       
        if (n2!=0) {
            // System.out.println(n2+"  "+(n1%n2));
            return hcf(n2,n1%n2);
            
        }
        else
        return n1;
    }





    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //    practiceset6 aa=new practiceset6();
    //    int c = aa.pankaj(10);
    //    System.out.println(c);


    // //question 1
    // System.out.println("Multipication table \n Enter number : ");
    // int num1=sc.nextInt();
    //    multiple(num1);


    // //Question 2
    // System.out.println("Pattern printing \n Enter number");
    // int num2=sc.nextInt();
    // pattern(num2);


    // //Question 3
    // System.out.println("Sum using recursive\nEnter number");
    // int num3=sc.nextInt();
    // System.out.println(sumn(num3));


    // //Question4
    // System.out.println("Invert patter \nEnter Number");
    // int num4=sc.nextInt();
    // invertpattern(num4);


    // //Question5
    // System.out.println("fibonaci series at index \nEnter Number");
    // int num5=sc.nextInt();
    // System.out.println(ntfibonaci(num5));

    //  //Question5.2
    // System.out.println("fibonaci series  \nEnter Number");
    // int num6=sc.nextInt();
    // fibonaci(num6);


    // //Question6
    // System.out.println("Array sum \nEnter number");
    // int num6=sc.nextInt();
    // int[]arr=new int[num6];
    // for (int i = 0; i < arr.length; i++) {
    //     arr[i]=sc.nextInt();
    // }

    // System.out.println(arrsum(arr));



    // //Question7
    // System.out.println("Pattern using recursion\nEnter number : ");
    // int num7=sc.nextInt();
    // pattern_rec1(num7);

    // //Question8
    // System.out.println("Reverse Pattern using recursion\nEnter number : ");
    // int num8=sc.nextInt();
    // pattern_rec2(num8);

    // //QUETION9
    // System.out.println("celsius to faherenheit \nEnter Temp : ");
    // int num9=sc.nextInt();
    // System.out.println(ctof(num9));

    //   //Question10
    //   System.out.println("sum using recursion \nEnter number ");
    //   int num10=sc.nextInt();
    //   System.out.println(rec_sum(num10));  
    


    
    // //Write a Program to check if an integer (entered by the user) can be expressed as the sum of two prime numbers,
    // //if yes then print all possible combinations with the use of functions.

    // System.out.println("Enter number : ");
    // boolean flag1 =false;
    // int num11=sc.nextInt();
    // for (int i = 2; i < num11/2; ++i) {
    //     if (isprime(i)){
    //         if (isprime(num11-i)) {
    //             System.out.println(num11 +" = "+i+" + "+(num11-i));
    //         }
    //         flag1=true;
    //     }
    // }

    // if (!flag1) {
    //     System.out.println(num11+"can't be exist at sum of 2 prime number ");
    // }


    // System.out.println("Convert Binary Number to Decimal");
    // System.out.println("Enter number : ");
    // int num11=sc.nextInt();
    // System.out.println(btod(num11));

    // System.out.println("Convert Binary Number to Decimal");
    // System.out.println("Enter number : ");
    // int num12=sc.nextInt();
    // System.out.println(dtob(num12));


    // //GCD using recursion
    // System.out.println("GCD using recursion");

    // System.out.println("Enter n1 and n2");
    // int n1=sc.nextInt();
    // int n2=sc.nextInt();
    // // System.out.println((n1%n2));
    // // System.out.println((n2%n1));
    // System.out.println(hcf(n1,n2));
   

    // //power of number using recursion
    // System.out.println("Enter base : ");
    // int base =sc.nextInt();
    // System.out.println("Enter power : ");
    // int power = sc.nextInt();
    // int result =recpow(base,power);

    // System.out.println(result);




    }

   

      
}
