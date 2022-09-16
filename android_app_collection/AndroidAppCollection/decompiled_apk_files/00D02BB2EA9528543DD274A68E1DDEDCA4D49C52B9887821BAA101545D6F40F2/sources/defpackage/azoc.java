package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azoc  reason: default package */
/* loaded from: classes3.dex */
public final class azoc implements aznm<Void> {
    final /* synthetic */ azxl a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public azoc(azxl azxlVar, String str, String str2) {
        this.a = azxlVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.aznm
    public final /* bridge */ /* synthetic */ Void a() {
        azxl azxlVar = this.a;
        String str = this.b;
        String str2 = this.c;
        String[] strArr = {Integer.toString(azxlVar.n)};
        ContentValues contentValues = new ContentValues();
        contentValues.put("corpus", Integer.valueOf(azxlVar.n));
        if (str == null) {
            contentValues.putNull("sync_token");
        } else {
            contentValues.put("sync_token", str);
        }
        if (str2 == null) {
            contentValues.putNull("pagination_token");
        } else {
            contentValues.put("pagination_token", str2);
        }
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
