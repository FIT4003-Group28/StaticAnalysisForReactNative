package defpackage;

import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: azpc  reason: default package */
/* loaded from: classes.dex */
public final class azpc implements axxf {
    public static final dcqe a = dcqe.c("azpc");
    public static final dcep<drjr> b = dcnm.b(EnumSet.complementOf(EnumSet.of(drjr.ELEMENT_NOT_SET)));
    public final azof c;
    public final dxio<azhi> d;
    private final batn e;
    private final batm f;
    private final bvjj g;
    private final akfa h;
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final dxio<z<dcdc<drjs>>> i = j();
    private final dxio<z<dcdc<axxe>>> j = j();
    private final dxio<z<dcdc<axxe>>> k = j();

    public azpc(azof azofVar, dxio<azhi> dxioVar, batn batnVar, batm batmVar, bvjj bvjjVar, akfa akfaVar) {
        this.c = azofVar;
        this.d = dxioVar;
        this.e = batnVar;
        this.f = batmVar;
        this.g = bvjjVar;
        this.h = akfaVar;
    }

    public static int h(drki drkiVar, drki drkiVar2) {
        boolean z = true;
        dbzx g = dbzx.b.g((drkiVar.a & 4) != 0, (drkiVar2.a & 4) != 0);
        dpoj dpojVar = drkiVar.e;
        if (dpojVar == null) {
            dpojVar = dpoj.e;
        }
        int i = dpojVar.b;
        dpoj dpojVar2 = drkiVar2.e;
        if (dpojVar2 == null) {
            dpojVar2 = dpoj.e;
        }
        dbzx c = g.c(i, dpojVar2.b);
        dpoj dpojVar3 = drkiVar.e;
        if (dpojVar3 == null) {
            dpojVar3 = dpoj.e;
        }
        int i2 = dpojVar3.c;
        dpoj dpojVar4 = drkiVar2.e;
        if (dpojVar4 == null) {
            dpojVar4 = dpoj.e;
        }
        dbzx c2 = c.c(i2, dpojVar4.c);
        dpoj dpojVar5 = drkiVar.e;
        if (dpojVar5 == null) {
            dpojVar5 = dpoj.e;
        }
        int i3 = dpojVar5.d;
        dpoj dpojVar6 = drkiVar2.e;
        if (dpojVar6 == null) {
            dpojVar6 = dpoj.e;
        }
        dbzx c3 = c2.c(i3, dpojVar6.d);
        boolean z2 = (drkiVar.a & 8) != 0;
        if ((drkiVar2.a & 8) == 0) {
            z = false;
        }
        dbzx g2 = c3.g(z2, z);
        dpoj dpojVar7 = drkiVar.f;
        if (dpojVar7 == null) {
            dpojVar7 = dpoj.e;
        }
        int i4 = dpojVar7.b;
        dpoj dpojVar8 = drkiVar2.f;
        if (dpojVar8 == null) {
            dpojVar8 = dpoj.e;
        }
        dbzx c4 = g2.c(i4, dpojVar8.b);
        dpoj dpojVar9 = drkiVar.f;
        if (dpojVar9 == null) {
            dpojVar9 = dpoj.e;
        }
        int i5 = dpojVar9.c;
        dpoj dpojVar10 = drkiVar2.f;
        if (dpojVar10 == null) {
            dpojVar10 = dpoj.e;
        }
        dbzx c5 = c4.c(i5, dpojVar10.c);
        dpoj dpojVar11 = drkiVar.f;
        if (dpojVar11 == null) {
            dpojVar11 = dpoj.e;
        }
        int i6 = dpojVar11.d;
        dpoj dpojVar12 = drkiVar2.f;
        if (dpojVar12 == null) {
            dpojVar12 = dpoj.e;
        }
        return c5.c(i6, dpojVar12.d).i();
    }

    public static int i(drjs drjsVar, drjs drjsVar2) {
        dqfu c = batk.c(drjsVar);
        dqfu c2 = batk.c(drjsVar2);
        if (drjr.a(drjsVar.a).equals(drjr.HOTEL_RESERVATION)) {
            c = batk.m(c);
        }
        if (drjr.a(drjsVar2.a).equals(drjr.HOTEL_RESERVATION)) {
            c2 = batk.m(c2);
        }
        dqfu d = batk.d(drjsVar);
        dqfu d2 = batk.d(drjsVar2);
        boolean z = true;
        dbzx d3 = dbzx.b.g(1 == (c.a & 1), 1 == (c2.a & 1)).d(c.b, c2.b);
        int i = d.a;
        int i2 = d2.a & 1;
        boolean z2 = 1 == (i & 1);
        if (1 != i2) {
            z = false;
        }
        return d3.h(z2, z).d(d.b, d2.b).i();
    }

    private static <E> dxio<z<dcdc<E>>> j() {
        return btsp.b(azon.a);
    }

    @Override // defpackage.axxf
    public final v<dcdc<axxe>> a() {
        return this.j.a();
    }

    @Override // defpackage.axxf
    public final v<dcdc<axxe>> b() {
        return this.k.a();
    }

    @Override // defpackage.axxf
    public final v<dcdc<drjs>> c() {
        return this.i.a();
    }

    @Override // defpackage.axxf
    public final synchronized void d(final drjs drjsVar) {
        this.f.b(new Runnable(this, drjsVar) { // from class: azot
            private final azpc a;
            private final drjs b;

            {
                this.a = this;
                this.b = drjsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azpc azpcVar = this.a;
                String str = this.b.c;
                bvrj.UI_THREAD.d();
                try {
                    dcdc r = dcdc.r(azof.q(azxm.m, str));
                    azpc.a.d(r.size() == 1 ? Level.INFO : Level.WARNING).t(4204).s("Deleting %d reservations for key: %s.", r.size(), str);
                    if (!azpcVar.c.k(r)) {
                        return;
                    }
                    azpcVar.d.a().a();
                    azpcVar.e();
                } catch (axxc unused) {
                }
            }
        });
    }

    @Override // defpackage.axxf
    public final synchronized void e() {
        dcdc e;
        dcdc e2;
        dcdc e3;
        dccx dccxVar = new dccx();
        dccx dccxVar2 = new dccx();
        dccx dccxVar3 = new dccx();
        batn batnVar = this.e;
        btlu j = this.h.j();
        if (batnVar.a.getSuggestParameters().e && batnVar.b.a() && j != null && !batnVar.c.o(bvjk.gK, j, false)) {
            bvrj.UI_THREAD.d();
            try {
                e = dcbg.b(this.c.a(azxm.l)).s(azoy.a).A(azoz.a);
            } catch (axxc unused) {
                e = dcdc.e();
            }
            int size = e.size();
            for (int i = 0; i < size; i++) {
                drki drkiVar = (drki) e.get(i);
                String str = drkiVar.b;
                bvrj.UI_THREAD.d();
                try {
                    e3 = dcbg.b(azof.r(azxm.m, str)).s(azpa.a).o(azpb.a).A(azoo.a);
                } catch (axxc unused2) {
                    e3 = dcdc.e();
                }
                axxe c = axxe.c(drkiVar, e3);
                dccxVar2.g(c);
                if (this.e.a(drkiVar)) {
                    dccxVar.g(c);
                }
            }
            bvrj.UI_THREAD.d();
            try {
                e2 = dcbg.b(this.c.a(azxm.m)).s(azop.a).o(azoq.a).o(azor.a).A(azos.a);
            } catch (axxc unused3) {
                e2 = dcdc.e();
            }
            dccxVar3.i(e2);
        }
        this.j.a().f(dccxVar.f());
        this.k.a().f(dccxVar2.f());
        this.i.a().f(dccxVar3.f());
        dcdc f = dccxVar2.f();
        this.l.set(false);
        btlu j2 = this.h.j();
        if (!f.isEmpty() && j2 != null) {
            this.l.set(!dcnm.p(dcbg.b(f).s(azow.a).s(azox.a).B(), this.g.E(bvjk.jQ, this.h.j(), dcmr.a)).isEmpty());
        }
    }

    @Override // defpackage.axxf
    public final boolean f() {
        return this.l.get();
    }

    @Override // defpackage.axxf
    public final void g() {
        this.l.set(false);
        dcdc<axxe> h = b().h();
        dbsk.s(h);
        this.g.ag(bvjk.jQ, this.h.j(), dcbg.b(h).s(azou.a).s(azov.a).B());
    }
}
