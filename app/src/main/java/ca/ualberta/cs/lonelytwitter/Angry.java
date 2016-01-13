package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lmingram on 1/12/16.
 */
public class Angry extends Mood {
    private Date date;

    public Angry(Date date) {
        this.date = date;
    }

    public Angry(){
        this.date = new Date();
    }

    public String getMood() {
        return "angry";
    }

    public String toString(){
        return ">:[";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
