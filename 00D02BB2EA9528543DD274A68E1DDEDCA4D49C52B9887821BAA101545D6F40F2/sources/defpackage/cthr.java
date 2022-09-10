package defpackage;

import android.database.Cursor;
/* renamed from: cthr  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cthr implements dbrn {
    static final dbrn a = new cthr();

    private cthr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        dccx F = dcdc.F();
        while (cursor.moveToNext()) {
            dbsg<cufj> a2 = ctjt.a(cursor);
            if (a2.a()) {
                F.g(a2.b());
            } else {
                cstl.a("ContactCursors");
            }
        }
        return F.f();
    }
}
