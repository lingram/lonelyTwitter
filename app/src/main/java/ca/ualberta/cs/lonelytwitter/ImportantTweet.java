package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lmingram on 1/12/16.
 */
public class ImportantTweet extends Tweet implements Tweetable{
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    public ImportantTweet(String message) {
        super(message);
    }

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
