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
    public class SmartWatch extends SmartDevice {
    private boolean hasHeartRateMonitor;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, int batteryLevel, boolean hasHeartRateMonitor) {
        super(brand, model, batteryLevel);
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    // Getters y setters

    public boolean hasHeartRateMonitor() {
        return hasHeartRateMonitor;
    }

    public void setHasHeartRateMonitor(boolean hasHeartRateMonitor) {
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }
}

