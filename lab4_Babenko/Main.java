package lab4_Babenko;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*//екземпляр класу
        Clothes[] clothess = new Clothes[3];
        //ініціалізація
        clothess[0] = new Clothes();
        clothess[1] = new Clothes();
        clothess[2] = new Clothes();*/

        Clothes[] clothess = {
                new Clothes((byte)42, 35, "Blouse", "cotton", "black", "classic",
                        "D&G", "office style", 1 ),
                new Clothes((byte)44, 55, "Blouse", "viscose", "white", "classic",
                        "Gucci", "office style",0),
                new Clothes((byte)40, 80, "Dress", "cotton", "blue", "holiday",
                        "Channel", "festive style", 1 ),


        };

        System.out.println(clothess[0].compareTo(clothess[1]));


        Arrays.sort(clothess);
        System.out.println();
        /*int[] array = {1, 3, 2};
        Arrays.sort(array);*/
        /*for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }*/




        /*System.out.println(clothess[2]);
        System.out.println(clothess[1].toString());*/


       /* //System.out.println("Привіт! Це моя четверта лабораторна робота!");
        //System.out.println(clothes.getNames());
        //System.out.println(clothes.getBrand());*/

        /*System.out.println(clothes.isclothesexists());
        //System.out.println("size = " + clothes.size);
        System.out.println(clothes.toString());*/

    }
}





