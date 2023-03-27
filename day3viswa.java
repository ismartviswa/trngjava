import java.util.Scanner;
class viswa
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=5;
int res=num/i%num;
System.out.println(num+"/"+i+"%"+num+"="+res);
}
}