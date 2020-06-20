package cafe;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author emili
 */
public class Audio {
    
    public Clip clip;
    public String ruta = "/Musica/";
    
    public void sonido(String archivo){
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (Exception e){
        }
    }
}
