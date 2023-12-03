package partOne;

public class main {

    public static void main(String[] args) {

        Add a = new Add();


        // overload
        a.add(1 ,2);

        a.add(3,4);

        a.add(5d,6d);


        //print array

        int [] arr = {1,2,3,4,5};

        a.prinyarray(arr);


        String [] arrs = {"ah" , "ma" , "ham" , "sel"};

        a.printarrayString(arrs);


        char [] arrc = {'a' , 's' , 'a' , 'g'};

        a.printarraychar(arrc);
















    }
}
