package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * the interface that all tweets should follow
 * @see Tweet
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
