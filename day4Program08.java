class A
{
public void funA1()
{
System.out.println("funA1 method of classA called");
}//funA1
public void funA2()
{
System.out.println("funA2 method of classA called");
}//funA2
public void funA3()
{
System.out.println("funA3 method of classA called");
}//funA3
}//classA
class B
{
public void funB1()
{
System.out.println("funB1 method of classB called");
}//funB1
public void funB2()
{
System.out.println("funB2 method of classB called");
}//funB2
public void funB3()
{
System.out.println("funB3 method of classB called");
}//funB3
}//class B
class C
{
public static void main(String args[])
{
A obA=new A();
obA.funA1();
obA.funA2();
obA.funA3();
B obB=new B();
obB.funB1();
obB.funB2();
obB.funB3();
}//main
}//classC