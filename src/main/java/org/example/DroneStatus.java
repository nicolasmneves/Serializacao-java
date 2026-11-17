package org.example;

import java.lang.reflect.Constructor;

public class DroneStatus
{

    public String codigoIdentificador;
    public int nivelBateria;
    public double latitude;
    public double longitude;
    public boolean emMissao;

    public DroneStatus(String codigoIdentificador, int nivelBateria, double latitude, double longitude, boolean emMissao) {
        this.codigoIdentificador = codigoIdentificador;
        this.nivelBateria = nivelBateria;
        this.latitude = latitude;
        this.longitude = longitude;
        this.emMissao = emMissao;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isEmMissao() {
        return emMissao;
    }

    public void setEmMissao(boolean emMissao) {
        this.emMissao = emMissao;
    }
}
