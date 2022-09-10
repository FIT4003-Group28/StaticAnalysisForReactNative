package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aibw  reason: default package */
/* loaded from: classes2.dex */
public final class aibw {
    static final long a = TimeUnit.MINUTES.toMillis(2);

    public static dbsg<dhjz> a(ahvg ahvgVar, long j) {
        double d;
        dcwa a2;
        if (!ahvgVar.c().a()) {
            return ahvgVar.g();
        }
        dbsg<eaow> l = ahvgVar.l(new eapd(j));
        if (l.a()) {
            long j2 = a;
            if (l.b().p(eaow.e(j2))) {
                j -= l.b().b - j2;
            }
        }
        dbsg<ahvj> c = ahvgVar.c();
        if (c.a()) {
            doqt doqtVar = c.b().a.c;
            if (doqtVar == null) {
                doqtVar = doqt.k;
            }
            dgas dgasVar = doqtVar.h;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            if ((dgasVar.a & 1) != 0) {
                ahvj b = c.b();
                if (b.a.d) {
                    return ahvgVar.g();
                }
                long j3 = ahvgVar.l(new eapd(j)).b().b;
                amtm a3 = b.b.a();
                doqt doqtVar2 = b.a.c;
                if (doqtVar2 == null) {
                    doqtVar2 = doqt.k;
                }
                dgas dgasVar2 = doqtVar2.h;
                if (dgasVar2 == null) {
                    dgasVar2 = dgas.e;
                }
                double d2 = dgasVar2.b;
                double d3 = ((float) j3) / 1000.0f;
                Double.isNaN(d2);
                Double.isNaN(d3);
                double a4 = bnwf.a(a3, d2 - d3);
                dowb dowbVar = doqtVar2.g;
                if (dowbVar == null) {
                    dowbVar = dowb.d;
                }
                if ((dowbVar.a & 1) != 0) {
                    dowb dowbVar2 = doqtVar2.g;
                    if (dowbVar2 == null) {
                        dowbVar2 = dowb.d;
                    }
                    d = dowbVar2.b;
                } else {
                    d = a4;
                }
                double max = Math.max(d, a4);
                dcwi a5 = b.c.a();
                double d4 = dcyn.a;
                double d5 = 0.0d;
                for (int i = 1; i < a5.a; i++) {
                    d5 += a5.a(i - 1).o(a5.a(i));
                }
                double i2 = max / dcuy.d(d5).i();
                if (i2 > dcyn.a) {
                    for (int i3 = 1; i3 < a5.a; i3++) {
                        d4 += a5.a(i3 - 1).o(a5.a(i3));
                    }
                    double d6 = i2 * d4;
                    int i4 = 1;
                    while (true) {
                        int i5 = a5.a;
                        if (i4 >= i5) {
                            a2 = a5.a(i5 - 1);
                            break;
                        }
                        int i6 = i4 - 1;
                        double o = a5.a(i6).o(a5.a(i4));
                        if (d6 < o) {
                            double sin = Math.sin(d6) / Math.sin(o);
                            a2 = dcwa.a(dcwa.c(a5.a(i6), Math.cos(d6) - (Math.cos(o) * sin)), dcwa.c(a5.a(i4), sin));
                            break;
                        }
                        d6 -= o;
                        i4++;
                    }
                } else {
                    a2 = a5.a(0);
                }
                dcvs dcvsVar = new dcvs(a2);
                dhjy bZ = dhjz.e.bZ();
                double g = dcvsVar.g();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhjz dhjzVar = (dhjz) bZ.b;
                dhjzVar.a |= 2;
                dhjzVar.c = g;
                double i7 = dcvsVar.i();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhjz dhjzVar2 = (dhjz) bZ.b;
                dhjzVar2.a = 1 | dhjzVar2.a;
                dhjzVar2.b = i7;
                dhjz bK = bZ.bK();
                if (bK != null) {
                    return dbsg.j(bK);
                }
            }
        }
        return ahvgVar.g();
    }
}
