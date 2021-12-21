import java.util.Scanner;
public class tempcheck {
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String name = new String ("Pankaj");
String nameof = new String ("Pankaj Soni");
System.out.println(name.length());
System.out.println(name.indexOf("a"));
System.out.println(name.indexOf('a',3));
System.out.println(name.lastIndexOf("a"));
System.out.println(name.lastIndexOf("j",4));
System.out.println(name.lastIndexOf("k",5));
System.out.println("cheak");
System.out.println(name.substring(2));

System.out.println(name.substring(1,3));
System.out.println(name.toLowerCase());
System.out.println(name.toUpperCase());

System.out.println(nameof.trim());

System.out.println(nameof.replace('i','y'));
System.out.println(nameof.startsWith("Pa"));
System.out.println(nameof.endsWith("ni"));

System.out.println(name.equals("PaNkaj"));
System.out.println(name.equalsIgnoreCase("PaNkaj"));


        

    }
}
    

