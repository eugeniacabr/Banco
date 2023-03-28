import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        LocalDate fecha1 = LocalDate.of(2022, 04, 15);
        
        LocalDate fecha2 = LocalDate.of(2021, 05, 30);
        
        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);

        Prestamo prestamo1 = new Prestamo(1, 2000f);

        Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
        Cuenta cuenta4 = new Cuenta(2, true, 550.0f);

        Prestamo prestamo2 = new Prestamo(1, 5000f);
        
        Prestamo[] prestamos2 = {prestamo2};
        Cuenta[] cuentas2 = {cuenta3, cuenta4};

        
        ClienteB clienteB1 = new ClienteB(2l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha2, cuentas2, 1000.0f, prestamos2);

        Prestamo[] prestamos1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};

        ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha1, cuentas1, 2000.0f, prestamos1);

        System.out.println("El balance total de cuentas del cliente es: " + clienteA1.calculoBalance());
        System.out.println("El prestamo al que el cliente puede aplicar es de: " + clienteA1.calculoPrestamo());

        clientes.add(clienteA1);
        clientes.add(clienteB1);

        System.out.println(clientes);
    }   
}
