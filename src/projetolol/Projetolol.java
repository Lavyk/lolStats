/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolol;

/**
 *
 * @author Edna
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Projetolol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String arr = "";
        try {
            FileReader arq = new FileReader("camp.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
            while (linha != null) {
                if (linha.trim().equals("")) {
                    //System.out.printf(", ");
                    arr += ",";
                } else {
                    //System.out.printf("\"%s\"", linha);
                    arr += linha;
                }
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            
            System.out.println(arr);
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }
}
