/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiler;

import Analizadores.LexParser;
import Analizadores.SintacticoParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class Ejecutor {

    public static void main(String[] args) {
        try {
            new Ejecutor().EJECUTAR();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejecutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EJECUTAR() throws FileNotFoundException {
        String texto = "{int x; char y; {bool x; int w; {int z;} }}";
        escribir("filetemp.txt", texto);
        LexParser lex = new LexParser(new FileReader("filetemp.txt"));
        SintacticoParser sin = new SintacticoParser(lex);
        try {
            sin.parse();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error " + e.getMessage());
        }

    }

    public void escribir(String direccion, String texto) {
        //metodo que guarda lo que esta escrito en un archivo de texto
        try {
            FileWriter writer = new FileWriter(direccion);
            PrintWriter print = new PrintWriter(writer);
            print.print(texto);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
