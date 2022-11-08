package GameComponents;


//We are going to reuse the player class from the previous project CDIO1//
public class Player {

    private String playerName;
    private int balance;
    Account PlayerAccount = new Account(playerName);

    public Player(String playerName) {
        this.playerName = playerName;
        //this.balance = balance;
        //System.out.println(playerName);
        //PlayerAccount.setBalance(balance);

    }

    /*
    public int getPlayerNumber() {
        return playerNumber;
    }

     */

    public void withdrawMoney(int newPoints) {
        PlayerAccount.withDraw(newPoints);
    }

    public void depositMoney(int newPoints){
        PlayerAccount.deposit(newPoints);
    }

    public int getCurrentBalance(){
        //System.out.println(PlayerAccount.getBalance());
        return (PlayerAccount.getBalance());
    }

    public String getPlayerName (){
        return playerName;
    }
}