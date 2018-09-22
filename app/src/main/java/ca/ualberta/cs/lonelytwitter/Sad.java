package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends Mood {
    public Sad(Date date){
        super(date);
    }

    @Override
    public String mood_represent(){
        return "Sad";
    }
}
