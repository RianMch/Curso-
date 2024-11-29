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
    public void removerCliente(String nome){
        String ret="Cliente foi Removido.";
        if(!listaCliente.isEmpty()){
        if(listaCliente.contains(nome)) {
            listaCliente.remove(nome);
            JOptionPane.showMessageDialog(null,ret);
            qtddCliente();
            ;
        }
        }
        JOptionPane.showMessageDialog(null,"Lista está vazio");

    }

    public void mostrarLista(){
        if(!listaCliente.isEmpty()){
        StringBuilder lista=new StringBuilder();
        lista.append("Lista de Cliente:").append("\n");
        listaCliente.forEach(cliente ->lista.append(cliente).append("\n"));
        JOptionPane.showMessageDialog(null,lista.toString());
        }
        JOptionPane.showMessageDialog(null,"Lista está vazio");
    }


    public ArrayList<String> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<String> listaCliente) {
        this.listaCliente = listaCliente;
    }
}
