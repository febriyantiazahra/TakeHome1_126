/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_takehome.takehome1_126;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Febriyanti Azahra
 */
@Controller
public class controller {
          
    jualbeli JB = new jualbeli();
       
    @RequestMapping("/input")
    public String input (@RequestParam(value="nama") String nama,
                         @RequestParam(value="harga") String harga,
                         @RequestParam(value="jumlah") String jumlah,
                         @RequestParam(value="bayar") String bayar,
                         Model model) {         
        
        int hargaBarang = Integer.parseInt(harga);
        int jumlahBarang = Integer.parseInt(jumlah);
        int uangbyr = Integer.parseInt(bayar);
        
        int totalawal = JB.hitungawal(hargaBarang, jumlahBarang);
        int hargaAkhir = JB.hitungakhir(hargaBarang, jumlahBarang);
        int hargadiskon = JB.hargadiskon(totalawal, hargaAkhir);
        int diskon = JB.diskon(totalawal);
        int kembalian = JB.kembalian(uangbyr, hargaAkhir);
                
        model.addAttribute("barang", nama);
        model.addAttribute("harga", hargaBarang);
        model.addAttribute("jumlah", jumlahBarang);
        model.addAttribute("bayar", uangbyr);
        model.addAttribute("hitungawal", totalawal);
        model.addAttribute("hitungakhir", hargaAkhir);
        model.addAttribute("totalhargadiskon", hargadiskon);
        model.addAttribute("diskon", diskon);
        model.addAttribute("kembali", kembalian);
        
        return "view";
    }
}
