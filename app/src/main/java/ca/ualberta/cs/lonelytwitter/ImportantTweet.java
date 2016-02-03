package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A tweet with a higher priority level, which implements tweet
 * @see Tweet
 */
public class ImportantTweet extends Tweet implements Tweetable{
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Indicates this tweets important status
     * @return a boolean value, stating wither it's important or not
     */
    @Override
    public Boolean isImportant() {
        return true;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getDate() {
        return this.date;
    }
}
