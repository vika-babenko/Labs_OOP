package Lab5_Babenko_oop;

public class Letter {
    /**
     * variables
     */
    private char symbol;


    /**
     * constructor for access to symbols
     */
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
