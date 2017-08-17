import java.util.Scanner;
public class perfectornot
{
public static void main(String[] args)
{
int a, total=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number:");
a= scan.nextInt();
for(int i=1; i<a; i++)
{
if(a%i==0)
{
total=total+i;
}
}
if(total==a)
{
System.out.println("The number is perfect.");
}
else
{
System.out.println("The number is not perfect.");
}
}
}
