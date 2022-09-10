package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: yzr  reason: default package */
/* loaded from: classes7.dex */
public final class yzr {
    public static final /* synthetic */ int b = 0;
    private static final eaow c = eaow.c(5);
    public final yzm a;

    public yzr(Resources resources) {
        this.a = new yzm(resources);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r7 != defpackage.dqvj.TRANSIT) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r7 == defpackage.dgau.DEPART) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        r5 = r5.q;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.akrk a(defpackage.akrk r4, defpackage.dpie r5, int r6, int r7) {
        /*
            dsrj<dpbp> r0 = r5.e
            java.lang.Object r0 = r0.get(r6)
            dpbp r0 = (defpackage.dpbp) r0
            dsrj<dpdy> r0 = r0.c
            java.lang.Object r0 = r0.get(r7)
            dpdy r0 = (defpackage.dpdy) r0
            dsrj<dpdq> r1 = r0.d
            int r1 = r1.size()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            defpackage.dbsk.a(r1)
            dbrn r1 = defpackage.yzn.a
            dpdy r5 = f(r5, r6, r7, r1)
            if (r5 == 0) goto L31
            dsrj<dpdq> r5 = r5.d
            java.lang.Object r5 = r5.get(r3)
            dpdq r5 = (defpackage.dpdq) r5
            goto L32
        L31:
            r5 = 0
        L32:
            dsrj<dpdq> r6 = r0.d
            java.lang.Object r6 = r6.get(r3)
            dpdq r6 = (defpackage.dpdq) r6
            int r6 = r6.q
            if (r5 != 0) goto L45
            int r5 = r4.l()
            int r5 = r5 + (-1)
            goto L87
        L45:
            dpec r7 = r5.c
            if (r7 != 0) goto L4b
            dpec r7 = defpackage.dpec.o
        L4b:
            int r1 = r7.a
            r1 = r1 & r2
            if (r1 == 0) goto L5e
            int r7 = r7.b
            dqvj r7 = defpackage.dqvj.c(r7)
            if (r7 != 0) goto L5a
            dqvj r7 = defpackage.dqvj.DRIVE
        L5a:
            dqvj r1 = defpackage.dqvj.TRANSIT
            if (r7 == r1) goto L72
        L5e:
            int r7 = r5.a
            r7 = r7 & 32
            if (r7 == 0) goto L75
            int r7 = r5.g
            dgau r7 = defpackage.dgau.b(r7)
            if (r7 != 0) goto L6e
            dgau r7 = defpackage.dgau.MANEUVER_UNKNOWN
        L6e:
            dgau r1 = defpackage.dgau.DEPART
            if (r7 != r1) goto L75
        L72:
            int r5 = r5.q
            goto L87
        L75:
            dsrj<dpdq> r5 = r0.d
            int r5 = r5.size()
            dsrj<dpdq> r7 = r0.d
            int r5 = r5 + (-1)
            java.lang.Object r5 = r7.get(r5)
            dpdq r5 = (defpackage.dpdq) r5
            int r5 = r5.q
        L87:
            akru r7 = new akru
            int r5 = r5 + r2
            r7.<init>(r4, r6, r5)
            akrk r4 = r7.d()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzr.a(akrk, dpie, int, int):akrk");
    }

    public static amvh b(akrk akrkVar, dpie dpieVar, int i, int i2, amvh amvhVar) {
        if (i == 0) {
            if (i2 == 0) {
                return amvhVar;
            }
            i = 0;
        }
        dpdy e = e(dpieVar, i, i2, yzo.a);
        if (e != null) {
            dphe dpheVar = e.e;
            if (dpheVar == null) {
                dpheVar = dphe.x;
            }
            if ((dpheVar.a & 4) != 0) {
                dphe dpheVar2 = e.e;
                if (dpheVar2 == null) {
                    dpheVar2 = dphe.x;
                }
                dpgw dpgwVar = dpheVar2.d;
                if (dpgwVar == null) {
                    dpgwVar = dpgw.r;
                }
                return g(dpgwVar);
            }
        }
        amvg P = amvh.P();
        P.d(akrkVar.m(0));
        return P.a();
    }

    public static amvh c(akrk akrkVar, dpie dpieVar, int i, int i2, amvh amvhVar) {
        int size = dpieVar.e.size();
        int size2 = dpieVar.e.get(i).c.size();
        if (i == size - 1 && i2 == size2 - 1) {
            return amvhVar;
        }
        dpdy f = f(dpieVar, i, i2, yzp.a);
        if (f != null) {
            dphe dpheVar = f.e;
            if (dpheVar == null) {
                dpheVar = dphe.x;
            }
            if ((dpheVar.a & 2) != 0) {
                dphe dpheVar2 = f.e;
                if (dpheVar2 == null) {
                    dpheVar2 = dphe.x;
                }
                dpgw dpgwVar = dpheVar2.c;
                if (dpgwVar == null) {
                    dpgwVar = dpgw.r;
                }
                return g(dpgwVar);
            }
        }
        amvg P = amvh.P();
        P.d(akrkVar.p());
        return P.a();
    }

    public static boolean d(dpdy dpdyVar) {
        dpec dpecVar = dpdyVar.c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        dqvj c2 = dqvj.c(dpecVar.b);
        if (c2 == null) {
            c2 = dqvj.DRIVE;
        }
        if (c2 == dqvj.WALK) {
            dpec dpecVar2 = dpdyVar.c;
            if (dpecVar2 == null) {
                dpecVar2 = dpec.o;
            }
            dgas dgasVar = dpecVar2.e;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            return ((long) dgasVar.b) >= c.g();
        }
        return true;
    }

    @dzsi
    private static dpdy e(dpie dpieVar, int i, int i2, dbrn<dpdy, Boolean> dbrnVar) {
        if (i < 0) {
            return null;
        }
        dpbp dpbpVar = dpieVar.e.get(i);
        if (i2 == -1) {
            i2 = dpbpVar.c.size();
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            dpdy dpdyVar = dpbpVar.c.get(i3);
            if (dbrnVar.a(dpdyVar).booleanValue()) {
                return dpdyVar;
            }
        }
        return e(dpieVar, i - 1, -1, dbrnVar);
    }

    @dzsi
    private static dpdy f(dpie dpieVar, int i, int i2, dbrn<dpdy, Boolean> dbrnVar) {
        dpdy dpdyVar;
        if (i >= dpieVar.e.size()) {
            return null;
        }
        dpbp dpbpVar = dpieVar.e.get(i);
        do {
            i2++;
            if (i2 < dpbpVar.c.size()) {
                dpdyVar = dpbpVar.c.get(i2);
            } else {
                return f(dpieVar, i + 1, -1, dbrnVar);
            }
        } while (!dbrnVar.a(dpdyVar).booleanValue());
        return dpdyVar;
    }

    private static amvh g(dpgw dpgwVar) {
        amvg P = amvh.P();
        P.z = true;
        int i = dpgwVar.a;
        if ((i & 1) != 0) {
            P.b = dpgwVar.b;
        }
        if ((i & 128) != 0) {
            dnoh dnohVar = dpgwVar.i;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            P.d = akqq.e(dnohVar);
        }
        if ((dpgwVar.a & 4096) != 0) {
            P.c = akqi.b(dpgwVar.n);
        }
        return P.a();
    }
}
