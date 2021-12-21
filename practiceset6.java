import java.util.Scanner;

public class practiceset6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    // //Question1
    //     float[] sum={2f ,2f,3f,3f,4f};
    //     float num= 0;
    //     for (int i = 0; i < sum.length; i++) {
    //          num =num + sum[i];
    //     }

    //     System.out.println(num);

    // //Question2
    // int[] arr={2,3,43,5443,34,323,43};
    // int num=sc.nextInt();
    // for (int i = 0; i < arr.length; i++) {
    //     if (num==arr[i]) {
    //         System.out.println("yes number is prestnet");
    //         System.out.println("index of array is "+ i);
            
    //     }
    //     else
    //     System.out.println("NO this number is not present in array");
    //     break;
    // }


//     //Question3
//     System.out.println("Enter size of array : ");
//     int num =sc.nextInt();
//     float[] physics=new float[num];
//     for (int i = 0; i < physics.length; i++) {
//         System.out.println("Enter element of array: ");
//         physics[i]=sc.nextFloat();
//     }

//     float sum=0;
//     for(float element: physics){

//         sum+=element;
//     }
// System.out.println(sum/physics.length);


// //Queston4
// int[][] arr1 = new int[2][3];
// System.out.println("Enter element of array 1");
// for (int i = 0; i < 2; i++) {
//     for (int j = 0; j < 3; j++) {
//             arr1[i][j]=sc.nextInt();
//     }
// }
// int[][] arr2 = new int[2][3];
// System.out.println("Enter element of array 2");
// for (int i = 0; i < 2; i++) {
//     for (int j = 0; j < 3; j++) {
//             arr2[i][j]=sc.nextInt();
//     }
// }

// for (int i = 0; i < 2; i++) {
//     for (int j = 0; j < 3; j++) {
//         arr1[i][j]=arr1[i][j]+arr2[i][j];
//     }
// }
// // 
// for (int i = 0; i < 2; i++) {
//     for (int j = 0; j < 3; j++) {
//             System.out.print(arr1[i][j]);
//             System.out.print(" ");
//     }
//     System.out.println("");
// }


// //Quuestion6
// System.out.println("Enter row");
// int row=sc.nextInt();
// System.out.println("Enter col ");
// int col=sc.nextInt();
// int[][] arr=new int[row][col];
// for (int i = 0; i < row; i++) {
//     for (int j = 0; j < col; j++) {
//             arr[i][j]=sc.nextInt();
//     }
    
// }



// for (int i = 0; i < row; i++) {
//     for (int j = 0; j < col; j++) {
//             System.out.print(arr[i][j]);
//             System.out.print(" ");
//     }
//     System.out.println("");
// }
// int max=0;
// for (int i = 0; i < row; i++) {
//     for (int j = 0; j < col; j++) {
//         if(max<arr[i][j]){
//             max=arr[i][j];
//         }
            
//     }
  
// }
// System.out.println("maximum is "+max); 

// //Question5
// System.out.println("Enter row");
// int row=sc.nextInt();
// int[] arr=new int[row];
// System.out.println("Enter array");
// for (int i = 0; i < arr.length; i++) {
//     arr[i]=sc.nextInt();
// }
// for (int i = arr.length-1; i >= 0; i--) {
//     System.out.print(arr[i]+" ");
// }
// System.out.println("");



// //Question7
// System.out.println("Enter row");
// int row=sc.nextInt();
// int[] arr=new int[row];
// boolean issort =true;
// System.out.println("Enter array");
// for (int i = 0; i < arr.length; i++) {
//     arr[i]=sc.nextInt();
// }
// for (int i = 0; i < arr.length; i++) {
//     if (arr[i]>=arr[i+1]) {
//        issort=false;
//        break;
//     }
    
// }
// if (issort) {
//     System.out.println("sorted");
// }
// else
// System.out.println("Not sorted");



//Access element
System.out.println("Enter number");
int n=sc.nextInt();
boolean flag = true;
int[] arr=new int[n];
for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
}

for (int i = 1; i < arr.length; i++) {
    if (arr[i-1]>arr[i]) {
        flag = false;
        break;
    }

    
}
if (flag) {
    System.out.println("sorted");
}
else
System.out.println("Not sorted ");


    }

    
}
