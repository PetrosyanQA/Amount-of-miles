public class Main {
    public static void main(String[] args) {

        System.out.println("Итоговый миль за пакупки");
        int amount = 1000;
        boolean b = amount >= -20;

        int bonus;
        if (b) {
            bonus = (amount / 20);
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }

}