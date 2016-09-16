package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jason on 15/09/2016.
 */
public abstract class CurrentMood {

    private String mood;
    private Date date;


    public CurrentMood(Date date){
        this.date = date;
    }

    public CurrentMood(){
        this.date = new Date();
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }
}
