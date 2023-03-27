import java.util.Scanner;
class Program02
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int i=0;
while(i<=50)
{
   System.out.println("\n"+num1+"*"+i+"="+num1*i);
   i=i+1;
}
}
}