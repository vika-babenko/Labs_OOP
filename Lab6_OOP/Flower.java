package Lab6_OOP;

public class Flower extends BouquetComponent{
    private int freshness;

    //generation of constructor
    public Flower(int price, int freshness) {
        super(price);
        this.freshness = freshness;
    }

//generation getter for freshness
    public int getFreshness() {
        return freshness;
    }

    //generation toString for output in console
    //беремо клас об*єкту і отримуємо назву
    @Override
    public String toString() {
        return "Flower {" +
                "class=" + /*this.*/getClass().getSimpleName() +
                ", freshness=" + freshness +
                '}';
    }

}
