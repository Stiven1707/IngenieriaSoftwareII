/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.parkinglot.acces;

import co.unicauca.parkinglot.domain.Vehicle;

/**
 *
 * @author Kevin
 */
public interface IVehicleRepository {
    public boolean saveNewVehicle(Vehicle vehiculo);
    public java.util.List<Vehicle> listVehiculos();
}
