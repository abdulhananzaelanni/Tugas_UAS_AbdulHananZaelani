package com.example.tugaslist;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaslist.model.Makanan;

public class ProfilActivity extends AppCompatActivity {

    Makanan makanan;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivFotoMakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        makanan = (Makanan) intent.getSerializableExtra(DaftarMakananActivity.MAKANAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(makanan);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoMakanan = findViewById(R.id.gambarMakanan);
    }


    private void tampilkanProfil(Makanan makanan) {
        Log.d("Profil","Menampilkan "+makanan.getJenis());
        txJudul.setText(makanan.getJenis());
        txJenis.setText(makanan.getRas());
        txAsal.setText(makanan.getAsal());
        txDeskripsi.setText(makanan.getDeskripsi());
        ivFotoMakanan.setImageDrawable(this.getDrawable(makanan.getDrawableRes()));
    }




}