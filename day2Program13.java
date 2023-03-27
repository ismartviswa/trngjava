import java.util.Scanner;
class Program13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
switch(num)
{
case 1:{System.out.print("MONDAY");break;}
case 2:{System.out.print("TUESDAY");break;}
case 3:{System.out.print("WEDNESDAY");break;}
case 4:{System.out.print("THURSDAY");break;}
case 5:{System.out.print("FRIDAY");break;}
case 6:{System.out.print("SATURDAY");break;}
case 7:{System.out.print("SUNDAY");break;}
default:{System.out.print("INVALID");break;}
}
}
}