package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {
    private  String message;
    private Date date;

    public Tweet(String message){

    }
    public void setMessage(String message) throws ToLongTweetException{
        if (message.length()>140){
            throw new ToLongTweetException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public abstract Boolean isImoprtant();
}
