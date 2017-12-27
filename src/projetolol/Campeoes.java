/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Edna
 */
public class Campeoes {
    
    private String campeoes[];
    
    public Campeoes(){
        String arr = "";
        try {
            FileReader arq = new FileReader("camp.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                if (linha.trim().equals("")) {
                    arr += ",";
                } else {
                    arr += linha;
                }
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        
        this.campeoes = new String[(arr.split(",")).length];
        this.campeoes = arr.split(",");
    }
    
    public String[] getCampeoes(){
        return this.campeoes;
    }
}
