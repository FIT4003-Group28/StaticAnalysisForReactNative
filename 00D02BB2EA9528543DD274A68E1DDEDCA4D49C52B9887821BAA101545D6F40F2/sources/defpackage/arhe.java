package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: arhe  reason: default package */
/* loaded from: classes2.dex */
public final class arhe {
    public static dvct a(Context context, @dzsi String str, @dzsi dhjx dhjxVar) {
        dvcs bZ = dvct.f.bZ();
        if (str != null) {
            dfqr bZ2 = dfqs.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfqs dfqsVar = (dfqs) bZ2.b;
            str.getClass();
            dfqsVar.a |= 1;
            dfqsVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvct dvctVar = (dvct) bZ.b;
            dfqs bK = bZ2.bK();
            bK.getClass();
            dvctVar.b = bK;
            dvctVar.a |= 1;
        }
        if (dhjxVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvct dvctVar2 = (dvct) bZ.b;
            dhjxVar.getClass();
            dvctVar2.d = dhjxVar;
            dvctVar2.a |= 4;
        }
        dvco bZ3 = dvcp.c.bZ();
        int a = jmj.a(context, 16);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvcp dvcpVar = (dvcp) bZ3.b;
        dvcpVar.a |= 1;
        dvcpVar.b = a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvct dvctVar3 = (dvct) bZ.b;
        dvcp bK2 = bZ3.bK();
        bK2.getClass();
        dvctVar3.c = bK2;
        dvctVar3.a |= 2;
        return bZ.bK();
    }
}
