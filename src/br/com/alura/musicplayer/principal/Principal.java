package br.com.alura.musicplayer.principal;

import br.com.alura.musicplayer.model.MinhasFavoritas;
import br.com.alura.musicplayer.model.Musica;
import br.com.alura.musicplayer.model.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Catcher of My Dreams");
        minhaMusica.setCantor("Anette Olzon");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("DEVaneios");
        meuPodcast.setApresentador("Paulo Teixeira");

        for (int i = 0; i < 200; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 20; i++) {
            meuPodcast.curte();
        }

        MinhasFavoritas favoritas = new MinhasFavoritas();
        favoritas.inclui(minhaMusica);
        favoritas.inclui(meuPodcast);
    }
}
