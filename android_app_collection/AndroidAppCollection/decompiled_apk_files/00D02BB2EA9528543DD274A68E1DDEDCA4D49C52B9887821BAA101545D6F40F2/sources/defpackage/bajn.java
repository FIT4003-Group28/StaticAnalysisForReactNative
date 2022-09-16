package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: bajn  reason: default package */
/* loaded from: classes3.dex */
public class bajn implements baew {
    public final Executor a;
    public final Executor b;
    public final cklq c;
    public final dxio<bvjj> d;
    public final dxio<axwi> e;
    final aoso f;
    public final bagz g;
    public final axwq h;
    public final bahj i;
    public final bahz j;
    public final btlu k;
    public final m l;
    private final acyp s;
    private final btpc t;
    private final btrm u;
    private final gga v;
    private final bagj w;
    private final cjnx x;
    private final aote y;
    private final boolean z;
    public boolean m = true;
    public boolean n = true;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    private boolean A = false;

    public bajn(acyp acypVar, cqat cqatVar, cqhn cqhnVar, btpc btpcVar, Executor executor, Executor executor2, btrm btrmVar, gga ggaVar, cklq cklqVar, dxio<bvjj> dxioVar, dxio<axwi> dxioVar2, bagk bagkVar, axwg axwgVar, aosp aospVar, bagz bagzVar, axwq axwqVar, bahj bahjVar, baia baiaVar, aotf aotfVar, cjnx cjnxVar, btlu btluVar, m mVar, boolean z, cjqp cjqpVar) {
        aote aoteVar;
        aoso aosoVar;
        this.s = acypVar;
        this.t = btpcVar;
        this.a = executor;
        this.b = executor2;
        this.u = btrmVar;
        this.d = dxioVar;
        this.v = ggaVar;
        this.c = cklqVar;
        this.e = dxioVar2;
        this.x = cjnxVar;
        this.g = true != axwgVar.i() ? null : bagzVar;
        this.h = axwqVar;
        this.k = btluVar;
        this.i = true != axwgVar.g() ? null : bahjVar;
        this.l = mVar;
        if (axwgVar.k()) {
            Runnable runnable = new Runnable(this) { // from class: baiy
                private final bajn a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqkx.p(this.a);
                }
            };
            anhg a = aotfVar.a.a();
            aotf.a(a, 1);
            aotf.a(aotfVar.b.a(), 2);
            gga a2 = aotfVar.c.a();
            aotf.a(a2, 3);
            bvjj a3 = aotfVar.d.a();
            aotf.a(a3, 4);
            aotf.a(aotfVar.e.a(), 5);
            aosw a4 = aotfVar.f.a();
            aotf.a(a4, 6);
            aoth a5 = aotfVar.g.a();
            aotf.a(a5, 7);
            aotf.a(aotfVar.h.a(), 8);
            bvpe a6 = aotfVar.i.a();
            aotf.a(a6, 9);
            aotf.a(runnable, 10);
            aoteVar = new aote(a, a2, a3, a4, a5, a6, runnable);
        } else {
            aoteVar = null;
        }
        this.y = aoteVar;
        this.z = z;
        baez a7 = baiaVar.a.a();
        baia.a(a7, 1);
        baia.a(baiaVar.b.a(), 2);
        Executor a8 = baiaVar.c.a();
        baia.a(a8, 3);
        gga a9 = baiaVar.d.a();
        baia.a(a9, 4);
        bwqv a10 = baiaVar.e.a();
        baia.a(a10, 5);
        dxio a11 = ((dxjh) baiaVar.f).a();
        baia.a(a11, 6);
        baib a12 = baiaVar.g.a();
        baia.a(a12, 7);
        bbat a13 = baiaVar.h.a();
        baia.a(a13, 8);
        bbca a14 = baiaVar.i.a();
        baia.a(a14, 9);
        btvo a15 = baiaVar.j.a();
        baia.a(a15, 10);
        this.j = new bahz(a7, a8, a9, a10, a11, a12, a13, a14, a15);
        anhg a16 = bagkVar.a.a();
        bagk.a(a16, 1);
        axwy a17 = bagkVar.b.a();
        bagk.a(a17, 2);
        this.w = new bagj(a16, a17);
        if (axwgVar.l()) {
            baje bajeVar = new baje(this, dxioVar, btluVar, cqatVar);
            gga a18 = aospVar.a.a();
            aosp.a(a18, 1);
            bzqa a19 = aospVar.b.a();
            aosp.a(a19, 2);
            cjqy a20 = aospVar.c.a();
            aosp.a(a20, 3);
            aosp.a(bajeVar, 4);
            aosp.a(cjqpVar, 5);
            aosoVar = new aoso(a18, a19, a20, bajeVar, cjqpVar);
        } else {
            aosoVar = null;
        }
        this.f = aosoVar;
    }

    private final void w() {
        this.n = true;
        btlu btluVar = this.k;
        if (btluVar != null) {
            baek.a(this.x.l(btluVar)).b(this.l, new aa(this) { // from class: bajm
                private final bajn a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    bajn bajnVar = this.a;
                    bajnVar.a.execute(new Runnable(bajnVar, (Boolean) obj) { // from class: baja
                        private final bajn a;
                        private final Boolean b;

                        {
                            this.a = bajnVar;
                            this.b = r2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final bajn bajnVar2 = this.a;
                            final boolean booleanValue = this.b.booleanValue();
                            final boolean z = bajnVar2.d.a().x(bvjk.kn, bajnVar2.k, 0L) > 0;
                            bajnVar2.b.execute(new Runnable(bajnVar2, booleanValue, z) { // from class: bajl
                                private final bajn a;
                                private final boolean b;
                                private final boolean c;

                                {
                                    this.a = bajnVar2;
                                    this.b = booleanValue;
                                    this.c = z;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    bajn bajnVar3 = this.a;
                                    bajnVar3.r = !this.b && !this.c;
                                    bajnVar3.n = false;
                                    if (!bajnVar3.a().booleanValue()) {
                                        cqkx.p(bajnVar3);
                                        bajnVar3.c.c(cklt.SAVED_PLACES_LIST);
                                    }
                                }
                            });
                        }
                    });
                }
            });
        }
        this.m = true;
        if (!this.t.i()) {
            this.m = false;
            s();
            return;
        }
        baek.a(this.h.e()).b(this.l, new aa(this) { // from class: baiz
            private final bajn a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                bajn bajnVar = this.a;
                if (((Boolean) obj).booleanValue()) {
                    bajnVar.s();
                    return;
                }
                bajnVar.o = true;
                bajnVar.m = false;
                if (bajnVar.a().booleanValue()) {
                    return;
                }
                cqkx.p(bajnVar);
                bajnVar.c.c(cklt.SAVED_PLACES_LIST);
            }
        });
    }

    @Override // defpackage.baew
    public Boolean a() {
        boolean z = true;
        if (this.p || (!this.m && !this.n)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.baew
    public Boolean b() {
        return Boolean.valueOf(this.s.f());
    }

    @Override // defpackage.baew
    public Boolean c() {
        return Boolean.valueOf(this.z);
    }

    @Override // defpackage.baew
    public Boolean d() {
        boolean z = true;
        if (a().booleanValue() || (!this.o && this.q)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.baew
    public String e() {
        return this.v.getString(R.string.SAVED_PLACES_RETRY_SYNC_HEADLINE_TEXT);
    }

    @Override // defpackage.baew
    public String f() {
        return this.v.getString(R.string.RETRY_SYNC_ACTION_TEXT);
    }

    @Override // defpackage.baew
    public cqkl g() {
        w();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.baew
    public cjtd h() {
        return cjtd.b;
    }

    @Override // defpackage.baew
    public baev i() {
        bahj bahjVar = this.i;
        if (bahjVar == null || !bahjVar.e()) {
            return null;
        }
        return this.i;
    }

    @Override // defpackage.baew
    public baev j() {
        bagz bagzVar = this.g;
        if (bagzVar == null || !bagzVar.e()) {
            return null;
        }
        return this.g;
    }

    @Override // defpackage.baew
    public baef k() {
        aote aoteVar = this.y;
        if (aoteVar == null || !aoteVar.d().booleanValue()) {
            return null;
        }
        return this.y;
    }

    @Override // defpackage.baew
    public baeg n() {
        if (this.r) {
            return this.f;
        }
        return null;
    }

    public void o() {
        btrm btrmVar = this.u;
        dceq a = dcet.a();
        a.b(azrb.class, new bajp(azrb.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        w();
        aote aoteVar = this.y;
        if (aoteVar != null) {
            aoteVar.a();
        }
        this.A = true;
    }

    public void p() {
        if (this.A) {
            q();
        }
    }

    public void q() {
        bahj bahjVar = this.i;
        if (bahjVar != null) {
            bahjVar.f();
        }
        bagz bagzVar = this.g;
        if (bagzVar != null) {
            bagzVar.f();
        }
        this.u.a(this);
        this.A = true;
    }

    public void r() {
        aote aoteVar = this.y;
        if (aoteVar != null) {
            aoteVar.b();
        }
    }

    public final void s() {
        this.m = true;
        final dehn<dcdc<azva>> m = this.h.m();
        this.a.execute(new Runnable(this, m) { // from class: bajf
            private final bajn a;
            private final Future b;

            {
                this.a = this;
                this.b = m;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bajn bajnVar = this.a;
                bajnVar.b.execute(new Runnable(bajnVar, (dcdc) deha.s(this.b), bajnVar.h.x().a()) { // from class: bajb
                    private final bajn a;
                    private final dcdc b;
                    private final List c;

                    {
                        this.a = bajnVar;
                        this.b = r2;
                        this.c = r3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        final bajn bajnVar2 = this.a;
                        final dcdc dcdcVar = this.b;
                        final List list = this.c;
                        baek.a(bajnVar2.e.a().f()).b(bajnVar2.l, new aa(bajnVar2, dcdcVar, list) { // from class: bajc
                            private final bajn a;
                            private final dcdc b;
                            private final List c;

                            {
                                this.a = bajnVar2;
                                this.b = dcdcVar;
                                this.c = list;
                            }

                            @Override // defpackage.aa
                            public final void m(Object obj) {
                                final bajn bajnVar3 = this.a;
                                final dcdc dcdcVar2 = this.b;
                                final List list2 = this.c;
                                final dcdc dcdcVar3 = (dcdc) obj;
                                bajnVar3.a.execute(new Runnable(bajnVar3, dcdcVar2, list2, dcdcVar3) { // from class: bajd
                                    private final bajn a;
                                    private final dcdc b;
                                    private final List c;
                                    private final dcdc d;

                                    {
                                        this.a = bajnVar3;
                                        this.b = dcdcVar2;
                                        this.c = list2;
                                        this.d = dcdcVar3;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final bajn bajnVar4 = this.a;
                                        dcdc<azva> dcdcVar4 = this.b;
                                        List list3 = this.c;
                                        dcdc<baad> dcdcVar5 = this.d;
                                        bvrj.UI_THREAD.d();
                                        bajnVar4.q = !dcbg.b(dcdcVar5).o(bajg.a).y();
                                        bahz bahzVar = bajnVar4.j;
                                        bvrj.UI_THREAD.d();
                                        dccx F = dcdc.F();
                                        dccx F2 = dcdc.F();
                                        for (baad baadVar : dcdcVar5) {
                                            if (baadVar.z()) {
                                                F2.g(bahzVar.h.a(baadVar));
                                            } else {
                                                F.g(bahzVar.h.a(baadVar));
                                                if (baadVar.q() && baadVar.o() == baab.WANT_TO_GO) {
                                                    F.g(bahzVar.g);
                                                }
                                            }
                                        }
                                        dcdc f = F.f();
                                        baez baezVar = bahzVar.a;
                                        gga a = baezVar.a.a();
                                        baez.a(a, 1);
                                        bwqv a2 = baezVar.b.a();
                                        baez.a(a2, 2);
                                        aymh a3 = baezVar.c.a();
                                        baez.a(a3, 3);
                                        dxio a4 = ((dxjh) baezVar.d).a();
                                        baez.a(a4, 4);
                                        baez.a(((dxjh) baezVar.e).a(), 5);
                                        ania a5 = baezVar.f.a();
                                        baez.a(a5, 6);
                                        batz a6 = baezVar.g.a();
                                        baez.a(a6, 7);
                                        baez.a(dcdcVar4, 8);
                                        baez.a(list3, 9);
                                        bahzVar.b.execute(new Runnable(bahzVar, f, new baey(a, a2, a3, a4, a5, a6, dcdcVar4, list3), F2) { // from class: bahp
                                            private final bahz a;
                                            private final dcdc b;
                                            private final bayk c;
                                            private final dccx d;

                                            {
                                                this.a = bahzVar;
                                                this.b = f;
                                                this.c = r3;
                                                this.d = F2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final bahz bahzVar2 = this.a;
                                                final dcdc dcdcVar6 = this.b;
                                                final bayk baykVar = this.c;
                                                dccx dccxVar = this.d;
                                                bahzVar2.i = bahzVar2.f.a(bahz.f(dcdcVar6, baykVar), bahx.OWNED, bahzVar2.i.b().booleanValue());
                                                bahzVar2.j = bahzVar2.f.a(dccxVar.f(), bahx.FOLLOWED, bahzVar2.j.b().booleanValue());
                                                bahzVar2.g.u(new Runnable(bahzVar2, dcdcVar6, baykVar) { // from class: bahr
                                                    private final bahz a;
                                                    private final dcdc b;
                                                    private final bayk c;

                                                    {
                                                        this.a = bahzVar2;
                                                        this.b = dcdcVar6;
                                                        this.c = baykVar;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        bahz bahzVar3 = this.a;
                                                        bahzVar3.i = bahzVar3.f.a(bahz.f(this.b, this.c), bahx.OWNED, bahzVar3.i.b().booleanValue());
                                                        cqkx.p(bahzVar3);
                                                    }
                                                });
                                            }
                                        });
                                        dcdc<baal> z = dcbg.b(dcdcVar5).o(bajh.a).t(baji.a).o(bajj.a).z();
                                        dcdc<azxk> e = dcdc.e();
                                        try {
                                            e = bajnVar4.h.g(azxm.e);
                                        } catch (axxc unused) {
                                        }
                                        bahj bahjVar = bajnVar4.i;
                                        if (bahjVar != null) {
                                            bahjVar.c(z, e, dcdcVar4);
                                        }
                                        bagz bagzVar = bajnVar4.g;
                                        if (bagzVar != null) {
                                            bagzVar.c(z, e, dcdcVar4);
                                        }
                                        bajnVar4.b.execute(new Runnable(bajnVar4) { // from class: bajk
                                            private final bajn a;

                                            {
                                                this.a = bajnVar4;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                bajn bajnVar5 = this.a;
                                                bajnVar5.m = false;
                                                bajnVar5.p = true;
                                                if (!bajnVar5.a().booleanValue()) {
                                                    cqkx.p(bajnVar5);
                                                    bajnVar5.c.c(cklt.SAVED_PLACES_LIST);
                                                }
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public btlu t() {
        return this.k;
    }

    @Override // defpackage.baew
    /* renamed from: u */
    public bahz l() {
        return this.j;
    }

    @Override // defpackage.baew
    /* renamed from: v */
    public bagj m() {
        return this.w;
    }
}
