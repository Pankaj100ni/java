import java.util.Scanner;


public class practiceset3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String name = "Pankaj pankaj  aaa AAA jdaskn aa ";

    //question 1
    System.out.println(name.toLowerCase());

    //Question 2
    System.out.println(name.replace(' ','_'));
// Question 3
    String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);
    //Question 4
    System.out.println(name.indexOf("aa"));

    //Question 5
    String etter = " Dear Pankaj ,\n\tThis java is nice. \nthnx";
    System.out.println(etter);
    System.out.println("\'");

    

    }
    

    
}
