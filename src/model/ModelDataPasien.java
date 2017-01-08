/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ncel
 */
public class ModelDataPasien {
    private int id_pas;
    private String nama_pas, ttl, alamat, nope;

    public int getId_pas() {
        return id_pas;
    }

    public String getNama_pas() {
        return nama_pas;
    }

    public String getTtl() {
        return ttl;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNope() {
        return nope;
    }

    public void setId_pas(int id_pas) {
        this.id_pas = id_pas;
    }

    public void setNama_pas(String nama_pas) {
        this.nama_pas = nama_pas;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNope(String nope) {
        this.nope = nope;
    }
    
    
}
