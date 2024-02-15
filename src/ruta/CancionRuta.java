package ruta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DanKuzo
 */
import java.applet.AudioClip;

public class CancionRuta {

    public void cancionReproducir() {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/cancion.wav"));
        sonido.play();
    }

    public void cancionDetener() {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/cancion.wav"));
        sonido.stop();
    }
}
