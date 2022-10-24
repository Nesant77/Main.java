import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String playerA = "";

        String playerB = "";

        String trash = "";

        boolean done = false;

        Scanner in = new Scanner(System.in);

        String playAgain = "";

        do
        {
            System.out.print("Player A, Enter your move.[r,s,p] :");

            if(in.hasNextLine())
            {
                playerA = in.nextLine();

                System.out.print("Player B, Enter your move.[r,s,p]");
                playerB = in.nextLine();

                if (playerA.equalsIgnoreCase("r"))
                {
                    if (playerB.equalsIgnoreCase("r"))
                    {
                        System.out.println("It's a Draw. Both of you selected Rock.");
                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("p"))
                    {
                        System.out.println("Player B wins! Paper beats Rock.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }

                    }
                    else if (playerB.equalsIgnoreCase("s"))// Player B must be Scissors
                    {
                        System.out.println("Player A Wins!Rock beats Scissors.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You need to enter a valid RPS Move for both players to continue playing. ");}
                }

                else if (playerA.equalsIgnoreCase("p"))
                {
                    if (playerB.equalsIgnoreCase("r"))
                    {
                        System.out.println("Player A Wins! Paper beats Rock.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("p"))
                    {
                        System.out.println("It's a Draw!Both of you selected Paper");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("s")) // Player B must be Scissors
                    {
                        System.out.println("Player B Wins!Scissors beats Paper");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }

                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You need to enter a valid RPS Move for both players to continue. ");
                    }
                }
                else if (playerA.equalsIgnoreCase("s")) // playerA must be Scissors
                {
                    if (playerB.equalsIgnoreCase("r"))
                    {
                        System.out.println(" Player B Wins!Rock beats Scissors.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("p"))
                    {
                        System.out.println("Player A Wins!Scissors beats Paper.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("s")) // Player B must be Scissors
                    {
                        System.out.println("It's a Draw!Both of you selected Scissors");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You need to enter a valid RPS Move for both players to continue. ");
                    }
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You need to enter a valid RPS Move for both players to continue. ");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You need to enter a valid RPS Move for both players to continue.");}

        }while(!done);

    }
}
