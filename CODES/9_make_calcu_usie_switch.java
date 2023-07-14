import java.util.*;

class HelloWorld {
    public static void main(String[] args)
     {
        
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        Scanner input = new Scanner (System.in);
        char c = input.next().charAt(0);
        
        switch(c){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default : System.out.println("Eror");
        }
       
    }
}