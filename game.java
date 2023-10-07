import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        String computer;
        String user;
        String winner;
        System.out.println("Choose Your Choice:");
        System.out.println("1.Rock\n2.Paper\n3.Scissor");
        computer=generateComputer(random);
        user=userChoice(scanner);
        winner=chooseWinner(computer,user);
        System.out.println("Your Choice:"+user+"\nComputer Choice:"+computer);
        System.out.println(winner);
    }
    static String generateComputer(Random random)
    {
        int word=random.nextInt(3)+1;
        String computer="";
        if(word==1)
        {
            computer="Rock";
        }
        else if(word==2)
        {
            computer="Paper";
        }
        else if(word==3)
        {
            computer="Scissor";
        }
        System.out.println("The computer has its choice already taken");
        return computer;
    }
    static String userChoice(Scanner scanner)
    {
        String word="";
        System.out.print("Now your Turn:");
        word=scanner.nextLine();
        return word;
    }
    static String chooseWinner(String computer,String user)
    {
        String winner="No Winner";
        String custom="Both Choose Same";
        String finalMessage="";
        String rockCustom="Rock Smashes the Scissor";
        String paperCustom="The paper holds the tightly";
        String scissorCustom="The Scissor cuts the paper into pieces";
        if(computer.equals("Rock")&&user.equalsIgnoreCase("Scissor"))
        {
            winner="Computer";
            custom=rockCustom;
        }
        else if(user.equalsIgnoreCase("Rock")&&computer.equalsIgnoreCase("Scissor"))
        {
            winner="User";
            custom=rockCustom;
        }
        if(computer.equals("Scissor")&&user.equalsIgnoreCase("Paper"))
        {
            winner="Computer";
            custom=scissorCustom;
        }
        else if(user.equalsIgnoreCase("Scissor")&&computer.equals("Paper"))
        {
            winner="User";
            custom=scissorCustom;
        }
        if(computer.equals("Paper")&&user.equalsIgnoreCase("Rock"))
        {
            winner="Computer";
            custom=paperCustom;
        }
        else if(user.equalsIgnoreCase("Paper")&&computer.equals("Rock"))
        {
            winner="User";
            custom=paperCustom;
        }
        finalMessage=winner+"won("+custom+")";
        return finalMessage;
    }
}
