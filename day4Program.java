class jtraining
{
public void break1()
{
System.out.println("Break from 11-11:10");
System.out.println("Take for water");
}
public void break2()
{
System.out.println("Break from 1-1:50");
System.out.println("Take for launch");
}
public void break3()
{
System.out.println("Break from 3:30-3:40");
System.out.println("Take for water");
}
}
class Program06
{
public static void main(String args[])
{
jtraining ob=new jtraining();
ob.break1();
ob.break2();
ob.break3();
}
}