package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public abstract class Mood {
    private Date date;
    private String mood;

    public Mood(){
        this.date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public String getMood() {
        return mood;
    }

    public abstract String mood_represent();

}


