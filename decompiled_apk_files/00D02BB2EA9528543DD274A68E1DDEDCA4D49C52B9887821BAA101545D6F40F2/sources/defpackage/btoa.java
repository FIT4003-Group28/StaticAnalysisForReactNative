package defpackage;

import android.database.Cursor;
/* renamed from: btoa  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btoa implements bton {
    static final bton a = new btoa();

    private btoa() {
    }

    @Override // defpackage.bton
    public final Object a(Cursor cursor, int i) {
        return cursor.getString(i);
    }
}
