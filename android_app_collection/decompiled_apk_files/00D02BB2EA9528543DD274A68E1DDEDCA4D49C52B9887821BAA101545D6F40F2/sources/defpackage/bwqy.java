package defpackage;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
/* compiled from: PG */
/* renamed from: bwqy  reason: default package */
/* loaded from: classes.dex */
public final class bwqy implements bwqw {
    private static final dcqe a = dcqe.c("bwqy");
    private static final String b = bwqw.class.getSimpleName();
    private final bwqx c;

    public bwqy(Application application, afec afecVar) {
        this.c = new bwqx(application, afecVar);
    }

    @Override // defpackage.bwqw
    @dzsi
    public final dbsi<byte[], String> a(bwrm bwrmVar) {
        Cursor query = this.c.getReadableDatabase().query("gmm_storage_table", new String[]{"_data"}, "_key_pri = ? AND _key_sec = ?", new String[]{bwrmVar.a().a(), bwrmVar.b()}, null, null, null);
        try {
            try {
                if (!query.moveToNext()) {
                    return null;
                }
                return dbsi.a(query.getBlob(0), null);
            } catch (IllegalStateException e) {
                throw e;
            }
        } finally {
            query.close();
        }
    }

    @Override // defpackage.bwqw
    public final void b() {
        this.c.close();
    }

    @Override // defpackage.bwqw
    public final void c(bwrm bwrmVar) {
        this.c.getWritableDatabase().delete("gmm_storage_table", "_key_pri = ? AND _key_sec = ?", new String[]{bwrmVar.a().a(), bwrmVar.b()});
    }

    @Override // defpackage.bwqw
    public final void d(bwrm bwrmVar, byte[] bArr) {
        bvrj.GMM_STORAGE.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_key_pri", bwrmVar.a().a());
        contentValues.put("_key_sec", bwrmVar.b());
        contentValues.put("_data", bArr);
        try {
            if (this.c.getWritableDatabase().replaceOrThrow("gmm_storage_table", null, contentValues) != -1) {
                return;
            }
            bvoo.h("replaceOrThrow of %s failed", bwrmVar);
        } catch (SQLiteException e) {
            bvoq.a();
            throw e;
        }
    }
}
