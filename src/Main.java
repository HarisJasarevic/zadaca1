public class Main {
    public static void main(String[] args) {

//        String someText = "Some random text";
//        int someNumber = someText; //Error: Requests int, we provided String
//        double someDoubleNumber = someText; //Error: Requests double, we provided String
//        double someDoubleNumber2 = 28111987;
//        boolean someRandomBoolean = someDoubleNumber2; //Error: requests boolean, we provided double
//        boolean someRandomBoolean2 = true;
//        long someRandomLong = someRandomBoolean2; //Error: Requests long, we provided boolean
//        long someRandomLong2 = someDoubleNumber2; //Error: Requests long, we provided double

        //Zadatak 5.

        String firstName = "Haris";
        String lastName = "Jasarevic";
        String firstInitial = "H";
        int birthYear = 1987;
        double someRandomNumber = 42.001;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstInitial);
        System.out.println(birthYear);
        System.out.println(someRandomNumber);

        //Zadatak 6.

        char firstNameLetter1 = 72;
        char firstNameLetter2 = 97;
        char firstNameLetter3 = 114;
        char firstNameLetter4 = 105;
        char firstNameLetter5 = 115;

        System.out.print(firstNameLetter1);
        System.out.print(firstNameLetter2);
        System.out.print(firstNameLetter3);
        System.out.print(firstNameLetter4);
        System.out.print(firstNameLetter5);
        System.out.println("\n");

        //Zadatak 7:

        String answerVariable = "Answer to the Ultimate Question of Life, the Universe, and Everything is number 42: ";
        Boolean someRandomBoolean = true;

        System.out.print(answerVariable + someRandomBoolean);

        //Zadatak 8. + Bonus

        String text1 = "\nThis is a number 2 and its about to double: ";
        int someNumber = 2;

        System.out.println(text1 + someNumber);
        System.out.println(text1 + (someNumber *2) + ("\nThe original number has been doubled: X times "));
        System.out.println(text1 + (someNumber *4) + ("\nThe original number has been doubled: XX times "));
        System.out.println(text1 + (someNumber *8) + ("\nThe original number has been doubled: XXX times "));
        System.out.println(text1 + (someNumber *16) + ("\nThe original number has been doubled: XXXX times "));
        System.out.println(text1 + (someNumber *32) + ("\nThe original number has been doubled: XXXXX times "));
        System.out.println(text1 + (someNumber *64) + ("\nThe original number has been doubled: XXXXXX times "));
        System.out.println(text1 + (someNumber *128) + ("\nThe original number has been doubled: XXXXXXX times "));
        System.out.println(text1 + (someNumber *256) + ("\nThe original number has been doubled: XXXXXXXX times "));



    }
}