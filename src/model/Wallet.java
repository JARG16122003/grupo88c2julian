package model;
public class Wallet{
    
    public static final int CAPACIDAD_MAXIMA=1000000;

    private int saldo;
    private boolean tieneLimite;

    public Wallet(){
        super();
        saldo =0;
        tieneLimite =true;
    }

    public String saveMoney(int valor){
        
        if (valor<0) {
            return "Debe digitar una cantidad valida";
        }

        if (tieneLimite && valor+saldo> CAPACIDAD_MAXIMA){
            return "El saldo no puede superar la cantidad maxima";
        }
        saldo +=valor;
        return "Transaccion exitosa";
    }

    public String takeMoney(int valor){
        if (saldo<valor) {
            return "El monto supera el saldo";
        }
        saldo -= valor;
        return "Transaccion exitosa";
    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int newSaldo){
        saldo=newSaldo;
    }

    public String breakLimits(){
        if(!tieneLimite){
            return "tu cuenta ya estaba configurada sin limites";
        }
        if(saldo >= CAPACIDAD_MAXIMA-100000){
        tieneLimite = false;
        return "tu cuenta ya no tiene limites";
        }
        return "Te hace falta " +((CAPACIDAD_MAXIMA-100000)-saldo);
    }
}
