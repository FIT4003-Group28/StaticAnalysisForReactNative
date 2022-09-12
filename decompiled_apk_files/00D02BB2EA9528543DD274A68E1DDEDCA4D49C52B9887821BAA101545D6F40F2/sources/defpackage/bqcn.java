package defpackage;

import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bqcn  reason: default package */
/* loaded from: classes4.dex */
public final class bqcn {
    private static final dcqe l = dcqe.c("bqcn");
    @dzsi
    private akta B;
    public final Executor a;
    public bqgw c;
    int d;
    public int k;
    private final zzn m;
    private final gga n;
    private final btrm o;
    private final akzh p;
    private final alhv q;
    private final bpsj r;
    private final akox s;
    private final bpyj t;
    @dzsi
    private akuh u;
    @dzsi
    private akuh v;
    @dzsi
    private akuh w;
    @dzsi
    private akte x;
    @dzsi
    private akte z;
    private final List<dbsi<akte, akta>> y = new ArrayList();
    public final List<akta> b = new ArrayList();
    private final List<akta> A = new ArrayList();
    @dzsi
    private akqq C = null;
    private dbsg<bqhj> D = dbpy.a;
    public boolean e = false;
    boolean f = false;
    boolean g = false;
    public final AtomicInteger h = new AtomicInteger(0);
    private boolean E = false;
    private int F = -1;
    private int H = 2;
    final bqcm i = new bqcm(this);
    private final alht G = new bqcd(this);
    final akzt j = new bqce(this);

    public bqcn(bqhf bqhfVar, zzn zznVar, Executor executor, gga ggaVar, btrm btrmVar, akzh akzhVar, alhv alhvVar, bpsj bpsjVar, akox akoxVar, bpyj bpyjVar) {
        this.d = -1;
        this.m = zznVar;
        this.a = executor;
        this.n = ggaVar;
        this.o = btrmVar;
        this.p = akzhVar;
        this.q = alhvVar;
        this.r = bpsjVar;
        this.s = akoxVar;
        this.t = bpyjVar;
        this.c = bqhfVar.b();
        this.k = bqhfVar.c();
        this.d = bqhfVar.a();
    }

    private final void A() {
        if (this.v != null) {
            B(this.s).j(this.v);
            this.v = null;
        }
    }

    private static akvz B(akox akoxVar) {
        return akoxVar.aj().aF().e();
    }

    private final akte C(akrk akrkVar, akuh akuhVar, int i) {
        akoq aj = this.s.aj();
        akte c = aj.aj().c(akrkVar.q(), akuhVar, i, 0, 2, 2, 3);
        aj.aF().c().f(c);
        return c;
    }

    private final boolean D(akqq akqqVar) {
        List<akqq> f = this.c.f();
        if (f.isEmpty()) {
            return true;
        }
        akqq akqqVar2 = f.get(0);
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        if (i == 2) {
            akqqVar2 = f.get(f.size() - 1);
        } else if (i == 4) {
            akqqVar2 = f.get(this.d);
        } else {
            bvoo.h("This should not happen. ", new Object[0]);
        }
        return !akqq.v(akqqVar, akqqVar2, 0.1d);
    }

    private final void E() {
        if (this.B != null) {
            aksp b = this.s.aj().aF().b();
            akta aktaVar = this.B;
            dbsk.s(aktaVar);
            b.a(aktaVar);
            this.B = null;
        }
    }

    private final void F() {
        akte akteVar = this.x;
        if (akteVar != null) {
            akteVar.i();
            this.x.j();
            this.x = null;
        }
    }

    private final void G() {
        for (dbsi<akte, akta> dbsiVar : this.y) {
            dbsiVar.a.i();
            dbsiVar.a.j();
            I(dcdc.f(dbsiVar.b));
        }
        this.y.clear();
    }

    private final void H() {
        akte akteVar = this.z;
        if (akteVar != null) {
            akteVar.i();
            this.z.j();
            this.z = null;
        }
        I(this.b);
        this.b.clear();
        I(this.A);
        this.A.clear();
    }

    private final void I(List<akta> list) {
        for (akta aktaVar : list) {
            this.s.aj().aF().b().a(aktaVar);
        }
    }

    private final void J(akqq akqqVar) {
        this.h.getAndIncrement();
        this.s.q(akyt.g(akqqVar), this.j);
    }

    private final bqhj K() {
        if (this.D.a()) {
            return this.D.b();
        }
        akqq akqqVar = this.C;
        dbsk.s(akqqVar);
        return bqhj.e(akqqVar);
    }

    private final void q() {
        if (!this.f) {
            this.q.b(this.G);
            btrm btrmVar = this.o;
            bqcm bqcmVar = this.i;
            dceq a = dcet.a();
            a.b(alhw.class, new bqcp(alhw.class, bqcmVar, bvrj.UI_THREAD));
            btrmVar.g(bqcmVar, a.a());
        }
        this.f = true;
    }

    private final boolean r() {
        return this.c.f().size() >= 100;
    }

    private final void t() {
        F();
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        if (i != 2 || this.h.get() != 0) {
            return;
        }
        List<akqq> f = this.c.f();
        if (f.isEmpty() || f.isEmpty() || this.C == null) {
            return;
        }
        akqq akqqVar = f.get(f.size() - 1);
        akqq a = K().a();
        if (akqq.v(akqqVar, a, 0.1d)) {
            return;
        }
        akrk d = akrk.d(akra.f(akqqVar), akra.f(a));
        if (this.u == null) {
            int i2 = this.H;
            if (i2 == 0) {
                throw null;
            }
            this.u = y(i2 == 2 ? bpzc.a() : bpzc.b(), this.s);
        }
        this.x = C(d, this.u, 21);
    }

    private final void u(List<akqq> list) {
        G();
        this.F = (int) this.p.k();
        if (list.size() <= 1) {
            return;
        }
        if (this.d != 0) {
            v(list.get(0), list.get(1), true);
        }
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        if (i == 2 || this.d == list.size() - 1) {
            return;
        }
        v((akqq) dcft.s(list), list.get(list.size() - 2), false);
    }

    private final void v(akqq akqqVar, akqq akqqVar2, boolean z) {
        dmqx d;
        dbsg<akqq> a = this.r.a(akqqVar, akqqVar2);
        if (!a.a()) {
            return;
        }
        akrk d2 = akrk.d(akra.f(akqqVar), akra.f(a.b()));
        if (this.v == null) {
            int i = this.H;
            if (i == 0) {
                throw null;
            }
            if (i == 2) {
                d = bpzc.d(-7303024, -986896);
            } else {
                d = bpzc.d(-12566464, -9408400);
            }
            this.v = y(d, this.s);
        }
        akte C = C(d2, this.v, 22);
        bpyj bpyjVar = this.t;
        akta a2 = bpyjVar.a(a.b(), bpyjVar.b(), 16, 2);
        this.y.add(dbsi.a(C, a2));
        a2.Pt(new bqcg(this, a, z));
    }

    private final void w() {
        dafk b = ckos.b(this.n.findViewById(16908290), R.string.MISSING_ROAD_POLYLINE_MAX_POINTS_REACHED, 0);
        b.s(this.n.getResources().getColor(R.color.qu_daynight_white));
        b.u(this.n.getResources().getColor(R.color.mod_daynight_blue600));
        b.c();
    }

    private final dbsg<akqq> x(int i) {
        akqq akqqVar;
        List<akqq> f = this.c.f();
        if (f.isEmpty()) {
            return dbpy.a;
        }
        akqq akqqVar2 = f.get(i);
        int i2 = 1;
        if (f.size() > 1) {
            if (i != 0) {
                i2 = i - 1;
            }
            akqqVar = f.get(i2);
        } else {
            akqqVar = new akqq(akqqVar2.a - 9.999999747378752E-5d, akqqVar2.b);
        }
        return this.r.a(akqqVar2, akqqVar);
    }

    private static aktg y(dmqx dmqxVar, akox akoxVar) {
        return B(akoxVar).c(dmqxVar);
    }

    private final void z() {
        if (this.u != null) {
            B(this.s).j(this.u);
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        q();
        View b = this.m.b();
        if (b != null) {
            b.setClickable(true);
            b.setImportantForAccessibility(2);
        }
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.E = true;
        n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        this.E = false;
        this.g = false;
        o();
        akvz B = B(this.s);
        akuh akuhVar = this.w;
        if (akuhVar != null) {
            B.j(akuhVar);
            this.w = null;
        }
        View b = this.m.b();
        if (b != null) {
            b.setClickable(false);
            b.setImportantForAccessibility(1);
        }
        z();
        A();
        bpyj bpyjVar = this.t;
        akvz e = bpyjVar.a.aj().aF().e();
        Pair<akuh, Bitmap> pair = bpyjVar.b;
        if (pair != null) {
            e.j((akuh) pair.first);
            bpyjVar.b = null;
        }
        Pair<akuh, Bitmap> pair2 = bpyjVar.c;
        if (pair2 != null) {
            e.j((akuh) pair2.first);
            bpyjVar.c = null;
        }
        Pair<akuh, Bitmap> pair3 = bpyjVar.d;
        if (pair3 != null) {
            e.j((akuh) pair3.first);
            bpyjVar.d = null;
        }
        Pair<akuh, Bitmap> pair4 = bpyjVar.e;
        if (pair4 != null) {
            e.j((akuh) pair4.first);
            bpyjVar.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(bqgw bqgwVar) {
        this.c = bqgwVar;
        this.k = bqgwVar.f().isEmpty() ? 2 : 3;
        this.d = -1;
        e();
        q();
    }

    public final boolean f() {
        return this.c.f().size() >= 2;
    }

    public final synchronized void g() {
        if (this.C == null) {
            return;
        }
        if (r()) {
            w();
            return;
        }
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        if (i == 4) {
            dbsg<akqq> x = x(this.d);
            if (x.a()) {
                J(x.b());
                if (this.d == 0) {
                    this.c.i();
                }
                this.d = -1;
                this.k = 2;
                n();
                j();
            }
        } else {
            int size = this.c.f().size();
            this.c.g(K());
            j();
            if (this.D.a()) {
                J(this.D.b().a());
                return;
            }
            dbsg<akqq> x2 = x(size);
            if (x2.a()) {
                J(x2.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h() {
        int i = this.d;
        if (i == -1) {
            this.a.execute(new Runnable(this) { // from class: bqcc
                private final bqcn a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bqcn bqcnVar = this.a;
                    bqcnVar.k(bqcnVar.c.f().size() - 1);
                }
            });
            return;
        }
        this.c.h(i);
        if (this.c.f().isEmpty()) {
            this.d = -1;
        } else {
            this.d = Math.max(this.d - 1, 0);
        }
        j();
        if (this.d == -1) {
            return;
        }
        J(this.c.f().get(this.d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(akqq akqqVar, dbsg<bqhj> dbsgVar) {
        this.D = dbsgVar;
        this.C = akqqVar;
        e();
        if (this.h.get() == 0 && this.E) {
            if (this.F != ((int) this.p.k())) {
                u(this.c.f());
            }
            int i = this.k;
            if (i == 0) {
                throw null;
            }
            if (i != 4 || this.d == -1 || !D(K().a())) {
                t();
                s();
                return;
            }
            bqgw bqgwVar = this.c;
            bqgwVar.a.set(this.d, K());
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void j() {
        Pair<akuh, Bitmap> pair;
        if (!this.g) {
            return;
        }
        e();
        t();
        u(this.c.f());
        List<akqq> f = this.c.f();
        H();
        if (!f.isEmpty()) {
            int i = 0;
            if (f.size() > 1) {
                ArrayList arrayList = new ArrayList(f.size());
                for (akqq akqqVar : f) {
                    arrayList.add(akra.f(akqqVar));
                }
                akrk e = akrk.e(arrayList);
                if (this.w == null) {
                    this.w = y(bpzc.c(), this.s);
                }
                this.z = C(e, this.w, 100);
            }
            while (i < f.size()) {
                akqq akqqVar2 = f.get(i);
                bpyj bpyjVar = this.t;
                int i2 = this.d;
                if (i2 == i) {
                    if (bpyjVar.d == null) {
                        bpyjVar.d = bpyjVar.c(2131232374, 6, R.color.mod_daynight_blue600, R.color.white_slightly_transparent);
                    }
                    pair = bpyjVar.d;
                } else {
                    if (bpyjVar.c == null) {
                        bpyjVar.c = bpyjVar.c(2131232252, 6, R.color.mod_daynight_blue600, R.color.white_slightly_transparent);
                    }
                    pair = bpyjVar.c;
                }
                akta a = bpyjVar.a(akqqVar2, pair, 32, i2 != i ? 3 : 4);
                if (this.d == i) {
                    a.c(a.d());
                    if (this.e) {
                        a.i();
                    }
                }
                this.b.add(a);
                a.Pt(new bqci(this));
                i++;
            }
            for (int i3 = 1; i3 < f.size(); i3++) {
                akra I = akra.f(f.get(i3)).I(akra.f(f.get(i3 - 1)), 0.5f);
                bpyj bpyjVar2 = this.t;
                akta a2 = bpyjVar2.a(I.S(), bpyjVar2.b(), 16, 1);
                a2.Pt(new bqck(this, I, i3));
                this.A.add(a2);
            }
        }
        s();
    }

    public final synchronized void k(int i) {
        if (i >= 0) {
            if (i < this.c.f().size()) {
                J(this.c.f().get(i));
                this.k = 4;
                this.d = i;
                n();
                j();
                return;
            }
        }
        bvoo.h("This should not happen. Trying to select at invalid index.", new Object[0]);
    }

    public final synchronized void l(dbsg<akqq> dbsgVar, boolean z) {
        if (r()) {
            w();
            return;
        }
        J(dbsgVar.b());
        this.k = 2;
        if (z) {
            this.c.i();
        }
        this.d = -1;
        n();
        j();
    }

    public final synchronized void m(akra akraVar, int i) {
        if (r()) {
            w();
            return;
        }
        J(akraVar.S());
        this.k = 4;
        View b = this.m.b();
        if (b != null) {
            b.setVisibility(0);
        }
        bqgw bqgwVar = this.c;
        bqgwVar.a.add(i, bqhj.e(akraVar.S()));
        this.d = i;
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void o() {
        H();
        F();
        G();
        E();
        this.F = -1;
        if (this.f) {
            this.o.a(this.i);
            this.q.c(this.G);
        }
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void p(int i) {
        if (this.H != i) {
            this.H = i;
            z();
            A();
        }
    }

    public final void n() {
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        int i2 = 4;
        if ((i != 4 || this.e) && ((i != 4 || this.d != -1) && i != 3 && i != 5)) {
            i2 = 0;
        }
        View b = this.m.b();
        if (b == null) {
            return;
        }
        b.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bqcl e() {
        /*
            r6 = this;
            akqq r0 = r6.C
            r1 = -1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != 0) goto La
        L8:
            r0 = 0
            goto L34
        La:
            int r0 = r6.k
            if (r0 == 0) goto L58
            r5 = 3
            if (r0 != r5) goto L12
            goto L8
        L12:
            r5 = 4
            if (r0 != r5) goto L28
            int r0 = r6.d
            if (r0 == 0) goto L26
            bqgw r5 = r6.c
            java.util.List r5 = r5.f()
            int r5 = r5.size()
            int r5 = r5 + r1
            if (r0 != r5) goto L8
        L26:
            r0 = 1
            goto L34
        L28:
            bqhj r0 = r6.K()
            akqq r0 = r0.a()
            boolean r0 = r6.D(r0)
        L34:
            int r5 = r6.k
            if (r5 == 0) goto L57
            r2 = 2
            if (r5 != r2) goto L48
            bqgw r1 = r6.c
            java.util.List r1 = r1.f()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4d
            goto L4e
        L48:
            int r2 = r6.d
            if (r2 == r1) goto L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            boolean r1 = r6.f()
            bqcl r0 = defpackage.bqcl.d(r0, r3, r1)
            return r0
        L57:
            throw r2
        L58:
            goto L5a
        L59:
            throw r2
        L5a:
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqcn.e():bqcl");
    }

    private final void s() {
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        if (i != 3 && this.D.a()) {
            int i2 = this.k;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != 2 || D(this.D.b().a())) {
                int i3 = this.k;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 != 4 || this.e) {
                    akta aktaVar = this.B;
                    if (aktaVar != null) {
                        aksz d = aktaVar.d();
                        d.b(akra.f(this.D.b().a()));
                        akta aktaVar2 = this.B;
                        dbsk.s(aktaVar2);
                        aktaVar2.c(d);
                        return;
                    }
                    bpyj bpyjVar = this.t;
                    akqq a = this.D.b().a();
                    if (bpyjVar.e == null) {
                        bpyjVar.e = bpyjVar.c(2131232768, 3, R.color.mod_daynight_blue600, R.color.qu_daynight_grey_200);
                    }
                    this.B = bpyjVar.a(a, bpyjVar.e, 16, 5);
                    return;
                }
            }
        }
        E();
    }
}
