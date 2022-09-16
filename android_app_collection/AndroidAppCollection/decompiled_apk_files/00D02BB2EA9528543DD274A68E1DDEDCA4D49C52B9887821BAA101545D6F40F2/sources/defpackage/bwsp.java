package defpackage;
/* compiled from: PG */
/* renamed from: bwsp  reason: default package */
/* loaded from: classes4.dex */
public final class bwsp {
    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static dzsk a(dhjx dhjxVar) {
        dzsk dzskVar;
        dhjz dhjzVar = dhjxVar.b;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        dhkb dhkbVar = dhjxVar.c;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        dzsk b = b(dhjzVar, dhkbVar);
        double radians = Math.toRadians(decb.d(dhjxVar.e, 1.0d, 179.0d));
        dhkd dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        double d = dhkdVar.b;
        dhkd dhkdVar2 = dhjxVar.d;
        if (dhkdVar2 == null) {
            dhkdVar2 = dhkd.d;
        }
        double d2 = dhkdVar2.c;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = radians * 0.5d;
        double sin = Math.sin(d4);
        if (sin == dcyn.a || d3 == dcyn.a) {
            dzskVar = null;
        } else {
            double cos = Math.cos(d4) / sin;
            dzskVar = new dzsk();
            dzskVar.a = cos / d3;
            dzskVar.f = cos;
            dzskVar.k = -1.000002000002d;
            dzskVar.l = -0.002000002000002d;
            dzskVar.o = -1.0d;
        }
        if (dzskVar == null) {
            return null;
        }
        dzsk dzskVar2 = new dzsk();
        dzskVar2.a(dzskVar, b);
        return dzskVar2;
    }

    public static dzsk b(dhjz dhjzVar, dhkb dhkbVar) {
        dzsk c = c(-dhkbVar.c);
        c.a(c, d(-dhkbVar.d));
        double d = dhjzVar.d;
        dzsk dzskVar = new dzsk();
        dzskVar.a = 1.0d;
        dzskVar.b = dcyn.a;
        dzskVar.c = dcyn.a;
        dzskVar.e = dcyn.a;
        dzskVar.f = 1.0d;
        dzskVar.g = dcyn.a;
        dzskVar.i = dcyn.a;
        dzskVar.j = dcyn.a;
        dzskVar.k = 1.0d;
        dzskVar.m = dcyn.a;
        dzskVar.n = dcyn.a;
        dzskVar.o = dcyn.a;
        dzskVar.d = dcyn.a;
        dzskVar.h = dcyn.a;
        dzskVar.l = (-d) - 6371010.0d;
        dzskVar.p = 1.0d;
        c.a(c, dzskVar);
        c.a(c, c(-90.0d));
        c.a(c, d(-dhkbVar.b));
        c.a(c, c(dhjzVar.c));
        double d2 = dhjzVar.b;
        dzsk dzskVar2 = new dzsk();
        double radians = Math.toRadians((-d2) - 90.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        dzskVar2.a = cos;
        dzskVar2.b = -sin;
        dzskVar2.c = dcyn.a;
        dzskVar2.d = dcyn.a;
        dzskVar2.e = sin;
        dzskVar2.f = cos;
        dzskVar2.g = dcyn.a;
        dzskVar2.h = dcyn.a;
        dzskVar2.i = dcyn.a;
        dzskVar2.j = dcyn.a;
        dzskVar2.k = 1.0d;
        dzskVar2.l = dcyn.a;
        dzskVar2.m = dcyn.a;
        dzskVar2.n = dcyn.a;
        dzskVar2.o = dcyn.a;
        dzskVar2.p = 1.0d;
        c.a(c, dzskVar2);
        return c;
    }

    private static dzsk c(double d) {
        dzsk dzskVar = new dzsk();
        double radians = Math.toRadians(d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        dzskVar.a = 1.0d;
        dzskVar.b = dcyn.a;
        dzskVar.c = dcyn.a;
        dzskVar.d = dcyn.a;
        dzskVar.e = dcyn.a;
        dzskVar.f = cos;
        dzskVar.g = -sin;
        dzskVar.h = dcyn.a;
        dzskVar.i = dcyn.a;
        dzskVar.j = sin;
        dzskVar.k = cos;
        dzskVar.l = dcyn.a;
        dzskVar.m = dcyn.a;
        dzskVar.n = dcyn.a;
        dzskVar.o = dcyn.a;
        dzskVar.p = 1.0d;
        return dzskVar;
    }

    private static dzsk d(double d) {
        dzsk dzskVar = new dzsk();
        double radians = Math.toRadians(d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        dzskVar.a = cos;
        dzskVar.b = dcyn.a;
        dzskVar.c = sin;
        dzskVar.d = dcyn.a;
        dzskVar.e = dcyn.a;
        dzskVar.f = 1.0d;
        dzskVar.g = dcyn.a;
        dzskVar.h = dcyn.a;
        dzskVar.i = -sin;
        dzskVar.j = dcyn.a;
        dzskVar.k = cos;
        dzskVar.l = dcyn.a;
        dzskVar.m = dcyn.a;
        dzskVar.n = dcyn.a;
        dzskVar.o = dcyn.a;
        dzskVar.p = 1.0d;
        return dzskVar;
    }
}
