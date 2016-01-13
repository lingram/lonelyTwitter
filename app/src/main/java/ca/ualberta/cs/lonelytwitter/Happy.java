package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lmingram on 1/12/16.
 */
public class Happy extends Mood {
    private Date date;

    public Happy(Date date) {
        this.date = date;
    }

    public Happy() {
        this.date = new Date();
    }

    @Override
    public String getMood() {
        return "happy";
    }

    @Override
    public String toString() {
        return ":)";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
