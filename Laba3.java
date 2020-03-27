public class Laba3 {
    /*private static String[] substr;
    private static String[] words;*/

    public static void main(String[] args) {
        //задаємо тип string і текст для роботи програми
        String s = "Hello, world! How are you? This is my program. This is my 3-d lab!";
        if (s.length() == 0) {
            System.out.print("Відсутній текст. Введіть текст будь ласка!");
        }
        //виводимо за допомогою регулярного виразу зміну тексту
        System.out.println(s.replaceAll("([^.!?, ]+)([^.!?]+?)([^.!?, ]+)([.!?])", "$3$2$1$4"));
    }
}
/*String[] subStr = s.split("\\W+");
        String[] words = subStr.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        // Разделения строки str с помощью метода split()
        // Виключна ситуація на введення пустого рядка*/


        /*for(int i = 0; i < words.length; i++) {
            //обираємо перше слово з рядка, яке матиме назву tmp у подальшому ході програми
            tmp = words[0];
            //заміна 1-го і останнього слів(words.length-1) місцями
            words[0] = words[subStr.length - 1];
            //замінюємо останнє і перше слово
            words[subStr.length - 1] = tmp;

        }
        // Вывод на экран
        for(String word:words) {
            System.out.println(words);
        }

        for (String word : subStr) {
            System.out.print(word + " ");
        }

        }

    }*/