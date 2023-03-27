import java.util.Scanner;
class Number
{
public int add(int a,int b)
{
int c=a+b;
return c;
}//add
public int sub(int a,int b)
{
int c=a-b;
return c;
}//sub
public int mult(int a,int b)
{
int c=a*b;
return c;
}//mul
public int div(int a,int b)
{
int c=a/b;
return c;
}//div
public int mod(int a,int b)
{
int c=a%b;
return c;
}//mod
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
res=ob.sub(num1,num2);
System.out.println(num1+"-"+num2+"="+res);
res=ob.mult(num1,num2);
System.out.println(num1+"*"+num2+"="+res);
res=ob.div(num1,num2);
System.out.println(num1+"/"+num2+"="+res);
res=ob.mod(num1,num2);
System.out.println(num1+"%"+num2+"="+res);
}//main
}//test