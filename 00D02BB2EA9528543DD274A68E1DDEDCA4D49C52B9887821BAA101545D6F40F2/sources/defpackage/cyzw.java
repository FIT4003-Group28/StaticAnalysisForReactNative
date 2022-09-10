package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
/* renamed from: cyzw  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyzw implements deft {
    static final deft a = new cyzw();

    private cyzw() {
    }

    @Override // defpackage.deft
    public final Object a(defu defuVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        dccx F = dcdc.F();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                String asString = contentValues.getAsString("display_name");
                String asString2 = contentValues.getAsString("photo_thumb_uri");
                String e = dbsj.e(contentValues.getAsString("data1"));
                dsgu bZ = dsgv.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dsgv dsgvVar = (dsgv) bZ.b;
                dsgvVar.a |= 8;
                dsgvVar.e = true;
                if (!dbsj.d(asString)) {
                    dshu bZ2 = dshv.e.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dshv dshvVar = (dshv) bZ2.b;
                    asString.getClass();
                    dshvVar.a |= 1;
                    dshvVar.b = asString;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsgv dsgvVar2 = (dsgv) bZ.b;
                    dshv bK = bZ2.bK();
                    bK.getClass();
                    dsgvVar2.c = bK;
                    dsgvVar2.a |= 2;
                }
                if (!dbsj.d(asString2)) {
                    dsid bZ3 = dsig.d.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dsig dsigVar = (dsig) bZ3.b;
                    dsigVar.c = 3;
                    int i = dsigVar.a | 2;
                    dsigVar.a = i;
                    asString2.getClass();
                    dsigVar.a = i | 1;
                    dsigVar.b = asString2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsgv dsgvVar3 = (dsgv) bZ.b;
                    dsig bK2 = bZ3.bK();
                    bK2.getClass();
                    dsgvVar3.b = bK2;
                    dsgvVar3.a |= 1;
                }
                dsgi bZ4 = dsgk.c.bZ();
                dshz bZ5 = dsia.e.bZ();
                dsgr bZ6 = dsgt.f.bZ();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dsgt dsgtVar = (dsgt) bZ6.b;
                dsgv bK3 = bZ.bK();
                bK3.getClass();
                dsgtVar.d = bK3;
                dsgtVar.a |= 1;
                dsgw bZ7 = dshb.f.bZ();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dshb dshbVar = (dshb) bZ7.b;
                e.getClass();
                dshbVar.a |= 1;
                dshbVar.b = e;
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dsgt dsgtVar2 = (dsgt) bZ6.b;
                dshb bK4 = bZ7.bK();
                bK4.getClass();
                dsgtVar2.c = bK4;
                dsgtVar2.b = 2;
                bZ5.a(bZ6);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dsgk dsgkVar = (dsgk) bZ4.b;
                dsia bK5 = bZ5.bK();
                bK5.getClass();
                dsgkVar.b = bK5;
                dsgkVar.a = 1;
                F.g(bZ4.bK());
            }
        }
        return F.f();
    }
}
