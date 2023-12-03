package partOne;

public class String2 {


    public static void main(String[] args) {
        //Replacing

        //https://harmash.com/tutorials/java/strings

        String a = "mahmood selawe .com";

        String str = "welcome to harmash.com";

        System.out.println( str.replace('a', 'X') );
        System.out.println( str.replace(' ', '-') );
        System.out.println( str.replace("com", "net") );


        //Comparison
        //It returns true if the value we passed in place of the toffset parameter is located at the beginning of the text,
        // or at the place where we specified that the search process should start.
        System.out.println("a.startsWith(\"mahmood\") = " + a.startsWith("mahmood"));
        System.out.println("a.startsWith(\"mahmood\" , 1) = " + a.startsWith("mahmood", 1));

        //Returns true if the value we are testing is at the end of the text.
        //It also returns true if we test an empty value.
        //Otherwise returns false

        System.out.println("a.endsWith(\"mahmood\") = " + a.endsWith("mahmood"));

        String o = "mahmood";
        String o2 = "ahmed";
        String o3 = "Mahmood";

        System.out.println("o.equals(o2) = " + o.equals(o2));

        System.out.println("o.equals(o3) = " + o.equals(o3));

        //Manipulation

        System.out.println("o.concat(o2) = " + o.concat(o2));

        char[] ch = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'j', 'a', 'v', 'a'};

        String s = "";
        s = String.copyValueOf(ch);
        System.out.println(s);

        s= String.copyValueOf(ch,1,10);
        System.out.println(s);


        //public static String copyValueOf(char[] data, int offset, int count)
        //
        //
        //Parameters
        //In place of the data parameter, we pass the array of characters that we want to convert to text.
        //Offset is an optional parameter. In its place, you can pass the index number
        // from which you want to start the copying process.

        //count is an optional parameter that you can pass
        // in place of the number of characters we want to copy from the array
        // that you pass in place of the data parameter.

        String p  = "welcome to amman";

        System.out.println(p.hashCode());

        System.out.println(p.intern());
       // https://harmash.com/tutorials/java/strings/string-intern

        System.out.println("p.length() = " + p.length());

//        char [] f = {'a','f','d','d'};

        System.out.println("p.toCharArray() = " + p.toCharArray());

        System.out.println("p.toLowerCase() = " + p.toLowerCase());

        System.out.println("p.toUpperCase() = " + p.toUpperCase());

        System.out.println("p.trim() = " + p.trim());

        int i = 10;

        System.out.println("String.valueOf(i) = " + String.valueOf(i));

        //https://harmash.com/tutorials/java/strings
        


    }






}
