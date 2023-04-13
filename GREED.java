import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.io.*;
import java.lang.Math;
import java.lang.runtime.*;
import javax.lang.model.util.ElementScanner14;
import javax.swing.DefaultBoundedRangeModel;

public class GREED {


public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";

public static final String BLACK_BOLD = "\033[1;30m";  
public static final String RED_BOLD = "\033[1;31m";    
public static final String GREEN_BOLD = "\033[1;32m";  
public static final String YELLOW_BOLD = "\033[1;33m";
public static final String BLUE_BOLD = "\033[1;34m";   
public static final String PURPLE_BOLD = "\033[1;35m"; 
public static final String CYAN_BOLD = "\033[1;36m";   
public static final String WHITE_BOLD = "\033[1;37m";

public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";


    public static int n;

    public static int score = 0;
    
    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        String[][] board = new String[n][3*n];

        int a = (n/2);
        int b = ((3*n)/2);



        setBoard(board , a , b);
        printBoard(board);
        movement( board, a, b);


        
    }


    //PrintBoard
    //PAINTING
    public static void printBoard(String board[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3 * n; j++) {

                if(board[i][j].equals("1"))
                {
                    System.out.print(ANSI_BLUE + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("2"))
                {
                    System.out.print(ANSI_GREEN + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("3"))
                {
                    System.out.print(ANSI_RED + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("4"))
                {
                    System.out.print(ANSI_YELLOW + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("5"))
                {
                    System.out.print(ANSI_PURPLE + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("6"))
                {
                    System.out.print(ANSI_CYAN + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("7"))
                {
                    System.out.print(ANSI_WHITE + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("8"))
                {
                    System.out.print(ANSI_BLACK + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("9"))
                {
                    System.out.print(BLACK_BOLD + board[i][j] + ANSI_RESET);
                }
                else if(board[i][j].equals("#"))
                {
                    System.out.print(ANSI_WHITE_BACKGROUND + board[i][j] + ANSI_RESET);
                }
                else
                {
                    System.out.print(board[i][j]);
                }

                    System.out.print(" ");
            }

            System.out.println();
        }
    }


    //SetBoard
    public static void setBoard(String board[][] , int a , int b)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 3 * n; j++)
            {
                    if(i == a && j == b)
                    {
                        board[i][j] = "#";
                    }
                    else
                    {
                    board[i][j] = String.valueOf((int)(((Math.random() * 10 ) % 9) + 1));
                    } 
            }
        }
    }



//Moving
public static void movement(String board[][] , int a , int b)
{
    Scanner scanner  = new Scanner(System.in);
    
    
    while(true)
    {

    char x = scanner.nextLine().toLowerCase().charAt(0);
     
    switch (x) 
    {
        case 'w':
        {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            if(a == 0 || board[a - 1][b]==" " || a - Integer.parseInt(board[a-1][b]) < 0 )
            {
                System.out.println("Cannot MOVE...");
                 break;
            }
            else 
            {
                System.out.println("Moving Up");

                int np =  a - Integer.parseInt(board[a-1][b]);
                for(int i = a ; i >= np ; i--)
                {
                      board[i][b]=" ";
                      score++;
                }
                a=np;
                board[a][b]="#";
                
            }

        break;
        }


        case 's':
        {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            if(a == n-1 || board[a + 1][b]==" "|| a + Integer.parseInt(board[a + 1][b]) >= n )
            {
                System.out.println("Cannot MOVE...");
                 break;
            }
            else 
            {
                System.out.println("Moving Down");
                int np =  a + Integer.parseInt(board[a + 1][b]);
                for(int i = a ; i < np ; i++)
                {
                      board[i][b]=" ";
                      score++;
                }
                a=np;
                board[a][b]="#";
                
            }

        break;
        }


        case 'a':
        {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            if(b == 0 || board[a][b-1]==" "|| b - Integer.parseInt(board[a][b-1]) < 0 )
            {
                System.out.println("Cannot MOVE...");
                 break;
            }
            else 
            {
                System.out.println("Moving Left");
                int np =  b - Integer.parseInt(board[a][b-1]);
                for(int j = b ; j >= np ; j--)
                {
                      board[a][j]=" ";
                      score++;
                }
                b=np;
                board[a][b]="#";
                
            }

        break;
        }


        case 'd':
        {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            if(b == 3*n-1 || board[a][b+1]==" "|| b + Integer.parseInt(board[a][b+1]) >= 3*n )
            {               
                System.out.println("Cannot MOVE...");                                    
                 break;
            }
            else 
            {
                System.out.println("Moving Right");
                int np =  b + Integer.parseInt(board[a][b+1]);
                for(int j = b ; j < np ; j++)
                {
                      board[a][j]=" ";
                      score++;
                }
                b=np;
                board[a][b]="#";
            }

        break;
        }
    }
    
    
    
    printBoard(board);
    
    endChecker(a, b, board, n);
}
}



//ENDCHECK
 public static void endChecker(int a , int b , String board[][] , int n)
{
     if((a == 0 || board[a-1][b] == " " || a - Integer.parseInt(board[a-1][b]) < 0) 
     && (a == n-1 || board[a+1][b] == " " || a + Integer.parseInt(board[a+1][b]) > (n-1)) 
     && (b == 0 || board[a][b-1] == " " || b - Integer.parseInt(board[a][b-1]) < 0) 
     && (b == 3*n-1 || board[a][b+1] == " " || b + Integer.parseInt(board[a][b+1]) > (3*n-1)))
    {
        System.out.println("\n\n");
        
        System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\" + ANSI_RED_BACKGROUND + ":|:|:GAME-OVER:|:|:" + ANSI_RESET + "\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");

        System.out.println("\n\n");

        System.out.println(ANSI_PURPLE_BACKGROUND + "<<<<<--SCORE-->>>>> " + ANSI_RESET + score);

        System.out.println("\n\n");


        System.out.println("                |OOO|                     |OOO|             ");
        System.out.println("                OOOOO         [|]         OOOOO             ");
        System.out.println("                |OOO|         [|]         |OOO|             ");
        System.out.println("            O ____________________________________ O       ");
        System.out.println("              O \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/ O         ");
        System.out.println("                O ---------------------------- O           ");
        System.out.println("                  O |||||||||||||||||||||||| O             ");
        System.out.println("                    O \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/ O               ");
        System.out.println("                      O _______________ O                 ");
        System.out.println("                                                            ");
        System.out.println("        [=[=[=[=[[[[[SEE YOU NEXT TIME LOSER]]]]]=]=]=]=]           ");
        System.out.println("\n\n");


         System.exit(404);

    }
    else
    {
        System.out.println("GG, Playing...");
    }
}


































}









