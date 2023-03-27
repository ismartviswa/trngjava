import java.util.Scanner;
class Number
{
public int add(int a,int b)
{
int c=a+b;
return c;
}//add
}//number
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
Number ob=new Number();
int res=0;
res=ob.add(num1,num2);
System.out.println(num1+"+"+num2+"="+res);
}//main
}//test