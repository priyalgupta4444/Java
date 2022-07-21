import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets play Pokerito. type anything when ready. ");
        String x= scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n• There are two players, you and the computer.\n• The dealer will give each player one card.");
        System.out.println("• Then, the dealer will draw five cards (the river)\n• The player with the most river matches wins!\n• If the matches are equal, everyone's a winner!");
        System.out.println("\nReady? Type anything if you are.");
        x= scan.nextLine();
        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */
        System.out.println("here's your card: ");
        int user =randomCard();

        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */
        System.out.println("\n\nHere's the computer's card : ");
        int comp= randomCard();
        int yourMatches = 0;
        int computerMatches =0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */
        System.out.println("\n\nNow, the dealer will draw 5 cards. press any key to continue.");
        x= scan.nextLine();
        int a=randomCard();
        x= scan.nextLine();
        if(a==user){yourMatches++;}
        if(a==comp){computerMatches++;}
        int b = randomCard();
        x= scan.nextLine();
        if(b==user){yourMatches++;}
        if(b==comp){computerMatches++;}
        int c = randomCard();
        x= scan.nextLine();
        if(c==user){yourMatches++;}
        if(c==comp){computerMatches++;}
        int d = randomCard();
        x= scan.nextLine();
        if(d==user){yourMatches++;}
        if(d==comp){computerMatches++;}
        int e = randomCard();
        x= scan.nextLine();
        if(e==user){yourMatches++;}
        if(e==comp){computerMatches++;}
        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */
        System.out.println("\n\n Your score: "+yourMatches+"\nComputer's score: "+computerMatches);
         if(yourMatches>computerMatches)
        {
            System.out.println("\n\nYou win!");
        }
        else if(computerMatches>yourMatches)
        {
            System.out.println("\n\nComputer wins!");
        }
        else 
        {
            System.out.println("its a tie! both win!!");
        }
        scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */

     public static int randomCard()
     {
        double n = Math.random();
        n =(n*13)+1;
        int r = (int)n;
        switch(r)
        {
            case 1: System.out.println("    _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n");return 1;
            case 2: System.out.println("   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n");return 2;
            case 3: System.out.println( "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n");return 3;
            case 4 : System.out.println("   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n");return 4;
            case 5: System.out.println("   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n");return 5;
            case 6: System.out.println("   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n");return 6;
            case 7: System.out.println("   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n");return 7;
            case 8: System.out.println("   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n");return 8;
            case 9: System.out.println( "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n");return 9;
            case 10: System.out.println("   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n");return 10;
            case 11: System.out.println("   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n");return 11;
            case 12 : System.out.println("   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n"); return 12;
            default: System.out.println("   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n");return 13;
        }
     }
}
