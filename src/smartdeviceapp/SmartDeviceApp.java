/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartdeviceapp;

/**
 *
 * @author clau
 */
public class SmartDeviceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // Crear objetos SmartPhone y SmartWatch
        SmartPhone phone = new SmartPhone("Apple", "iPhone 12", 90, "123456789", true);
        SmartWatch watch = new SmartWatch("Samsung", "Galaxy Watch 3", 80, true);

        // Imprimir valores por consola
        System.out.println("SmartPhone:");
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Battery Level: " + phone.getBatteryLevel());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Has Internet: " + phone.hasInternet());

        System.out.println("\nSmartWatch:");
        System.out.println("Brand: " + watch.getBrand());
        System.out.println("Model: " + watch.getModel());
        System.out.println("Battery Level: " + watch.getBatteryLevel());
        System.out.println("Has Heart Rate Monitor: " + watch.hasHeartRateMonitor());
    }
}
    
    
