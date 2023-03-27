import java.util.Scanner;
class A
{
public int findlargest(int a,int b,int c)
{
int max=0;
if(a>b && a>c)max=a;
if(b>a && b>c)max=b;
if(c>a && c>b)max=c;
return max;
}//findlargest
public int findsmallest(int a,int b,int c)
{
int min=0;
if(a<b && a<c)min=a;
if(b<a && b<c)min=b;
if(c<a && c<b)min=c;
return min;
}//findsmallest
}//class A
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
A ob=new A();
int res=ob.findlargest(n1,n2,n3);
int x=ob.findsmallest(n1,n2,n3);
System.out.println(res);
System.out.println(x);
}//main
}//Test