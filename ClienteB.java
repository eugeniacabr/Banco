

public class ClienteB extends Cliente implements InterfaceClienteService {

    public ClienteB(int i, String nombre, String apellido, String telefono,
     String email, Object fecha, Cuenta[] cuentas, Float ingresoMensual, Prestamo[] prestamos) {
        super(i,nombre,apellido,telefono,email,fecha,cuentas,ingresoMensual,prestamos);
    }

    public ClienteB(){}

    @Override
    public Float calculoPrestamo() {
        Prestamo[] prestamos = getPrestamos();
        Float deudaTotal = 0f;
        for(int i=0; i < prestamos.length; i++){
            deudaTotal += prestamos[i].getSaldo();
        }
        return  getIngresoMensual() * 5 - deudaTotal;
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
