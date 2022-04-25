package com.webrayan.creationals.builder;

public class ComputerBuilder {

    // required parameters
    private String HDD;
    private String RAM;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public ComputerBuilder(String hdd, String ram){
        this.HDD=hdd;
        this.RAM=ram;
    }


    public ComputerBuilder(String hdd, String ram,boolean graphic, boolean bluetooth){
        this.HDD=hdd;
        this.RAM=ram;
        this.isGraphicsCardEnabled=graphic;
        this.isBluetoothEnabled=bluetooth;
    }

    public Computer build(){
        return new Computer(this);
    }

}
