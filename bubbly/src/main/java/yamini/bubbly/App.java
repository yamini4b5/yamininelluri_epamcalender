package yamini.bubbly;
import java.util.Scanner;
 class Calculator 
{
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);
       while(true) {
    	   System.out.println("Simple Calculator\n option 1:to ADD two numbers\n option 2:to SUBTRACT two numbers\n option 3:to MULTIPLY two numbers\n option 4:to divide two numbers\n option 0:to exit the Calculator");
       int option=sc.nextInt();
       switch(option) {
       case 1:
    	   System.out.println("Enter first number");
    	   double a1=sc.nextDouble();
    	   System.out.println("Enter next number");
    	   double a2=sc.nextDouble();
    	   Add a=new Add(a1,a2);
    	   a.add();
    	   break;
       case 2:
    	   System.out.println("Enter first number");
    	   double s1=sc.nextDouble();
    	   System.out.println("Enter next number");
    	   double s2=sc.nextDouble();
    	   Subtract s=new Subtract(s1,s2);
    	   s.sub();
    	   break;
       case 3:
    	   System.out.println("Enter first number");
    	   double m1=sc.nextDouble();
    	   System.out.println("Enter next number");
    	   double m2=sc.nextDouble();
    	   Multiply m=new Multiply(m1,m2);
    	   m.mul();
    	   break;
       case 4:
    	   System.out.println("Enter first number");
    	   double d1=sc.nextDouble();
    	   System.out.println("Enter next number");
    	   double d2=sc.nextDouble();
    	   Divide d=new Divide(d1,d2);
    	   d.div();
    	   break;
       case 0:
    	   sc.close();
    	   return;
    	default:
    		System.out.println("Enter valid option");
       }
    }
}
}
