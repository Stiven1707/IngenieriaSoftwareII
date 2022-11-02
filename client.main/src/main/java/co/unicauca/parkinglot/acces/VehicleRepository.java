/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.parkinglot.acces;

import co.unicauca.parkinglot.domain.TypeEnum;
import co.unicauca.parkinglot.domain.Vehicle;
import java.security.Provider.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class VehicleRepository implements IVehicleRepository{

    
     private Connection conn;

    public VehicleRepository() {
        initDatabase();
    }

     @Override
    public boolean saveNewVehicle(Vehicle newVehiculo) {

        try {
            //Validate product
            if (newVehiculo == null || newVehiculo.getPlaca().isEmpty()|| newVehiculo.getType().toString().isEmpty()) {
                return false;
            }
            this.connect();

            String sql = "INSERT INTO Vehicle ( PlacaVehiculo, TipoVehiculo)"
                    + "VALUES (?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newVehiculo.getPlaca());
            pstmt.setString(2, newVehiculo.getType().toString());
            pstmt.executeUpdate();
            pstmt.close();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

     @Override
    public List<Vehicle> listVehiculos() {
        List<Vehicle> vehiculos = new ArrayList<>();
        try {

            String sql = "SELECT PlacaVehiculo, TipoVehiculo FROM Vehicle";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Vehicle newVehiculo = new Vehicle();
                newVehiculo.setPlaca(rs.getString("PlacaVehiculo"));
                TypeEnum tipoVehiculo= TypeEnum.valueOf(rs.getString("TipoVehiculo"));
                newVehiculo.setType(tipoVehiculo);
                vehiculos.add(newVehiculo);
                
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculos;
    }

    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Vehicle (\n"
                + "	PlacaVehiculo text PRIMARY KEY,\n"
                + "	TipoVehiculo text NOT NULL\n"
                + ");";

        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void connect() {
        // Si se quiere guardar los datos a un archivo
        String url = "jdbc:sqlite:./mydatabase.db";
        
        // Guarda los datos en memoria RAM
        
        //String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
