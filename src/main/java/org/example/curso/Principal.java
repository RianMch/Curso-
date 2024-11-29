package org.example.curso;

import javax.swing.*;

public class Principal {
    private static Cliente c;
    public static void main(String[] args) {
     c=new Cliente();
    int op;
     do {
         op=menu();
         operacao(op);

     }while(op!=5);


    }


    private static int menu(){
        String menu="1 -Cadastrar um cliente na lista:\n" +
                "2 -Excluir um cliente da lista:\n" +
                "3 -Mostrar a quantidade de clientes na lista:\n" +
                "4 -Listar todos os clientes cadastrados:\n" +
                "5 -Sair:\n";
        int op=Integer.parseInt(JOptionPane.showInputDialog(menu)) ;
        return op;
    }

    private static void operacao(int op){
        if(op==1) c.addCliente(JOptionPane.showInputDialog("Cadastrar nome de Cliente:"));
        if(op==2)c.removerCliente(JOptionPane.showInputDialog("Qual o Cliente Que deseja remover:"));
        if(op==3)c.qtddCliente();
        if(op==4) c.mostrarLista();
        if(op==5)JOptionPane.showMessageDialog(null,"Saindo Do Sistema");
    }
}

