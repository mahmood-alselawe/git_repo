/*
wrapper classes?

Every primitive data type in Java has a class that represents it, and has the same name

The int type can be represented by the Integer class.

boxing

Integer a = 10;

unboxing

int x = a + 10;
--------function wrapper classes--------
1

ublic ... xxxValue()
is a set of functions used to convert the value of an object (which represents a number)
to a primitive value determined by the function that was called from the object and returns it.

2
public int compareTo(T o)

compares the value of the object that called it,
which represents a number, with the value of the object that we pass to it in place of the parameter o.
It returns 0 if their values are equal,
returns 1 if the value of the object that called it is greater,
and returns 1- if the value of the object that called it is smaller.

3
public boolean equals(Object o)
compares the value of the object that called it,
which represents a number, with the value of the object that we pass to it in place of the parameter o.
Returns true if their values are equal, and returns false if they are not.

4
public String toString()
returns the value of the calling object, which represents a number as a String.
Note: Converting a numerical value to a textual value is very useful in some cases
and makes the programmer benefit from functions that are not originally intended to deal with numbers.

5
public ... parseXxx(String s)
is a set of functions used to get the primitive value of a number stored as a String.

radix is a regular number used to specify how to convert the value of parameter s to a primitive value.

Note: When adding radix, the value of the parameter s that we pass represents a

(binary, octal, decimal, or hexadecimal number).

The radix can be 2, 8, 10, or 16 in the order above.

6
public static Integer valueOf(String s)
Converts the value of the object s that we pass to it,
which is essentially a number for a value of type Integer.



class math:

define as final static ==> you can not change it

The PI constant has a PI value that is equal to 3.141592653589793.

The constant E has an Exponential value of 2.718281828459045.

you can call it by name without create object from clas math because it static modifier in same package

can not use any attribute in class just attribute type of static

1
public static double abs(double d)

returns the absolute value of the number we pass to it in place of the parameter d.

2
public static double ceil(double d)

returns the integer greater than or equal to the number we pass to it in place of the parameter d.

3
public static double floor(double d)

 returns the integer smaller or equal to the number we pass to it in place of the parameter d.

4
public static double rint(double d)

returns the closest integer to the number we pass to it in place of the parameter d.

5
public static long round(double d)

returns the closest integer to the number we pass to it in place of the parameter d.

6
public static double max(double a, double b)
returns the largest number between the two numbers we pass to it in place of the parameters a and b.

7
public static double min(double a, double b)
returns the smaller number between the two numbers we pass to it in place of the parameters a and b.

8
public static double exp(double d)
It returns the value of ex, that is, the exponential value of the number that we pass to it in place of the parameter d.


9
public static double log(double d)
returns the logarithm value of the number we pass to it in place of the parameter d.

10
public static double pow(double a, double b)
Multiplies the value of parameter a by the value of parameter b and then returns the result.

11
public static double sqrt(double d)
returns the value of the square root of the number we pass to it in place of the parameter d.

12
public static double sin(double d)
returns the value of the sine of the number we pass to it in place of the parameter d.

13
public static double cos(double d)
returns the cosine value of the number we pass to it in place of the parameter d.

14
public static double tan(double d)
returns the tangent value of the number we pass to it in place of the parameter d.

15
public static double asin(double d)
returns the value of the arc sine of the number we pass to it in place of the parameter d.

16
public static double acos(double d)
returns the value of the arc cosine of the number we pass to it in place of the parameter d.

17
public static double atan(double d)
returns the value of the arc tangent of the number we pass to it in place of the parameter d.

18
public static double toDegrees(double d)
converts the value of the number we pass to it in place of the parameter d for Degrees and then returns the result.

19
public static double toRadians(double d)
converts the value of the number we pass to it in place of the parameter d for Radians and then returns the result.

20
public static double random()
returns a random number between 0 and 1.


 */



package partOne;



public class numbers {

    public static void main(String[] args) {

        int x = -130;
        double x1 = -0.25;
        Integer x3 = -1172001;


        System.out.println("Math.abs(x) = " + Math.abs(x));

        System.out.println("Math.abs(x1) = " + Math.abs(x1));

        System.out.println("Math.abs(x3) = " + Math.abs(x3));


        double d1 = 22.375;

        float f1 = 121.123f;

        System.out.println("Math.round(f1) = " + Math.round(f1));

        System.out.println("Math.round(d1) = " + Math.round(d1));

        double c = 10;

        double b = 3;

        System.out.println("Math.pow(c,b) = " + Math.pow(c, b));


        double t = 81;

        System.out.println("Math.sqrt(t) = " + Math.sqrt(t));


        double p = 10;

        System.out.println("Math.cos(p) = " + Math.cos(p));


        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + Math.random());


        System.out.println("Math.PI = " + Math.PI);

        System.out.println("Math.E = " + Math.E);


        ///// ----------------class wrapper classes---------------



        ////xxxValue();

        Integer x11 = 10;

        System.out.println("x.byteValue() = " + x11.byteValue());

        System.out.println("x.doubleValue() = " + x11.doubleValue());

        ////compareTo();

        Integer x2 = 40;

        Integer x4 = 20;

        Integer y2 = 20;

        Integer y4 = 20;

        System.out.println("x2.compareTo(x4) = " + x2.compareTo(x4));

        System.out.println("x4.compareTo(y2) = " + x4.compareTo(y2));

        System.out.println("y4.compareTo(y2) = " + y4.compareTo(y2));


        //// .equals
        Integer i1 = 4000;
        Integer i2 = 4000;
        Integer i3= 50;

        System.out.println( i1.equals(i2) );

        System.out.println( i2.equals(i2) );

        System.out.println("Integer.parseInt(\"20\" , 2) = " + Integer.parseInt("20", 2));

        System.out.println("Integer.parseInt(\"1172001\") = " + Integer.parseInt("1172001"));

        Integer qc  = Integer.valueOf(1172001);

        System.out.println(qc);

        Integer qc1  = Integer.valueOf("1172001");

        System.out.println("qc1 = " + qc1);

        Integer qc2  = Integer.valueOf("1172001",16);

        System.out.println("qc2 = " + qc2);


    }



}

