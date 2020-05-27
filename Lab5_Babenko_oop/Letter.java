package Lab5_Babenko_oop;

public class Letter {
    // todo analyze are all of the fields needed
    private boolean isUpperCase;
    private boolean isVowel;
    private char symbol;


    // GENERATION OF CONSTRUCTOR FOR SYMBOL
    public Letter(char symbol) {
        this.symbol = symbol;
    }

    //output with method toString() for symbol
    @Override
    public String toString() {
        return "" + symbol;
        /*return "Letter{" +
                "symbol=" + symbol +
                '}';*/

    }
}
