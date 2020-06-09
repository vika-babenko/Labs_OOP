package Lab6_OOP;

import java.util.Objects;

public class Flower extends BouquetComponent{
    private int freshness;
    private int length;
    //generation of equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return freshness == flower.freshness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(freshness);
    }

    //generation of constructor
    public Flower(int price, int freshness, int length) {
        super(price);
        this.freshness = freshness;
        this.length = length;
    }

//generation getter for freshness
    public int getFreshness() {
        return freshness;
    }

    @Override
    public int getLength() {
        return length;
    }

    //generation toString for output in console
    //беремо клас об*єкту і отримуємо назву
    @Override
    public String toString() {
        return "Flower {" +
                "name of flower=" + /*this.*/getClass().getSimpleName() +
                ", freshness=" + freshness +
                ", length=" + length +
                '}';
    }

}
