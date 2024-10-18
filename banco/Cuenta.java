public abstract class Cuenta {
 protected int NCuenta;
 protected String dueno;
 protected int saldo;


public Cuenta(int NCuenta, String dueno, int saldo) {
    this.NCuenta = numeroCuenta;
    this.dueno = titular;
    this.saldo = saldo;
}

@Override
public String toString() {
    return "Cuenta = " + numeroCuenta + ", titular = " + titular + ", saldo = " + saldo;
}

public abstract void deposito(int valor);
public abstract void retiro(int valor);

 
}
