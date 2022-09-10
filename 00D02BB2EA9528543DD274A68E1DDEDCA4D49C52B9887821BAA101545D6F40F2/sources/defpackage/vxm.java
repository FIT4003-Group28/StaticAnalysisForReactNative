package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: vxm  reason: default package */
/* loaded from: classes7.dex */
public final class vxm {
    static boolean a(amub amubVar, amub amubVar2, akra akraVar) {
        akrn V = amubVar.V(akraVar, akraVar.r() * 100.0d);
        int i = V != null ? V.d : -1;
        amuo[] amuoVarArr = amubVar.k;
        for (int length = amuoVarArr.length - 2; length >= 0; length--) {
            int i2 = (amuoVarArr[length].j + amuoVarArr[length + 1].j) / 2;
            if (i2 < i) {
                return true;
            }
            akra akraVar2 = amubVar.y().get(i2);
            if (amubVar2.V(akraVar2, akraVar2.r() * 10.0d) == null) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(amub amubVar, amub amubVar2, akra akraVar) {
        return a(amubVar, amubVar2, akraVar) && a(amubVar2, amubVar, akraVar);
    }

    public static final int c(amub amubVar, List<amub> list) {
        akra m = amubVar.l.m(0);
        for (int i = 0; i < list.size(); i++) {
            if (b(amubVar, list.get(i), m)) {
                return i;
            }
        }
        return -1;
    }
}
