public class power {

    public static void power(int num, int power) {
        int temp = num;
        for (int i = 1; i < power; i++) {
            num *= temp;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        power(6, 2);
    }
}
