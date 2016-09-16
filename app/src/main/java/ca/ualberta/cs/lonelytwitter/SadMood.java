package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jason on 15/09/2016.
 */
public class SadMood extends CurrentMood {

    public SadMood(Date date){
        super(date);
        setMood(":(");
    }

    public SadMood(){
        super();
        setMood(":(");
    }

}
