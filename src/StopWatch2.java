import java.util.Date;

public class StopWatch2 {
    private long startTime;
    private long endTime;

    public long start() {
        startTime = new Date().getTime();
        return startTime;
    }

    public long stop() {
        endTime = new Date().getTime();
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}