package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azns  reason: default package */
/* loaded from: classes3.dex */
public final class azns implements aznm<azoh> {
    final /* synthetic */ azxm a;

    public azns(azxm azxmVar) {
        this.a = azxmVar;
    }

    @Override // defpackage.aznm
    @dzsi
    public final /* bridge */ /* synthetic */ azoh a() {
        String[] strArr = {Integer.toString(this.a.b().n)};
        SQLiteDatabase b = aznn.b(false);
        synchronized (aznn.class) {
            Cursor query = b.query("sync_corpus_metadata", null, "corpus = ?", strArr, null, null, null);
            if (!aznn.d(query)) {
                if (query != null) {
                    query.close();
                }
                return azoh.c().a();
            }
            azog c = azoh.c();
            ((azgi) c).a = query.getString(1);
            ((azgi) c).b = query.getString(3);
            azoh a = c.a();
            if (query != null) {
                query.close();
            }
            return a;
        }
    }
}
