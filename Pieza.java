public class Pieza {
    private String nombre;
private String movimiento;
    private int cantidad;
    
    public Pieza(String nombre,String movimiento,int cantidad){
        this.nombre=nombre;
        this.movimiento=movimiento;
        this.cantidad=cantidad;
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}