import java.util.Scanner;
class calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your 1st Number:");
        int a=sc.nextInt();
        System.out.print("Enter Your 2nd Number:");
        int b=sc.nextInt();
        int result;
        System.out.println("Choose Your Opearation:");
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Modulo\n5.Division");
        System.out.print("Enter Your Choice:");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                result=a+b;
                System.out.println("The sum is:"+result);
                break;
            case 2:
                result=a-b;
                System.out.println("The difference is:"+result);
                break;
            case 3:
                result=a*b;
                System.out.println("The product is:"+result);
                break;
            case 4:
                result=a%b;
                System.out.println("The modulo is:"+result);
                break;
            case 5:
                result=a/b;
                System.out.println("The division is:"+result);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}