package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lmingram on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));

        try {
            tweets.add(tweet);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(Boolean.TRUE);
        }
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);

        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet, tweet);
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("hello", new Date(2015, 12, 12));
        Tweet tweet2 = new NormalTweet("what", new Date(2000, 10, 10));
        Tweet tweet3 = new NormalTweet("you what?", new Date(2015, 12, 13));

        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        ArrayList<Tweet> tweetsList = tweets.getTweets();

        assertEquals(tweetsList.get(0), tweet2);
        assertEquals(tweetsList.get(1), tweet1);
        assertEquals(tweetsList.get(2), tweet3);
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("hello");
        Tweet tweet2 = new NormalTweet("what");
        Tweet tweet3 = new NormalTweet("you what?");

        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        assertEquals(tweets.getCount(), 3);

        tweets.delete(tweet1);

        assertEquals(tweets.getCount(), 2);
    }
}
