public class Laba3 {
    public static void main(String[] args){
        //задаємо тип string і текст для роботи програми
        String tmp, s = "Це моя третя лабораторна робота";
       //використання регулярного виразу для пробілу
        String[] words = s.split(" ") ;
        //обираємо перше слово з рядка, яке матиме назву tmp у подальшому ході програми
        tmp = words[0];
        //заміна 1-го і останнього слів(words.length-1) місцями
        words[0] = words[words.length-1];
        //замінюємо останнє і перше слово
        words[words.length-1] = tmp;
        //виводимо результат виконання програми
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

}
