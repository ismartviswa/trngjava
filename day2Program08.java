import java.util.Scanner;
class Program08
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i;
i=num;
while(i>=0)
{
   System.out.print(i+",");
   i=i-1;
}
}
}