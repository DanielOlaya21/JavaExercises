package Exercises8_17;

public class Exercise8_17 {
/*
 * (Tic-Tac-Toe) Create a class TicTacToe that will enable you to write a program to play Tic- Tac-Toe. 
 * The class contains a private 3-by-3 two-dimensional array. Use an enum type to represent the value 
 * in each cell of the array. The enum’s constants should be named X, O and EMPTY (for a po- sition that does not contain an X or an O). 
 * The constructor should initialize the board elements to EMPTY. Allow two human players. 
 * Wherever the first player moves, place an X in the specified square, and place an O wherever 
 * the second player moves. Each move must be to an empty square. 
 * After each move, determine whether the game has been won and whether it’s a draw. 
 * If you feel ambitious, modify your program so that the computer makes the moves for one of the players. 
 * Also, allow the player to specify whether he or she wants to go first or second. 
 * If you feel exceptionally ambitious, develop a program that will play three-dimensional Tic-Tac-Toe
 * on a 4-by-4-by-4 board [Note: This is an extremely challenging project!].
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] PlusArray = {{"+","+","+"},
								{"+","+","+" },
								{"+","+","+"}};
		

		
		Scanner input = new Scanner(System.in); // declares a new input object.
		
		boolean turn = true;
		
		int i = 0;
		while(i < 9) { // 9 Turns. i is the turn counter.
			
			TicTacToe.PrintBoard(PlusArray);
			System.out.println("Which position would you like to play?: ");
			System.out.println("Insert Row: ");
			int Rows = input.nextInt();
			System.out.println("Insert Column: ");
			int Column = input.nextInt();
			
			if(turn) {
				PlusArray[Rows][Column] = "X";
				turn = false;
			}
			else {
				PlusArray[Rows][Column] = "O";
				turn = true;
			}
			
			i++;
			
		}
	}

}
