
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese el salario del cliente en cuestion:  ");
        Float a = leer.nextFloat();
    
        System.out.println("Ingrese fecha de ingreso en formato 'dd/mm/YYYY' ");
        

        String b = leer.next();
        try{
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha= formato.parse(b);
        
        LocalDate fechaHoy=LocalDate.now();
        LocalDate fecha1= fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(fecha1,fechaHoy);

        if((a >= 2000 ) && (period.getYears()>=2)){
            Cliente cliente=new ClienteA();
            System.out.println("Es cliente A, ingrese datos correspondientes: ");
            



        }
            
        
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }

    


        leer.close();


        //LocalDate fecha1 = LocalDate.of(2022, 04, 15);
        
        //LocalDate fecha2 = LocalDate.of(2021, 05, 30);
        
        //Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        //Cuenta cuenta2 = new Cuenta(2, true, 350.0f);

        //Prestamo prestamo1 = new Prestamo(1, 2000f);

        //Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
        //Cuenta cuenta4 = new Cuenta(2, true, 550.0f);

        //Prestamo prestamo2 = new Prestamo(1, 5000f);
        
        //Prestamo[] prestamos2 = {prestamo2};
        //Cuenta[] cuentas2 = {cuenta3, cuenta4};

        
        //ClienteB clienteB1 = new ClienteB(2l, "Ricardo", "Gomez", "242342",
        // "Richard@Fort.com", fecha2, cuentas2, 1000.0f, prestamos2);

        //Prestamo[] prestamos1 = {prestamo1};
        //Cuenta[] cuentas1 = {cuenta1, cuenta2};

        //ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
        // "Richard@Fort.com", fecha1, cuentas1, 2000.0f, prestamos1);

        //System.out.println("El balance total de cuentas del cliente es: " + clienteA1.calculoBalance());
        //System.out.println("El prestamo al que el cliente puede aplicar es de: " + clienteA1.calculoPrestamo());

        //clientes.add(clienteA1);
        //clientes.add(clienteB1);

        //System.out.println(clientes);
    }   

}
