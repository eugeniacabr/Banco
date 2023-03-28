import java.time.LocalDate;

public class ClienteA extends Cliente implements InterfaceClienteService {

    public ClienteA(Long idCliente, String nombre, String apellido, 
    String telefono, String email, LocalDate fechaAlta, Cuenta[] cuentas,
    Float ingresoMensual, Prestamo[] prestamos) {
        super(idCliente,nombre,apellido,telefono,email,fechaAlta,cuentas,ingresoMensual,prestamos);
    }


    @Override
    public Float calculoPrestamo() {
        Prestamo[] prestamos = getPrestamos();
        Float deudaTotal = 0f;
        for(int i=0; i < prestamos.length; i++){
            deudaTotal += prestamos[i].getSaldo();
        }
        return  getIngresoMensual() * 10 - deudaTotal;
    } 

    @Override
    public Float calculoBalance() {
        Cuenta[] cuentas = getCuentas();
        Float saldoTotal = 0f;
        for(int i=0; i < cuentas.length; i++){
            saldoTotal += cuentas[i].getBalance();
        }
        return saldoTotal;
    }
}
