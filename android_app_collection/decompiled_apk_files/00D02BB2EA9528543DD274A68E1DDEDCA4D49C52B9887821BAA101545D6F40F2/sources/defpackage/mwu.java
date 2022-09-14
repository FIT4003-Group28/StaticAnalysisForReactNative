package defpackage;

import android.view.View;
import com.google.android.apps.auto.sdk.ui.CarRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: mwu  reason: default package */
/* loaded from: classes7.dex */
public final class mwu extends nor {
    public static final /* synthetic */ int h = 0;
    private static final dcqe i = dcqe.c("mwu");
    private static final cjsz j = new cjsz(dtxm.eH);
    public final ldm a;
    public final nop b;
    public final not c;
    public final kdi d;
    public final dcdc<ldm> e;
    public List<mck> f;
    public final mxl g;
    private final cqat k;
    private final aluu l;
    private final kdg m;
    private final kxs n;
    private final noo o;
    private final cqkj p;
    private final mcb q;
    private final kcw r;
    private final cqkf<mxk> s;
    private final cov t;
    private final kqo u;
    private final abx v;

    public mwu(cqat cqatVar, aluu aluuVar, cqkj cqkjVar, ldm ldmVar, kdg kdgVar, ksi ksiVar, nop nopVar, noo nooVar, not notVar, kdi kdiVar, kxu kxuVar, cjqy cjqyVar, cjqq cjqqVar, mcb mcbVar, dcdc<ldm> dcdcVar, btvo btvoVar, kcw kcwVar) {
        super(cjqyVar, cjqqVar);
        this.f = dcdc.e();
        this.u = new mwr(this);
        this.g = new mws(this);
        this.v = new mwt(this);
        dbsk.s(cqatVar);
        this.k = cqatVar;
        dbsk.s(aluuVar);
        this.l = aluuVar;
        dbsk.s(cqkjVar);
        this.p = cqkjVar;
        dbsk.s(ldmVar);
        this.a = ldmVar;
        dbsk.s(kdgVar);
        this.m = kdgVar;
        dbsk.s(ksiVar);
        dbsk.s(nopVar);
        this.b = nopVar;
        dbsk.s(nooVar);
        this.o = nooVar;
        dbsk.s(notVar);
        this.c = notVar;
        dbsk.s(kdiVar);
        this.d = kdiVar;
        dbsk.s(mcbVar);
        this.q = mcbVar;
        dbsk.s(dcdcVar);
        this.e = dcdcVar;
        dbsk.s(btvoVar);
        dbsk.s(kcwVar);
        this.r = kcwVar;
        cqkf<mxk> d = cqkjVar.d(new mxi(), notVar.a(), false);
        this.s = d;
        this.t = (cov) d.c().findViewById(mxi.a);
        View c = d.c();
        kxn k = kxo.k();
        k.k();
        this.n = new kxs(c, k, kxuVar);
    }

    @dzsi
    private final mck l(amvh amvhVar) {
        akqq akqqVar = amvhVar.e;
        if (akqqVar == null) {
            bvoo.h("No location for waypoint refinement, can't draw on map.", new Object[0]);
            return null;
        }
        ily ilyVar = new ily();
        ilyVar.I(amvhVar);
        ilyVar.i = true;
        return mck.a(ilyVar.d(), akra.f(akqqVar), this.k, this.l, false, aryq.GENERIC);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        dcdc<dpca> r = this.a.r();
        int min = Math.min(r.size(), 8);
        ldm ldmVar = this.a;
        int i2 = min + 1;
        dccx G = dcdc.G(i2);
        mck l = l(ldmVar.h);
        if (l != null) {
            G.g(l);
        }
        for (int i3 = 0; i3 < min; i3++) {
            dpjx dpjxVar = r.get(i3).c;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            mck l2 = l(amvh.M(dpjxVar, this.p.d));
            if (l2 != null) {
                G.g(l2);
            }
        }
        this.f = G.f();
        this.q.a();
        this.q.d(this.f);
        cqkf<mxk> cqkfVar = this.s;
        ldm ldmVar2 = this.a;
        String str = ldmVar2.b;
        noo nooVar = this.o;
        dccx G2 = dcdc.G(i2);
        ilo iloVar = ldmVar2.d;
        G2.g(new mxm(ldmVar2.b, 0, this.g, false, iloVar != null ? iloVar.bY() : null));
        int i4 = 0;
        while (i4 < min) {
            dpca dpcaVar = r.get(i4);
            dpjx dpjxVar2 = dpcaVar.c;
            if (dpjxVar2 == null) {
                dpjxVar2 = dpjx.n;
            }
            String str2 = dpjxVar2.e;
            int i5 = i4 + 1;
            mxl mxlVar = this.g;
            boolean z = i4 == min + (-1);
            cjta b = cjtd.b();
            b.g(dpcaVar.d);
            G2.g(new mxm(str2, i5, mxlVar, z, b.a()));
            i4 = i5;
        }
        cqkfVar.e(new mxn(str, nooVar, G2.f()));
        this.t.a.i(this.v);
        this.r.h(this.u);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        this.m.d(this);
        this.n.a();
        this.t.a.post(new Runnable(this) { // from class: mwq
            private final mwu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        });
        s(j);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.s.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        this.q.e();
        this.n.b();
        this.m.e(this);
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.s.h();
        this.r.j(this.u);
        this.q.b();
        this.q.c();
    }

    @Override // defpackage.non
    public final String g() {
        return "WaypointRefinementOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.c.b(noeVar, d());
    }

    public final void k() {
        cov covVar = this.t;
        CarRecyclerView carRecyclerView = covVar.a;
        View o = covVar.b.o();
        View a = nsh.a(this.t, nqo.av.NR(this.p.d));
        if (o == null || a == null) {
            return;
        }
        int Z = carRecyclerView.Z(o);
        int Z2 = carRecyclerView.Z(a);
        if (Z == -1 || Z2 == -1) {
            return;
        }
        this.q.g(Z, Z2 + 1, false);
    }
}
