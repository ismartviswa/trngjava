import java.util.Scanner;
class Program02
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter three numbers:");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
System.out.println("\n"+num1+"+"+num2+"*"+num3+"="+(num1+num2*num3));
}
}


