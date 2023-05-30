package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " Considerado sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " Estão curtindo!");

        }
    }
}
