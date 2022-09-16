package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pvk  reason: default package */
/* loaded from: classes7.dex */
public final class pvk implements zfl {
    private final dzsj<qbt> A;
    private final dzsj<byej> B;
    public final vnk a;
    public final gga b;
    public final ziv c;
    public final jkf d;
    public final vmv e;
    public final vop f;
    public final cqkf<zbx> g;
    public final cqkf<zbx> h;
    public final cqkf<zbx> i;
    public final cqkf<zbx> j;
    public final dzsj<qce> k;
    public final xkl l;
    public final dxio<uin> m;
    public final qbv n;
    public final Executor o;
    public boolean s;
    @dzsi
    bvpk w;
    private final tmy y;
    private final bvrb z;
    private static final dcqe x = dcqe.c("pvk");
    static final long p = TimeUnit.MINUTES.toMillis(1);
    public final bzgf q = new bzgf(this) { // from class: pvh
        private final pvk a;

        {
            this.a = this;
        }

        @Override // defpackage.bzgf
        public final void a() {
            this.a.y();
        }
    };
    public final bzgj r = new bzgj();
    @dzsi
    public View t = null;
    public int u = 0;
    public final Callable<Integer> v = new pvi(this);

    public pvk(gga ggaVar, jkf jkfVar, vop vopVar, bvrb bvrbVar, dzsj<qce> dzsjVar, dzsj<qbt> dzsjVar2, dzsj<byej> dzsjVar3, ziw ziwVar, Executor executor, dxio<uin> dxioVar, qbv qbvVar, vnk vnkVar, cqkf<zbx> cqkfVar, cqkf<zbx> cqkfVar2, cqkf<zbx> cqkfVar3, cqkf<zbx> cqkfVar4, zbs zbsVar, zie zieVar, vmv vmvVar, bbb bbbVar, tmy tmyVar, bwob bwobVar, vyo vyoVar, @dzsi izl izlVar, xkl xklVar) {
        this.b = ggaVar;
        this.z = bvrbVar;
        this.a = vnkVar;
        this.y = tmyVar;
        this.k = dzsjVar;
        this.A = dzsjVar2;
        this.B = dzsjVar3;
        this.e = vmvVar;
        this.d = jkfVar;
        this.f = vopVar;
        this.g = cqkfVar;
        this.h = cqkfVar2;
        this.i = cqkfVar3;
        this.j = cqkfVar4;
        this.l = xklVar;
        this.m = dxioVar;
        this.n = qbvVar;
        this.o = executor;
        jjn L = jkfVar.l().L();
        Activity activity = (Activity) ((dxjd) ziwVar.a).a;
        ziw.a(activity, 1);
        vnp a = ziwVar.b.a();
        ziw.a(a, 2);
        vmh a2 = ziwVar.c.a();
        ziw.a(a2, 3);
        cjqy a3 = ziwVar.d.a();
        ziw.a(a3, 4);
        bvjj a4 = ziwVar.e.a();
        ziw.a(a4, 5);
        zka a5 = ziwVar.f.a();
        ziw.a(a5, 6);
        zqi a6 = ziwVar.g.a();
        ziw.a(a6, 7);
        zny a7 = ziwVar.h.a();
        ziw.a(a7, 8);
        zlb a8 = ziwVar.i.a();
        ziw.a(a8, 9);
        zky a9 = ziwVar.j.a();
        ziw.a(a9, 10);
        cqat a10 = ziwVar.k.a();
        ziw.a(a10, 11);
        zuz a11 = ziwVar.l.a();
        ziw.a(a11, 12);
        vmz a12 = ziwVar.m.a();
        ziw.a(a12, 13);
        ziw.a(L, 14);
        ziw.a(this, 15);
        ziw.a(bbbVar, 16);
        ziw.a(zbsVar, 17);
        ziw.a(zieVar, 18);
        ziw.a(bwobVar, 19);
        ziw.a(vyoVar, 20);
        ziw.a(dxioVar, 21);
        ziw.a(xklVar, 23);
        this.c = new ziv(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, L, this, bbbVar, zbsVar, zieVar, bwobVar, vyoVar, dxioVar, izlVar, xklVar);
    }

    private final void B() {
        vop vopVar = this.f;
        zbv e = this.c.e();
        zdv zdvVar = null;
        if (e != null) {
            zdv k = e.k();
            if (k != null) {
                zdvVar = k;
            } else {
                zcn l = e.l();
                if (l != null) {
                    zdvVar = l.c();
                }
            }
        }
        vopVar.d = zdvVar;
        dzrn<dzqo> it = ((dzqc) ((dzqd) vopVar.b).g()).iterator();
        while (it.hasNext()) {
            dzqo next = it.next();
            if (zdvVar == null || !((dqvj) next.getKey()).equals(zdvVar.c())) {
                ((vok) next.getValue()).d();
            } else {
                ((vok) next.getValue()).c(zdvVar.b());
            }
        }
    }

    @Override // defpackage.zcw
    public final void A(cjqm cjqmVar) {
        this.d.w();
        this.e.h(dqvj.TAXI, yys.b(cjqmVar));
    }

    public final boolean a() {
        zbv e = this.c.e();
        zbz i = e != null ? e.i() : null;
        return (i == null || i.g() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.c.b().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        zbv e = this.c.e();
        if (this.c.a().booleanValue() && e != null) {
            if (e.d().booleanValue()) {
                return true;
            }
            if (e.f().booleanValue()) {
                zcn l = e.l();
                dbsk.s(l);
                if (!l.d().booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d() {
        zbv e = this.c.e();
        return this.c.a().booleanValue() && e != null && e.b().booleanValue();
    }

    public final boolean e() {
        return !f() && this.c.a().booleanValue() && !this.c.d().get(this.c.f().intValue()).j().booleanValue();
    }

    public final boolean f() {
        btpf c = btpf.c(this.b);
        return c.e && c.f;
    }

    public final boolean g() {
        return btpf.c(this.b).f;
    }

    @Override // defpackage.qbp
    public final void h(dwao dwaoVar, @dzsi dnqh dnqhVar) {
        this.e.n(dwaoVar, dnqhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jjn i() {
        if (f()) {
            return jjn.FULLY_EXPANDED;
        }
        if (this.c.a().booleanValue()) {
            return jjn.COLLAPSED;
        }
        if (!this.c.b().booleanValue()) {
            return jjn.COLLAPSED;
        }
        return g() ? jjn.FULLY_EXPANDED : jjn.EXPANDED;
    }

    public final zxo j() {
        return (zxo) this.g.c();
    }

    public final void k() {
        if (this.a.bw() == 1) {
            this.c.l(this.y.e());
        }
        this.c.m(this.a);
        B();
    }

    public final void l() {
        if (this.c.a().booleanValue()) {
            this.g.e(this.c);
        } else {
            this.g.e(null);
        }
        if (this.c.b().booleanValue()) {
            this.h.e(this.c);
        } else {
            this.h.e(null);
        }
        this.i.e(this.c);
        this.j.e(this.c);
        this.t = null;
        B();
    }

    public final jkh m() {
        ziv zivVar = this.c;
        zivVar.v();
        return zivVar;
    }

    @Override // defpackage.zfe
    public final void n(amuo amuoVar) {
        amub o = this.c.o();
        if (!this.s || o == null) {
            return;
        }
        vwn d = this.a.l().d();
        amte p2 = d.p();
        qbt a = this.A.a();
        if (p2 == null || a == null) {
            return;
        }
        int i = o.c;
        a.D(p2, i, d.r(i), amuoVar);
    }

    @Override // defpackage.zfe
    public final void o(int i, int i2) {
        if (!this.s || this.c.o() == null) {
            return;
        }
        this.e.v(i2);
    }

    @Override // defpackage.zfb
    public final void p(amwb amwbVar, akra akraVar, akqs akqsVar) {
        if (!this.s) {
            return;
        }
        this.d.w();
        byej a = this.B.a();
        if (a == null) {
            return;
        }
        a.i(amwbVar, akraVar, akqsVar);
    }

    @Override // defpackage.zfc
    public final void q(int i, cjqm cjqmVar) {
        this.e.e(i, yys.b(cjqmVar));
    }

    @Override // defpackage.zfl
    public final void r() {
        if (!this.s) {
            return;
        }
        amub o = this.c.o();
        amve amveVar = o == null ? null : o.d;
        if (amveVar == null) {
            return;
        }
        List<pyx> d = pyy.d(amveVar);
        if (d.isEmpty()) {
            bvoo.h("Empty agency info should not be clickable.", new Object[0]);
            return;
        }
        qbt a = this.A.a();
        if (a == null) {
            return;
        }
        a.p(d);
    }

    @Override // defpackage.zfl
    public final void s(List<GmmNotice> list, qda qdaVar) {
        qbt a = this.A.a();
        if (a != null) {
            a.q(null, list, qdaVar, null);
        }
    }

    @Override // defpackage.zfd
    public final void t(@dzsi qcd qcdVar) {
        vun ae = this.a.ae();
        vwn d = this.a.l().d();
        amte p2 = d.p();
        dzsj<qce> dzsjVar = this.k;
        if (dzsjVar == null || ae == null || p2 == null) {
            return;
        }
        dzsjVar.a().e(ae, p2, d.e(), qcdVar);
    }

    public final void u() {
        jjn jjnVar;
        if (!this.s) {
            return;
        }
        jjn L = this.d.l().L();
        if (this.c.b().booleanValue()) {
            jjn jjnVar2 = jjn.HIDDEN;
            int ordinal = L.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (g()) {
                        jjnVar = jjn.COLLAPSED;
                    }
                } else {
                    jjnVar = jjn.COLLAPSED;
                }
            }
            jjnVar = jjn.EXPANDED;
        } else {
            jjnVar = !L.b() ? jjn.FULLY_EXPANDED : jjn.COLLAPSED;
        }
        this.d.B(jjnVar);
    }

    public final boolean v() {
        synchronized (this.a) {
            dtja ap = this.a.ap();
            dtjs aq = this.a.aq();
            if (this.a.bw() != 1 || ap == null || aq == null) {
                return false;
            }
            this.c.l(this.y.e());
            this.y.f(ap, aq, this.a.au(), this.a.as());
            return true;
        }
    }

    @dzsi
    public final View w() {
        if (!this.c.b().booleanValue()) {
            return null;
        }
        return cqkx.o(this.c.q().get(this.c.i().intValue()));
    }

    public final void x() {
        bvpk a = bvpk.a(new pvj(this));
        this.z.a(a, bvrj.UI_THREAD, p);
        this.w = a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        this.c.r();
    }

    @Override // defpackage.zcz
    public final void z() {
        this.d.B(jjn.COLLAPSED);
    }
}
