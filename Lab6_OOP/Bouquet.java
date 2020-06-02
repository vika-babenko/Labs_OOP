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
}
