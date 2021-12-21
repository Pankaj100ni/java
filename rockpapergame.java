import java.util.Scanner;
    import java.util.Random;
public class rockpapergame {
    
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Enter 1 for rock \nEnter 2 for Paper\nEnter 3 for Secissor");
            int num =sc.nextInt();
            int computur=rand.nextInt(3);
            if (num==computur) {
                System.out.println("match draw ");
                
            }
            else if (num==1&&computur==2||num==2&&computur==3||num==3&&computur==1) {
                System.out.println("computer won");
            }
            else
            System.out.println("you won");
    
    
        }
    }
     

