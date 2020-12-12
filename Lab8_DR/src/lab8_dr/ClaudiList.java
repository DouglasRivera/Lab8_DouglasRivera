/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_dr;

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
public class ClaudiList {

    String Nombre;
    private ArrayList<TipoProgramas> Programas = new ArrayList();

    public ClaudiList() {
    }

    public ClaudiList(String Nombre, ArrayList<TipoProgramas> Programas) {
        this.Nombre = Nombre;
        this.Programas = Programas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<TipoProgramas> getProgramas() {
        return Programas;
    }

    public void setProgramas(ArrayList<TipoProgramas> Programas) {
        this.Programas = Programas;
    }

    @Override
    public String toString() {
        return Nombre + " " + toStringII(Programas);
    }

    public String toStringII(ArrayList<TipoProgramas> Programas) {
        String ret = null;
        for (int i = 0; i < Programas.size(); i++) {
            for (int j = 0; j < Programas.size(); j++) {
                ret += Programas.get(i).toString();
            }
        }
        return ret;
    }
    
     public ArrayList<ClaudiList> ReadFileScannerArrayList() {
         File archivo = null;
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        ArrayList<ClaudiList> favoritos = new ArrayList<>();
        ArrayList<TipoProgramas> programas = new ArrayList<>();
        try {
            archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "ClaudiList.txt");
            sc = new Scanner(archivo);
             String nombre = sc.nextLine();
            while (sc.hasNext()) {
                String temp = sc.nextLine();
                String[] next = temp.split(",");
                programas.add(new TipoProgramas(Integer.parseInt(next[3]), Integer.parseInt(next[4]), next[0], next[2], next[1]));
                
                // .out.println(next);
               
            }
            favoritos.add(new ClaudiList(nombre, programas));
            return favoritos;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
            return favoritos;
        } finally {
             sc.close();
        }
        
    }

    public void ReadFileScanner(File TFile) {
        File archivo = null;
        Scanner sc = null;
        try {
            archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "ClaudiList.txt");
            sc = new Scanner(archivo);
            while (sc.hasNext()) {
                String next = sc.nextLine();
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer.");
        }
        sc.close();
    }
    
    public void WriteFile(String NombreLista, ArrayList<TipoProgramas> programa) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "ClaudiList-"+NombreLista+".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(NombreLista);
            bw.newLine();
            for (int i = 0; i < programa.size(); i++) {
                 bw.write(programa.get(i).getNombre() + "," + programa.get(i).getGenero() + "," + programa.get(i).getTipo() + "," + programa.get(i).getPuntos() + "," + programa.get(i).getYearLanzamiento());
                    bw.newLine();
            }
           
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }

    public void WriteFile(ArrayList<TipoProgramas> Programas, String Nombre) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "ClaudiList-"+Nombre+".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (TipoProgramas list : Programas) {
                bw.write(list.getNombre() + ",");
                bw.write(list.getGenero() + ",");
                bw.write(list.getTipo() + ",");
                bw.write(list.getPuntos() + ",");
                bw.write(list.getYearLanzamiento() + ",");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Writer.");
        }
    }
    
     public void WriteFileMod(ArrayList<ClaudiList> favoritos) {
         File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
         for (int i = 0; i < favoritos.size(); i++) {
             try {
            archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "ClaudiList-"+favoritos.get(i).getNombre()+".txt");
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (TipoProgramas programas : favoritos.get(i).getProgramas()) {
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
    
}
