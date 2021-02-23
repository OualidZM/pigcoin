package edu.pingpong.walid.pigcoin;

import java.security.PublicKey;

public class Transaction {
    private String hash = null;
    private String prev_hash = null;
    private PublicKey pKey_sender = null;
    private double pigcoins = 0;
    private String message = null;
    private byte[] signature;

    

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPrev_hash() {
        return this.prev_hash;
    }

    public void setPrev_hash(String prev_hash) {
        this.prev_hash = prev_hash;
    }

    public PublicKey getPKey_sender() {
        return this.pKey_sender;
    }

    public void setPKey_sender(PublicKey pKey_sender) {
        this.pKey_sender = pKey_sender;
    }

    public double getPigcoins() {
        return this.pigcoins;
    }

    public void setPigcoins(double pigcoins) {
        this.pigcoins = pigcoins;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }
    


    @Override
    public String toString() {
        return "{" +
            "hash: " + getHash() + "\n" +
            "prev_hash: " + getPrev_hash() + "\n" +
            "pKey_sender: " + getPKey_sender() + "\n" +
            "pigcoins: " + getPigcoins() + "\n" +
            "message: " + getMessage() + "\n" +
            "signature: " + getSignature();
    }


}
