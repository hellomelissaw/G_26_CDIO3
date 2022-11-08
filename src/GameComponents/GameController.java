package GameComponents;
import java.util.Scanner;

public class GameController {

    public void init(){
        BoardInit board = new BoardInit();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of player (2-4):");
        int playerCount = userInput.nextInt();

        int[] player = new int[playerCount];

        for (int i = 0 ; i < playerCount ; i++) {
            System.out.println("Player " + i+1 + "enter your name:");
            String playerName = userInput.nextLine();
            player[i]= new Player(playerName,);
        }


    }

}
