package defpackage;

import android.database.Cursor;
/* renamed from: btof  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btof implements bton {
    static final bton a = new btof();

    private btof() {
    }

    @Override // defpackage.bton
    public final Object a(Cursor cursor, int i) {
        return Float.valueOf(cursor.getFloat(i));
    }
}
