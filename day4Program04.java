import java.util.Scanner;
class Program04
{
public static void fun1(int a,int b)
{
int res=a+b;
System.out.println(res);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
fun1(num1,num2);
}
}