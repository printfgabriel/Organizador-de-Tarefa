/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizadordetarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class arquivo {
    
    public static ArrayList carregarArquivo(){
    
        try {
            FileReader arq = new FileReader("tarefas.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            ArrayList<String> linhas = new ArrayList<>();

            String linha = lerArq.readLine();  

            while (linha != null) {
                linhas.add(linha);
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); 
                } 
            arq.close();
            return linhas;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            return null;
        }
    }
    
    public static void salvarArquivo(){
        System.out.println("Salvando...");
        try {
            FileWriter arq = new FileWriter("tarefas.txt");
            BufferedWriter gravarArq = new BufferedWriter(arq);

            for(javax.swing.JTextField texF: Frame.labels){
                System.out.println(texF.getText());
                gravarArq.write(texF.getText() + "\n");
            }
            gravarArq.close();
            
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
}
   