package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * An implemenation of the abstract class mood, which attaches the angry
 * tag to a tweet for development reasons
 *
 * @see Mood for more information
 */
public class Angry extends Mood {
    private Date date;

    /**
     * creates an instance of the Angry object given a date
     * @param date
     */
    public Angry(Date date) {
        this.date = date;
    }

    /**
     * creates an instance of Angry with the date set to the date this instance
     * was created
     */
    public Angry(){
        this.date = new Date();
    }

    /**
     * Gives the mood in english
     * @return the current mood
     */
    public String getMood() {
        return "angry";
    }

    /**
     * @return the string representation of the angry class
     */
    public String toString(){
        return ">:[";
    }

    /**
     * @return the date this object was instantieted on
     */
    public Date getDate() {
        return date;
    }

    /**
     * changes the date assciated with this object
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
