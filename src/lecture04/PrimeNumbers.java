package lecture04;

public class PrimeNumbers {
    public static void main(String[] args){
        int counter = 0;
        System.out.println("Prime numbers:");
        for(int i = 1; i <= 100; i += 1){
            for(int j = i; j > 0; j -= 1){
                if(i%j == 0){
                    counter += 1;
                }
            }
            if(counter == 2){
                System.out.println(i);
            }
            counter = 0;
        }
    }
}
