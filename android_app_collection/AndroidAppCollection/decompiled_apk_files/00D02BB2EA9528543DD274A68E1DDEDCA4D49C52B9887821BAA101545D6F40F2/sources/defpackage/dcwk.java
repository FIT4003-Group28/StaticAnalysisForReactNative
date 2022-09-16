package defpackage;

import java.math.BigDecimal;
/* compiled from: PG */
/* renamed from: dcwk  reason: default package */
/* loaded from: classes5.dex */
public final class dcwk {
    static {
        double d = dcvc.a;
        dcuz.b(2.0d - dcvc.b);
        new BigDecimal("0.25");
        new BigDecimal("0.5");
        new BigDecimal("2");
        new BigDecimal("4");
    }

    public static int a(dcwa dcwaVar, dcwa dcwaVar2, dcwa dcwaVar3) {
        double j = dcwa.j(dcwaVar3, dcwaVar, dcwaVar2);
        int i = j >= 1.6E-15d ? 1 : j <= -1.6E-15d ? -1 : 0;
        return i == 0 ? dcwj.a(dcwaVar, dcwaVar2, dcwaVar3) : i;
    }

    public static boolean b(dcwa dcwaVar, dcwa dcwaVar2, dcwa dcwaVar3, dcwa dcwaVar4) {
        int i = a(dcwaVar2, dcwaVar4, dcwaVar) >= 0 ? 1 : 0;
        if (a(dcwaVar3, dcwaVar4, dcwaVar2) >= 0) {
            i++;
        }
        if (a(dcwaVar, dcwaVar4, dcwaVar3) > 0) {
            i++;
        }
        return i >= 2;
    }

    public static int c(double d, double d2) {
        if (d > d2) {
            return 1;
        }
        return d >= (-d2) ? 0 : -1;
    }

    public static dcun d(dcwa dcwaVar) {
        return new dcun(dcus.a(dcwaVar.h), dcus.a(dcwaVar.i), dcus.a(dcwaVar.j));
    }
}
