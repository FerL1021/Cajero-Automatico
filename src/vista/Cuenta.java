package vista;

import java.util.ArrayList;

public class Cuenta {
    private String nombre ;
     private int nroCuenta;
    private String apellido  ;
    private String login;
    private String contraseña ;
    private ArrayList <TipoCuenta> listaTipoCuenta;

    public Cuenta(String nombre,String apellido,int nrocuenta,  String login, String contraseña) {
        this.nombre = nombre;
        this.nroCuenta=nrocuenta;
        this.apellido = apellido;
        this.login = login;
        this.contraseña = contraseña;
        listaTipoCuenta = new ArrayList<TipoCuenta>();
    }

    public Cuenta() {
    }

    public int getNroCuenta() {
        return nroCuenta;
    }
    public boolean iniciarSesion(String loginn,String pass){
        return contraseña.equals(pass)&&login.equals(loginn);
    }
    
    public void añadirMoneda(String moneda){
        TipoCuenta añadirmoneda=new TipoCuenta(0,moneda,0);
        listaTipoCuenta.add(añadirmoneda);
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLogin() {
        return login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public ArrayList<TipoCuenta> getListaTipoCuenta() {
        return listaTipoCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setListaTipoCuenta(ArrayList<TipoCuenta> listaTipoCuenta) {
        this.listaTipoCuenta = listaTipoCuenta;
    }
}
