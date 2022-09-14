package defpackage;

import android.database.Cursor;
/* renamed from: btog  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btog implements bton {
    static final bton a = new btog();

    private btog() {
    }

    @Override // defpackage.bton
    public final Object a(Cursor cursor, int i) {
        return Double.valueOf(cursor.getDouble(i));
    }
}
