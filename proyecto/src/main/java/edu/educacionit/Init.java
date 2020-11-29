package edu.educacionit;

import com.intrusos.Menu;

interface ReproductorMusica {
	void reproducir();
	void pausar();
	void parar();

}
class Mp3Player implements ReproductorMusica {

    public void reproducir() {
    }

    public void pausar() {
    }

    public void parar() {
    }
}

class Flac implements ReproductorMusica {
    public void reproducir() {
    }

    public void pausar() {
    }

    public void parar() {
    }
}

class MiCeluSamsung implements ReproductorMusica{
    public void reproducir() {
    }

    public void pausar() {
    }

    public void parar() {
    }
}

public class Init{
    public static void main(String[] args){
        Menu m = new Menu();
        m.mostrarMenu();
        
    }
      
}
