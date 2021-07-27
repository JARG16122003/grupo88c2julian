package model;

public class Owner extends User {
    private Wallet wallet;

    public Owner(String nombre) {
        super();
        wallet = new Wallet();
        setNombre(nombre);
    }

    public Wallet getWallet(){
        return wallet;
    }

    public String compararWallet(Wallet otraWallet){
        Wallet miWallet = getWallet();

        if(miWallet.getSaldo()> otraWallet.getSaldo()){
            return "mi Wallet tiene mas saldo";
        }
        else if(miWallet.getSaldo() == otraWallet.getSaldo()){
            return "Ambas Wallet tienen el mismo saldo";
        }
        else if(miWallet.getSaldo() < otraWallet.getSaldo()){
            return "La otra Wallet tiene mas saldo";
        }
        else{ return "hubo un error";}
    }


}
