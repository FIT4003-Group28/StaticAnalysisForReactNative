package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: vyr  reason: default package */
/* loaded from: classes7.dex */
public final class vyr {
    public static amvh a(amvh amvhVar, amvh amvhVar2) {
        amvg amvgVar = new amvg(amvhVar);
        dpbi bZ = dpbj.c.bZ();
        dpai bZ2 = dpaj.d.bZ();
        dpjx I = amvhVar2.I();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpaj dpajVar = (dpaj) bZ2.b;
        I.getClass();
        dpajVar.b = I;
        int i = dpajVar.a | 1;
        dpajVar.a = i;
        dpajVar.a = i | 2;
        dpajVar.c = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpbj dpbjVar = (dpbj) bZ.b;
        dpaj bK = bZ2.bK();
        bK.getClass();
        dpbjVar.b = bK;
        dpbjVar.a |= 1;
        amvgVar.n = bZ.bK();
        return amvgVar.a();
    }

    public static amvh b(amvh amvhVar) {
        amvg amvgVar = new amvg(amvhVar);
        amvgVar.n = null;
        return amvgVar.a();
    }

    public static boolean c(List<amvh> list) {
        for (amvh amvhVar : list) {
            if (amvhVar.y()) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(List<amvh> list, dqvj dqvjVar, boolean z) {
        dpbl x;
        amvh amvhVar = (amvh) dcft.s(list);
        return dqvjVar == dqvj.DRIVE && amvhVar.n() && (x = amvhVar.x()) != null && x.a && x.b && !e(list) && !z;
    }

    public static boolean e(List<amvh> list) {
        return list.size() - g(list) > 2;
    }

    public static boolean f(amvh[] amvhVarArr) {
        return e(Arrays.asList(amvhVarArr));
    }

    public static int g(List<amvh> list) {
        int i = 0;
        for (amvh amvhVar : list) {
            if (amvhVar.y) {
                i++;
            }
        }
        return i;
    }

    public static dpzh h(amvh amvhVar) {
        dpbl x = amvhVar.x();
        if (x == null) {
            return dpzh.UNKNOWN_PARKING_PRESENCE;
        }
        dpzi dpziVar = x.c;
        if (dpziVar == null) {
            dpziVar = dpzi.e;
        }
        dpzh b = dpzh.b(dpziVar.b);
        return b == null ? dpzh.UNKNOWN_PARKING_PRESENCE : b;
    }
}
