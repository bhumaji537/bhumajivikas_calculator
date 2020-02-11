import java.lang.*;
import java.util.*;
public class calculator
{
  static int add(int a,int b)
{
  return a+b;
}
static int sub(int a,int b)
{
  return a-b;
}
static int mul(int a,int b)
{
  return a*b;
}
static int div(int a,int b)
{  
      int k=(int)(a/b);
  return k;
}
 public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   int b=s.nextInt();
    char c=s.next().charAt(0);
    int x=0;
    if(c=='+')
     x=add(a,b);
    else if(c=='-')
     x=sub(a,b);
    else if(c=='*')
     x=mul(a,b);
    else if(c=='/')
      x=div(a,b);
  System.out.print(x);
 }
}

