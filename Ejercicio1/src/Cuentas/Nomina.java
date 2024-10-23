package Cuentas;

public class Nomina extends Cuenta implements IRetiro {
   
    public Nomina(int numCuenta, String titular){
    super(numCuenta, titular);
   }

    @Override
    public void retiro(long valor) {
        // TODO Auto-generated method stub
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
        } else {
            this.saldo -= valor;
            System.out.println("Retiro de " + valor + " realizado. Saldo actual: " + this.saldo);
        }
    } 
        public String toString(){
            return super.toString();
        }
   
}
