package activityStarterCode.objects;

public class DiceRoller {
    public static void main(String[] args) {
        Die theDie = new Die();
        Die die2 = new Die();
        int count = 0;
        for (int i = 1; i < 1000001; i++) {
            theDie.roll();
            theDie.getValue();
            die2.roll();
            die2.getValue();
//            System.out.println("Roll " + i + " generated a " + theDie.toString());

            if (theDie.getValue() == die2.getValue()){
                count ++;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + count + " times");
    }
}
