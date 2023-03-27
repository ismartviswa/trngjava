import java.util.Scanner;
class Program14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
switch(num)
{
case 1:{System.out.print("JANUARY");break;}
case 2:{System.out.print("FEBRUARY");break;}
case 3:{System.out.print("MARCH");break;}
case 4:{System.out.print("APRIL");break;}
case 5:{System.out.print("MAY");break;}
case 6:{System.out.print("JUNE");break;}
case 7:{System.out.print("JULY");break;}
case 8:{System.out.print("AUGUST");break;}
case 9:{System.out.print("SEPTEMBER");break;}
case 10:{System.out.print("OCTOBER");break;}
case 11:{System.out.print("NOVEMBER");break;}
case 12:{System.out.print("DECEMBER");break;}
default:{System.out.print("INVALID");break;}
}
}
}