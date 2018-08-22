package com.example.logonrmlocal.listagemdedados;

import java.util.ArrayList;
import java.util.List;

public class GeradorContatos {

    public static List<Contato> geraContatos(){
        List<Contato> contatos = new ArrayList<>();
        Contato c1 = new Contato(
                "Lula", "(11)190", R.drawable.lula, "alguém me ajuda, to preso"
        );
        Contato c2 = new Contato(
                "Bolsonaro", "(11)2018", R.drawable.bolsonaro, "cola comigo"
        );
        Contato c3 = new Contato(
                "Hitler", "(11)18159151919", R.drawable.hitler, "Hi! My frind."
        );
        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        return contatos;
    }
}
