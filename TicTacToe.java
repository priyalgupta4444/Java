import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.
            char[][] arr = {{ '_','_','_'},{'_','_','_'},{'_','_','_'}};
            //Task 2: Call the function printBoard();
            printBoard(arr);
             
              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }*/
            char x ='x';
            char o = 'o';
            for(int i = 0;i<9;i++)
            {
              if(i%2==0)
              {
                System.out.println("Turn: o");
                askUser( arr,o );
                printBoard(arr);
              }
              else
              {
                System.out.println("Turn: x");
                askUser(arr,x);
                printBoard(arr);
              }
            }
            System.out.println("\n\nIts a tie!\n\n");
                /*Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */

            scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */        

    public static void printBoard(char[][] arr)
    {
      for(int i = 0;i<3;i++)
      {
        System.out.print("\n\n");
        for(int j=0;j<3;j++)
        {
          System.out.print("\t"+arr[i][j]);
        }
      }
      System.out.println("\n");
    }    

   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */

    public static char[][] askUser(char[][] arr,char c)
    {
      //System.out.println("Enter row and column number: ");
    
        while(true){
        
        System.out.println("Enter row and column number: ");
        int x = scan.nextInt();
        int y= scan.nextInt();
        if(x>2||y>2)
        {
          System.out.println("Invalid value! ");
          continue;
        }
        if(arr[x][y]=='_')
        {
          arr[x][y] =c;
          checkWin(arr);
          return arr;
        }
        else
        {
          System.out.println("number is already occupied!");
        }
        
      }
    }

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */

     public static void checkWin(char[][] arr)
     {
      for(int i=0;i<3;i++){
        if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][1]!='_')
        {
          printBoard(arr);
          System.out.println("\n\n"+arr[i][0]+" wins!!\n\n");
          System.exit(0);
        }}
      for(int j=0;j<3;j++)
      {
        if(arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j] && arr[1][j]!='_')
        {
          printBoard(arr);
          System.out.println("\n\n"+arr[0][j]+" wins!!\n\n");
          System.exit(0);
        }
      }
      if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[1][1]!='_')
        {
          printBoard(arr);
          System.out.println("\n\n"+arr[0][0]+" wins!!\n\n");
          System.exit(0);
        }
      
      if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[1][1]!='_')
        {
          printBoard(arr);
          System.out.println("\n\n"+arr[0][2]+" wins!!\n\n");
          System.exit(0);
        }
      
     }

}
