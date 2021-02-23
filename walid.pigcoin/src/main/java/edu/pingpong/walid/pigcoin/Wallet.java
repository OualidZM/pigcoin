package edu.pingpong.walid.pigcoin;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Random;
import edu.pingpong.walid.pigcoin.Transaction;
public class Wallet {
    
    private PublicKey address = null;
    private PrivateKey sKey = null;
    private double total_input = 0.0;
    private double total_output =  0.0;
    private double balance;
    private String inputTransactions = null;
    private String outputTransactions = null;



    private int generarKeyPair(){
        Random
    }



    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public void setsKey(PrivateKey sKey) {
        this.sKey = sKey;
    }

    public PublicKey getAddress() {
        return address;
    }

    public PrivateKey getsKey() {
        return sKey;
    }


    public void loadCoins(bChain){

    }

    public void sendCoins(PublicKey pKey_recipient,double coins,String message,String bChain){

    }

    byte[] signTransaction(String message){

    }


    @Override
    public String toString() {
        return

            "outputTransactions: " + outputTransactions;
    }


}

