package defpackage;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
/* renamed from: clhh  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhh implements clhr {
    static final clhr a = new clhh();

    private clhh() {
    }

    @Override // defpackage.clhr
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            clev d = clew.d();
            d.b(cursor.getString(1));
            d.c(clil.a(cursor.getInt(2)));
            String string = cursor.getString(3);
            ((clem) d).a = string == null ? null : Base64.decode(string, 0);
            arrayList.add(d.a());
        }
        return arrayList;
    }
}
