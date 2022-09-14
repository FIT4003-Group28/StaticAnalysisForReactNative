package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aznu  reason: default package */
/* loaded from: classes3.dex */
public final class aznu implements aznm<Long> {
    @Override // defpackage.aznm
    @dzsi
    public final /* bridge */ /* synthetic */ Long a() {
        Long l;
        String[] strArr = {"last_sync_time"};
        SQLiteDatabase b = aznn.b(false);
        synchronized (aznn.class) {
            Cursor query = b.query("sync_metadata", null, "metadata_key = ? ", strArr, null, null, null);
            l = null;
            if (aznn.d(query)) {
                if (!query.isNull(1)) {
                    l = Long.valueOf(query.getLong(1));
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
