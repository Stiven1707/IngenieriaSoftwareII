/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.parkinglot.infra;

/**
 *
 * @author Kevin
 */
public class Utilities {
    public static long redondearValor(long valor){
        return (long) Math.ceil((float) valor/100 )*100;
    }
    public static int GenerarAleatorio(){
        return (int) (Math.random() * 1000 + 1);
    }
}
