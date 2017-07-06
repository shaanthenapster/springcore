package core;

/**
 * Created by shaan on 29/6/17.
 */
public class Streamm {
    private String StreamName;

    public Streamm(String streamName, String streamDuration) {
        StreamName = streamName;
        StreamDuration = streamDuration;
    }

    private String StreamDuration;


    public String getStreamName() {
        return StreamName;
    }

    public void setStreamName(String streamName) {
        StreamName = streamName;
    }

    public String getStreamDuration() {
        return StreamDuration;
    }

    public void setStreamDuration(String streamDuration) {
        StreamDuration = streamDuration;
    }
    void Sdisplay()
    {
        System.out.println(StreamName + " "+ StreamDuration);
    }
}
