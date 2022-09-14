package defpackage;

import android.database.Cursor;
import android.util.Pair;
/* renamed from: ctie  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctie implements dbrn {
    static final dbrn a = new ctie();

    private ctie() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        dccx dccxVar = new dccx();
        while (cursor != null && cursor.moveToNext()) {
            dbsg<cufw> a2 = ctjx.a(cursor);
            if (a2.a()) {
                dccxVar.g(Pair.create(Integer.valueOf(cursor.getInt(ctlv.a(1))), a2.b()));
            } else {
                cstl.a("SQLiteMessagingStore");
            }
        }
        return dccxVar.f();
    }
}
