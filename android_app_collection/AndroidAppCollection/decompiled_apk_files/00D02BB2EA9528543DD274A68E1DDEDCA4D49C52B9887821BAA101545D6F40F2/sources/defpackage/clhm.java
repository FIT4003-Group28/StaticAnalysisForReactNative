package defpackage;

import android.database.Cursor;
/* renamed from: clhm  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhm implements clhr {
    static final clhr a = new clhm();

    private clhm() {
    }

    @Override // defpackage.clhr
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }
}
