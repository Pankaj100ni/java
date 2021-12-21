import java.util.Scanner;

import javax.swing.plaf.basic.DefaultMenuLayout;

import java.lang.Math;


// public static boolean checkprime(int num){
//     boolean flag = true ;
//     for (int i = 2; i <= num/2; i++) {
//         if (num%i==0) {
//              flag = false;
//              break;
//         }
        
//     }



public class practiceset5 {


    


public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//     //Qustion1
// int n=4;
// for(int i =n;i>0;i--){

//     for(int j =0;j<i;j++){
    
//    System.out.print(" * ");
//     } 
//     System.out.println(" "); 
// }


// //question2
// System.out.println("Enter numer : ");
// int num = sc.nextInt();
// int sum=0;
// for (int i = 0; i <= num; i++) {

//     if(i%2==0){
//         sum+=i;
//     }
//     else
//     sum=sum; 
// }
// System.out.println(sum);


// //question3
// System.out.print("table of : ");
// int num=sc.nextInt();
// for (int i = 1; i <= 10; i++) {
//     int mul=num*i;
//     System.out.println(num+"*"+i+"="+mul);
    
// }

// //question4
// System.out.print("table of : ");
// int num=sc.nextInt();
// for (int i = 10; i >= 1; i--) {
//     int mul=num*i;
//     System.out.println(num+"*"+i+"="+mul);
    
// }


// //Quistion5
// int num=5;
// int factorial=1;
// for (int i = 1; i <= num; i++) {
//     factorial=factorial*i;
// }
// System.out.println(factorial);


// //Question6
// int factorial=1;
// int n=1;
// while(n<=5){
//     factorial*=n;
//     n++;
// }
// System.out.println(factorial);


// //Qestion7
// int n=4;
// while (n>0) {
//     int j=n;
// while (j>0) {
//     System.out.print(" * ");
//     j--;
// }
// System.out.println(" ");
//     n--;
// }

// //qestion9
// int num=8;
// int sum=0;
// for (int i = 10; i >= 1; i--) {
        
//         int mul=num*i;
//         sum+=mul;
//         System.out.println(num+"*"+i+"="+mul);
// }
// System.out.println("sum is "+sum);


// //Fibonacci Series
// int n= sc.nextInt();
// int n1=0,n2=1;
// int sum=0;

//  while (sum<=n){
    
// System.out.println(sum);
// n1=n2;
// n2=sum;
// sum=n1+n2; 
// }



// //hcf
// int n1=sc.nextInt();
// int n2=sc.nextInt();

// while(n1 != n2) {
//     if(n1 > n2)
//     n1 -= n2;
//     else
//     n2 -= n1;
    
// }
// System.out.println(n1);

// //LCM
// int n1=40;
// int n2=32;
// int max = 0;
// if (n1>n2) {
//     max=n1;
// }
// else
// max=n2;

// do {
//     if (max%n1==0&&max%n2==0) {
//         break;
//     } else {
//         ++max;
//     }
// } while (true);
// System.out.println("lcm is : "+max);


// //reversing number
// int n =12345;
// int reminder,rev=0;

// while (n!=0) {
//     reminder=n%10;
//     rev = rev*10+reminder;
//     n/=10;
    
// }
// System.out.println(rev);



// //sum of all digits of a given Number N by user
// int n=sc.nextInt();
// int i=0;
// int sum=0;
// while (i<=n) {
// sum+=i;
// i++;
    
// }
// System.out.println(sum);

// //Power of a Number using inbuilt pow() function
// int a=2;
// int b=4;
// System.out.println(Math.pow(a, b));

// //Power of a Number without using inbuilt pow() function 
// int a=sc.nextInt();
// int b=sc.nextInt();
// int pow=1;
// for (int i = 1; i <= b; i++) {
//     pow*=a;
// }
// System.out.println(pow);


//Armstrong number or not
// int number=sc.nextInt();
// int original,rem,result=0,n=0;
// original=number;
// while (original!=0) {
//     original/=10;
//     ++n;
// }

// original=number;
// for (int i = 1; i <= n; i++) {
//     rem = original%10;
//     result +=Math.pow(rem, n);
//     original/=10;
// }

// if(result == number)
//     {System.out.println(number + " is an Armstrong number.");}
// else
//     System.out.println(number + " is not an Armstrong number.");




// // prime number
// int p1=sc.nextInt();
// int p2=sc.nextInt();

// while (p1<p2) {
//     if (checkprime(p1)) 
//         System.out.println(p1);
//         ++p1;
// }
    






// int low = sc.nextInt();
// int  high = sc.nextInt();

// while (low < high) {
//     if(checkPrimeNumber(low))
//         System.out.print(low + " ");

//     ++low;
// }
// }

// public static boolean checkPrimeNumber(int num) {
// boolean flag = true;

// for(int i = 2; i <= num/2; ++i) {

//     if(num % i == 0) {
//         flag = false;
//         break;
//     }
// }

// return flag;




// //Display all Factors of a Number entered by User
// int n1=sc.nextInt();

// for (int i = 2; i <= n1; ) {

//     if (n1%i==0) {
//         System.out.println(i);
//         n1/=i;
//     }
//     else
//     i++;
// }

// int i=2;
// while (i<=n1) {
//     if (n1%i==0) {
//                 System.out.println(i);
//                 n1/=i;
//             }
//             else
//             i++;
    
// }




// //Solid Rectangular star
// System.out.println("Enter row : ");
// int n1=sc.nextInt();
// System.out.println("Enter col : ");
// int n2=sc.nextInt();
// for (int i = 0; i < n1; i++) {
//     for (int j = 0; j < n2; j++) {
//         System.out.print("*");
//     }
//     System.out.println(" ");
// }


// //Hollow Rectangular star
// System.out.println("Enter row " );
// int n1=sc.nextInt();
// System.out.println("Enter col ");;
// int n2=sc.nextInt();
// for (int i = 1; i <= n1; i++) {
//     for (int j = 1; j <= n2; j++) {
//         if (j==1||j==n2||i==1||i==n1) {
//             System.out.print("#");
//         }
//         else
//         System.out.print(" ");
//     }
//     System.out.println(" ");
// }





// //Half Pyramid Star Pattern
// System.out.print("Enter number : ");
// int num=sc.nextInt();
// for (int i = 1; i <= num; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("#");
//     }
//     System.out.println(" ");
// }


// // Inverted Half pyramid
// System.out.print("Enter number : ");
// int num=sc.nextInt();
// for (int i = num; i >=1; i--) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("#");
//     }
//     System.out.println(" ");
// }



// //Full Pyramid Star Pattern
// System.out.print("Enter number : ");
// int num=sc.nextInt();
// for (int i = 1; i <= num; i++) {
//     for (int j = num-i; j >=1; j--) {
//        System.out.print(" ");
//     }

//     for (int j = 1; j < i; j++) {
//         System.out.print(" #");
//     }
   
//     System.out.println(" ");

// }


// // Inverted Full pyramid
// System.out.print("Enter number : ");
// int num=sc.nextInt();
// for (int i = 0; i < num; i++) {

//     for (int j = num; j >=num-i; j--) {
//         System.out.print(" ");
//     }

//     for (int j = 1; j <= num-i; j++) {
//         System.out.print(" *");
//     }
    

//     System.out.println(" ");
// }

// //Hollow Full Pyramid Star
// System.out.print("Enter number : ");
// int num=sc.nextInt();
// for (int i = 1; i <= num; i++) {
//     for (int j = 1; j <= num-i; j++) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <= i; j++) {
//        if (j==1||j==i||i==num) {
//         System.out.print("* "); 
           
//        }
//        else
//        System.out.print("  ");
//     }
//     System.out.println(" ");
// }



// // Half pyramid using numbers
// System.out.print("Enter number : ");
// int num=sc.nextInt();
// for (int i = 1; i <=num; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print(j);
//     }
//     System.out.println(" ");
// }




//Pascal Triangle
System.out.println("Enter number");
int num=sc.nextInt();
int coef=1;
for (int i = 0; i < num; i++) {

    for (int j = 1; j <= num-i; j++) {
        System.out.print(" ");
        
    }
    for(int j=0; j <= i; j++)
    {
    if (j==0 || i==0)
    coef = 1;
    else
    coef = coef*(i-j+1)/j;
    System.out.print(coef+" ");
    }

   System.out.println(" "); 
}




}





// public static boolean checkprime(int num) {
//     boolean flag = true;
//     if(num==0||num==1){
//  flag = false;
//    }     
//     for(int i = 2; i <= num/2; ++i) {

//         if(num % i == 0) {
//             flag = false;
//             break;
//         }
//     }

//     return flag;
// }



}


