package cafe;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public class Audio {
    /* El objeto clip representa un tipo especial de línea de datos los cuales pueden ser de audio */
    public Clip clip;
    public String ruta = "/Musica/";
    
    /**
     * .open – abre el clip con el formato y datos de audio de los parámetros
     * AudioSystem Esta clase actúa como medio de entrada a los archivos de audio
     * .getAudioInputStream() recibe de .getClass información de una clase del proyecto, en este caso un String que tiene la ruta con .getResourceAsStream del package donde esta la canción Jazz.wav
     * .start – hace que la línea de dato, el audio, participe en la entrada y salida de datos
     * @param archivo 
     */
    public void sonido(String archivo){
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (Exception e){
        }
    }
}
