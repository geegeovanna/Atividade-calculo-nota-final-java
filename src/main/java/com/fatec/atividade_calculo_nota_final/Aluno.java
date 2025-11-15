/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.atividade_calculo_nota_final; 
import javax.swing.JOptionPane;
/**
 *
 * @author fatec-dsm2
 */
public class Aluno {
    private String nome;
    private double notas[] = new double[3];
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double[] getNotas() {
        return notas;
    }
    
    public void setNotas(int i, double nota){
        if (i >= 0 && i < 3) {
            notas[i] = nota;
        }
    }
    
    public double calculaMedia(){
        double soma = 0;
        for(int i = 0; i < 3; i++){
            soma += notas[i];
        } 
        return soma/3;
    }
    
     public void retornarStatus(){
        double media = calculaMedia();
        String mediaFormat = String.format("%.2f", media);
        String status;
        
        if(media < 6.0){
            status = "Reprovado";
        }else if(media <= 9.0){
            status = "Aprovado";
        }else {
            status = "Ótimo aproveitamento";
        }
        
        JOptionPane.showMessageDialog(
            null,
            "Nome do aluno: " + nome + "\nStatus: " + status + "\nMédia: " + mediaFormat,
            "Resultado",
            JOptionPane.INFORMATION_MESSAGE
        );

    }
}





























