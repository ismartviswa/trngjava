import java.util.Scanner;
class Rectangle
{
public int calculateArea(int l,int w)
{
int area=l*w;
return area;
}//Area
public int calculatePerimeter(int l,int w)
{
int perimeter=2*(l+w);
return perimeter;
}//perimeter
}//Rectangle
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int length=sc.nextInt();
int width=sc.nextInt();
int res;
Rectangle ob=new Rectangle();
res=ob.calculateArea(length,width);
System.out.println("Area is:"+res);
res=ob.calculatePerimeter(length,width);
System.out.println("Perimeter is:"+res);
}//main
}//Test