import java.util.Scanner;
class Program06
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int min=0;
if(num1<=num2)min=num1;
if(num2<num1)min=num2;
System.out.println("Smallest out of "+num1+" and "+num2+" is "+min);
} 
}
