package Modelo;

public class Pais {
    private String Nombre;
    private String TotalConfirmados;
    private String TotalMuertos;
    private String TotalRecuperados;
    private String FechaActualizacion;

    public Pais(String nombre, String tConfirmados, String tMuertos, String tRecuperados, String fActual){
        this.Nombre = nombre;
        this.TotalConfirmados = tConfirmados;
        this.TotalMuertos = tMuertos;
        this.TotalRecuperados = tRecuperados;
        this.FechaActualizacion = fActual;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTotalConfirmados() {
        return TotalConfirmados;
    }

    public String getTotalMuertos() {
        return TotalMuertos;
    }

    public String getTotalRecuperados() {
        return TotalRecuperados;
    }

    public String getFechaActualizacion() {
        return FechaActualizacion;
    }
}