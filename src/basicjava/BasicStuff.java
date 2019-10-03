package basicjava;

public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 18;
        double age1 = 19;
        System.out.println("We are "+age0+" and "+age1);
        double sumOfAges = age0 + age1;
        System.out.println("The sum of our ages is " + sumOfAges + "!" );
        System.out.println("The sum of our age is " +age0 + age1);
        System.out.println("The sum of our age is " +(age0 + age1));
        System.out.println(age0 +age1);
        System.out.println(age0 + age1 + " is the sum of our ages");
        System.out.println(1+2-3-4);
        System.out.println(6/3);
        double x = 6/4;
        System.out.println(x);
        System.out.println(6.00/4);

        String phrase = "Change is inevitable";
        String mutation1 = phrase.concat(", except for vending machine");
        String mutation2 = mutation1.toUpperCase();
        String mutation3 = phrase.toUpperCase();
        phrase.concat(", except for vending machine");


        System.out.println(mutation2);
        System.out.println(mutation3);
        System.out.println(phrase);
        // => we can't change a string object. we can only create new string objects as the result of modifying the original string's value.



//        byte y = 130;
//        System.out.println(y);


    }
}
