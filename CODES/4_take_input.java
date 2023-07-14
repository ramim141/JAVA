
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
    System.out.print("Enter your age: ");
    Scanner sc = new Scanner(System.in);
      
    int age= sc.nextInt();
    
    
    if(age>18)
    {
        System.out.println("adult");
    }
    else 
    {
        System.out.println("Not Adult");
    }

      
    }
}