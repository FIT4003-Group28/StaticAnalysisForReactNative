package defpackage;

import android.database.Cursor;
/* renamed from: ctih  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctih implements dbrn {
    static final dbrn a = new ctih();

    private ctih() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        dccx F = dcdc.F();
        if (cursor.moveToFirst()) {
            do {
                dbsg<cufw> a2 = ctjx.a(cursor);
                if (a2.a()) {
                    F.g(a2.b());
                } else {
                    cstl.a(ctjx.a);
                }
            } while (cursor.moveToNext());
            return F.f();
        }
        return F.f();
    }
}
