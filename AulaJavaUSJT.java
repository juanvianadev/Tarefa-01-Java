/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Juan Viana
 */

import javax.swing.JOptionPane;

public class AulaJavaUSJT {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          
     double resultado = 0;
     double valorReal =   5.15;     
     double valorDolar = 0;
     boolean valorValido = false;
     
     do{
         valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Dolar(USD): "));
         resultado = valorDolar * valorReal;
         
         if(valorDolar >= 0){
             JOptionPane.showMessageDialog(null, "Resultado em Reais(BRL): "   +  resultado);
             valorValido = true;
         }else{
             JOptionPane.showMessageDialog(null, "Por favor insira um valor");
         }
         
     }while(!valorValido);    
         
     }    
        
}
