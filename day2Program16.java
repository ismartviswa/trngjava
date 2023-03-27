import java.util.Scanner;
class Program16
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER TWO NUMBER:");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("1:Addition");
System.out.println("2:Subtraction");
System.out.println("3:multiplication");
System.out.println("4:division");
System.out.println("5:modulus division");
int num3=sc.nextInt();
switch(num3)
{
case 1:{System.out.print(num1+"+"+num2+"="+(num1+num2));break;}
case 2:{System.out.print(num1+"-"+num2+"="+(num1-num2));break;}
case 3:{System.out.print(num1+"*"+num2+"="+(num1*num2));break;}
case 4:{System.out.print(num1+"/"+num2+"="+(num1/num2));break;}
case 5:{System.out.print(num1+"%"+num2+"="+(num1%num2));break;}
}
}
}