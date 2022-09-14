package defpackage;

import android.database.Cursor;
/* renamed from: btoe  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btoe implements bton {
    static final bton a = new btoe();

    private btoe() {
    }

    @Override // defpackage.bton
    public final Object a(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i));
    }
}
