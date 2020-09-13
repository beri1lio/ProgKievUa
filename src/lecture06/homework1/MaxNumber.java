package lecture06.homework1;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 23, 235, 1, -1};
        System.out.println(getMax(arr));
    }

    static int getMax(int[] array){
        int min = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > min) {
                min = value;
            }
        }
        return min;
    }
}
