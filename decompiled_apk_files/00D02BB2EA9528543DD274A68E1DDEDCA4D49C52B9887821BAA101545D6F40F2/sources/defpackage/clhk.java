package defpackage;

import android.database.Cursor;
/* renamed from: clhk  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhk implements clhr {
    static final clhr a = new clhk();

    private clhk() {
    }

    @Override // defpackage.clhr
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }
}
