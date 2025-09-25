/*import java.util.Scanner;

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

 */

        //Question 3

import java.util.Scanner;

        public class Class_trial {
            public static void main(String args[])
            {
                Scanner input = new Scanner(System.in);


                System.out.print("Enter a letter:");
                String letter =  input.nextLine();


                switch(letter){
                    case"a","b","c":
                        System.out.println("1");
                        break;

                    case"d","e","f":
                        System.out.println("2");
                        break;

                    case"g","h","i":
                        System.out.println("3");
                        break;

                    case"j","k","l":
                        System.out.println("4");
                        break;

                    case"m","n","o":
                        System.out.println("5");
                        break;

                    case"p","q","r","s":
                        System.out.println("6");

                    case"t","u","v":
                        System.out.println("7");
                        break;

                    case"w","x","y","z":
                        System.out.println("8");

                        //Question 5

                        byte s = input.nextByte() ;






                }







            }
        }






    }
}
