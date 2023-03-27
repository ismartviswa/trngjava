import java.util.Scanner;
class Program09
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int i;
i=num1;
while(i>=0)
{
   System.out.print(i+",");
   i=i-num2;
}
}
}