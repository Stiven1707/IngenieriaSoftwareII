/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.parkinglot.domain;

import java.time.LocalDateTime;

/**
 *
 * @author Kevin
 */
public interface IParkingCost {
    public long calculateCostVehicle(Vehicle vehiculo,LocalDateTime llegada,LocalDateTime ida);
}
