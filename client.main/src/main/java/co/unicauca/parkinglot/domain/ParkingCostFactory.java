/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.parkinglot.domain;

import co.unicauca.parkinglot.acces.IVehicleRepository;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Kevin
 */
public class ParkingCostFactory {
    private Map<TypeEnum, IParkingCost> Dictionary;

    // Singleton
    private static ParkingCostFactory instance;

    private ParkingCostFactory() {
        Dictionary = new EnumMap<>(TypeEnum.class);
        Dictionary.put(TypeEnum.MOTO, new MotoParkingCost());
        Dictionary.put(TypeEnum.CARRO, new CarParkingCost());
        Dictionary.put(TypeEnum.CAMION, new TruckParkingCost());
        // Si se requie otto pais, se abre un registro en este diccionario
        // No se viola el principio porque este este modulo no está pensado
        // para que sea estable.
    }

    /**
     * Devuelve la instancia de la clase
     *
     * @return instancia unica de la la fábrica
     */

    public static ParkingCostFactory getInstance() {
        if (instance == null) {
            instance = new ParkingCostFactory();
        }
        return instance;
    }

    /**
     * Para un pais determina la clase que se encarga de calcular el costo del
     * envío.
     *
     * @param vehicle
     * @return
     */
    public  IParkingCost getParkingCost(TypeEnum vehicle) {

        IParkingCost  result = null;

        if (Dictionary.containsKey(vehicle)) {
            result = Dictionary.get(vehicle);
        }

        return result;

    } 
    
}
