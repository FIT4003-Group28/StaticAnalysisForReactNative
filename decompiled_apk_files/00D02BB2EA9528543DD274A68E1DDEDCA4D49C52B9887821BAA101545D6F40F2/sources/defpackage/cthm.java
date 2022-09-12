package defpackage;

import android.database.Cursor;
/* renamed from: cthm  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cthm implements dbrn {
    static final dbrn a = new cthm();

    private cthm() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            cuex b = cuey.b();
            b.b(true);
            return b.a();
        }
        cuex b2 = cuey.b();
        b2.b(false);
        return b2.a();
    }
}
