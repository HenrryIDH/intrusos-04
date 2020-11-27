package com.intrusos;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class Menu {
    public void mostrarMenu() {
        String[] arrMenu = null;
        String[] arrClases = null;
        
        try {
            List<String> lineas = FileUtils.readLines(new File("/var/config/instrusos/menu.txt"),"utf-8");
            arrMenu = new String[lineas.size()];
            arrClases = new String[lineas.size()];
            
            System.out.println("Menu principal (Ingrese una opcion)");
            int idx = 0;
            for (String linea : lineas) {
                // System.out.println(linea);
                String[] dosElementos = linea.split(":::");
                System.out.print("   ");
                System.out.println(dosElementos[0]);
                // System.out.println(dosElementos[1]);
                arrMenu[idx] = dosElementos[0];
                arrClases[idx] = dosElementos[1];
                idx++;
            }
            
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            Integer x = Integer.parseInt(st);
            if (x >= 1 && x <= lineas.size()) {
                Runnable r = (Runnable)Class.forName(arrClases[x-1]).newInstance();
                r.run();
                return;
            }
            System.out.println("La opcion NO es valida");
        }
        catch (ClassNotFoundException ex) {
            System.out.print("No se encontro la clase: ");
            System.out.println(ex.getMessage());
        }
        catch (ClassCastException ex) {
            System.out.print("No se pudo instanciar la clase ");
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

