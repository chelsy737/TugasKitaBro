/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelDataPasien;
import util.Koneksi;

/**
 *
 * @author ncel
 */
public class ControllerDataPasien {
    Koneksi koneksi = new Koneksi();
    
    public void simpanPasien(ModelDataPasien mt){
        koneksi.koneksiDatabase();
        String querySimpanPasien = "insert into tbl_dtpas(nama_pas,ttl,alamat,nope) values('"+mt.getNama_pas()+"','"+mt.getTtl()+"','"+mt.getAlamat()+"','"+mt.getNope()+"')";
        try {
            koneksi.state.executeUpdate(querySimpanPasien);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan");
            System.err.println("Galat Controller Teman : "+e);
        }
    }
    public void hapusDataPasien(ModelDataPasien mp){
        try {
            koneksi.koneksiDatabase();
            String queryHapusDataPasien = "delete from tbl_dtpas where id=('"+mp.getId_pas()+"')";
            koneksi.state.executeUpdate(queryHapusDataPasien);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
            //koneksi.connect.close();
        } catch (SQLException e) {
            System.err.println("Galat hapusDataPasien : "+e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terhapus");
        }
    }
    
    public void ubahDataPasien(ModelDataPasien mp){
        koneksi.koneksiDatabase();
         try {
            int id = mp.getId_pas();
            String nama = mp.getNama_pas();
            String nope = mp.getNope();
            String alamat = mp.getAlamat();
            String ttl = mp.getTtl();

            String queryUbahDataPasien = "update tbl_dtpas "
                    + "set nama_pas=('" + nama + "'),"
                    + "ttl=('"+ ttl +"'),"
                    + "alamat=('"+ alamat +"'),"
                    + "nope=('"+ nope +"')"
                    + "where id=('" + id + "')";
            koneksi.state.executeUpdate(queryUbahDataPasien);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } catch (SQLException e) {
            System.err.println("Galat ubahDataPasien : " + e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terubah");
        }
    }
}

