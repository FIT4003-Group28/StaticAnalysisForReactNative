package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahlm  reason: default package */
/* loaded from: classes2.dex */
public final class ahlm implements degu<Void> {
    final /* synthetic */ String a;
    final /* synthetic */ cogy b;
    final /* synthetic */ eavq c;
    final /* synthetic */ ahln d;

    public ahlm(ahln ahlnVar, String str, cogy cogyVar, eavq eavqVar) {
        this.d = ahlnVar;
        this.a = str;
        this.b = cogyVar;
        this.c = eavqVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r5) {
        try {
            cogy cogyVar = this.b;
            final String str = this.a;
            final List k = dchl.k(dchl.b(this.c), cogt.a);
            cogy.a(str);
            if (!cogo.b(cogyVar.a, cogyVar.d)) {
                throw new cogx();
            }
            deha.q(cogyVar.b.a(new dbrn(str, k) { // from class: cogu
                private final String a;
                private final List b;

                {
                    this.a = str;
                    this.b = k;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    String str2 = this.a;
                    cohc cohcVar = (cohc) obj;
                    for (dspd dspdVar : this.b) {
                        ContentValues contentValues = new ContentValues();
                        cqat cqatVar = cohcVar.b;
                        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                        contentValues.put("collection_name", str2);
                        contentValues.put("selection_key", Integer.valueOf(cohcVar.c.nextInt(2147483646) + 1));
                        contentValues.put("value", dspdVar.G());
                        cohcVar.a.insertWithOnConflict("collections", null, contentValues, 5);
                        if (str2.length() == 0) {
                            new String("Added example to collection ");
                        }
                        int i = cohd.e;
                    }
                    long queryNumEntries = DatabaseUtils.queryNumEntries(cohcVar.a, "collections") - 10000;
                    if (queryNumEntries > 0) {
                        SQLiteDatabase sQLiteDatabase = cohcVar.a;
                        StringBuilder sb = new StringBuilder(77);
                        sb.append("id IN (SELECT id FROM collections ORDER BY id ASC LIMIT ");
                        sb.append(queryNumEntries);
                        sb.append(")");
                        sQLiteDatabase.delete("collections", sb.toString(), new String[0]);
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Deleted ");
                        sb2.append(queryNumEntries);
                        sb2.append(" examples");
                        sb2.toString();
                        int i2 = cohd.e;
                    }
                    return null;
                }
            }), new ahll(this), this.d.a);
        } catch (cogx unused) {
        }
    }
}
