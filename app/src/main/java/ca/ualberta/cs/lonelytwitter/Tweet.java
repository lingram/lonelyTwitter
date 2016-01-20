package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lmingram on 1/12/16.
 */
public abstract class Tweet  {
    protected Date date;
    protected String message;
    protected ArrayList<Mood> mood_list = new ArrayList<Mood>();

    public abstract Boolean isImportant();

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }


    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 140) {
            throw new TweetTooLongException();
        }
            this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addMood(Mood mood){
        this.mood_list.add(mood);
    }

    public ArrayList<Mood> getMoods(){
        return this.mood_list;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}
