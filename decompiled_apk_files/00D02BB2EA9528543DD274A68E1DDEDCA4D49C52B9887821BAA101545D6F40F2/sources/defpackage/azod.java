package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azod  reason: default package */
/* loaded from: classes3.dex */
public final class azod implements aznm<Void> {
    final /* synthetic */ azxl a;
    final /* synthetic */ Long b;

    public azod(azxl azxlVar, Long l) {
        this.a = azxlVar;
        this.b = l;
    }

    @Override // defpackage.aznm
    public final /* bridge */ /* synthetic */ Void a() {
        azxl azxlVar = this.a;
        Long l = this.b;
        String[] strArr = {Integer.toString(azxlVar.n)};
        ContentValues contentValues = new ContentValues();
        contentValues.put("corpus", Integer.valueOf(azxlVar.n));
        contentValues.put("last_sync_time_for_corpus", l);
        SQLiteDatabase b = aznn.b(true);
        Cursor query = b.query("sync_corpus_metadata", null, "corpus = ? ", strArr, null, null, null);
        try {
            if (aznn.d(query)) {
                b.update("sync_corpus_metadata", contentValues, "corpus = ? ", strArr);
            } else {
                b.replaceOrThrow("sync_corpus_metadata", null, contentValues);
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }
}
