package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jzphung on 9/13/16.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
