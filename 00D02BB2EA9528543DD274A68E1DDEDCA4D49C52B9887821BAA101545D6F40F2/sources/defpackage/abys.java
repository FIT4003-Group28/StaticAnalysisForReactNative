package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abys  reason: default package */
/* loaded from: classes2.dex */
public final class abys {
    public static final dqlu a;
    public static final dqlu b;
    private static final dcqe g;
    public abyr c;
    public final btvo d;
    public final awvy e;
    public final dxio<ahjq> f;
    private final Executor h;
    private final buso i;

    static {
        dqlp bZ = dqlu.c.bZ();
        dqlr dqlrVar = dqlr.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqlu dqluVar = (dqlu) bZ.b;
        dqlrVar.getClass();
        dqluVar.b = dqlrVar;
        dqluVar.a = 1;
        a = bZ.bK();
        dqlp bZ2 = dqlu.c.bZ();
        dqlr dqlrVar2 = dqlr.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqlu dqluVar2 = (dqlu) bZ2.b;
        dqlrVar2.getClass();
        dqluVar2.b = dqlrVar2;
        dqluVar2.a = 2;
        b = bZ2.bK();
        g = dcqe.c("abys");
    }

    public abys(btvo btvoVar, Executor executor, buso busoVar, awvy awvyVar, dxio<ahjq> dxioVar) {
        abyq f = abyr.f();
        ((abwv) f).d = false;
        this.c = f.a();
        this.d = btvoVar;
        this.h = executor;
        this.i = busoVar;
        this.e = awvyVar;
        this.f = dxioVar;
    }

    public static dcdc<aceh> c(dkeo dkeoVar) {
        dbsg dbsgVar;
        dccx F = dcdc.F();
        for (dkei dkeiVar : dkeoVar.a) {
            dkeh dkehVar = dkeiVar.c;
            if (dkehVar == null) {
                dkehVar = dkeh.e;
            }
            String str = dkehVar.b;
            dkeh dkehVar2 = dkeiVar.c;
            if (dkehVar2 == null) {
                dkehVar2 = dkeh.e;
            }
            dwfl dwflVar = dkehVar2.c;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            dwfl dwflVar2 = dwflVar;
            dqlw dqlwVar = dkeiVar.d;
            if (dqlwVar == null) {
                dqlwVar = dqlw.i;
            }
            dspd dspdVar = dqlwVar.d;
            dqlz dqlzVar = dkeiVar.e;
            if (dqlzVar == null) {
                dqlzVar = dqlz.c;
            }
            if ((dqlzVar.a & 1) != 0) {
                dqlz dqlzVar2 = dkeiVar.e;
                if (dqlzVar2 == null) {
                    dqlzVar2 = dqlz.c;
                }
                dbsgVar = dbsg.i(Integer.valueOf(dqlzVar2.b));
            } else {
                dbsgVar = dbpy.a;
            }
            dbsg dbsgVar2 = dbsgVar;
            dqlw dqlwVar2 = dkeiVar.d;
            if (dqlwVar2 == null) {
                dqlwVar2 = dqlw.i;
            }
            int a2 = dqmg.a(dqlwVar2.e);
            F.g(new acea(str, dwflVar2, dspdVar, dbsgVar2, a2 == 0 ? 1 : a2));
        }
        return F.f();
    }

    public static dcdc<aced> d(dkeo dkeoVar) {
        dbsg i;
        dccx F = dcdc.F();
        for (dkei dkeiVar : dkeoVar.a) {
            dkeh dkehVar = dkeiVar.c;
            if (dkehVar == null) {
                dkehVar = dkeh.e;
            }
            dbsg<acej> a2 = abyt.a(dkehVar);
            if (!a2.a()) {
                i = dbpy.a;
            } else {
                dqlw dqlwVar = dkeiVar.d;
                if (dqlwVar == null) {
                    dqlwVar = dqlw.i;
                }
                dpum dpumVar = dqlwVar.g;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                double d = dpumVar.b;
                dpum dpumVar2 = dqlwVar.g;
                if (dpumVar2 == null) {
                    dpumVar2 = dpum.d;
                }
                akra e = akra.e(d, dpumVar2.c);
                dpuq dpuqVar = dqlwVar.h;
                if (dpuqVar == null) {
                    dpuqVar = dpuq.d;
                }
                i = dbsg.i(new acdw(e, new akqs(dpuqVar), a2.b(), dqlwVar.b));
            }
            if (i.a()) {
                F.g((aced) i.b());
            }
        }
        return F.f();
    }

    public static acei e(dkeo dkeoVar) {
        dcdc q = dcdc.q(dcft.o(dkeoVar.a, abyo.a));
        if (q.isEmpty()) {
            return acei.f(dcdc.e());
        }
        if (q.size() > 1) {
            bvoo.h("Found multiple roots in element tree", new Object[0]);
        }
        acef acefVar = (acef) q.get(0);
        boolean a2 = acefVar.c().a();
        dbsg<aceg> c = acefVar.c();
        int a3 = c.a() ? c.b().a() : 0;
        dcdc<acej> i = acei.i(dcdc.f(acefVar));
        dbsg<aceg> c2 = acefVar.c();
        return new aceb(a2, a3, i, c2.a() && !c2.b().c(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return (this.c.a() == null || this.c.b() == null || !this.c.d().booleanValue()) ? false : true;
    }

    public final <T> dehn<T> b(dkem dkemVar, dbrn<dkeo, T> dbrnVar) {
        final deig d = deig.d();
        final btzc b2 = this.i.c().b(dkemVar, new abyp(this, dkemVar, d, dbrnVar), this.h);
        d.Pk(new Runnable(d, b2) { // from class: abyn
            private final deig a;
            private final btzc b;

            {
                this.a = d;
                this.b = b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deig deigVar = this.a;
                btzc btzcVar = this.b;
                dqlu dqluVar = abys.a;
                if (deigVar.isCancelled()) {
                    btzcVar.a();
                }
            }
        }, this.h);
        return d;
    }
}
