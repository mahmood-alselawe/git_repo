/*
https://harmash.com/tutorials/java/characters
Escape Sequences

The symbol \r causes the code to start executing from there.




 */



package partOne;


public class Charater1 {

    public static void main(String[] args) {


        //Returns true if the value we passed in place of the parameter ch is a character.
        //Otherwise returns false.

        System.out.println("Character.isLetter('A') = " + Character.isLetter('A'));

        System.out.println("Character.isLetter('$') = " + Character.isLetter('$'));


//        Returns true if the value we passed in place of parameter ch is a number.
//        Otherwise returns false.

        System.out.println("Character.isDigit('1') = " + Character.isDigit('1'));

        System.out.println("Character.isDigit(\"A\") = " + Character.isDigit('A'));

        //Returns true if the value we passed in place of parameter ch is a blank space.
        //Otherwise returns false.

        System.out.println("Character.isWhitespace('') = " + Character.isWhitespace(' '));
        System.out.println("Character.isWhitespace(\"\\n\") = " + Character.isWhitespace('\n'));

        //Returns true if the value we passed in place of the parameter ch is an uppercase letter.
        //Otherwise returns false.

        //Returns true if the value we passed in place of the parameter ch is a lowercase letter.
        //Otherwise returns false.

        System.out.println("Character.isUpperCase(\"A\") = " + Character.isUpperCase('A'));

        System.out.println("Character.isLowerCase('A') = " + Character.isLowerCase('A'));

        System.out.println("Character.toString('1') = " + Character.toString('1'));

        System.out.println("Character.toLowerCase('A') = " + Character.toLowerCase('A'));

        System.out.println("Character.toUpperCase('a') = " + Character.toUpperCase('a'));

    }




}
