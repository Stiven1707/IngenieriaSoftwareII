/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.parkinglot.acces;

/**
 *
 * @author Kevin
 */
public class RepositoryFactory {
    private static RepositoryFactory instance;
    

    public RepositoryFactory(RepositoryFactory instance) {
        RepositoryFactory.instance = instance;
    }

    public static RepositoryFactory getInstance() {
        if (instance == null) {
            instance = new RepositoryFactory(instance);
        }
        return instance;
    }

    public void setInstance(RepositoryFactory instance) {
        RepositoryFactory.instance = instance;
    }
    
    public IVehicleRepository getRepositoryType(String type) {
        
        IVehicleRepository result=null;
        if (type.equals("default")) {
            result=(IVehicleRepository) new VehicleRepository();
        }
        return result;
    }
}
