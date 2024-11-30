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

    private static void operacao(int op)
    {
        switch(op) {
            case 1:
                String clienteParaCadastrar = JOptionPane.showInputDialog("Cadastrar nome de Cliente:");
                c.addCliente(clienteParaCadastrar);
                break;
            case 2:
                String clienteParaRemover = JOptionPane.showInputDialog("Qual o Cliente Que deseja remover:");
                c.removerCliente(clienteParaRemover);
                break;
            case 3:
                c.qtddCliente();
                break;
            case 4:
                c.mostrarLista();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Saindo Do Sistema");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
    }
}

