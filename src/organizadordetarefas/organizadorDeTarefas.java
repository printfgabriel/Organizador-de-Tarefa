/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package organizadordetarefas;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author gabri
 */
public class organizadorDeTarefas {
    
    static int[] labelSize = new int[2];
    static int soma = 50;
    static int atual = 160;
    static int fixo = 160;
    static boolean auxB = true;
    static int indexAtual = 0;
    
    
   
    public static void dasdas() {
        labelSize[0] = 313;
        labelSize[1] = 43;
        
    }
    public static void setLugar(JTextField caixa){
       caixa.setBounds(100, atual, 313, 43);
    }
    public static void setLugar(JButton botao){
       botao.setBounds(420, atual, 88, 42);
       atual += soma;
    }
    
    public static void reposicionar(int j){ //problema: quando fica em ultimo para de receber comando
        resetar();
        Frame.buttons.forEach(x -> {
            x.setVisible(false);
        });
        Frame.labels.forEach(x -> {
            x.setVisible(false);
        });
        
        for(int i = 0; i<6; i++){   
            try{
                Frame.labels.get(Frame.labels.size() - (i+j+1)).setVisible(true);
                Frame.buttons.get(Frame.buttons.size() - (i+j+1)).setVisible(true);}
            catch(Exception e){
            }
            descer(j, i);
        }
    }
    
    public static void descer(int j, int i){
        try{
            setLugar(Frame.labels.get(Frame.labels.size() - (i+j+1) ));
            setLugar(Frame.buttons.get(Frame.buttons.size() - (i+j+1) ));
            auxB = false;
        } catch(Exception e){
            auxB = false;
        }
    }
    
    public static void clean(int j, int i){
        Frame.labels.get(Frame.labels.size() - (i+j+1)).setVisible(false);
        Frame.buttons.get(Frame.buttons.size() - (i+j+1)).setVisible(false);
    }
    
    public static void subir(int j, int i){
        setLugar(Frame.labels.get(Frame.labels.size()- (j-i+1) ));
        setLugar(Frame.buttons.get(Frame.buttons.size()-(j-i+1) ));
    }
    
    public static void resetar(){
        atual = fixo;
    }
    public static int getIndexAtual() {
        return indexAtual;
    }
    public static void setIndexAtual(int indexAtual) {
        organizadorDeTarefas.indexAtual = indexAtual;
    }
}
