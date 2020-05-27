package Lab5_Babenko_oop;

public class Client {
    private Text text;

    public Client(Text text) {
        this.text = text;
    }
    public void startLiveInTheSystem() {
        System.out.println("Word's entrances quantity: " + text.findWordEntrancesQuantity("Hello"));
    }
}
