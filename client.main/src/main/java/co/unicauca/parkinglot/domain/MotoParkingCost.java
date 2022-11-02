/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.parkinglot.domain;

import co.unicauca.parkinglot.infra.Utilities;
import java.time.LocalDateTime;

/**
 *
 * @author Kevin
 */

public class MotoParkingCost implements IParkingCost {
    final long TARIFA = 1000;
    final long FIJA = 2000;
    @Override
    public long calculateCostVehicle(Vehicle vehiculo,LocalDateTime llegada,LocalDateTime ida) {
        long costo=0;
        int deltaHoras = ida.getHour() - llegada.getHour();
        int deltaMinutos = ida.getMinute()-llegada.getMinute();
        if(deltaHoras==0 && deltaMinutos>0)
            costo = TARIFA;
        else{
            costo = FIJA;
            deltaHoras -=1;
            costo += (TARIFA*deltaHoras)+((TARIFA*deltaMinutos)/60);
        }
               
        return Utilities.redondearValor(costo);
    }
}
