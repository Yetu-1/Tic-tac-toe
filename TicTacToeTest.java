
import java.util.Scanner;

public class TicTacToeTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int num1;
        int sentinel = 0;
        int control;
        int control1;
        int ans;
        TicTacToe test = new TicTacToe();
        
      
        System.out.println("Do you want to go first , if yes input 1 else input 2");
        ans = input.nextInt();
        if (ans == 1) {

            while (sentinel == 0) {
                System.out.println("Enter move Player1:");

                num = input.nextInt();
                test.set(num, 1);
                test.display();
                // invokes method that checks if player1's move is winning move and if so returns a variabble that deceides if to print a message or not
                control = test.check();
                if (control != 0) {
                    sentinel = 1;
                    System.out.println("Player1 Wins");
                    break;
                } else if (control == 0) {
                    sentinel = 0;
                      int fin2 = test.finish();
                    if (fin2 == 9){
                        sentinel = 1;
                    }
                }

                System.out.println("Enter move player2:");
                // invokes method computer to check zero spaces and return location
                num1 = test.computer();
                test.set(num1, 2);
                test.display();
                // invokes method that checks if player2's move is winning move and if so returns a variabble that deceides if to print a message or not
                control1 = test.check3();
                if (control1 != 0) {
                    sentinel = 1;
                    System.out.println("Player2 Wins");
                    break;

                } else if (control1 == 0) {
                    sentinel = 0;
                    int fin3 = test.finish();
                    if (fin3 == 9){
                        sentinel = 1;
                    }
                }

            }
        }
        else if (ans == 2){
                  while (sentinel == 0) {
                System.out.println("Enter move Player1:");

                num = test.computer();
                test.set(num, 1);
                test.display();
                // invokes method that checks if player1's move is winning move and if so returns a variabble that deceides if to print a message or not
                control = test.check();
                if (control != 0) {
                    sentinel = 1;
                    System.out.println("Player1 Wins");
                    break;
                } else if (control == 0) {
                    sentinel = 0;
                    int fin = test.finish();
                    if (fin == 9){
                        sentinel = 1;
                    }
                }

                System.out.println("Enter move player2:");
                // invokes method computer to check zero spaces and return location
                num1 = input.nextInt();
                test.set(num1, 2);
                test.display();
                // invokes method that checks if player2's move is winning move and if so returns a variabble that deceides if to print a message or not
                control1 = test.check3();
                if (control1 != 0) {
                    sentinel = 1;
                    System.out.println("Player2 Wins");
                    break;

                } else if (control1 == 0) {
                    sentinel = 0;
                    int fin1 = test.finish();
                    if (fin1 == 9){
                        sentinel = 1;
                    }
                }

            }
        }
    }
}
