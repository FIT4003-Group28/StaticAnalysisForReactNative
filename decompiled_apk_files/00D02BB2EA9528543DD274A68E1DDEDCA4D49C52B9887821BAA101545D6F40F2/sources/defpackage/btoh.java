package defpackage;

import android.database.Cursor;
/* renamed from: btoh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class btoh implements bton {
    public static final bton a = new btoh();

    private btoh() {
    }

    @Override // defpackage.bton
    public final Object a(Cursor cursor, int i) {
        return cursor.getBlob(i);
    }
}
