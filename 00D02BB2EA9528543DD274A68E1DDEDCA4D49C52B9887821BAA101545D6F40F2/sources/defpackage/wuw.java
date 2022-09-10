package defpackage;
/* compiled from: PG */
/* renamed from: wuw  reason: default package */
/* loaded from: classes7.dex */
public final class wuw {
    private static final dcqe a = dcqe.c("wuw");

    public static boolean b(amve amveVar) {
        return amveVar.e() == 1 && amveVar.d(0).e() > 0 && amveVar.d(0).d(0).l();
    }

    public static boolean c(amve amveVar) {
        return amveVar.e() == 1 && amveVar.d(0).e() > 0 && amveVar.d(0).d(0).m();
    }

    @dzsi
    private static wuq e(dpah dpahVar) {
        drgz drgzVar;
        int i = dpahVar.a;
        if ((i & 8) != 0 && (i & 2) != 0) {
            wuq w = wuv.w();
            w.g(dpahVar.e);
            dquj dqujVar = dpahVar.c;
            if (dqujVar == null) {
                dqujVar = dquj.f;
            }
            wuf wufVar = (wuf) w;
            wufVar.f = dqujVar;
            if ((dpahVar.a & 4) != 0) {
                drgzVar = dpahVar.d;
                if (drgzVar == null) {
                    drgzVar = drgz.b;
                }
            } else {
                drgzVar = null;
            }
            wufVar.i = drgzVar;
            wufVar.k = (dpahVar.a & 16) != 0 ? dpahVar.f : null;
            wufVar.o = 2;
            w.f(true);
            w.h(false);
            dpan dpanVar = dpahVar.b;
            if (dpanVar == null) {
                dpanVar = dpan.e;
            }
            if (amuk.d(dpanVar)) {
                dpan dpanVar2 = dpahVar.b;
                if (dpanVar2 == null) {
                    dpanVar2 = dpan.e;
                }
                wufVar.a = amuk.e(dpanVar2);
                return w;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.wuq f(defpackage.dpax r7) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wuw.f(dpax):wuq");
    }

    @dzsi
    public final wuv a(amve amveVar, int i) {
        wuq e;
        if (b(amveVar) && c(amveVar)) {
            bvoo.h("Both online and offline taxi is present.", new Object[0]);
        }
        if (b(amveVar) || c(amveVar)) {
            dqvj c = dqvj.c(amveVar.b().b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            if (c == dqvj.TAXI && amveVar.e() != 0) {
                amtr d = amveVar.d(0);
                if (d.e() != 0) {
                    amuq d2 = d.d(0);
                    if (d2.l()) {
                        e = f(d2.n());
                    } else {
                        e = d2.m() ? e(d2.o()) : null;
                    }
                    if (e != null) {
                        ((wuf) e).c = cjtd.c(vyb.t(amveVar));
                        e.e(amveVar.b().i);
                        e.c(vyb.d(amveVar));
                        e.b(i);
                        return e.a();
                    }
                }
            }
            return null;
        }
        return null;
    }

    @dzsi
    public final wuv d(amuq amuqVar, int i) {
        wuq e;
        String str = null;
        if (amuqVar.l()) {
            e = f(amuqVar.n());
        } else {
            e = amuqVar.m() ? e(amuqVar.o()) : null;
        }
        if (e == null) {
            return null;
        }
        e.b(i);
        e.c(dpej.DELAY_NODATA);
        e.e(false);
        cjta b = cjtd.b();
        dpdy dpdyVar = amuqVar.a;
        if ((dpdyVar.a & 1) != 0) {
            str = dpdyVar.b;
        }
        b.g(str);
        ((wuf) e).c = b;
        return e.a();
    }
}
