package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {

    public NormalTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImoprtant() {
        return Boolean.FALSE;
    }
}
