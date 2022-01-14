package com.example.tugaslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnMkn_jepang,btnMinuman;
    Button btnProfile;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnMkn_jepang = findViewById(R.id.btn_buka_ras_mkn_jepang);
        btnMinuman = findViewById(R.id.btn_buka_ras_minuman);
        btnMkn_jepang.setOnClickListener(view -> bukaGaleri("Mkn_jepang"));
        btnMinuman.setOnClickListener(view -> bukaGaleri("Minuman"));
    }

    private void bukaGaleri(String jenisMakanan) {
        Log.d("MAIN","Buka activity Profile");
        Intent intent = new Intent(this, DaftarMakananActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisMakanan);
        startActivity(intent);
    }
    public void Buka(View view){
        Intent intent = new Intent(this, Identitas.class );
        startActivity(intent);

    }

}