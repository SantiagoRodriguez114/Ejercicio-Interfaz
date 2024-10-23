package Cuentas;

public class Vivienda extends Cuenta implements IDeposito {
    
    public Vivienda(int numCuenta, String titular){
        super(numCuenta, titular);

    }

    @Override
    public void deposito(long valor) {
        // TODO Auto-generated method stub
        if(valor < 0) {
    		System.out.println("Valor ingresado no valido...");
    	} else {
    	
    	this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado");
    }
    }

    
}
