package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lmingram on 1/12/16.
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return false;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getDate() {
        return this.date;
    }
}
