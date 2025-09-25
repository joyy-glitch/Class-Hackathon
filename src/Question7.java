import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters: ");
        String word = input.nextLine();


        String upperWord = word.toUpperCase();


        if (upperWord.charAt(0) == 'M') {

            switch (upperWord.charAt(1)) {
                case '1':
                    System.out.println("Mathematics Freshman");
                    break;
                case '2':
                    System.out.println("Mathematics Sophomore");
                    break;
                case '3':
                    System.out.println("Mathematics Junior");
                    break;
                case '4':
                    System.out.println("Mathematics Senior");
                    break;
            }
        }
    else if (upperWord.charAt(0) == 'C') {

            switch (upperWord.charAt(1)) {
                case '1':
                    System.out.println(" CS Freshman");
                    break;
                case '2':
                    System.out.println("CS Sophomore");
                    break;
                case '3':
                    System.out.println("CS Junior");
                    break;
                case '4':
                    System.out.println("CS Senior");
                    break;
            }
        }
        else if (upperWord.charAt(0) == 'I') {

            switch (upperWord.charAt(1)) {
                case '1':
                    System.out.println("IT Freshman");
                    break;
                case '2':
                    System.out.println("IT Sophomore");
                    break;
                case '3':
                    System.out.println("IT Junior");
                    break;
                case '4':
                    System.out.println("IT Senior");
                    break;
            }
        }






    }
}
