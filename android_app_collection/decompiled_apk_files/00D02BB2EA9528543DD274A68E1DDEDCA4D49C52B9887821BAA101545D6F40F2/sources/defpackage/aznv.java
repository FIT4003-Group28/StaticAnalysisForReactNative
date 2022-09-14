package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aznv  reason: default package */
/* loaded from: classes3.dex */
public final class aznv implements aznm<Long> {
    final /* synthetic */ azxm a;

    public aznv(azxm azxmVar) {
        this.a = azxmVar;
    }

    @Override // defpackage.aznm
    public final /* bridge */ /* synthetic */ Long a() {
        long j;
        azxl b = this.a.b();
        String[] strArr = {Integer.toString(b.n)};
        ContentValues contentValues = new ContentValues();
        contentValues.put("corpus", Integer.valueOf(b.n));
        synchronized (aznn.class) {
            SQLiteDatabase b2 = aznn.b(true);
            Cursor query = b2.query("sync_corpus_metadata", null, "corpus = ?", strArr, null, null, null);
            if (aznn.d(query)) {
                j = query.getLong(2);
                contentValues.put("unique_id_provider", Long.valueOf(1 + j));
                b2.update("sync_corpus_metadata", contentValues, "corpus = ?", strArr);
            } else {
                contentValues.put("unique_id_provider", (Long) 1L);
                b2.replaceOrThrow("sync_corpus_metadata", null, contentValues);
                j = 0;
            }
            if (query != null) {
                query.close();
            }
        }
        return Long.valueOf(j);
    }
}
