package br.com.exemploBanco;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
int numero;
double saldo,limite,rendimento;

      int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco: \n <1> Conta corrente\n <2> conta poupança <3> sair\n"));
 switch ( opcao ){
     case 1:
         numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta"));
         saldo = Double.parseDouble(JOptionPane.showInputDialog("saldo"));
         limite = Double.parseDouble(JOptionPane.showInputDialog("limite"));
       ContaCorrente cc1= new ContaCorrente(numero,saldo,limite);
        JOptionPane.showMessageDialog(null, "Saldo: " + cc1.getSaldo() + "\n saldo com o limite : " +cc1.consultaSaldoTotal(), "Conta corrente", JOptionPane.INFORMATION_MESSAGE );
         break;
     case 2:
         numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta"));
         saldo = Double.parseDouble(JOptionPane.showInputDialog("saldo"));
         rendimento = Double.parseDouble(JOptionPane.showInputDialog("rendimento"));
         ContaCorrente cp1= new ContaCorrente(numero,saldo,rendimento);
         JOptionPane.showMessageDialog(null, "Saldo: " + cp1.getSaldo() + "\n saldo com o limite : " +cp1.consultaSaldoTotal(), "Conta corrente", JOptionPane.INFORMATION_MESSAGE );

         break;
     case 3:
         break;
     default:

         JOptionPane.showMessageDialog(null,"Escolha invalida" , "Erro" , JOptionPane.ERROR);
 }


    }
}
