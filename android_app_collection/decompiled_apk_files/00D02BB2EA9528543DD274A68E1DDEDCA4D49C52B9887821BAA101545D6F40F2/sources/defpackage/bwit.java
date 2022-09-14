package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bwit  reason: default package */
/* loaded from: classes4.dex */
public class bwit implements bwjw, nxa, oxf {
    public final bwnj b;
    public final bwpn c;
    final nup d;
    @dzsi
    public Runnable e;
    public final bwjz f;
    public final eeu g;
    private boolean j;
    private boolean l;
    private final btrm n;
    private final dxio<akfa> o;
    private final bvrb p;
    private final ahjq q;
    private final bwjx r;
    private final ckcw s;
    private static final dcqe h = dcqe.c("bwit");
    public static final String a = bwit.class.getSimpleName();
    private final bwis i = new bwis(this);
    private final Map<bwnh, nxo> k = dcjz.j();
    private final ArrayList<bwnq> m = new ArrayList<>();

    public bwit(bwnj bwnjVar, gga ggaVar, bwpn bwpnVar, nxd nxdVar, cjzo cjzoVar, cjqy cjqyVar, bwjz bwjzVar, btrm btrmVar, dxio dxioVar, eeu eeuVar, bvrb bvrbVar, nut nutVar, qbt qbtVar, ahjq ahjqVar, ckcw ckcwVar, bwjy bwjyVar) {
        bwnjVar.T();
        this.f = bwjzVar;
        this.n = btrmVar;
        this.o = dxioVar;
        this.p = bvrbVar;
        this.q = ahjqVar;
        this.g = eeuVar;
        this.s = ckcwVar;
        this.b = bwnjVar;
        this.r = bwjyVar.a(new bwio());
        this.c = bwpnVar;
        if (dxioVar != null) {
            bwnjVar.O(((akfa) dxioVar.a()).o());
        }
        this.d = new nvg(ggaVar, cjzoVar, cjqyVar, btrmVar, dczx.a(nutVar), dczx.a(qbtVar), nxl.ODELAY, nxdVar, this);
    }

    private final void k(bwnq bwnqVar) {
        ckhf p = p();
        if (p != null) {
            ((ckhe) this.s.a(p)).c();
        }
        if (this.j) {
            if (!bwnqVar.h && bwnqVar.g == null) {
                this.b.r(bwnqVar.a);
            }
            List<dtmr> list = bwnqVar.i;
            dtnh dtnhVar = bwnqVar.f;
            dtod dtodVar = null;
            String str = (dtnhVar == null || (dtnhVar.a & 16) == 0) ? null : dtnhVar.e;
            bwnl bwnlVar = bwnqVar.a;
            boolean z = bwnqVar.h;
            dvnp dvnpVar = bwnqVar.j ? dvnp.START_PAGE : null;
            bttq bttqVar = bwnqVar.g;
            bwnm bwnmVar = new bwnm(str, dvnpVar);
            dccx F = dcdc.F();
            for (dtmr dtmrVar : list) {
                bwnf bwnfVar = new bwnf(dtmrVar, str, dvnpVar);
                this.b.J(bwnlVar, bwnfVar);
                F.g(bwnd.f(bwnfVar));
            }
            dcdc f = F.f();
            f.size();
            bvrj.UI_THREAD.c();
            if (!f.isEmpty()) {
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    nxo nxoVar = (nxo) f.get(i);
                    if (l(nxoVar)) {
                        if (this.g.b()) {
                            ArrayList<dtoh> a2 = dchl.a();
                            for (bwnf bwnfVar2 : nxoVar.a) {
                                a2.addAll(bwnfVar2.a().k);
                            }
                            for (dtoh dtohVar : a2) {
                                dthb dthbVar = dtohVar.a;
                                if (dthbVar == null) {
                                    dthbVar = dthb.F;
                                }
                                if ((dthbVar.a & 4) != 0) {
                                    dthb dthbVar2 = dtohVar.a;
                                    if (dthbVar2 == null) {
                                        dthbVar2 = dthb.F;
                                    }
                                    dtlv dtlvVar = dthbVar2.e;
                                    if (dtlvVar == null) {
                                        dtlvVar = dtlv.f;
                                    }
                                    String str2 = dtlvVar.a;
                                    bwnn a3 = this.r.a(dtiy.GMM_PREFETCH_ON_RENDER, dcdc.f(bwnd.a(dtlvVar.d)), new bwnl(dtlvVar.a));
                                    a3.d(this.b.B());
                                    a3.c(this.b.D());
                                    a3.b(this.b.F());
                                    this.f.i(a3.a(), this);
                                }
                            }
                        } else {
                            this.b.s();
                        }
                    }
                }
            }
            if (list != null) {
                if (!list.isEmpty()) {
                    dtmr dtmrVar2 = list.get(0);
                    if ((dtmrVar2.a & 256) != 0 && (dtodVar = dtmrVar2.i) == null) {
                        dtodVar = dtod.a;
                    }
                }
                if (dtodVar != null) {
                    this.b.S(dtodVar);
                }
            }
            this.c.z(list, bwnmVar);
            this.c.y(bttqVar);
            this.b.V();
            o();
            this.d.s();
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
            bvmn bvmnVar = bvmo.a;
        }
    }

    private final boolean l(nxo nxoVar) {
        List<nxn> c = nxoVar.c();
        if (c.isEmpty()) {
            return false;
        }
        nxo nxoVar2 = this.k.get(nxoVar.d());
        if (nxoVar2 != null) {
            if (!nxoVar.e() && !nxoVar.f()) {
                return false;
            }
            if (nxoVar.e()) {
                nxoVar2.b(nxoVar);
                this.c.D(nxoVar.c());
            } else if (!nxoVar.f()) {
                return false;
            } else {
                nxoVar2.a(nxoVar);
                m(c);
                n(nxoVar);
            }
        } else {
            n(nxoVar);
            m(c);
        }
        dthb dthbVar = nxoVar.b;
        if (dthbVar == null) {
            return true;
        }
        this.b.u();
        this.b.t(dthbVar);
        return true;
    }

    private final void m(List<nxn> list) {
        bwne R = this.b.R();
        for (nxn nxnVar : list) {
            nxnVar.f = this.d.o(new nun(nxnVar.b, nxnVar.d, nxnVar.e), nxnVar.a(R));
        }
        this.c.D(list);
    }

    private final void n(nxo nxoVar) {
        this.k.put(nxoVar.d(), nxoVar);
    }

    private final void o() {
        boolean z = true;
        boolean z2 = !this.b.s().isEmpty();
        if (!this.b.N() || (!z2 && this.b.u() == null)) {
            z = false;
        }
        this.c.v(z);
    }

    @dzsi
    private final ckhf p() {
        dtja dtjaVar = dtja.INVALID_UI_TYPE;
        int ordinal = this.b.b().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3 && ordinal != 4 && ordinal != 5 && ordinal != 8) {
                    if (ordinal == 19) {
                        return ckhi.R;
                    }
                    return null;
                }
            } else if (this.b.h()) {
                return ckhi.f;
            }
            return ckeq.q;
        }
        return ckjw.av;
    }

    @Override // defpackage.bwjw
    public final void a(bwnq bwnqVar) {
        if (this.j && this.b.n(bwnqVar.a) && bwnqVar.b == this.b.b()) {
            this.b.ad();
            if (!dbsd.a(null, bwnqVar.c) || this.b.d() != bwnqVar.d || this.b.j() != bwnqVar.e) {
                return;
            }
            bvmn bvmnVar = bvmo.a;
            if (this.l) {
                this.m.add(bwnqVar);
            } else {
                k(bwnqVar);
            }
        }
    }

    @Override // defpackage.oxf
    public final void aS() {
        dthb u = this.b.u();
        if (u != null) {
            this.b.t(null);
            this.p.b(new bwir(this, u), bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.bwjw
    public final void b() {
    }

    @Override // defpackage.nxa
    public final void c() {
        synchronized (this.b) {
            bwnl q = this.b.q();
            this.b.t(null);
            this.b.L();
            this.b.o();
            if (q != null) {
                this.b.p(q);
            }
        }
        j();
    }

    public final void d() {
        bvrj.UI_THREAD.c();
        if (this.j) {
            bvoo.h("onStart was called multiple times.", new Object[0]);
            return;
        }
        this.j = true;
        this.c.x(this);
        this.d.f();
        btrm btrmVar = this.n;
        bwis bwisVar = this.i;
        dceq a2 = dcet.a();
        a2.b(gds.class, new bwiu(0, gds.class, bwisVar, bvrj.UI_THREAD));
        a2.b(amqo.class, new bwiu(1, amqo.class, bwisVar, bvrj.UI_THREAD));
        btrmVar.g(bwisVar, a2.a());
    }

    public final void e() {
        bvrj.UI_THREAD.c();
        this.n.a(this.i);
        this.d.g();
        this.c.x(null);
        this.f.j(this);
        this.m.clear();
        this.j = false;
    }

    public final void f(boolean z) {
        if (this.f == null || !this.g.b()) {
            this.b.s();
            return;
        }
        this.m.clear();
        synchronized (this.b) {
            if (this.b.b() == null) {
                return;
            }
            Set<bwnl> s = this.b.s();
            dcdc f = dcdc.f(this.b.b());
            for (bwnl bwnlVar : s) {
                bwnn a2 = this.r.a(dtiy.FETCH_ON_DEMAND, f, bwnlVar);
                bwnj bwnjVar = this.b;
                a2.f = bwnjVar.a;
                a2.d(bwnjVar.B());
                a2.c(this.b.D());
                a2.c = this.b.d();
                a2.d = this.b.f();
                a2.e = this.b.j();
                this.b.ad();
                a2.b(this.b.F());
                this.b.ae();
                this.f.i(a2.a(), this);
            }
            o();
            if (z) {
                this.d.s();
            }
            ckhf p = p();
            if (p == null) {
                return;
            }
            ((ckhe) this.s.a(p)).a();
        }
    }

    public final void g(boolean z) {
        this.l = z;
        if (!z) {
            ArrayList<bwnq> arrayList = this.m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                k(arrayList.get(i));
            }
            this.m.clear();
        }
    }

    public final void h() {
        if (!this.b.U()) {
            return;
        }
        this.d.e();
        this.k.clear();
        synchronized (this.b) {
            for (bwnf bwnfVar : dcbg.d(this.b.I(), this.b.K())) {
                l(bwnd.f(bwnfVar));
            }
            this.b.Y();
        }
        o();
        this.b.V();
    }

    public final void i(@dzsi GmmLocation gmmLocation) {
        if (gmmLocation != null) {
            this.b.C(gmmLocation.a());
        } else {
            this.b.C(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        if (this.b.D() == null) {
            ahjq ahjqVar = this.q;
            i(ahjqVar == null ? null : ahjqVar.a());
        }
        h();
        this.c.y(null);
        f(true);
    }
}
