
import java.time.LocalDate;


public class Estudiante extends Cliente {
    private Cuenta cuenta;
    private Float balance;

    public Estudiante(int i, String nombre, String apellido, 
    String telefono, String email, LocalDate localdate, Cuenta cuenta) {
        super(i, nombre, apellido, telefono, email, localdate);
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return this.cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Float calculoBalance() {
        return this.balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

}
