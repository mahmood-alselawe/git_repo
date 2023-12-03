package partOne;

public class Add {


    public int add(int x , int y){

        if (x <= 0 && y <= 0){
            return x;
        }else {
            System.out.println("ok");
        }

        int x3 = x + y;
        return  x3;
    }

    public double add(double x , double y){
        if (x <= 0 && y <= 0){
            return x;
        }else {
            System.out.println("ok");
        }

        double x3 = x + y;
        return  x3;
    }

    public short add(short x , short y){

        if (x <= 0 && y <= 0){
            return x;
        }else {
            System.out.println("ok");
        }

        short x5 = (short) (x + y);
        return  x5;
    }


    public void prinyarray(int [] a){

        for (int i = 0 ; i < a.length ; i ++){

            System.out.println("i = " + i  + " a[i] = "+ a[i]);

        }

    }


    public void printarrayString(String [] x){

        for (String element : x){
            System.out.println("element = " + element);
        }

    }


    public void printarraychar(char [] y ){

        int i = 0;

        do {

            System.out.println("i = " + i  + " a[i] = "+ y[i]);
            i++;

        }while (i <y.length);


    }







}
