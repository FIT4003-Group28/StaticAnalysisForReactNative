package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aglz  reason: default package */
/* loaded from: classes.dex */
final class aglz implements ymu {
    private final agpj a;

    public aglz(agpj agpjVar) {
        this.a = agpjVar;
    }

    @Override // defpackage.ymu
    public final void a(SQLiteDatabase sQLiteDatabase) {
        avhn avhnVar;
        agpj agpjVar = this.a;
        if (agpjVar == null) {
            return;
        }
        agpl agplVar = new agpl(agpjVar.a, agpjVar.b);
        try {
            Cursor query = sQLiteDatabase.query("videosV2", agmt.a, null, null, null, null, null, null);
            query.getClass();
            List<agqo> c = agks.c(query, agpjVar, null, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_video_data_proto"), query.getColumnIndexOrThrow("deleted"), query.getColumnIndexOrThrow("channel_id"), query.getColumnIndex("video_id"));
            query.close();
            List asList = Arrays.asList(240, 480);
            for (agqo agqoVar : c) {
                File file = new File(agplVar.a(agqoVar.f()), "thumb_small.jpg");
                File file2 = new File(agplVar.a(agqoVar.f()), "thumb_large.jpg");
                avhn avhnVar2 = agqoVar.e.d;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
                aalc aalcVar = new aalc(ahdq.e(avhnVar2, asList));
                if (file.exists() && !aalcVar.a.isEmpty()) {
                    File m = agpjVar.m(agqoVar.f(), aalcVar.d().a());
                    anhe.f(m);
                    anhe.e(file, m);
                    if (file2.exists() && aalcVar.a.size() > 1) {
                        File m2 = agpjVar.m(agqoVar.f(), aalcVar.a().a());
                        anhe.f(m2);
                        anhe.e(file2, m2);
                    }
                }
                file.delete();
                file2.delete();
            }
            Cursor query2 = sQLiteDatabase.query("playlistsV2", aglm.a, null, null, null, null, null, null);
            List<agqf> e = agks.e(query2, agpjVar, null, query2.getColumnIndexOrThrow("id"), query2.getColumnIndexOrThrow("offline_playlist_data_proto"), query2.getColumnIndexOrThrow("placeholder"), query2.getColumnIndexOrThrow("size"), query2.getColumnIndexOrThrow("channel_id"));
            query2.close();
            for (agqf agqfVar : e) {
                String str = agqfVar.a;
                if (agplVar.c == null) {
                    agplVar.c = new File(agplVar.a, "playlists");
                }
                File file3 = new File(new File(agplVar.c, str), "thumb.jpg");
                atrp atrpVar = agqfVar.l;
                if (atrpVar != null) {
                    avhnVar = atrpVar.d;
                    if (avhnVar == null) {
                        avhnVar = avhn.a;
                    }
                } else {
                    avhnVar = null;
                }
                aalc aalcVar2 = new aalc(ahdq.e(avhnVar, Collections.singletonList(480)));
                if (file3.exists() && !aalcVar2.a.isEmpty()) {
                    File i = agpjVar.i(agqfVar.a, aalcVar2.d().a());
                    anhe.f(i);
                    anhe.e(file3, i);
                }
                file3.delete();
            }
            Cursor query3 = sQLiteDatabase.query("channels", aglk.a, null, null, null, null, null, null);
            int columnIndexOrThrow = query3.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query3.getColumnIndexOrThrow("offline_channel_data_proto");
            ArrayList<agqa> arrayList = new ArrayList(query3.getCount());
            while (query3.moveToNext()) {
                agqa a = agks.a(query3, agpjVar, columnIndexOrThrow, columnIndexOrThrow2);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            query3.close();
            for (agqa agqaVar : arrayList) {
                String str2 = agqaVar.a;
                if (agplVar.b == null) {
                    agplVar.b = new File(agplVar.a, "channels");
                }
                File file4 = new File(agplVar.b, str2.concat(".jpg"));
                atqe atqeVar = agqaVar.d.c;
                if (atqeVar == null) {
                    atqeVar = atqe.a;
                }
                avhn avhnVar3 = atqeVar.d;
                if (avhnVar3 == null) {
                    avhnVar3 = avhn.a;
                }
                aalc aalcVar3 = new aalc(ahdq.e(avhnVar3, Collections.singletonList(240)));
                if (file4.exists() && !aalcVar3.a.isEmpty()) {
                    File f = agpjVar.f(agqaVar.a, aalcVar3.d().a());
                    anhe.f(f);
                    anhe.e(file4, f);
                }
                file4.delete();
            }
        } catch (IOException e2) {
            zep.d("FileStore migration failed.", e2);
        }
    }
}
