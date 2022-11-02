/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.parkinglot.domain;

/**
 *
 * @author Kevin
 */
public class Vehicle {
    private String placa;
    private TypeEnum type;
    
    public Vehicle(){
        this.placa ="";
    }
    
    public Vehicle(String placa, TypeEnum type) {
        this.placa = placa;
        this.type = type;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
    
}
