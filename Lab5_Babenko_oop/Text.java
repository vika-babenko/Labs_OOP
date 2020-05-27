package Lab5_Babenko_oop;

public class Text {
    private Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

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

    public int findWordEntrancesQuantity(String wordString) {
        int wordEntrancesQuantity = 0;

        for (Sentence sentence : sentences) {
            wordEntrancesQuantity += sentence.findWordEntrancesQuantity(wordString);
        }
        return wordEntrancesQuantity;
    }
}
