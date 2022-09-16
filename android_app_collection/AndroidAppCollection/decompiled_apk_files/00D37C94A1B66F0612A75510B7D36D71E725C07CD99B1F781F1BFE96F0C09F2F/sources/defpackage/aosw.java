package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: aosw  reason: default package */
/* loaded from: classes.dex */
public final class aosw {
    static {
        aopa createBuilder = aorw.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).b = -62135596800L;
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).c = 0;
        aorw aorwVar = (aorw) createBuilder.mo39build();
        aopa createBuilder2 = aorw.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((aorw) createBuilder2.instance).b = 253402300799L;
        createBuilder2.copyOnWrite();
        ((aorw) createBuilder2.instance).c = 999999999;
        aorw aorwVar2 = (aorw) createBuilder2.mo39build();
        aopa createBuilder3 = aorw.a.createBuilder();
        createBuilder3.copyOnWrite();
        ((aorw) createBuilder3.instance).b = 0L;
        createBuilder3.copyOnWrite();
        ((aorw) createBuilder3.instance).c = 0;
        aorw aorwVar3 = (aorw) createBuilder3.mo39build();
        new aosu();
    }

    public static int a(aorw aorwVar, aorw aorwVar2) {
        return aosv.a.compare(aorwVar, aorwVar2);
    }

    public static long b(aorw aorwVar) {
        g(aorwVar);
        return anhg.c(anhg.d(aorwVar.b, 1000L), aorwVar.c / 1000000);
    }

    public static aorw c(long j) {
        return e(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static aorw d(long j) {
        return e(j / 1000000000, (int) (j % 1000000000));
    }

    public static aorw e(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = anhg.c(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        long j3 = j;
        if (i < 0) {
            i = (int) (i + 1000000000);
            long j4 = (-1) + j3;
            boolean z = true;
            boolean z2 = (1 ^ j3) >= 0;
            if ((j3 ^ j4) < 0) {
                z = false;
            }
            anhh.d(z2 | z, "checkedSubtract", j3, 1L);
            j3 = j4;
        }
        aopa createBuilder = aorw.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).b = j3;
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).c = i;
        aorw aorwVar = (aorw) createBuilder.mo39build();
        g(aorwVar);
        return aorwVar;
    }

    public static Comparator f() {
        return aosv.a;
    }

    public static void g(aorw aorwVar) {
        long j = aorwVar.b;
        int i = aorwVar.c;
        if (j < -62135596800L || j > 253402300799L || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }
}
