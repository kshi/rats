package pppp.g0;

import pppp.sim.Point;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by naman on 9/19/15.
 */
public class Piper {

    public int id;
    public Set<Integer> capturedRats;
    public Point prevLocation;
    public Point curLocation;
    public boolean playedMusic;

    public Piper(int id, Point curLocation) {
        this.id = id;
        this.capturedRats = new HashSet<Integer>();
        this.prevLocation = null;
        this.curLocation = curLocation;
        this.playedMusic = false;
    }

    public Piper(int id, Point curLocation, boolean playedMusic) {
        this.id = id;
        this.capturedRats = new HashSet<Integer>();
        this.prevLocation = null;
        this.curLocation = curLocation;
        this.playedMusic = playedMusic;
    }

    public void updateLocation(Point point) {
        this.prevLocation = this.curLocation;
        this.curLocation = point;
    }

    public void resetRats() {
        this.capturedRats = new HashSet<Integer>();
    }

    public void addRat(Integer ratId) {
        this.capturedRats.add(ratId);
    }
}
