package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ths  reason: default package */
/* loaded from: classes7.dex */
public final class ths implements tgx {
    public final tgw a;
    public final ufg b;
    public final Executor c;
    public final dxio<tgn> d;
    public final thd g;
    private final thg o;
    private final tnv p;
    private final tmb q;
    public boolean h = false;
    public boolean i = false;
    public dbsg<dwao> j = dbpy.a;
    public dbsg<dqvj> k = dbpy.a;
    public final crzp<uff> e = new crzp(this) { // from class: thq
        private final ths a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            ths thsVar = this.a;
            if (crzmVar.k()) {
                uff uffVar = (uff) crzmVar.l();
                dbsk.s(uffVar);
                if (uffVar.c()) {
                    btlu b = thsVar.l.b();
                    dbsk.s(b);
                    thsVar.a(thsVar.g.b(b, thsVar.k, thsVar.j));
                    thsVar.c();
                    return;
                }
            }
            if (crzmVar.k()) {
                uff uffVar2 = (uff) crzmVar.l();
                dbsk.s(uffVar2);
                if (uffVar2.c()) {
                    return;
                }
                uff uffVar3 = (uff) crzmVar.l();
                dbsk.s(uffVar3);
                thsVar.m = dbsg.i(uffVar3.a());
            }
        }
    };
    public final crzp<dwao> f = new crzp(this) { // from class: thr
        private final ths a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            ths thsVar = this.a;
            boolean d = thsVar.d.a().d();
            btlu b = thsVar.l.b();
            dbsk.s(b);
            if (thsVar.h) {
                thsVar.c();
                thd thdVar = thsVar.g;
                tgs a = thd.a(thdVar.a, b, dbpy.a, dbpy.a);
                ((tgp) a).e = 2;
                thsVar.a(a.a());
            }
            if (thsVar.h || !d) {
                return;
            }
            thsVar.h = true;
            if (!thsVar.i) {
                return;
            }
            thsVar.i = false;
            thsVar.a(thsVar.g.b(b, thsVar.k, thsVar.j));
        }
    };
    public dbsg<btlu> l = dbpy.a;
    public dbsg<dcdc<amvh>> m = dbpy.a;
    public dbsg<dwao> n = dbpy.a;

    public ths(tgw tgwVar, thg thgVar, ufg ufgVar, dxio<tgn> dxioVar, Executor executor, tnv tnvVar, tmb tmbVar, thd thdVar) {
        this.a = tgwVar;
        this.o = thgVar;
        this.b = ufgVar;
        this.c = executor;
        this.d = dxioVar;
        this.p = tnvVar;
        this.q = tmbVar;
        this.g = thdVar;
    }

    @Override // defpackage.tgx
    public final void a(tgv tgvVar) {
        uff l = this.b.a().l();
        dbsk.s(l);
        dcdc<amvh> a = l.a();
        if (!ufe.a(a)) {
            return;
        }
        this.o.b(FetchState.Fetch.c(tgk.IN_PROGRESS));
        if (this.d.a().d()) {
            int f = tgvVar.f();
            if (f == 0) {
                throw null;
            }
            if (f == 1) {
                btlu a2 = tgvVar.a();
                dbsk.s(a2);
                this.q.c(a2, true);
            }
            tgu e = tgvVar.e();
            dwao b = b(tgvVar.a());
            dbsk.s(b);
            dwao a3 = e.a(b);
            if (tgvVar.h()) {
                this.m = dbsg.i(a);
                this.n = dbsg.i(a3);
                c();
            }
            tgf tgfVar = tgvVar.g().a;
            vum vumVar = new vum();
            tgfVar.b(vumVar);
            vumVar.c(a);
            vumVar.a = a3;
            this.a.a(tgvVar, vumVar.a());
        } else if (!tgvVar.h()) {
        } else {
            this.i = true;
        }
    }

    public final dwao b(btlu btluVar) {
        dwao l = this.d.a().a().l();
        dbsk.s(l);
        dbsg<dqvj> c = this.p.c(btluVar);
        return c.a() ? tia.b(l, c.b()) : l;
    }

    public final void c() {
        this.j = dbpy.a;
        this.k = dbpy.a;
    }
}
