package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aghl  reason: default package */
/* loaded from: classes.dex */
public final class aghl implements agvt {
    private final azqb a;

    public aghl(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.agvt
    public final int a(String str, int i) {
        ylr.b();
        Cursor query = ((aglr) this.a.get()).b.a().query("hashes", new String[]{"merkle_level"}, "video_id = ? AND itag = ?", new String[]{str, Integer.toString(i)}, null, null, "merkle_level DESC", "1");
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("merkle_level");
            if (query.moveToNext()) {
                return query.getInt(columnIndexOrThrow);
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    @Override // defpackage.agvt
    public final agqd b(String str, int i, int i2) {
        ylr.b();
        Cursor query = ((aglr) this.a.get()).b.a().query("hashes", aglr.a, "video_id = ? AND itag = ? AND merkle_level = ?", new String[]{str, Integer.toString(i), Integer.toString(i2)}, null, null, "block_index DESC", "1");
        try {
            if (query.moveToNext()) {
                query.getClass();
                return aglp.a(query, query.getColumnIndexOrThrow("video_id"), query.getColumnIndexOrThrow("itag"), query.getColumnIndexOrThrow("storage_id"), query.getColumnIndexOrThrow("merkle_level"), query.getColumnIndexOrThrow("block_index"), query.getColumnIndexOrThrow("digest"), query.getColumnIndexOrThrow("hash_state"), query.getColumnIndexOrThrow("matches_bytes_on_disk"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    @Override // defpackage.agvt
    public final agqd c(String str, int i, int i2, int i3) {
        ylr.b();
        Cursor query = ((aglr) this.a.get()).b.a().query("hashes", aglr.a, "video_id = ? AND itag = ? AND merkle_level = ? AND block_index = ?", new String[]{str, Integer.toString(i), Integer.toString(i2), Integer.toString(i3)}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                query.getClass();
                return aglp.a(query, query.getColumnIndexOrThrow("video_id"), query.getColumnIndexOrThrow("itag"), query.getColumnIndexOrThrow("storage_id"), query.getColumnIndexOrThrow("merkle_level"), query.getColumnIndexOrThrow("block_index"), query.getColumnIndexOrThrow("digest"), query.getColumnIndexOrThrow("hash_state"), query.getColumnIndexOrThrow("matches_bytes_on_disk"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    @Override // defpackage.agvt
    public final void d(agqd agqdVar) {
        ylr.b();
        aglr aglrVar = (aglr) this.a.get();
        aglrVar.b.a().replaceOrThrow("hashes", null, aglrVar.a(agqdVar));
    }

    @Override // defpackage.agvt
    public final void e(List list) {
        ylr.b();
        aglr aglrVar = (aglr) this.a.get();
        SQLiteDatabase a = aglrVar.b.a();
        a.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a.replaceOrThrow("hashes", null, aglrVar.a((agqd) it.next()));
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    @Override // defpackage.agvt
    public final void f(String str, int i) {
        ylr.b();
        ((aglr) this.a.get()).b.a().delete("hashes", "video_id = ? AND itag = ? AND merkle_level = ? AND block_index BETWEEN ? AND ?", new String[]{str, String.valueOf(i), "0", "0", "2147483646"});
    }

    @Override // defpackage.agvt
    public final List g(String str, int i, int i2, int i3) {
        ylr.b();
        Cursor query = ((aglr) this.a.get()).b.a().query("hashes", aglr.a, "video_id = ? AND itag = ? AND merkle_level = ? AND block_index BETWEEN ? AND ?", new String[]{str, Integer.toString(i), Integer.toString(0), Integer.toString(i2), Integer.toString(i3 - 1)}, null, null, "block_index", null);
        try {
            query.getClass();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("video_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("itag");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("storage_id");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("merkle_level");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("block_index");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("digest");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("hash_state");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("matches_bytes_on_disk");
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                arrayList.add(aglp.a(query, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow7, columnIndexOrThrow8));
            }
            return arrayList;
        } finally {
            query.close();
        }
    }
}
