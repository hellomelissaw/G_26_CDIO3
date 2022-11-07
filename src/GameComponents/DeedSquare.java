package GameComponents;

public class DeedSquare extends SquareName{

    Deed deed;
    boolean sellDeed = false;

    public DeedSquare(String deedName , Deed deed) {
        super(deedName);
        this.deed = deed;
    }

    Deed getDeed(){
        return deed;
    }

    public boolean hasDeed(){ // Checks if the square has a deed available to buy or if it's already sold
        return sellDeed;
    }

    public void sellDeed(){ // Sets deed to null so Square no longer has a deed
        sellDeed = true ;
    }
}
