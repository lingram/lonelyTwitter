package ca.ualberta.cs.lonelytwitter;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by lmingram on 1/26/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();
    private int tweet_count = 0;

    public void add(Tweet tweet){
        if(this.tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
        tweet_count++;
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
        tweet_count--;
    }

    public ArrayList<Tweet> getTweets(){
        ArrayList<Tweet> rv = new ArrayList<Tweet>(this.tweets);
        Collections.sort(rv);

        return rv;
    }

    public int getCount(){
        return this.tweet_count;
    }
}
