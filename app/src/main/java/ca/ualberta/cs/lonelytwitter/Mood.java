package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Allows devs to attach moods
 *Implemented moods:
 * <ul>
 *     <li>angry</li>
 *     <li>happ</li>
 * </ul>
 *
 * To be implmented
 *
 * scared
 * sad
 *
 */
public abstract class Mood {

    public abstract String getMood();

    public abstract String toString();
}
