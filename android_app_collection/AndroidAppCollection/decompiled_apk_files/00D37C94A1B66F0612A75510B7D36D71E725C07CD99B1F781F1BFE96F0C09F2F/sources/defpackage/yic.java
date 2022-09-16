package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: yic  reason: default package */
/* loaded from: classes4.dex */
public final class yic {
    public static boolean a(aadd aaddVar) {
        arhd a = aaddVar.a();
        if (a != null) {
            aqdb aqdbVar = a.r;
            if (aqdbVar == null) {
                aqdbVar = aqdb.b;
            }
            return aqdbVar.d;
        }
        return false;
    }

    public static double b(awix awixVar) {
        double d = d(awixVar);
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    public static double c(awix awixVar) {
        if ((awixVar.b & 32) != 0) {
            awiw awiwVar = awixVar.h;
            if (awiwVar == null) {
                awiwVar = awiw.a;
            }
            double d = awiwVar.d;
            Double.isNaN(d);
            return d / 1000000.0d;
        }
        return 0.0d;
    }

    public static long d(awix awixVar) {
        return ((Long) awixVar.qm(awiy.c)).longValue();
    }

    public static awiv e(awix awixVar) {
        if ((awixVar.b & 128) != 0) {
            awis awisVar = awixVar.j;
            if (awisVar == null) {
                awisVar = awis.a;
            }
            awiv awivVar = awisVar.e;
            return awivVar == null ? awiv.a : awivVar;
        }
        return null;
    }

    public static void f(aopc aopcVar) {
        if (!aopcVar.qn(awiy.b) || !((Boolean) aopcVar.qm(awiy.b)).booleanValue()) {
            aopcVar.e(awiy.b, true);
            awiw awiwVar = ((awix) aopcVar.instance).h;
            if (awiwVar == null) {
                awiwVar = awiw.a;
            }
            g(aopcVar, awiwVar.b);
        }
    }

    public static void g(aopc aopcVar, long j) {
        f(aopcVar);
        awix awixVar = (awix) aopcVar.instance;
        if ((awixVar.b & 32) != 0) {
            awiw awiwVar = awixVar.h;
            if (awiwVar == null) {
                awiwVar = awiw.a;
            }
            long j2 = awiwVar.d;
            double floor = Math.floor(j / j2);
            double d = j2;
            Double.isNaN(d);
            long j3 = (long) (floor * d);
            aopg aopgVar = awiy.c;
            awiw awiwVar2 = ((awix) aopcVar.instance).h;
            if (awiwVar2 == null) {
                awiwVar2 = awiw.a;
            }
            long j4 = awiwVar2.e;
            awiw awiwVar3 = ((awix) aopcVar.instance).h;
            if (awiwVar3 == null) {
                awiwVar3 = awiw.a;
            }
            aopcVar.e(aopgVar, Long.valueOf(Math.max(j4, Math.min(awiwVar3.f, j3))));
            aopcVar.e(awiy.b, true);
        }
    }

    public static final dh h(avns avnsVar) {
        avnsVar.getClass();
        yew yewVar = new yew();
        Bundle bundle = new Bundle();
        bundle.putByteArray("UnlimitedFamilyMessageInterstitialRenderer", avnsVar.toByteArray());
        yewVar.ae(bundle);
        return yewVar;
    }

    public static CharSequence i(awja awjaVar) {
        return ajgl.k(" ", awjaVar.b.size() != 0 ? ajgl.p((arag[]) awjaVar.b.toArray(new arag[0])) : null);
    }
}
