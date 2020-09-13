package lecture03.homework1;

import java.util.Scanner;

public class Flat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input flat number: ");
        int flat  = sc.nextInt();

        int flatCopy;
        int section;
        int floor;

        if(flat < 1 || flat > 144){
            System.out.println("There is no such flat");
        }
        if(flat <= 36){
            section = 1;
            flatCopy = flat;
        } else if(flat <= 72){
            section = 2;
            flatCopy = flat - 36;
        } else if(flat <= 108){
            section = 3;
            flatCopy = flat - 72;
        } else{
            section = 4;
            flatCopy = flat - 108;
        }

        if(!(flatCopy%4 == 0)){
            floor = flatCopy/4 + 1;
        } else{
            floor = flatCopy/4;
        }

        System.out.println("Flat number " + flat + " is located on the " +
                floor + "th floor on the " + section + "th section of the house");
        sc.close();

    }
}
