package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jason on 15/09/2016.
 */
public class HappyMood extends CurrentMood {

    public HappyMood(Date date){
        super(date);
        setMood (":)");
    }

    public HappyMood(){
        super();
        setMood (":)");
    }

}
