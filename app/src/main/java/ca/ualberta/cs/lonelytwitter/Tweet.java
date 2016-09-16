package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

/**
 * Created by jzphung on 9/13/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<CurrentMood> moodList;
    //private String mood;

    public Tweet(String message){
        this.message = message;
        //this.mood = mood;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
        //this.mood = mood;
    }

    public abstract Boolean isImportant();


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140 ){
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<CurrentMood> getMoodList() {
        return moodList;
    }

    public void setMoodList(ArrayList<CurrentMood> moodList) {
        this.moodList = moodList;
    }

    public void addMood(CurrentMood mood){
        this.moodList.add(mood);
    }


}
