/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posisionamientoporventanas;

/**
 *
 * @author raule
 */
public class PosisionamientoPorVentanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana v = new Ventana("Si me buscas este es mi id" + getPID());
        v.setVisible(true);
    }

    public static String getPID(){
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
}
