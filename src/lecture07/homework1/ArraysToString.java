package lecture07.homework1;

public class ArraysToString {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(getArray(array));
    }

    public static String getArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int value : array) {
            sb.append(value).append(",");
        }
        sb.append("\b]");

        return sb.toString();
    }
}
