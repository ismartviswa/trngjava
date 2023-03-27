import java.util.*;
import java.lang.*;
class Circle
{
public double calculate(double radius)
{
double area=Math.PI*Math.pow(radius,2);
return area;

}//calculate
}//class Circle
class Program02
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double radius=sc.nextDouble();
Circle ob=new Circle();
System.out.println(ob.calculate(radius));

}//main

}//Program02