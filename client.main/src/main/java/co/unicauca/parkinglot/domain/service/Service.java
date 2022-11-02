/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.parkinglot.domain.service;

import co.unicauca.parkinglot.acces.IVehicleRepository;
import co.unicauca.parkinglot.acces.RepositoryFactory;
import co.unicauca.parkinglot.domain.IParkingCost;
import co.unicauca.parkinglot.domain.ParkingCostFactory;
import co.unicauca.parkinglot.domain.TypeEnum;
import co.unicauca.parkinglot.domain.Vehicle;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Kevin
 */
public class Service {
    private IVehicleRepository repository;
     
    
    public Service(IVehicleRepository repository) {
        this.repository = repository;
    }
    public IVehicleRepository getRepositorio() {
        return repository;
    }

    public void setRepositorio(IVehicleRepository repository) {
        this.repository = repository;
    }
    
    /**
     * Maneja una lógica de negocio simple para calcular un impuesto del producto
     * @param Vehiculo producto a calcular impuesto
     * @return 
     */
    public long calculateParkingCost(Vehicle vehiculo,LocalDateTime llegada,LocalDateTime ida) {
        IParkingCost  newVehiculo = ParkingCostFactory.getInstance().getParkingCost(vehiculo.getType() );
        return newVehiculo.calculateCostVehicle(vehiculo, llegada, ida);
    }
     
}
