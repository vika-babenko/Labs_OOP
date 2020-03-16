public class Laba1 {
    public static void main(String[] args) {
        long a=3, n=8, b=3, m=8, i, j;
// оголошенння константи С та суми S
        double S=0;
        int C=0;
// перевірка інтервалів сумування
        if ((a<=n)&&(b<=m)){
            for (i=a; i<=n; i++)
                if (i==C) {
// повідомлення проділення на 0
                    System.out.println("Ділення на нуль неможливе!");
                    S=0;
                    break;
                }
                else {
                    for (j=b; j<=m; j++)
                        S += (double) (i/j)/(i-C);
                }
// виведення результату
            System.out.println("S = "+ S);
        }
        else System.out.print("Помилка в межах сумування, будь ласка, перевірте їх!");
    }

}