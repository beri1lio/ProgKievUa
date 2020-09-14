package lecture06.homework1;

public class Words {
    public static void main(String[] args) {
        String line = "first second third fourth fifth";
        System.out.println(countWords(line));
    }

    static int countWords(String text){
        int counter = 0;
        for(String string : text.split(" ")){
            counter += 1;
        }
        return counter;
    }
}
