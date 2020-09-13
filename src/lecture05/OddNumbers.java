package lecture05;

public class OddNumbers {
    public static void main(String[] args){
        int[] array = new int[]{0,5,2,4,7,1,3,19};
        int counter = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                counter += 1;
            }
        }
        System.out.println("Odd numbers in an array: " + counter);
    }
}
