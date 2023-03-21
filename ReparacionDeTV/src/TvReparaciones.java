public class TvReparaciones {

    public String Fecha;
    private String daño;
    private String dueño;

    private String modelo;
    public TvReparaciones() {
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getDaño() {
        return daño;
    }

    public void setDaño(String daño) {
        this.daño = daño;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

  public double fecha;
    public String Daño_Original;
       public String Daño_Solucionado;
    public String Recibo;

    public void setFecha(double fecha) {
        this.fecha = fecha;
    }

    public String getDaño_Original() {
        return Daño_Original;
    }

    public void setDaño_Original(String daño_Original) {
        Daño_Original = daño_Original;
    }

    public String getDaño_Solucionado() {
        return Daño_Solucionado;
    }

    public void setDaño_Solucionado(String daño_Solucionado) {
        Daño_Solucionado = daño_Solucionado;
    }

    public String getRecibo() {
        return Recibo;
    }

    public void setRecibo(String recibo) {
        Recibo = recibo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void mostrarDatos(){
        System.out.println("Daño:"+ getDaño());
        System.out.println("Fecha:"+ getFecha());
        System.out.println("Dueño:"+ getDueño());
        System.out.println("Modelo:"+ getModelo());

    }

    public void MostrarDatos(){
        System.out.println("daño original;"+getDaño_Original());
        System.out.println("solucion;"+getDaño_Solucionado());
        System.out.println("entrega:"+getRecibo());

    }
}