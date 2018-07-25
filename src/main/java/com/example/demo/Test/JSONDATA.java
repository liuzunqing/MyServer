package com.example.demo.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yunxi
 * Date: 2018/7/18
 * Time: 19:04
 * Description: No Description
 */
public class JSONDATA {

    private  Data wind;
    private  Data temperature;
    private  Data humidity;
    private  Data gas;
    private  Data latitude; // 经纬度
    private  Data longitude;

    public JSONDATA(Data wind, Data temperature, Data humidity, Data gas, Data latitude, Data longitude) {
        this.wind = wind;
        this.temperature = temperature;
        this.humidity = humidity;
        this.gas = gas;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Data getWind() {
        return wind;
    }

    public void setWind(Data wind) {
        this.wind = wind;
    }

    public Data getTemperature() {
        return temperature;
    }

    public void setTemperature(Data temperature) {
        this.temperature = temperature;
    }

    public Data getHumidity() {
        return humidity;
    }

    public void setHumidity(Data humidity) {
        this.humidity = humidity;
    }

    public Data getGas() {
        return gas;
    }

    public void setGas(Data gas) {
        this.gas = gas;
    }

    public Data getLatitude() {
        return latitude;
    }

    public void setLatitude(Data latitude) {
        this.latitude = latitude;
    }

    public Data getLongitude() {
        return longitude;
    }

    public void setLongitude(Data longitude) {
        this.longitude = longitude;
    }
}
