
public class TicTacToe {

    private enum Status {

        X, O, EMPTY
    };
    private int[][] board = new int[3][3];

    //initializes the variables of the array
    // receives parameter num and checks which variable to initialize
    public void set(int num, int num2) {
        if (num == 1 && board[0][0] == 0) {
            board[0][0] = num2;
        } else if (num == 2 && board[0][1] == 0) {
            board[0][1] = num2;
        } else if (num == 3 && board[0][2] == 0) {
            board[0][2] = num2;
        } else if (num == 4 && board[1][0] == 0) {
            board[1][0] = num2;
        } else if (num == 5 && board[1][1] == 0) {
            board[1][1] = num2;
        } else if (num == 6 && board[1][2] == 0) {
            board[1][2] = num2;
        } else if (num == 7 && board[2][0] == 0) {
            board[2][0] = num2;
        } else if (num == 8 && board[2][1] == 0) {
            board[2][1] = num2;
        } else if (num == 9 && board[2][2] == 0) {
            board[2][2] = num2;
        }

    }

    //displays arrray after each player plays 
    public void display() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] == 0) {
                    System.out.print("     ");
                } else if (board[row][column] == 1) {
                    System.out.print("  X  ");
                } else if (board[row][column] == 2) {
                    System.out.print("  O  ");
                }
            }
            System.out.println();
               System.out.println();
                  System.out.println();
            
        }
    }

    //checks if move will be a winining move for player1
    public int check() {
        int num = 0;
        if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
            return 1;
        } else if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) {
            return 1;
        } else if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
            return 1;
        } else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) {
            return 1;
        } else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
            return 1;
        } else if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
            return 1;
        } else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) {
            return 1;
        } else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
            return 1;
        } else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) {
            return 1;
        } else if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    //checks if move will be a winining move for player2
    public int check3() {
        int num = 0;
        if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
            return 2;
        } else if (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2) {
            return 2;
        } else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
            return 2;
        } else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) {
            return 2;
        } else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) {
            return 2;
        } else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
            return 2;
        } else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) {
            return 2;
        } else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) {
            return 2;
        } else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) {
            return 2;
        } else if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) {
            return 2;
        }
        else {
            return 0;
        }
    }
// method to check for zero spaces and returns location 

    public int computer() {
        int compMove = 0;
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] == 0) {
                    if (row == 0 && column == 0) {
                        compMove = 1;
                    } else if (row == 0 && column == 1) {
                        compMove = 2;
                    } else if (row == 0 && column == 2) {
                        compMove = 3;
                    } else if (row == 1 && column == 0) {
                        compMove = 4;
                    } else if (row == 1 && column == 1) {
                        compMove = 5;
                    } else if (row == 1 && column == 2) {
                        compMove = 6;
                    } else if (row == 2 && column == 0) {
                        compMove = 7;
                    } else if (row == 2 && column == 1) {
                        compMove = 8;
                    } else if (row == 2 && column == 2) {
                        compMove = 9;
                    }
                }
            }

        }
        return compMove;

    }

    public int finish() {
        int num = 0;

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] == 0) {
                } else if (board[row][column] == 1) {
                    num++;
                } else if (board[row][column] == 2) {
                    num++;
                }
            }
            System.out.println();
        }
        return num;
    }

}
