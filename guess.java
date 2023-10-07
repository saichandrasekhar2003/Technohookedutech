import java.util.Scanner;
import java.util.Random;
class guess
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0;
Random r=new Random();
int n=r.nextInt(50);
boolean flag=true;
while(flag)
{
System.out.print("Enter the number range between 1-50:");
int guess=sc.nextInt();
if(guess<n)
{
System.out.println("Your guessed number less than actual number..!!Try again");
count++;
}
else if(guess>n)
{
System.out.println("Your guessed number greater than actual number..!!Try again");
count++;
}
else
{
System.out.println("Hey You guessed correct number");
System.out.println("Total no.of attempts:"+count);
flag=false;
}
}
}
}