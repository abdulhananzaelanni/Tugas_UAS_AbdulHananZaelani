package com.example.tugaslist;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.tugaslist.model.Minuman;
import com.example.tugaslist.model.Makanan;
import com.example.tugaslist.model.Mkn_jepang;

public class DataProvider {
    private static List<Makanan> makanans = new ArrayList<>();

    private static List<Mkn_jepang> initDataMkn_jepang(Context ctx) {
        List<Mkn_jepang> mkn_jepangss = new ArrayList<>();
        mkn_jepangss.add(new Mkn_jepang(ctx.getString(R.string.Nama_masakan), ctx.getString(R.string.Masakan),
                ctx.getString(R.string.Masakan1), R.drawable.makanan1));
        mkn_jepangss.add(new Mkn_jepang(ctx.getString(R.string.masakan1), ctx.getString(R.string.Masakan2),
                ctx.getString(R.string.Masakan3), R.drawable.makanan2));
        mkn_jepangss.add(new Mkn_jepang(ctx.getString(R.string.masakan3), ctx.getString(R.string.Masakan4),
                ctx.getString(R.string.Masakan5), R.drawable.makanan3));
        mkn_jepangss.add(new Mkn_jepang(ctx.getString(R.string.Masakan7), ctx.getString(R.string.Masakan6),
                ctx.getString(R.string.Masakan8), R.drawable.makanan4));
       mkn_jepangss.add(new Mkn_jepang(ctx.getString(R.string.Masakan14), ctx.getString(R.string.Masakan12),
                ctx.getString(R.string.Masakan9), R.drawable.makanan5));
        mkn_jepangss.add(new Mkn_jepang(ctx.getString(R.string.Masakan10), ctx.getString(R.string.Masakan13),
                ctx.getString(R.string.Masakan11), R.drawable.makanan6));
        return mkn_jepangss;
    }

    private static List<Minuman> initDataMinuman(Context ctx) {
        List<Minuman> minumans = new ArrayList<>();
        minumans.add(new Minuman(ctx.getString(R.string.Minuman1), ctx.getString(R.string.Minuman2),
                ctx.getString(R.string.Minuman3), R.drawable.minuman1));
        minumans.add(new Minuman(ctx.getString(R.string.Minuman4), ctx.getString(R.string.Minuman5),
                ctx.getString(R.string.Minuman6), R.drawable.minuman2));
        minumans.add(new Minuman(ctx.getString(R.string.Minuman7), ctx.getString(R.string.Minuman8),
                ctx.getString(R.string.Minuman9), R.drawable.minuman3));
        minumans.add(new Minuman(ctx.getString(R.string.Minuman10), ctx.getString(R.string.Minuman11),
                ctx.getString(R.string.Minuman12), R.drawable.minuman4));
        minumans.add(new Minuman(ctx.getString(R.string.Minuman13), ctx.getString(R.string.Minuman14),
                ctx.getString(R.string.Minuman15), R.drawable.minuman5));
        minumans.add(new Minuman(ctx.getString(R.string.Minuman16), ctx.getString(R.string.Minuman17),
                ctx.getString(R.string.Minuman18), R.drawable.minuman6));
        return minumans;
    }

    private static void initAllMakanans(Context ctx) {
        makanans.addAll(initDataMkn_jepang(ctx));
        makanans.addAll(initDataMinuman(ctx));
    }

    public static List<Makanan> getAllMakanan(Context ctx) {
        if (makanans.size() == 0) {
            initAllMakanans(ctx);
        }
        return  makanans;
    }

    public static List<Makanan> getMasakansByTipe(Context ctx, String jenis) {
        List<Makanan> makanansByType = new ArrayList<>();
        if (makanans.size() == 0) {
            initAllMakanans(ctx);
        }
        for (Makanan h : makanans) {
            if (h.getJenis().equals(jenis)) {
                makanansByType.add(h);
            }
        }
        return makanansByType;
    }

}