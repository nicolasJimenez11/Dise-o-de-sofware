public class Ahorro extends Cuenta {
    private double interes;

    public Ahorro(int NCuenta, String dueno) {
        super(numeroCuenta, titular, 0);
        this.interes = 0.03;
    }

@Override
public void deposito(int valor) {
    
    saldo+=valor; 
    saldo+=valor*interes; 
}

@Override
public void retiro(int valor) {
    
    if(valor <= saldo){
        saldo-=valor; 
       }else{
        System.out.println("Saldo no posible ");
       }

    }
    
}