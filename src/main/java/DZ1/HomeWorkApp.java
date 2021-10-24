package DZ1;

public class HomeWorkApp {

    public static void main(String[] args) {
       printThreeWords();
       checkSumSign();
       compareNumbers();
       printColor();
    }

    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");

    }
    public static int checkSumSign(){
        int a = 15;
        int b = 10;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
        return c;

    }
    public static void  printColor() {
        int value = 69;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
        public static void compareNumbers () {
            int a = 65;
            int b = 39;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a <= b");
            }
        }
    }


















