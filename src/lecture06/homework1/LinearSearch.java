package lecture06.homework1;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int element = 2;
        System.out.println(findElement(array, element));
    }

    static int findElement(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
