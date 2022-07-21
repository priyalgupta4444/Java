import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static Scanner scan = new Scanner(System.in);

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        System.out.println(gallows[0]);
        //System.out.println("\n\n");
        int n = randomNum();
        int space = words[n].length();
        char[] w = new char[space];
        char[] blank = new char[space];
        for(int i = 0;i<w.length;i++)
        {
            w[i] = '_';
            blank[i] = '_';
            System.out.print(w[i]+" ");
            
        }
        System.out.println("\n\n");
        
        char[] miss = { '_','_','_','_','_','_'};
        int x= 0;
        int num = 1;
        while(true)
        {
            
            System.out.println("Enter a character: ");
            String a = scan.next();
            check(w, a.charAt(0),words[n]);
            worline(w);
            if(Arrays.equals(w, blank))
            {
                
                System.out.println(gallows[num]);
                num++;
                miss[x] = a.charAt(0);
                x++;
                if(x>5)
                {
                    System.out.println("\n\n Youre out! ");
                    System.out.println("WORD WAS: "+words[n]);
                    System.exit(0);
                }
            }
            else{
                System.out.println(gallows[num-1]);
                nolet(w,blank);
                check2(w,words[n]);
            }
            System.out.println("Misses: "+ Arrays.toString(miss));
        }


    }

    public static void check2(char[] w, String n)
    {
        int x = 0;
        for(int i=0;i<w.length;i++)
        {
            if(w[i] == n.charAt(i))
            {
                x++;
            }
        }
        if(x==w.length)
        {
            System.out.println("BINGO! YOU WON!");
            System.exit(0);
        }
    }

    public static void worline(char[] w)
    {
        System.out.println("\n\n");
        for(int i=0;i<w.length;i++)
        {
            System.out.print(w[i]+" ");
        }
        System.out.println("\n");
    }

    public static char[] check(char[] w,char a,String word)
    {
        for(int i = 0;i<w.length;i++)
        {
            if(a == word.charAt(i) )
            {
                w[i] = a;
                
            }
        }
        return w;

    }

    public static void nolet(char[] w,char[] blank)
    {
        for(int i =0;i<w.length;i++)
        {
            blank[i] = w[i];
        }
    }

    public static int randomNum()
    {
        double n = Math.random();
        n = (n*words.length)+1;
        return (int)n;
    }

}





