package ca.ualberta.cs.lonelytwitter;

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message ){
        super(message);
    }

    @Override
    public Boolean isImoprtant() {
        return Boolean.TRUE;
    }
}
