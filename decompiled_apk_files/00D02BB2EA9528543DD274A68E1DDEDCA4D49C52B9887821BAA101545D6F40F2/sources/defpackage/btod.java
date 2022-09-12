package defpackage;

import android.database.Cursor;
/* renamed from: btod  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btod implements bton {
    static final bton a = new btod();

    private btod() {
    }

    @Override // defpackage.bton
    public final Object a(Cursor cursor, int i) {
        return Integer.valueOf(cursor.getInt(i));
    }
}
