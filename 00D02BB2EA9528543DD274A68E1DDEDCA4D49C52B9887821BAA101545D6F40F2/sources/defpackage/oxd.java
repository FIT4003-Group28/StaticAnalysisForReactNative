package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oxd  reason: default package */
/* loaded from: classes7.dex */
public final class oxd {
    public static amvh a(@dzsi dtov dtovVar, @dzsi Context context) {
        if (dtovVar == null || context == null) {
            return amvh.a;
        }
        if (!dtovVar.g) {
            if (dbsj.d(dtovVar.h)) {
                return amvh.a;
            }
            amvg amvgVar = new amvg();
            amvgVar.b = b(dtovVar);
            amvgVar.j = dtovVar.h;
            if ((dtovVar.a & 4) != 0) {
                dgrh dgrhVar = dtovVar.d;
                if (dgrhVar == null) {
                    dgrhVar = dgrh.d;
                }
                amvgVar.c = akqi.k(dgrhVar);
            }
            if ((dtovVar.a & 64) != 0) {
                dgrn dgrnVar = dtovVar.f;
                if (dgrnVar == null) {
                    dgrnVar = dgrn.d;
                }
                amvgVar.d = akqq.m(dgrnVar);
            }
            if ((dtovVar.a & 4096) != 0) {
                amvgVar.c(dtovVar.j);
            }
            int a = dtnx.a(dtovVar.i);
            if (a == 0) {
                a = 1;
            }
            int i = a - 2;
            if (i == 0) {
                amvgVar.a = dpjs.ENTITY_TYPE_HOME;
            } else if (i == 1) {
                amvgVar.a = dpjs.ENTITY_TYPE_WORK;
            }
            return amvgVar.a();
        }
        return amvh.i(context);
    }

    @dzsi
    public static String b(dtov dtovVar) {
        String str = dtovVar.b;
        String str2 = dtovVar.c;
        boolean z = !dbsj.d(str);
        boolean z2 = !dbsj.d(str2);
        if (!z || !z2) {
            if (z) {
                return str;
            }
            if (!z2) {
                return null;
            }
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" loc:");
        sb.append(str2);
        return sb.toString();
    }
}
