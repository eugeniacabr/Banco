
import java.time.LocalDate;



public abstract class Cliente {
    Long idCliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaAlta;
    private Cuenta[] cuentas;
    private Float ingresoMensual;
    private Prestamo[] prestamos;

    public Cliente() {}


    public Cliente(long i, String nombre, String apellido, 
    String telefono, String email, Object fecha, Cuenta[] cuentas, 
    Float ingresoMensual, Prestamo[] prestamos) {
        this.idCliente = i;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaAlta = (LocalDate) fecha;
        this.cuentas = cuentas;
        this.ingresoMensual = ingresoMensual;
        this.prestamos = prestamos;
    }

    public Cliente(int i, String nombre, String apellido, String telefono, 
    String email, LocalDate localdate) {
        this.idCliente = (long) i;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaAlta = localdate;
    }


    public Cliente(Long idCliente2, String nombre2, String apellido2, String telefono2, String email2,
            LocalDate fechaAlta2, Cuenta[] cuentas2, Float ingresoMensual2, Prestamo[] prestamos2) {
    }

    public Long getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Cuenta[] getCuentas() {
        return this.cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public Float getIngresoMensual() {
        return this.ingresoMensual;
    }

    public void setIngresoMensual(Float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public Prestamo[] getPrestamos() {
        return this.prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    public abstract Float calculoBalance();


    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", email='" + getEmail() + "'" +
            ", fechaAlta='" + getFechaAlta() + "'" +
            ", tipoCliente='" + getClass().getName() + "'" +
            ", ingresoMensual='" + getIngresoMensual() + "'" +
            "}";
    }


}
