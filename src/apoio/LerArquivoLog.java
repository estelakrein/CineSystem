package apoio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LerArquivoLog {
   public static void main(String[] args) {
       Path caminho = Paths.get("C:/Users/Acer/Documents/NetBeansProjects/CineSystem/exemplo.log");
       try {
           byte[] texto = Files.readAllBytes(caminho);
           String leitura = new String(texto);
           JOptionPane.showMessageDialog(null, leitura);
       } catch (IOException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao gerar arquivo: " + erro);
       }
   } 
    
}