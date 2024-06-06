package vista;

public class TipoCuenta {

   private int nroCuenta;
    private double saldo;
    private String tipoMoneda;

    public TipoCuenta(int nroCuenta, String tipoMoneda,double saldo) {
        this.nroCuenta=nroCuenta;
        this.saldo = saldo;
        this.tipoMoneda = tipoMoneda;
    }

    public TipoCuenta() {
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
    
}
