/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import organizadordetarefas.*;

/**
 *
 * @author gabri
 */
public class OrganizadorDeTarefas {
    
    static int[] labelSize = new int[2];
    static int soma = 46;
    static int atual = 110;
    
    /**
     * @param args the command line arguments
     */
    public static void dasdas() {
        labelSize[0] = 228;
        labelSize[1] = 33;
        
    }
    public static void setLugar(javax.swing.JTextField caixa){
       caixa.setBounds(50, atual, 240, 33);
    }
    public static void setLugar(javax.swing.JButton botao){
       botao.setBounds(297, atual, 40, 32);
       atual += soma;
    }
    public static void adicionarItem(){
        
    }
    
}
