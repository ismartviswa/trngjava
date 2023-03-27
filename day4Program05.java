import java.util.Scanner;
class Program05
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
fun1(num1,num2);
fun2(num1,num2);
}
public static void fun1(int a,int b)
{
int res=a+b;
System.out.println(res);
}
public static void fun2(int a,int b)
{
int res1=a-b;
System.out.println(res1);
}
}

