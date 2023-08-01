package br.com.alura.musicplayer.model;

public class MinhasFavoritas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
        System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" +
                " e amado por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também estão curtindo!");
        }
    }
}
