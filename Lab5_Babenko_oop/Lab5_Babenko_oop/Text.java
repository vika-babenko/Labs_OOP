package Lab5_Babenko_oop;


public class Text {
    /**
     * приватні змінні
     */
    private Sentence[] sentences;


    // constructor for text
    //access to sentences
    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }


    // перевантаження конструктора + creating екземпляру класу тексту як строки
    //delimiters: . !?
    public Text(String textString) {
        /*
        за допомогою регулярного виразу розділяємо стрінг з текстом
        ?<= позитивний перегляд назад для збереження делімітера в поверненні тексту
        зникає пробіл на початку наступного речення
        */
        String[] sentencesStrings = textString.split("(?<=[?!.]) ");
        sentences = new Sentence[sentencesStrings.length];
        for (int i = 0; i < sentencesStrings.length; i++) {
            sentences[i] = new Sentence(sentencesStrings[i]);
        }
    }

    //повертає текст
    @Override
    public String toString() {
        //пустий вордстрінг
        StringBuilder textString = new StringBuilder();
        //цикл, який обходить і ми отримуємо доступ до кожного елемента масиву
        //накопичуємо наші елементи масиву String.toString();
        for (int i = 0; i < sentences.length; i++) {
            //додавати пустий або непустий за допомогою конкатенації
            textString.append(sentences[i].toString() + (i != sentences.length - 1 ? " " : "" ));
        }
        return textString.toString();
    }


    /**
     * повератає кількість визначених слів у тексті
     */
    public int findWordEntrancesQuantity(String wordString) {
        // для чисельного повернення задаємо його int
        int wordEntrancesQuantity = 0;

        // return кількість входжень слова у текст
        for (Sentence sentence : sentences) {
            wordEntrancesQuantity += sentence.findWordEntrancesQuantity(wordString);
        }
        return wordEntrancesQuantity;
    }
}
