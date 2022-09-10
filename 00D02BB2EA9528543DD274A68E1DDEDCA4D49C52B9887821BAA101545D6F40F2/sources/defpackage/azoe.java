package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: azoe  reason: default package */
/* loaded from: classes3.dex */
final class azoe implements aznm<Void> {
    final /* synthetic */ Long a;

    public azoe(Long l) {
        this.a = l;
    }

    @Override // defpackage.aznm
    public final /* bridge */ /* synthetic */ Void a() {
        Long l = this.a;
        String[] strArr = {"last_sync_time"};
        ContentValues contentValues = new ContentValues();
        contentValues.put("metadata_key", "last_sync_time");
        if (l != null) {
            contentValues.put("numerical_value", l);
        } else {
            contentValues.putNull("numerical_value");
        }
        SQLiteDatabase b = aznn.b(true);
        Cursor query = b.query("sync_metadata", null, "metadata_key = ? ", strArr, null, null, null);
        try {
            if (aznn.d(query)) {
                b.update("sync_metadata", contentValues, "metadata_key = ? ", strArr);
            } else {
                b.replaceOrThrow("sync_metadata", null, contentValues);
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
