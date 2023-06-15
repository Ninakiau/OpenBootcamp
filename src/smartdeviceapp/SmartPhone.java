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
public class SmartPhone extends SmartDevice {
     private String phoneNumber;
    private boolean hasInternet;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, int batteryLevel, String phoneNumber, boolean hasInternet) {
        super(brand, model, batteryLevel);
        this.phoneNumber = phoneNumber;
        this.hasInternet = hasInternet;
    }

    // Getters y setters

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean hasInternet() {
        return hasInternet;
    }

    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }
}


