package defpackage;
/* compiled from: PG */
/* renamed from: amtg  reason: default package */
/* loaded from: classes2.dex */
public final class amtg {
    public static boolean a(doxf doxfVar) {
        int i = doxfVar.a;
        return ((i & 8) == 0 || (i & 4) == 0 || (i & 1) == 0 || (i & 2) == 0 || doxfVar.i.size() <= 0 || doxfVar.h.size() <= 0) ? false : true;
    }

    public static int b(doxf doxfVar, int i) {
        int i2;
        int i3 = 0;
        if ((doxfVar.a & 1) != 0) {
            dowb dowbVar = doxfVar.b;
            if (dowbVar == null) {
                dowbVar = dowb.d;
            }
            i2 = dowbVar.b;
        } else {
            i2 = 0;
        }
        int i4 = 0;
        while (i3 < doxfVar.h.size()) {
            int f = doxfVar.h.f(i3);
            int f2 = doxfVar.i.f(i3);
            int i5 = i4 + f;
            if (i5 < i) {
                i2 += f2;
            } else if (i4 < i) {
                double d = i5 - i;
                double d2 = f;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = 1.0d - (d / d2);
                double d4 = f2;
                Double.isNaN(d4);
                return (int) (i2 + Math.round(d3 * d4));
            }
            i3++;
            i4 = i5;
        }
        return i2;
    }

    public static dcdc<Integer> c(amve amveVar) {
        dccx F = dcdc.F();
        F.g(0);
        int i = 0;
        for (amtr amtrVar : amveVar.b) {
            dowb dowbVar = amtrVar.a().d;
            if (dowbVar == null) {
                dowbVar = dowb.d;
            }
            i += dowbVar.b;
            F.g(Integer.valueOf(i));
        }
        return F.f();
    }
}
