package lecture04;

public class MultiplicationTable {
    public static void main(String[] args){
        for(int i = 1; i < 10; i += 1){
            System.out.printf("%d x 5 = %d", i, i*5);
            System.out.println();
        }
    }
}