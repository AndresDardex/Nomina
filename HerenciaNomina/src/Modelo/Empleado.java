/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Andrés Dardex
 */
public class Empleado extends Persona {
    protected long salariobasico;
    protected int dias;
    public long getSalariobasico(){
        return salariobasico;
    }
    public void setSalariobasico(long salariobasico){
        this.salariobasico = salariobasico;
    }
    public int getDias(){
        return dias;
    }
    public void setDias(){
        this.dias = dias;
    }
    public long calcularsalario(){
        return ((this.salariobasico/30)*dias);
    }
    
}
