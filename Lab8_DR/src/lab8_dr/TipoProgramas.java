/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_dr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author famii
 */
public class TipoProgramas {
    private int Puntos, YearLanzamiento;
    private String Nombre, Tipo, Genero;
    private File Archivo;

    public TipoProgramas() {
        try {
            Archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "Programas.txt");
        } catch (IOException ex) {
            Logger.getLogger(TipoProgramas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public TipoProgramas(int Puntos, int YearLanzamiento, String Nombre, String Tipo, String Genero) {
        this.Puntos = Puntos;
        this.YearLanzamiento = YearLanzamiento;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Genero = Genero;
        try {
            Archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "Programas.txt");
        } catch (IOException ex) {
            Logger.getLogger(TipoProgramas.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    
     public void ReadFileScanner() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        try {
            sc = new Scanner(Archivo);
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
     
     public ArrayList<TipoProgramas> ReadFileScannerArrayList() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        ArrayList<TipoProgramas> programas = new ArrayList<>();
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String temp = sc.nextLine();
                System.out.println(temp);
                System.out.println(temp.split(",").length);
                String[] next = temp.split(","); 
                programas.add(new TipoProgramas(Integer.parseInt(next[3]), Integer.parseInt(next[4]), next[0], next[2], next[1]));
                
                // .out.println(next);
               
            }
            return programas;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
            return programas;
        } finally {
             sc.close();
        }
        
    }
    
    public void WriteFile(int Puntos, int YearLanzamiento, String Nombre, String Tipo, String Genero) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(Nombre + "," + Genero + "," + Tipo + "," + Puntos + "," + YearLanzamiento);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
    public void WriteFile() {
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(Nombre + "," + Genero + "," + Tipo + "," + Puntos + "," + YearLanzamiento);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
     public void WriteFileMod(ArrayList<TipoProgramas> Programas) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (TipoProgramas programas : Programas) {
            bw.write(programas.getNombre() + "," + programas.getGenero()+ "," + programas.getTipo() + "," + programas.getPuntos() + "," + programas.getYearLanzamiento());
            bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura");
        }
    }
}

