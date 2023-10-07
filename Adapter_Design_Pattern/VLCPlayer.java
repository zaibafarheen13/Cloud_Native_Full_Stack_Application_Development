package Adapter_Design_Pattern;

public class VLCPlayer implements AdvanceMediaPlayer{
    public void playFile(String filename){
        System.out.println("Playing VLC file "+filename);
    }
}
