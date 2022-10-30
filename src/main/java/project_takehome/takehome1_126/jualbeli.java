/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_takehome.takehome1_126;

/**
 *
 * @author Febriyanti Azahra
 */
public class jualbeli {
    public int hitungawal(int harga, int jumlah){
        int totalawal = harga * jumlah;
        return totalawal;
    }
    
    public int hitungakhir(int harga, int jumlah){
        int hargaAkhir;
        int total = harga * jumlah;
        if (total <= 10000){
            hargaAkhir = total - (total * 0);
        }
        else if (total > 10000 && total <= 50000){
            hargaAkhir = total - (total * 5 / 100);
        }
        else if (total > 50000 && total <= 100000){
            hargaAkhir = total - (total * 10 / 100);
        }
        else {
            hargaAkhir = total - (total * 15 / 100);
        }
        
        return hargaAkhir;
    }
    
    public int hargadiskon(int total, int hargaAkhir){
        int hargadiskon = total - hargaAkhir;
        return hargadiskon;
    }
    
    public int diskon(int totalawal){
        int disc;
        if (totalawal <= 10000){
            disc = 0;
        }
        else if (totalawal > 10000 && totalawal <= 50000){
            disc = 5;
        }
        else if (totalawal > 50000 && totalawal <= 100000){
            disc = 10;
        }
        else {
            disc = 15;
        }
        return disc;
    }
    
    public int kembalian(int bayar, int hargaAkhir){
        int kembalian = bayar - hargaAkhir;
        return kembalian;
    }
}
