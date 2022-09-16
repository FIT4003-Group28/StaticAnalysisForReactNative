package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: aznt  reason: default package */
/* loaded from: classes3.dex */
final class aznt implements aznm<Long> {
    @Override // defpackage.aznm
    @dzsi
    public final /* bridge */ /* synthetic */ Long a() {
        Long l;
        String[] strArr = {Integer.toString(azxl.TUTORIAL_HISTORY.n)};
        SQLiteDatabase b = aznn.b(false);
        synchronized (aznn.class) {
            Cursor query = b.query("sync_corpus_metadata", null, "corpus = ? ", strArr, null, null, null);
            l = null;
            if (aznn.d(query)) {
                if (!query.isNull(4)) {
                    l = Long.valueOf(query.getLong(4));
                    if (query != null) {
                        query.close();
                    }
                } else if (query != null) {
                    query.close();
                }
            } else if (query != null) {
                query.close();
            }
        }
        return l;
    }
}
