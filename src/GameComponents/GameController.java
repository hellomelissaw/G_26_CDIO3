package GameComponents;
import java.util.Scanner;

public class GameController {

    public void init(){
        BoardInit board = new BoardInit();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of player (2-4):");
        // TO DO : FEJL BESKED NÅR USER INPUT OVER 4 ELLER MINDRE END 2
        int playerCount = userInput.nextInt();
        int balance = 20-(playerCount-2)*2;
        if (playerCount < 2 || playerCount > 4) {
            System.out.println("Invalid player number, pleaSe enter an integer between 2 and 4 inclusively.");
        }

        Player[] player = new Player[playerCount];

        for (int i = 0 ; i < playerCount ; i++) {
            int playerNumber = i+1;
            System.out.println("Player " + playerNumber + "enter your name:");
            Scanner userInpu = new Scanner(System.in);
            String playerName = userInpu.nextLine();
            player[i] = new Player(playerName); // INITIALISE EACH PLAYER WITH NAME
            player[i].depositMoney(balance); // DEPOSIT INITIAL BALANCE

        }

        System.out.println(player[0]);


    }

}
