package cl.ds.app.models;

public class GPU {

    private String modelo;
    private String memoria;
    private String frecuenciaCore;
    private String frecuenciaCores;
    private String bus;
    private String fabricante;

    public GPU() {
    }

    public GPU(String modelo, String memoria, String frecuenciaCore, String frecuenciaCores, String bus, String fabricante) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.frecuenciaCore = frecuenciaCore;
        this.frecuenciaCores = frecuenciaCores;
        this.bus = bus;
        this.fabricante = fabricante;




    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getFrecuenciaCore() {
        return frecuenciaCore;
    }

    public void setFrecuenciaCore(String frecuenciaCore) {
        this.frecuenciaCore = frecuenciaCore;
    }

    public String getFrecuenciaCores() {
        return frecuenciaCores;
    }

    public void setFrecuenciaCores(String frecuenciaCores) {
        this.frecuenciaCores = frecuenciaCores;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "modelo='" + modelo + '\'' +
                ", memoria='" + memoria + '\'' +
                ", frecuenciaCore='" + frecuenciaCore + '\'' +
                ", frecuenciaCores='" + frecuenciaCores + '\'' +
                ", bus='" + bus + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
