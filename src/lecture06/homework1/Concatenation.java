package lecture06.homework1;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println(getConcatenate(3, 3.2, "cow"));
    }

    static String getConcatenate(int i, double d, String string){
        return string + (i+d);
    }
}
