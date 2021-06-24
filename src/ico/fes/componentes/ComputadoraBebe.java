/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author LENOVO
 */
public class ComputadoraBebe {
    private CPU cpu1;
    private Monitor monitor1;
    private Mouse mouse1;
    private Teclado teclado;

    public ComputadoraBebe() {
    }

    public ComputadoraBebe(CPU cpu1, Monitor monitor1, Mouse mouse1, Teclado teclado) {
        this.cpu1 = cpu1;
        this.monitor1 = monitor1;
        this.mouse1 = mouse1;
        this.teclado = teclado;
    }

    public CPU getCpu1() {
        return cpu1;
    }

    public void setCpu1(CPU cpu1) {
        this.cpu1 = cpu1;
    }

    public Monitor getMonitor1() {
        return monitor1;
    }

    public void setMonitor1(Monitor monitor1) {
        this.monitor1 = monitor1;
    }

    public Mouse getMouse1() {
        return mouse1;
    }

    public void setMouse1(Mouse mouse1) {
        this.mouse1 = mouse1;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "ComputadoraBebe{" + "cpu1=" + cpu1 + ", monitor1=" + monitor1 + ", mouse1=" + mouse1 + ", teclado=" + teclado + '}';
    }
    
    
    
    
}
