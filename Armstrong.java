import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
int n=0,b, temp;
int c=153;
temp=c;
while(c>0)
{
b=c%10;
c=c/10;
n=n+(b*b*b);
}
if(temp==n)
{
System.out.println("Armstrong Number.");
}
else
{
System.out.println("Not a armstrong number.");
}
}
}
