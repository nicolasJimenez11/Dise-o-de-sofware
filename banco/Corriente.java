public abstract class Corriente extends Cuenta{
    private int sobreGiro;
    

public Corriente(int NCuenta, String dueno, int saldo, int sobreGiro) {
        super(numeroCuenta, titular, saldo);
        this.sobreGiro = sobreGiro;
    }

@Override
public void deposito(int valor) {
   
    this.saldo+=valor;
}

@Override
public void retiro(int valor) {
    
    if(valor <= (this.saldo+this.sobreGiro)){
        this.saldo-=valor;
    }else {
        System.out.println("Monto de retiro no posible debido a ser elevado ");
    }
}
}

