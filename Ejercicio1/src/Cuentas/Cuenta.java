package Cuentas;

public class Cuenta implements IDeposito, IRetiro{
    protected int numCuenta;
    protected String titular;
    protected long saldo;
    
    public Cuenta(int numCuenta, String titular) {
        this.numCuenta = numCuenta;
        this.titular = titular;
  
    }
    
    public long getSaldo() {
        return saldo;
    }
    
    @Override
    public void deposito(long valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void retiro(long valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        return "Cuenta #" + this.numCuenta + "\n titular=" + titular + "\n saldo=" + saldo;
    }
    
}
