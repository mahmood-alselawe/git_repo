package partOne;

public class String1 {

    // function of class String







    //Comparison functions

    //Functions for processing (Manipulation



    //The String class is considered an Immutable class,
    // and this means that when you call any function on a String,

    // it will not modify the content of the String that called it,

    // but rather a modified copy of this String will be returned to you,

    // and the original String will remain as it is.

    public static void main(String[] args) {


        String a = "mahmood al-selawe";


        //Searching functions
        //It returns the character in the index that we pass to it in place of the index parameter.
        System.out.println("a.charAt('o') = " + a.charAt(5));

        System.out.println("a.indexOf('e') = " + a.indexOf('e'));

        System.out.println("a.lastIndexOf('e') = " + a.lastIndexOf('e'));

        System.out.println("a.contains('Q') = " + a.contains("selawe"));

        //Substring functions

        System.out.println("a.subSequence(1,10) = " + a.subSequence(1, 10));

        System.out.println("a.substring(1,10) = " + a.substring(1, 10));


        String s = "welcome to jordan hello word";

        String [] arr = s.split("-");

        String as = arr[0];

        System.out.println(as);


        //Replacing functions










    }
}
