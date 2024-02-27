/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Andrés Dardex
 */
public class Nomina extends Empleado{
    public long getAuxilioTransporte(){
        long auxilio = 0;
        if(this.salariobasico < (2*737117))
        {
            auxilio = (83140/30)*this.getDias();
        }
        else{
            auxilio = 0;}
        return auxilio;  
    }
        public long getSalud(){
            return (long)(super.calcularsalario()*0.03);
        }
        public long getPension(){
            return (long)(super.calcularsalario()*0.04);
        }
        public long calcularsalario(){
            return super.calcularsalario()+getAuxilioTransporte()-getSalud()-getPension();
    }

    public void setDias(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
