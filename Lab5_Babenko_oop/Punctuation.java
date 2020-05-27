package Lab5_Babenko_oop;

public class Punctuation extends SentenceElement {
    //private field for punctuation
    private String symbols;

    //constructor
    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    // return toString() for symbols
    @Override
    public String toString() {
        return symbols ;
    }
}
