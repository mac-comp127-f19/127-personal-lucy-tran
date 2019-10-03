package activityStarterCode.objects;

import java.util.List;
import java.util.Random;

public class Die {
    private int state;
    private boolean rolled = false;

    public Die(){
    }

    public void roll(){
        Random rand =new Random();
        state = rand.nextInt(6) +1;
        rolled = true;
    }

    public int getValue(){
        if (rolled){
            return state;
        } else {
            return -1;
        }
    }

    @Override
    public String toString(){
        List<String> str = List.of("one", "two", "three","four", "five", "six");
        return str.get(state -1);
        }
    }

