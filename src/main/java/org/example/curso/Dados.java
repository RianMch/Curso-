package org.example.curso;

import java.util.ArrayList;
import java.util.List;

public class Dados {
    private String nome;
    private List<String> lista;
    //adicionando itens na lista
    public void addItens(String itens){
        lista.add(itens);
    }
//getters && setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
}
