package Lab6_OOP;

public class Orchid extends Flower {
    private int quantityOfPetals;

    public Orchid(int price, int quantityOfPetals, int freshness, int length) {
        super(price, freshness, length);
        this.quantityOfPetals = quantityOfPetals;
    }



}
