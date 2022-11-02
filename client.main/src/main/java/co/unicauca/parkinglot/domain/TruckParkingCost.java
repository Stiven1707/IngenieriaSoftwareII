/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.parkinglot.domain;

import co.unicauca.parkinglot.infra.Utilities;
import static co.unicauca.parkinglot.infra.Utilities.GenerarAleatorio;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Kevin
 */
public class TruckParkingCost implements IParkingCost{
    final long TARIFA = 15000;
    final long FIJA = 10000;
    @Override
    public long calculateCostVehicle(Vehicle vehiculo, LocalDateTime llegada, LocalDateTime ida) {
        long costo=0;
        int deltaHoras = ida.getHour()- llegada.getHour();
        int deltaDias =  ida.getDayOfMonth()-llegada.getDayOfMonth();
        System.out.println(""+deltaDias);
        if (deltaDias==0 && deltaHoras<=12) {
            costo = FIJA;   
        }else if (deltaDias==0 && deltaHoras<24) {
            costo = TARIFA;
        }else{
            System.out.println("Opcion 3");
            costo = (TARIFA*deltaDias)+(TARIFA*deltaHoras)/24; 
        }
        return Utilities.redondearValor(costo);
    }
    public boolean sorteo(int nume){
        boolean bandera = false;
        if(nume == GenerarAleatorio()){
            bandera = true;
        }
        return bandera;
    }
    
}
