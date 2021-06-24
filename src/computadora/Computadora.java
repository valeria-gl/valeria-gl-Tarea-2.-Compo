/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.ComputadoraBebe;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author LENOVO
 */
public class Computadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComputadoraBebe computadora1 = new ComputadoraBebe(new CPU("ThinkCentre", "ThinkCentre_1", 3), new Monitor("LG", "Energy Star", 8), new Mouse("Logitech", "N-U0026", "Óptico"), new Teclado("Lenovo", "SK-8825", 101, 0));
        System.out.println(computadora1);
    }
    
}
