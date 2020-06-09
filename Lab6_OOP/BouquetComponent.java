package Lab6_OOP;

public class BouquetComponent {
    private int price;
    private int length;


    public BouquetComponent(int price, int length) {
        this.price = price;
        this.length = length;
    }

    public BouquetComponent(int price) {

    }

    /**
     * геттер для отримання довжини квітки
     * потрібен для пошуку квітів в заданому діапазоні
     */

    public int getLength() {
        return length;
    }

    // геттер для получения цены цветка, понадобится для поиска цветов в заданном диапазоне
    public int getPrice() {
        return price;
    }

}


