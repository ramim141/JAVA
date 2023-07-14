
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
    System.out.print("Enter your number: ");
    Scanner sc = new Scanner(System.in);
      
    int num= sc.nextInt();
    
    
    if(num%2==0)
    {
        System.out.println("Even");
    }
    else 
    {
        System.out.println("ODD");
    }

      
    }
}