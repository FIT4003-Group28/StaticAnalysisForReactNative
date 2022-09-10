package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpza  reason: default package */
/* loaded from: classes4.dex */
public class bpza {
    private final bqgw a;
    private final bpyy b;
    private final akox d;
    private final alec e;
    private final akpq f;
    private final akzh g;
    @dzsi
    private akuh h;
    @dzsi
    private akuh i;
    @dzsi
    private akte j;
    @dzsi
    private akte k;
    @dzsi
    private bpyz l;
    private int n = 2;
    @dzsi
    private akqq c = null;
    private final List<akta> m = new ArrayList();

    public bpza(bqgw bqgwVar, bpyy bpyyVar, akox akoxVar, alec alecVar, akpq akpqVar, akzh akzhVar) {
        this.a = bqgwVar;
        this.b = bpyyVar;
        this.d = akoxVar;
        this.e = alecVar;
        this.f = akpqVar;
        this.g = akzhVar;
    }

    private final void g() {
        this.d.D(this.n == 2);
    }

    private final void h(List<akqq> list) {
        dmqx a;
        l();
        if (list.isEmpty() || this.c == null) {
            return;
        }
        akra f = akra.f(list.get(list.size() - 1));
        akqq akqqVar = this.c;
        dbsk.s(akqqVar);
        akrk d = akrk.d(f, akra.f(akqqVar));
        if (this.h == null) {
            if (this.n == 1) {
                a = bpzc.b();
            } else {
                a = bpzc.a();
            }
            this.h = i(a, this.d);
        }
        this.j = j(d, this.h);
    }

    private static aktg i(dmqx dmqxVar, akox akoxVar) {
        return akoxVar.aj().aF().e().c(dmqxVar);
    }

    private final akte j(akrk akrkVar, akuh akuhVar) {
        akoq aj = this.d.aj();
        akte c = aj.aj().c(akrkVar.q(), akuhVar, 0, 0, 2, 2, 3);
        aj.aF().c().f(c);
        return c;
    }

    private final void k() {
        bpyz bpyzVar = this.l;
        if (bpyzVar != null) {
            this.f.c(bpyzVar);
            this.l = null;
        }
    }

    private final void l() {
        akte akteVar = this.j;
        if (akteVar != null) {
            akteVar.i();
            this.j.j();
            this.j = null;
        }
    }

    private final void m() {
        akte akteVar = this.k;
        if (akteVar != null) {
            akteVar.i();
            this.k.j();
            this.k = null;
        }
        this.e.c(this.m);
        this.m.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        g();
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized akqq b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(akqq akqqVar) {
        this.c = akqqVar;
        h(this.a.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        List<akqq> f = this.a.f();
        h(f);
        m();
        if (!f.isEmpty()) {
            if (f.size() > 1) {
                ArrayList arrayList = new ArrayList(f.size());
                for (akqq akqqVar : f) {
                    arrayList.add(akra.f(akqqVar));
                }
                akrk e = akrk.e(arrayList);
                if (this.i == null) {
                    this.i = i(bpzc.c(), this.d);
                }
                this.k = j(e, this.i);
            }
            if (this.b == bpyy.LINE_AND_POINTS) {
                List<aldl> a = aldn.a(f);
                int c = bntp.POLYLINE_MEASLES.c();
                for (aldl aldlVar : a) {
                    this.m.add(this.e.a(aldlVar, c));
                }
            }
        }
        k();
        if (!this.m.isEmpty()) {
            bpyz bpyzVar = new bpyz(dcdc.r(this.m), this.g, this.f);
            this.l = bpyzVar;
            this.f.a(bpyzVar);
            this.f.b(this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        k();
        m();
        l();
        akvz e = this.d.aj().aF().e();
        akuh akuhVar = this.i;
        if (akuhVar != null) {
            e.j(akuhVar);
            this.i = null;
        }
        akuh akuhVar2 = this.h;
        if (akuhVar2 != null) {
            e.j(akuhVar2);
            this.h = null;
        }
        this.d.D(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(int i) {
        if (this.n != i) {
            this.n = i;
            g();
            this.h = null;
            h(this.a.f());
        }
    }
}
