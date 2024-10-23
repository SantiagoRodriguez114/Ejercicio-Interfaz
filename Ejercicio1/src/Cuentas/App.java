package Cuentas;

public class App {
    public static void main(String[] args){

        Ahorro cuentaAhorro = new Ahorro(147, "Anuel");

        cuentaAhorro.deposito(15000);

        Nomina cuentaNomina = new Nomina(451, "Arcangel");
        cuentaNomina.retiro(84000);
        System.out.println(cuentaNomina);
    
    }

    
        
    
}
