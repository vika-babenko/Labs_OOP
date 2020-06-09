package Lab6_OOP;

import java.util.*;

public class Bouquet {
    //private array
    private BouquetComponent[] bouquetComponents;


    // generation of constructor
    public Bouquet(BouquetComponent[] bouquetComponents) {
        this.bouquetComponents = bouquetComponents;
    }

    //сортування квітів за свіжістю
    public void sortByFreshness(){
        //list -- варіант колекції, в якій є індексація та послідовність
        //додаємо в list квіти
        List<Flower> flowersList = new ArrayList();
        // цикл
        for (BouquetComponent bouquetComponent : bouquetComponents) {
            //якщо компонент букету є квіткою, то додаємо його у колекцію квітів
            if (bouquetComponent instanceof Flower){
                //компонент букету типу квітки(даункласкаст) спуск по ієрархії
                flowersList.add((Flower) bouquetComponent);
            }
        }
        //порівнюємо за свіжістю, створення методу getFreshness()
        //для кожної квітки використовується свіжість як критерій сортування
        flowersList.sort(Comparator.comparing(Flower::getFreshness));
        System.out.println(flowersList);
    }

    // метод для получения цветов в заданном ценовом диапазоне, вернет массив
    public BouquetComponent[] getFlowersInRange(double from, double to)
    {
        // так как мы не знаем, сколько цветов попадает в данный диапазон, найдем их кол-во, чтоб создать массив
        BouquetComponent[] flowersInRange = new BouquetComponent[getAmountOfFlowersInRange(from, to)];
        // index это текущий индекс массива с подоходящими цветами
        int index = 0;
        for (int i = 0; i < this.bouquetComponents.length; i++) {
            // проверяем, если текущий компонент ИМЕННО цветок, а не другая сущность
            if(this.bouquetComponents[i] instanceof Flower) {
                if(this.bouquetComponents[i].getLength() > from && this.bouquetComponents[i].getLength() < to) {
                    // если цветок подходит, добавляем массив, увеличиваем на 1 наш индекс,
                    // если использовать не index, a i, то выйдем за пределы массива
                    flowersInRange[index] = this.bouquetComponents[i];
                    index++;
                }
            }
        }
        return flowersInRange;
    }

    // вернет кол-во цветов в заданном диапазоне
    private int getAmountOfFlowersInRange(double from, double to)
    {
        // кол-во цветов
        int counter = 0;
        // если цена цветка в диапазоне, увеличиваем счетчик
        for (int i = 0; i < this.bouquetComponents.length; i++) {
            if(this.bouquetComponents[i] instanceof Flower) {
                if (this.bouquetComponents[i].getLength() > from && this.bouquetComponents[i].getLength() < to) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
