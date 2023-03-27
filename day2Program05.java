import java.util.Scanner;
class Program05
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int i=0;
while(i<=num1)
{
   System.out.print(i+",");
   i=i+7;
}
}
}