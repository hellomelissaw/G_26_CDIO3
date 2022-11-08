package GameComponents;

public class BoardInit {

    public void initializeSquares() {
        Square[] board = new Square[24];

        board[0] = new StartSquare("Start");
        board[1] = new DeedSquare("The Burgerbar");
        board[2] = new DeedSquare("The Pizzahouse");
        board[3] = new ChanceSquare("Chance");
        board[4] = new DeedSquare("The Candy Store");
        board[5] = new DeedSquare("Ice Cream Shop");
        board[6] = new JailSquare("Visitor at the Jail");
        board[7] = new DeedSquare("The Museum");
        board[8] = new DeedSquare("The Library");
        board[9] = new ChanceSquare("Chance");
        board[10] = new DeedSquare("The Skate Park");
        board[11] = new DeedSquare("The Pool");
        board[12] = new FreeParkingSquare("Free Parking");
        board[13] = new DeedSquare("The Playing Hall");
        board[14] = new DeedSquare("The Cinema");
        board[15] = new ChanceSquare("Chance");
        board[16] = new DeedSquare("The Toy Store");
        board[17] = new DeedSquare("The Pet Shop");
        board[18] = new JailSquare("Go to Jail");
        board[19] = new DeedSquare("The Bowling Alley");
        board[20] = new DeedSquare("The Zoo");
        board[21] = new ChanceSquare("Chance");
        board[22] = new DeedSquare("The Water Park");
        board[23] = new DeedSquare("The Board Walk");

    }
    public void initializeDeeds(){

        Deed[] boardDeed = new Deed[24];

        boardDeed[0] = new Deed(2, "START");
        boardDeed[1] = new Deed(1,"Gatekjøkkent Burgerbaren");
        boardDeed[2] = new Deed(1,"Pizzahuset Pizzeriaet");
        boardDeed[3] = new Deed(0,"Sjanse Chance");
        boardDeed[4] = new Deed(1,"Godtbutikken Slikbutikken");
        boardDeed[5] = new Deed(1,"Iskiosken");
        boardDeed[6] = new Deed(0,"Fengsel, På besøg");
        boardDeed[7] = new Deed(2, "Museet");
        boardDeed[8] = new Deed(2,"Biblioteket");
        boardDeed[9] = new Deed(0,"Chance");
        boardDeed[10] = new Deed(2,"Rullebrettparken Skateparken");
        boardDeed[11] = new Deed(2,"Svømmebassenget");
        boardDeed[12] = new Deed(0,"Parkering");
        boardDeed[13] = new Deed(3,"Spillehallen");
        boardDeed[14] = new Deed(3,"Kinoen Biografen");
        boardDeed[15] = new Deed(0,"Chance");
        boardDeed[16] = new Deed(3,"Lgetøjsbutikken");
        boardDeed[17] = new Deed(3,"Dyrebutikken");
        boardDeed[18] = new Deed(0,"Gå i Fengsel");
        boardDeed[19] = new Deed(4,"Bowlnghallen");
        boardDeed[20] = new Deed(4,"Zoologisk Have");
        boardDeed[21] = new Deed(0,"Chance");
        boardDeed[22] = new Deed(5,"Vandlandet");
        boardDeed[23] = new Deed(5,"Strandpromenaden");


    }
}
