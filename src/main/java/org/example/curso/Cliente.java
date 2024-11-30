package org.example.curso;

import javax.swing.*;
import java.util.ArrayList;

public class Cliente {

    private ArrayList<String> listaCliente=new ArrayList<>();

    public void addCliente(String nome){
        listaCliente.add(nome);
        JOptionPane.showMessageDialog(null,"Cliente cadastrado");
    }
    public void qtddCliente(){
        String ret="Quantidade de cliente cadastrado:\n";
        JOptionPane.showMessageDialog(null,ret+listaCliente.size());
    }
    public void removerCliente(String nome)
    {
        if (listaEstaVazia() || !clienteExisteNaLista(nome)) {
            return;
        }

        listaCliente.remove(nome);
        JOptionPane.showMessageDialog(null, "Cliente foi Removido.");
        qtddCliente();
    }

    protected boolean clienteExisteNaLista(String nome)
    {
        if (listaCliente.contains(nome)) {
            return true;
        }

        JOptionPane.showMessageDialog(null, "Cliente : " + nome + "não encontrado na lista.");
        return false;
    }

    public void mostrarLista()
    {
        if (listaEstaVazia()) {
            return;
        }

        StringBuilder lista = new StringBuilder();
        lista.append("Lista de Cliente:").append("\n");
        listaCliente.forEach(cliente ->lista.append(cliente).append("\n"));
        JOptionPane.showMessageDialog(null,lista.toString());
    }

    protected boolean listaEstaVazia()
    {
        if (!listaCliente.isEmpty()) {
            return false;
        }
        JOptionPane.showMessageDialog(null,"Lista está vazio");
        return true;
    }


    public ArrayList<String> getListaCliente()
    {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<String> listaCliente)
    {
        this.listaCliente = listaCliente;
    }
}
