package lecture07.homework1;

public class Pi {
    public static void main(String[] args) {
        for (int i = 2; i < 12; i++) {
            System.out.printf("%." + i + "f", Math.PI);
            System.out.println();
        }
    }
}
