/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_douglasrivera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author famii
 */
public class TipoProgramas {
    private int Puntos, YearLanzamiento;
    private String Nombre, Tipo, Genero;
    private File Archivo = new File("./Files/Programas.txt");

    public TipoProgramas() {
    }

    public TipoProgramas(int Puntos, int YearLanzamiento, String Nombre, String Tipo, String Genero) {
        this.Puntos = Puntos;
        this.YearLanzamiento = YearLanzamiento;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Genero = Genero;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public int getYearLanzamiento() {
        return YearLanzamiento;
    }

    public void setYearLanzamiento(int YearLanzamiento) {
        this.YearLanzamiento = YearLanzamiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    public String toString() {
        return Nombre + " - : " + Genero;
    }    
    public void ReadFileScanner(File archivo) {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        try {
            sc = new Scanner(archivo);
            while (sc.hasNext()) {
                String[] next = sc.nextLine().split("|"); 
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
        }
        sc.close();
    }
    public void WriteFile(int Puntos, int YearLanzamiento, String Nombre, String Tipo, String Genero) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(Nombre + "|" + Genero + "|" + Tipo + "|" + Puntos + "|" + YearLanzamiento);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
     public void WriteFileMod(ArrayList<TipoProgramas> Songs) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (TipoProgramas programas : Songs) {
            bw.write(programas.getNombre() + "|" + programas.getGenero()+ "|" + programas.getTipo() + "|" + programas.getPuntos() + "|" + programas.getYearLanzamiento());
            bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura");
        }
    }
}
