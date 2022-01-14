package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.australia_nama),ctx.getString(R.string.australia_asal),
                ctx.getString(R.string.australia_deskripsi), R.drawable.australia));
        kucings.add(new Kucing(ctx.getString(R.string.inggris_nama),ctx.getString(R.string.inggris_asal),
                ctx.getString(R.string.inggris_deskripsi), R.drawable.inggris));
        kucings.add(new Kucing(ctx.getString(R.string.filipina_nama),ctx.getString(R.string.filipina_asal),
                ctx.getString(R.string.filipina_deskripsi), R.drawable.filipina));
        kucings.add(new Kucing(ctx.getString(R.string.kanada_nama),ctx.getString(R.string.kanada_asal),
                ctx.getString(R.string.kanada_deskripsi), R.drawable.kanada));
        kucings.add(new Kucing(ctx.getString(R.string.peru_nama),ctx.getString(R.string.peru_asal),
                ctx.getString(R.string.peru_deskripsi), R.drawable.peru));
        kucings.add(new Kucing(ctx.getString(R.string.vietnam_nama),ctx.getString(R.string.vietnam_asal),
                ctx.getString(R.string.vietnam_deskripsi), R.drawable.vietnam));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.instagram_nama),ctx.getString(R.string.inggris_asal),
                ctx.getString(R.string.instagram_deskripsi), R.drawable.instagram));
        anjings.add(new Anjing(ctx.getString(R.string.spotify_nama),ctx.getString(R.string.spotify_asal),
                ctx.getString(R.string.spotify_deskripsi), R.drawable.spotify));
        anjings.add(new Anjing(ctx.getString(R.string.shoope_nama),ctx.getString(R.string.shoope_asal),
                ctx.getString(R.string.shoope_deskripsi), R.drawable.shoope));
        anjings.add(new Anjing(ctx.getString(R.string.twiter_nama),ctx.getString(R.string.twiter_asal),
                ctx.getString(R.string.twiter_deskripsi), R.drawable.twiter));
        anjings.add(new Anjing(ctx.getString(R.string.youtube_nama),ctx.getString(R.string.youtube_asal),
                ctx.getString(R.string.youtube_deskripsi), R.drawable.youtube));
        anjings.add(new Anjing(ctx.getString(R.string.indosat_nama),ctx.getString(R.string.indosat_asal),
                ctx.getString(R.string.indosat_deskripsi), R.drawable.indosat));
        return anjings;
    }

    private static List<Buaya>initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya(ctx.getString(R.string.rawon_nama),ctx.getString(R.string.rawon_asal),
                ctx.getString(R.string.rawon_deskripsi), R.drawable.rawon));
        buayas.add(new Buaya(ctx.getString(R.string.sate_nama),ctx.getString(R.string.sate_asal),
                ctx.getString(R.string.sate_deskripsi), R.drawable.sate));
        buayas.add(new Buaya(ctx.getString(R.string.pempek_nama),ctx.getString(R.string.pempek_asal),
                ctx.getString(R.string.pempek_deskripsi), R.drawable.pempek));
        buayas.add(new Buaya(ctx.getString(R.string.bakso_nama),ctx.getString(R.string.bakso_asal),
                ctx.getString(R.string.bakso_deskripsi), R.drawable.bakso));
        buayas.add(new Buaya(ctx.getString(R.string.rendang_nama),ctx.getString(R.string.rendang_asal),
                ctx.getString(R.string.rendang_deskripsi), R.drawable.rendang));
        buayas.add(new Buaya(ctx.getString(R.string.gudeg_nama),ctx.getString(R.string.gudeg_asal),
                ctx.getString(R.string.gudeg_deskripsi), R.drawable.gudeg));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
