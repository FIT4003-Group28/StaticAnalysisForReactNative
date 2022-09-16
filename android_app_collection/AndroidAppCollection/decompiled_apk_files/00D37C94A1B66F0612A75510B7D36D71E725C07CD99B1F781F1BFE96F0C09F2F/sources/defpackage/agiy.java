package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: agiy  reason: default package */
/* loaded from: classes.dex */
public final class agiy implements agvy {
    private final azqb a;
    private final azqb b;
    private final agis c;

    public agiy(azqb azqbVar, azqb azqbVar2, agis agisVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = agisVar;
    }

    @Override // defpackage.agvy
    public final void a(List list, long j) {
        if (!this.c.z()) {
            return;
        }
        aglb aglbVar = (aglb) this.a.get();
        SQLiteDatabase a = aglbVar.a.a();
        try {
            a.beginTransaction();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aglbVar.a.a().insertWithOnConflict("channelsV13", null, aglb.a((agqa) it.next()), 4);
            }
            a.setTransactionSuccessful();
            aglb.e(a);
            agmf agmfVar = (agmf) this.b.get();
            List<String> u = amxp.u(list, agix.a);
            Long valueOf = Long.valueOf(j);
            SQLiteDatabase a2 = agmfVar.a.a();
            try {
                a2.beginTransaction();
                a2.delete("subscriptionsV31", "client_modified_timestamp < ?", new String[]{valueOf.toString()});
                for (String str : u) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", str);
                    contentValues.put("display_state", (Integer) 1);
                    contentValues.put("should_sync_to_server", (Boolean) true);
                    contentValues.put("client_modified_timestamp", valueOf);
                    agmfVar.a.a().insertWithOnConflict("subscriptionsV31", null, contentValues, 4);
                }
                a2.setTransactionSuccessful();
            } finally {
                agmf.a(a2);
            }
        } catch (Throwable th) {
            aglb.e(a);
            throw th;
        }
    }
}
