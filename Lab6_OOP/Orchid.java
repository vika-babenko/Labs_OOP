package Lab6_OOP;

public class Orchid extends Flower {
    private int quantityOfPetals;

    public Orchid(int price, int quantityOfPetals, int freshness) {
        super(price, freshness);
        this.quantityOfPetals = quantityOfPetals;
    }



}
