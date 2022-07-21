import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        String x  = scan.nextLine();
        System.out.println("\n\nYou get : ");
        int ua = randomCard(0);
        int ub = randomCard(0);
        int uscore = ua+ub;
        System.out.println("Your total is: "+uscore);
        x = scan.nextLine();
        System.out.println("\n\nThe dealer shows: ");
        int da = randomCard(0);
        int db = randomCard(15);
        int dscore = da+db;
        
        System.out.println("\nThe dealer's total is hidden");

        //Task 3 – Wait for the user to press enter.
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>

        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden

        System.out.println("\n\nHit or Stay: ");
        x= scan.nextLine();
        String h = "Hit";
        String s = "Stay";
        if(x.equals(s))
        {
            dealer(da,db,dscore,uscore);
            
        }
        int uc;
        while(!x.equals(s))
        {
            System.out.println("Your card is: ");
            uc = randomCard(0);
            uscore+=uc;
            if(uscore>21)
            {
                System.out.println("Your total score is: "+uscore);
                System.out.println("Total exceeds 21.\n\nBUST \n\ndealer wins!");
                System.exit(0);
            }
            else
            {
                System.out.println("Your total score is: "+uscore);
                System.out.println("\nHit or Stay : ");
                x = scan.nextLine();
            }
        }
        dealer(da,db,dscore,uscore);
        
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 

        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

    
    public static void dealer(int da,int db,int dscore,int uscore)
    {
        System.out.println("The dealer's cards are: ");
        randomCard(da);
        randomCard(db);
        int dc=0;
        if(dscore>=17)
        {
            System.out.println("\nDealer's total: "+dscore);
        }
        while(dscore<17)
        {
            dc = randomCard(0);
            dscore+=dc;
        }
        System.out.println("\nDealer's total: "+dscore);
        if(dscore>21)
        {
            System.out.println("Score exceeded 21.\n\nBUST \n\nYOU WIN!");
            System.exit(0);
        }
        else if(dscore>uscore)
        {
            System.out.println("\nDealer's hand value is greater than your hand value. \nDealer wins!");
        }
        else if(uscore>dscore)
        {
            System.out.println("\nYour hand value is greater than dealer's value. \nYou win!");
        }
        else 
        {
            System.out.println("\nIts a tie!");
        }

    }
    
     
   
     public static int randomCard(int a)
     {
        double n = Math.random();
        n =(n*13)+1;
        int r = (int)n;
        int x=0;
        if(a>13)
        {
             x = r;
            r = 15;
        }
        else if(a!=0)
        {
            r=a;
        }
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
            case 13: System.out.println("   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n");return 13;
            default: System.out.println("Card is facedown!");
            System.out.println(
                "   _____\n"+
                "  |     |\n"+ 
                "  |  J  |\n"+
                "  | JJJ |\n"+
                "  |  J  |\n"+
                "  |_____|\n");
                return x;
        }
     }
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    }

