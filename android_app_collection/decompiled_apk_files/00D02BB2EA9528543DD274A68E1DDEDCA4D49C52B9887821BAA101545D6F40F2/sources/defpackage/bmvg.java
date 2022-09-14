package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bmvg  reason: default package */
/* loaded from: classes3.dex */
public final class bmvg implements bmvi {
    private static final dcqe j = dcqe.c("bmvg");
    public final cqat a;
    public final bmnj b;
    public final btvo c;
    public final Activity d;
    public final bmuv e;
    public bmug f;
    public final Executor i;
    private final bmun k;
    private final bmdv l;
    private final bmuo m;
    private bmuf n = bmuf.c(dcdc.e(), eapg.a());
    public bmtt h = bmtt.a;
    public dbsg<bmvc> g = dbpy.a;

    public bmvg(bmun bmunVar, cqat cqatVar, bmdv bmdvVar, bmuo bmuoVar, bmnj bmnjVar, btvo btvoVar, Activity activity, bmuv bmuvVar, Executor executor) {
        this.k = bmunVar;
        this.a = cqatVar;
        this.l = bmdvVar;
        this.m = bmuoVar;
        this.b = bmnjVar;
        this.c = btvoVar;
        this.d = activity;
        this.e = bmuvVar;
        this.i = executor;
        this.f = bmug.e(dcdc.e(), false, "", bmuvVar.h.a(new eapd(cqatVar.b())));
    }

    private static dcdc<bmtj> B(final bmuo bmuoVar, final bmdv bmdvVar, bmuf bmufVar, final eapg eapgVar) {
        return dcdc.r(dchl.k(((bmtx) bmufVar).a, new dbrn(bmuoVar, eapgVar, bmdvVar) { // from class: bmuw
            private final bmuo a;
            private final eapg b;
            private final bmdv c;

            {
                this.a = bmuoVar;
                this.b = eapgVar;
                this.c = bmdvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bmuo bmuoVar2 = this.a;
                eapg eapgVar2 = this.b;
                bmdv bmdvVar2 = this.c;
                bmud bmudVar = (bmud) obj;
                bmti h = bmtj.h();
                h.c(bmudVar.a());
                h.g(bmuoVar2.a(bmudVar.a(), eapgVar2));
                h.h(bmuo.c(bmudVar.a(), eapgVar2));
                h.d(bmuoVar2.b(bmudVar.a(), eapgVar2));
                h.e(bmudVar.c());
                h.b(bmdvVar2.e(bmudVar.b().a().a, bmudVar.a(), false));
                h.f(bmudVar.a().equals(eapgVar2));
                return h.a();
            }
        }));
    }

    private final bmug C() {
        return !this.g.a() ? this.f : this.g.b().a();
    }

    @Override // defpackage.bmvi
    public final void A() {
        bvrj.UI_THREAD.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
        if ((r10.get(0).a & 8) == 0) goto L49;
     */
    @Override // defpackage.bmvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ilo r9, defpackage.bmtt r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmvg.a(ilo, bmtt):void");
    }

    @Override // defpackage.bmvi
    public final void b(ilo iloVar) {
        bvrj.UI_THREAD.c();
        this.e.e = iloVar;
    }

    @Override // defpackage.bmvi
    public final ilo c() {
        bvrj.UI_THREAD.c();
        return this.e.e;
    }

    @Override // defpackage.bmvi
    public final String d() {
        bvrj.UI_THREAD.c();
        return C().c();
    }

    @Override // defpackage.bmvi
    public final List<dosf> e() {
        bvrj.UI_THREAD.c();
        return this.e.e.bX().n;
    }

    @Override // defpackage.bmvi
    public final void f(eapd eapdVar) {
        bvrj.UI_THREAD.c();
        dcdc<bmtj> a = C().a();
        eapg eapgVar = (eapg) dbzu.a(C().d(), this.e.h.a(eapdVar));
        bmuo bmuoVar = this.m;
        bmdv bmdvVar = this.l;
        String aT = this.e.e.aT();
        eapd f = eapdVar.f(eaow.e(1L));
        this.g = dbsg.i(bmvc.d(bmug.e(bmuv.a(eapgVar, f, a, bmuoVar, bmdvVar), true, bmdvVar.c(f.a, aT), eapgVar), 1, eapdVar));
    }

    @Override // defpackage.bmvi
    public final dbsg<String> g() {
        bvrj.UI_THREAD.c();
        return dbpy.a;
    }

    @Override // defpackage.bmvi
    public final void h(dnqp dnqpVar) {
        bvrj.UI_THREAD.c();
        dnem dnemVar = this.e.e.bX().p;
        if (dnemVar == null) {
            dnemVar = dnem.h;
        }
        if ((dnemVar.a & 1) != 0) {
            dnru bZ = dnrv.c.bZ();
            dnem dnemVar2 = this.e.e.bX().p;
            if (dnemVar2 == null) {
                dnemVar2 = dnem.h;
            }
            dqfw dqfwVar = dnemVar2.b;
            if (dqfwVar == null) {
                dqfwVar = dqfw.a;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnrv dnrvVar = (dnrv) bZ.b;
            dqfwVar.getClass();
            dnrvVar.b = dqfwVar;
            dnrvVar.a |= 1;
            if (dnqpVar.c) {
                dnqpVar.bF();
                dnqpVar.c = false;
            }
            dnqq dnqqVar = (dnqq) dnqpVar.b;
            dnrv bK = bZ.bK();
            dnqq dnqqVar2 = dnqq.f;
            bK.getClass();
            dnqqVar.e = bK;
            dnqqVar.a |= 16;
        }
    }

    @Override // defpackage.bmvi
    public final boolean i() {
        bvrj.UI_THREAD.c();
        dnem dnemVar = this.e.e.bX().p;
        if (dnemVar == null) {
            dnemVar = dnem.h;
        }
        return dnemVar.d;
    }

    @Override // defpackage.bmvi
    public final bmtp j() {
        bvrj.UI_THREAD.c();
        bmug C = C();
        bmuv bmuvVar = this.e;
        dcdc<bmtj> a = C.a();
        boolean b = C.b();
        eapg d = C.d();
        dcdc r = dcdc.r(dchl.k(a, bmur.a));
        bmuj.a(bmuvVar.c.a.a(), 1);
        bmuj.a(r, 2);
        bmuj.a(d, 3);
        return new bmtp(b, a, new bmui(r, d));
    }

    @Override // defpackage.bmvi
    public final dcdc<bmud> k() {
        bvrj.UI_THREAD.c();
        return ((bmtx) this.n).a;
    }

    @Override // defpackage.bmvi
    public final boolean l() {
        bvrj.UI_THREAD.c();
        bmuv bmuvVar = this.e;
        if (!bmuvVar.g) {
            dnem dnemVar = bmuvVar.e.bX().p;
            if (dnemVar == null) {
                dnemVar = dnem.h;
            }
            if ((dnemVar.a & 2) != 0) {
                return true;
            }
            dnem dnemVar2 = this.e.e.bX().p;
            if (dnemVar2 == null) {
                dnemVar2 = dnem.h;
            }
            return dnemVar2.e;
        }
        return true;
    }

    @Override // defpackage.bmvi
    public final boolean m() {
        bvrj.UI_THREAD.c();
        bmuv bmuvVar = this.e;
        if (!bmuvVar.g) {
            dnem dnemVar = bmuvVar.e.bX().p;
            if (dnemVar == null) {
                dnemVar = dnem.h;
            }
            if ((dnemVar.a & 2) != 0) {
                return true;
            }
            dnem dnemVar2 = this.e.e.bX().p;
            if (dnemVar2 == null) {
                dnemVar2 = dnem.h;
            }
            dneh dnehVar = dnemVar2.g;
            if (dnehVar == null) {
                dnehVar = dneh.c;
            }
            return dnehVar.b;
        }
        return true;
    }

    @Override // defpackage.bmvi
    public final boolean n() {
        bvrj.UI_THREAD.c();
        dnem dnemVar = this.e.e.bX().p;
        if (dnemVar == null) {
            dnemVar = dnem.h;
        }
        dneh dnehVar = dnemVar.g;
        if (dnehVar == null) {
            dnehVar = dneh.c;
        }
        return dnehVar.a;
    }

    @Override // defpackage.bmvi
    public final void o(boolean z) {
        bvrj.UI_THREAD.c();
        this.e.g = z;
    }

    @Override // defpackage.bmvi
    public final boolean p() {
        bvrj.UI_THREAD.c();
        return ((Boolean) this.g.h(bmux.a).c(false)).booleanValue();
    }

    @Override // defpackage.bmvi
    public final boolean q() {
        bvrj.UI_THREAD.c();
        return !C().c().isEmpty();
    }

    @Override // defpackage.bmvi
    public final boolean r() {
        bvrj.UI_THREAD.c();
        return C().b();
    }

    @Override // defpackage.bmvi
    public final boolean s() {
        bvrj.UI_THREAD.c();
        return this.e.f;
    }

    @Override // defpackage.bmvi
    public final bmuu t(String str, String str2) {
        bvrj.UI_THREAD.c();
        bmuv bmuvVar = this.e;
        Runnable runnable = new Runnable(this) { // from class: bmuy
            private final bmvg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmvg bmvgVar = this.a;
                bvrj.UI_THREAD.c();
                bmvgVar.f = bmug.e(dcdc.e(), false, "", bmvgVar.e.h.a(new eapd(bmvgVar.a.b())));
            }
        };
        bmtt bmttVar = this.h;
        bmuvVar.f = true;
        return new bmuu(bmuvVar, str, str2, runnable, bmttVar);
    }

    @Override // defpackage.bmvi
    public final boolean u() {
        dnem dnemVar = this.e.e.bX().p;
        if (dnemVar == null) {
            dnemVar = dnem.h;
        }
        return dnemVar.f;
    }

    @Override // defpackage.bmvi
    public final ango v(String str, btrm btrmVar) {
        bvrj.UI_THREAD.c();
        return new bmvb(this, 1, str, btrmVar, this.g.b().b(), this.g.b().a());
    }

    @Override // defpackage.bmvi
    public final bmvh w(eapd eapdVar, btrm btrmVar, String str) {
        bmug e;
        long j2;
        bvrj.UI_THREAD.c();
        dnem dnemVar = this.e.e.bX().p;
        if (dnemVar == null) {
            dnemVar = dnem.h;
        }
        if ((dnemVar.a & 2) != 0) {
            dnem dnemVar2 = this.e.e.bX().p;
            if (dnemVar2 == null) {
                dnemVar2 = dnem.h;
            }
            dnel dnelVar = dnemVar2.c;
            if (dnelVar == null) {
                dnelVar = dnel.c;
            }
            if ((dnelVar.a & 1) == 0) {
                dsrj<dosf> dsrjVar = this.e.e.bX().n;
                bmun bmunVar = this.k;
                List<dosf> subList = dsrjVar.subList(1, dsrjVar.size());
                dbrn<eapd, eapg> dbrnVar = this.e.h;
                bmuf a = bmunVar.a(subList, dbrnVar, dbrnVar.a(eapdVar));
                eapg eapgVar = ((bmtx) a).b;
                e = bmug.e(B(this.m, this.l, a, eapgVar), false, dsrjVar.size() < 2 ? "" : this.l.a(dsrjVar.get(1), this.e.e.aT()), eapgVar);
            } else {
                e = bmug.e(this.f.a(), false, this.f.c(), (eapg) dbzu.a(this.f.d(), this.e.h.a(eapdVar)));
            }
            this.g = dbsg.i(bmvc.d(e, 2, eapdVar));
            dnel dnelVar2 = dnemVar.c;
            if (dnelVar2 == null) {
                dnelVar2 = dnel.c;
            }
            if ((dnelVar2.a & 1) != 0) {
                dnel dnelVar3 = dnemVar.c;
                if (dnelVar3 == null) {
                    dnelVar3 = dnel.c;
                }
                dnej dnejVar = dnelVar3.b;
                if (dnejVar == null) {
                    dnejVar = dnej.b;
                }
                j2 = dnejVar.a;
            } else {
                j2 = this.e.e.bX().n.get(0).b;
            }
            return bmvh.c(new eapd(j2), new bmvb(this, 2, str, btrmVar, this.g.b().b(), this.g.b().a()));
        }
        this.e.f = true;
        return bmvh.c(eapdVar.f(bmuv.a), new bmvf(this, str));
    }

    @Override // defpackage.bmvi
    public final void x() {
        bvrj.UI_THREAD.c();
    }

    @Override // defpackage.bmvi
    public final void y() {
        bvrj.UI_THREAD.c();
    }

    @Override // defpackage.bmvi
    public final void z() {
        bvrj.UI_THREAD.c();
    }
}
