package GameComponents;
import java.util.Scanner;

public class GameController {
    int playerCount = 0;
    int balance = 0;
    Player[] player = new Player[playerCount];
    public void init(){
        BoardInit board = new BoardInit();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of player (2-4):");
        playerCount = userInput.nextInt();
        balance = 20-(playerCount-2)*2;
        if (playerCount < 2 || playerCount > 4) {
            System.out.println("Invalid player number, pleaSe enter an integer between 2 and 4 inclusively.");
        }

        for (int i = 0 ; i < playerCount ; i++) {
            int playerNumber = i + 1;
            System.out.println("Player " + playerNumber + "enter your name:");
            Scanner input = new Scanner(System.in);
            String playerName = input.nextLine();
            player[i] = new Player(playerName); // INITIALISE EACH PLAYER WITH NAME
            player[i].depositMoney(balance); // DEPOSIT INITIAL BALANCE
        }

    }

    public void run() {
        PlayerTurn action = new PlayerTurn();
        for (int i = 0 ; i < playerCount ; i++) {
            action.move(player[i]);
        }


    }

}
