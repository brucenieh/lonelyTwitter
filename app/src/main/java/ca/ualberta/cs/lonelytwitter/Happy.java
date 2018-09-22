package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Mood {
    public Happy(Date date){
        super(date);
    }

    @Override
    public String mood_represent(){
        return "Happy";
    }
}
