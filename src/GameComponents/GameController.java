package GameComponents;
//import gui_main.GUI;

import java.util.Scanner;

public class GameController {
    int playerCount = 0;
    int balance = 0;
    Player[] player;
   // GUI gui = new GUI();
    public void init(){
        BoardInit board = new BoardInit();
        board.getSquareArr();
        //System.out.println(board[2]);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of player (2-4):");
        playerCount = userInput.nextInt();
        balance = 20-(playerCount-2)*2;
        if (playerCount < 2 || playerCount > 4) {
            System.out.println("Invalid player number, pleaSe enter an integer between 2 and 4 inclusively.");
        }

        player = new Player[playerCount];

        for (int i = 0 ; i < playerCount ; i++) {
            //System.out.println("There are " + playerCount + "players.");
            int playerNumber = i + 1;
            System.out.println("Player " + playerNumber + " enter your name:");
            Scanner input = new Scanner(System.in);
            String playerName = input.nextLine();
            player[i] = new Player(playerName); // INITIALISE EACH PLAYER WITH NAME
            player[i].depositMoney(balance); // DEPOSIT INITIAL BALANCE
        }

    }

    public void run() {
        //PlayerTurn action = new PlayerTurn();
        Cup cup = new Cup();
        int[] diceArr;
        for (int i = 0 ; i < playerCount ; i++) {
            diceArr = cup.getSum();
            int sum = diceArr[2];
            System.out.println("You have rolled a " + diceArr[0] + " and a " + diceArr[1] + ". You move " + sum + " squares.");
            int newPosition = player[i].updatePosition(sum);

            int playerIndex = i+1;
            System.out.println("Player" + playerIndex + " you are on square " + newPosition);

        }


    }

}
