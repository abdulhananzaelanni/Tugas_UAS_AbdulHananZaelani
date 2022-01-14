package com.example.tugaslist;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.example.tugaslist.model.Makanan;

public class DaftarMakananActivity extends AppCompatActivity {
    public final static String MAKANAN_TERPILIH ="hewan_obj_key";
    List<Makanan> makanans;
    ListView listView;
    String jenisMakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_makanan);
        Intent intent = getIntent();
        jenisMakanan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText(getString(R.string.daftar1)+jenisMakanan.toUpperCase());
        makanans = DataProvider.getMasakansByTipe(this,jenisMakanan);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_makanan);
        DaftarMakananAdapter adapter = new DaftarMakananAdapter(this,makanans);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Makanan terpilih = makanans.get(position);
            bukaProfileHewan(terpilih);
        }
    };

    private void bukaProfileHewan(Makanan hewanTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfilActivity.class);
        intent.putExtra(MAKANAN_TERPILIH, hewanTerpilih);
        startActivity(intent);
    }


}