package GameComponents;

public class BoardInit {
    Square[] board = new Square[24];
    String squareName;
    //public void initializeSquares() {
    public BoardInit() {

        board[0] = new StartSquare("Start");
        board[1] = new DeedSquare("The Burgerbar",1);
        board[2] = new DeedSquare("The Pizzahouse", 1);
        board[3] = new ChanceSquare("Chance");
        board[4] = new DeedSquare("The Candy Store",1);
        board[5] = new DeedSquare("Ice Cream Shop", 1);
        board[6] = new JailSquare("Visitor at the Jail");
        board[7] = new DeedSquare("The Museum",2);
        board[8] = new DeedSquare("The Library",2);
        board[9] = new ChanceSquare("Chance");
        board[10] = new DeedSquare("The Skate Park",2);
        board[11] = new DeedSquare("The Pool",2);
        board[12] = new FreeParkingSquare("Free Parking");
        board[13] = new DeedSquare("The Playing Hall",3);
        board[14] = new DeedSquare("The Cinema",3);
        board[15] = new ChanceSquare("Chance");
        board[16] = new DeedSquare("The Toy Store",3);
        board[17] = new DeedSquare("The Pet Shop",3);
        board[18] = new JailSquare("Go to Jail");
        board[19] = new DeedSquare("The Bowling Alley",4);
        board[20] = new DeedSquare("The Zoo",4);
        board[21] = new ChanceSquare("Chance");
        board[22] = new DeedSquare("The Water Park",4);
        board[23] = new DeedSquare("The Board Walk",4);

    }

    public Square[] getSquareArr() {
        return board;
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
