/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.atividade_calculo_nota_final;
import javax.swing.JOptionPane;
/**
 *
 * @author fatec-dsm2
 */
public class Atividade_calculo_nota_final {

    public static void main(String[] args) {
        
        Aluno al = new Aluno();

        String nome = JOptionPane.showInputDialog(null,
                "Digite o nome do aluno:", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        al.setNome(nome);

        for (int i = 0; i < 3; i++) {
            String nNotas = JOptionPane.showInputDialog(null,
                    "Digite a nota " + (i + 1) + ":", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
            double nota = Double.parseDouble(nNotas);
            al.setNotas(i, nota);
        }

        al.retornarStatus();
        
    }
}










