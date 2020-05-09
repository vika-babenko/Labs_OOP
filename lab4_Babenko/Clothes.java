package lab4_Babenko;

public class Clothes implements Comparable {
    //dynamic fields
    private byte size /*= 42*/;
    private int price;
    private String name /*="blouse"*/;
    private String material/* = "cotton"*/;
    private String colour /*= "green"*/ ;
    private String kind;
    private String brand;
    private String type /*= "office style"*/;
    private int clothesexistance;

    //constructor
    /*private*/public Clothes(){
        System.out.println(1);
    }

    /*private*/public Clothes(byte size){
        this.size = size;
    }

    //creating constructor by hands:)
    public Clothes(byte size, int price, String name, String material, String colour, String kind, String brand,
                   String type, int clothesexistance){
        //доступ до глобальних змінних
        this.size = size;
        this.price = price;
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.kind = kind;
        this.brand = brand;
        this.type = type;
        this.clothesexistance = clothesexistance;

    }

    //creating toString()
    @Override
    public String toString() {

        return "Clothes {" +
                "size = " + size +
                ", price = '" + price + '\'' +
                ", name = '" + name + '\'' +
                ", material = '" + material + '\'' +
                ", colour = '" + colour + '\'' +
                ", kind = '" + kind + '\'' +
                ", brand = '" + brand + '\'' +
                ", type = '" + type + '\'' +
                ", clothesexistance = '" + clothesexistance + '\'' +
                '}';
    }

    /*public byte getSize(){
        return size;
    }

    public void setSize(byte size){
        this.size = size;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getNames(){
        return name;
    }

    public void setNames(String names){
        this.name = names;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getKind(){
        return kind;
    }

    public void setKind(String kind){
        this.kind = kind;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(){
        this.brand = brand;
    }

    public String getType(){
        return type;
    }

    public void setType(){
        this.type = type;
    }*/



    public boolean isclothesexists() {
        return clothesexistance > 0;
    }

//generation
    @Override
    public int compareTo(Object o) {
       int nameCompareResult = -name.compareTo(((Clothes)o).name);
        return nameCompareResult != 0 ? nameCompareResult : material.compareTo(((Clothes) o).material);

    }
}