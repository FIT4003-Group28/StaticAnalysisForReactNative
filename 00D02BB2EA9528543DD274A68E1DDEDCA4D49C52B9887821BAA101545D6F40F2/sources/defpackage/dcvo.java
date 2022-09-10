package defpackage;
/* compiled from: PG */
/* renamed from: dcvo  reason: default package */
/* loaded from: classes5.dex */
public final class dcvo {
    public static final double a;
    public static final double b;

    static {
        double d = dcvc.a;
        a = dcvc.a * 9.0d * dcvc.c;
        b = dcvc.c * 2.25d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (java.lang.Math.abs(r28.h) >= java.lang.Math.abs(r28.i)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        if ((((r28.h < defpackage.dcyn.a) ^ (r28.i < defpackage.dcyn.a)) ^ (r28.j < defpackage.dcyn.a)) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int a(defpackage.dcwa r26, defpackage.dcwa r27, defpackage.dcwa r28, defpackage.dcwa r29, defpackage.dcwa r30, double r31, defpackage.dcuw r33) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcvo.a(dcwa, dcwa, dcwa, dcwa, dcwa, double, dcuw):int");
    }

    public static boolean b(dcwa dcwaVar, dcwa dcwaVar2, int i, double d, dcuw dcuwVar, dcuw dcuwVar2) {
        if (dcwz.m(dcwaVar) != i || dcwz.m(dcwaVar2) != i) {
            dcwa k = dcwz.k(i, dcvc.d(dcwaVar, dcwaVar2));
            dcwa k2 = dcwz.k(i, dcwaVar);
            dcwa k3 = dcwz.k(i, dcwaVar2);
            double d2 = d + 1.0d;
            dcwa dcwaVar3 = new dcwa(d2 * k.h, d2 * k.i, k.j);
            double abs = Math.abs(dcwaVar3.h);
            double abs2 = Math.abs(dcwaVar3.i);
            double abs3 = Math.abs(dcwaVar3.j);
            if (abs2 >= abs3 - abs && abs >= abs3 - abs2) {
                if (Math.max(Math.abs(k.h), Math.max(Math.abs(k.i), Math.abs(k.j))) < Math.scalb(1.0d, -511)) {
                    k = dcwa.c(k, Math.scalb(1.0d, 563));
                }
                dcwa f = dcwa.f(k);
                dcwa e = dcwa.e(f, k2);
                dcwa e2 = dcwa.e(k3, f);
                if (a(k3, k2, new dcwa(-dcwaVar3.h, -dcwaVar3.i, -dcwaVar3.j), e2, e, d2, dcuwVar) + a(k2, k3, dcwaVar3, e, e2, d2, dcuwVar2) < 3) {
                    return true;
                }
            }
            return false;
        }
        dcwz.i(i, dcwaVar, dcuwVar);
        dcwz.i(i, dcwaVar2, dcuwVar2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(double d, double d2, double d3, double d4, double d5) {
        return Math.abs(d2 - d) <= Math.abs(d3 - d) ? d4 + (((d5 - d4) * (d - d2)) / (d3 - d2)) : d5 + (((d4 - d5) * (d - d3)) / (d2 - d3));
    }

    public static boolean d(dcwa dcwaVar, dcwa dcwaVar2, dcwa dcwaVar3, dcwa dcwaVar4) {
        if (!dcwaVar.p(dcwaVar2) && !dcwaVar3.p(dcwaVar4)) {
            if (dcwaVar.p(dcwaVar4)) {
                return dcwk.b(dcvc.e(dcwaVar), dcwaVar3, dcwaVar2, dcwaVar);
            }
            if (dcwaVar2.p(dcwaVar3)) {
                return dcwk.b(dcvc.e(dcwaVar2), dcwaVar4, dcwaVar, dcwaVar2);
            }
            if (dcwaVar.p(dcwaVar3)) {
                return dcwk.b(dcvc.e(dcwaVar), dcwaVar4, dcwaVar2, dcwaVar);
            }
            if (dcwaVar2.p(dcwaVar4)) {
                return dcwk.b(dcvc.e(dcwaVar2), dcwaVar3, dcwaVar, dcwaVar2);
            }
        }
        return false;
    }
}
