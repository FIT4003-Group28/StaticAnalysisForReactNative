package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.auto.sdk.ui.CarRecyclerView;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mbp  reason: default package */
/* loaded from: classes7.dex */
public final class mbp extends nor {
    private static final dcqe F = dcqe.c("mbp");
    public final mog A;
    public final Runnable B;
    final mfh C;
    public final mwp D;
    final mbm E;
    @dzsi
    private final amuh G;
    private final mcj H;
    private final boolean I;
    private final akox J;
    private final aktm K;
    private final kcw L;
    private final kdi M;
    private final nov N;
    @dzsi
    private final mnz O;
    private final mcl P;
    private final kxs Q;
    private final kdg R;
    private final cqkf<mfe> S;
    private boolean T;
    private boolean U;
    private final kqo V;
    private final abi W;
    private final abx X;
    private final kqn Y;
    private final kso Z;
    public final cqat a;
    private final mbg aa;
    public final bvsl b;
    public final cqkj c;
    public final jzp d;
    public final cjqy e;
    public final ksr f;
    public final asmp g;
    public final mcp h;
    public final mcb i;
    public final aste j;
    public final dcdc<ldm> k;
    public final not l;
    public final nop m;
    @dzsi
    public final akqi n;
    public final boolean o;
    public final ckco p;
    public final ckco q;
    public final ckco r;
    public final kow s;
    public final ckmd t;
    public final Handler u;
    public final mfl v;
    public final View w;
    public mez<mfd> x;
    public ntc y;
    public final mey z;

    public mbp(cqat cqatVar, bvsl bvslVar, mcc mccVar, cqkj cqkjVar, jzp jzpVar, ksr ksrVar, amuh amuhVar, cjqy cjqyVar, cjqq cjqqVar, asmp asmpVar, mcj mcjVar, aste asteVar, dcdc dcdcVar, not notVar, kxu kxuVar, akox akoxVar, kcw kcwVar, nop nopVar, mwp mwpVar, kdi kdiVar, nov novVar, mnz mnzVar, mcl mclVar, mco mcoVar, akqi akqiVar, boolean z, kdg kdgVar, ckcw ckcwVar, kow kowVar, ckmd ckmdVar) {
        super(cjqyVar, cjqqVar);
        String e;
        akqq akqqVar;
        this.u = new Handler(Looper.getMainLooper());
        this.T = false;
        this.U = false;
        this.A = new mbf(this);
        this.aa = new mbg(this);
        this.V = new mbh(this);
        this.W = new mbj(this);
        this.X = new mbk(this);
        this.B = new mbl(this);
        this.E = new mbm(this);
        this.C = new mbn(this);
        this.Y = new mbo(this);
        this.Z = new mbe(this);
        dbsk.s(cqatVar);
        this.a = cqatVar;
        dbsk.s(bvslVar);
        this.b = bvslVar;
        dbsk.s(cqkjVar);
        this.c = cqkjVar;
        dbsk.s(jzpVar);
        this.d = jzpVar;
        dbsk.s(cjqyVar);
        this.e = cjqyVar;
        dbsk.s(ksrVar);
        this.f = ksrVar;
        this.G = amuhVar;
        dbsk.s(asmpVar);
        this.g = asmpVar;
        dbsk.s(mcjVar);
        this.H = mcjVar;
        dbsk.s(asteVar);
        this.j = asteVar;
        this.k = dcdcVar;
        dbsk.s(notVar);
        this.l = notVar;
        dbsk.s(akoxVar);
        this.J = akoxVar;
        dbsk.s(kcwVar);
        this.L = kcwVar;
        dbsk.s(nopVar);
        this.m = nopVar;
        dbsk.s(mwpVar);
        this.D = mwpVar;
        dbsk.s(kdiVar);
        this.M = kdiVar;
        this.N = novVar;
        this.O = mnzVar;
        dbsk.s(mclVar);
        this.P = mclVar;
        this.n = akqiVar;
        this.o = z;
        dbsk.s(kdgVar);
        this.R = kdgVar;
        dbsk.s(kowVar);
        this.s = kowVar;
        dbsk.s(ckmdVar);
        this.t = ckmdVar;
        this.K = akoxVar.aj().aF().h();
        this.i = mccVar.a(asmpVar, cqkjVar.d, akoxVar.aj());
        mcp g = mcjVar.g(mcoVar);
        this.h = g;
        amvh[] amvhVarArr = new amvh[dcdcVar.size()];
        for (int i = 0; i < dcdcVar.size(); i++) {
            amvhVarArr[i] = ((ldm) dcdcVar.get(i)).h;
        }
        g.b(amvhVarArr);
        this.I = mcoVar == null;
        if (!dcdcVar.isEmpty() && (akqqVar = ((ldm) dcdcVar.get(0)).h.e) != null) {
            this.i.g = akra.f(akqqVar);
        }
        this.y = new ntc(cqkjVar, dbsg.i(Integer.valueOf(mcjVar.k())));
        this.x = new mez<>(new mba(this), this.E);
        this.z = new mbb(this);
        cqkf<mfe> d = cqkjVar.d(new mew(), notVar.a(), false);
        this.S = d;
        this.w = d.c().findViewById(mew.a);
        if (asteVar.e().isEmpty()) {
            e = asteVar.d();
        } else {
            e = asteVar.e();
        }
        this.v = new mfl(nopVar, e, cqkjVar.d, ksrVar, nopVar.g());
        View c = d.c();
        kxn k = kxo.k();
        k.k();
        this.Q = new kxs(c, k, kxuVar);
        this.p = (ckco) ckcwVar.a(ckee.at);
        this.q = (ckco) ckcwVar.a(ckee.av);
        if (asteVar.c() != null) {
            dpvf dpvfVar = dpvf.UNKNOWN_CATEGORY;
            int ordinal = asteVar.c().ordinal();
            if (ordinal != 5 && ordinal != 10 && ordinal != 55) {
                if (ordinal == 38) {
                    this.r = (ckco) ckcwVar.a(ckee.aE);
                    return;
                } else if (ordinal != 39) {
                    this.r = (ckco) ckcwVar.a(ckee.aG);
                    return;
                }
            }
            this.r = (ckco) ckcwVar.a(ckee.aF);
            return;
        }
        this.r = (ckco) ckcwVar.a(ckee.aG);
    }

    public static String n(mck mckVar) {
        String str = mckVar.a.b;
        if (str == null) {
            bvoo.h("null title in waypointInfo", new Object[0]);
            return "";
        }
        return dbqa.a(str);
    }

    public static dbsi<String, String> o(mck mckVar) {
        dvxz j = mckVar.b.j();
        return dbsi.a(n(mckVar), (j == null || (j.a & 4) == 0) ? "" : dbqa.a(j.d));
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.U = true;
        this.f.a();
        this.y.o(this.W);
        ((cov) this.w).setAdapter(this.y);
        ((cov) this.w).setMaxPages(3);
        CarRecyclerView carRecyclerView = ((cov) this.w).a;
        carRecyclerView.i(this.X);
        carRecyclerView.setItemAnimator(null);
        this.S.e(this.v);
        this.v.h();
        this.h.f(this.aa);
        if (this.I) {
            this.h.a(this.j, false);
        }
        this.L.h(this.V);
        this.U = false;
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        this.t.a.p(ckoh.b);
        this.Q.a();
        if (this.P == mcl.ONE_STOP_CHARGING_ASSISTANCE) {
            s(new cjsz(dtxm.cp));
        } else if (this.P == mcl.LONG_TRIP_CHARGING_ASSISTANCE) {
            s(new cjsz(dtxm.co));
        } else {
            s(new cjsz(dtxm.cq));
        }
        this.J.aj().aF().g(kyc.a);
        this.R.d(this);
        kow kowVar = this.s;
        kowVar.h = u();
        btrm btrmVar = kowVar.b;
        kov kovVar = kowVar.f;
        dceq a = dcet.a();
        a.b(alhl.class, new koy(0, alhl.class, kovVar, bvrj.UI_THREAD));
        a.b(alhw.class, new koy(1, alhw.class, kovVar, bvrj.UI_THREAD));
        btrmVar.g(kovVar, a.a());
        if (this.T) {
            this.x.a();
            p();
        } else {
            this.T = true;
        }
        this.H.i(this.h);
        this.i.a();
        this.L.b(this.Y);
        this.f.h(this.Z);
        if (this.G != null) {
            asmp asmpVar = this.g;
            astf f = astg.f();
            f.e(this.G);
            f.d(alfa.SHOW_NONE);
            f.c(true);
            asmpVar.D(f.a());
        }
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.S.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        if (this.G != null) {
            this.g.D(null);
        }
        this.L.c(this.Y);
        this.J.aj().aF().g(this.K);
        this.i.b();
        this.i.e();
        this.H.j(this.h);
        this.g.y();
        this.f.i(this.Z);
        kow kowVar = this.s;
        kowVar.a();
        kowVar.b.a(kowVar.f);
        kowVar.h = null;
        this.R.e(this);
        this.Q.b();
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.L.j(this.V);
        this.h.g(this.aa);
        this.S.e(null);
        ((cov) this.w).a.j(this.X);
        this.y.p(this.W);
        this.i.c();
        this.H.h(this.h);
        this.f.b();
    }

    @Override // defpackage.non
    public final String g() {
        return "NavigationSearchResultsListOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.l.b(noeVar, this.S.c());
    }

    public final boolean k() {
        mnz mnzVar = this.O;
        return mnzVar != null && mnzVar.a();
    }

    public final void l(final aryr aryrVar, final ldm ldmVar, final ncf ncfVar, final kdk kdkVar, final nop nopVar, final boolean z) {
        if (this.U) {
            this.u.post(new Runnable(this, aryrVar, ldmVar, ncfVar, kdkVar, nopVar, z) { // from class: mbd
                private final mbp a;
                private final aryr b;
                private final ldm c;
                private final ncf d;
                private final kdk e;
                private final nop f;
                private final boolean g;

                {
                    this.a = this;
                    this.b = aryrVar;
                    this.c = ldmVar;
                    this.d = ncfVar;
                    this.e = kdkVar;
                    this.f = nopVar;
                    this.g = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m(this.b, this.c, this.d, this.e, this.f, this.g);
                }
            });
        } else {
            m(aryrVar, ldmVar, ncfVar, kdkVar, nopVar, z);
        }
    }

    public final void m(aryr aryrVar, ldm ldmVar, ncf ncfVar, kdk kdkVar, nop nopVar, boolean z) {
        non o;
        if (this.U) {
            dcqe.b.v(dcqz.SMALL);
        }
        this.N.a();
        if (z) {
            nopVar.b();
        }
        if (this.P == mcl.DEFAULT) {
            kdi kdiVar = this.M;
            dcdc<ldm> dcdcVar = this.k;
            not notVar = this.l;
            mnz mnzVar = this.O;
            dbsk.s(mnzVar);
            o = kdiVar.n(nopVar, ldmVar, aryrVar, ncfVar, dcdcVar, kdkVar, notVar, mnzVar);
        } else {
            kdi kdiVar2 = this.M;
            not notVar2 = this.l;
            dccx F2 = dcdc.F();
            F2.g(ldmVar);
            F2.i(this.k);
            o = kdiVar2.o(notVar2, F2.f(), msv.SEARCH_SINGLE_CHARGING_STATION);
        }
        nopVar.k(o);
        this.N.b();
    }

    public final void p() {
        cov covVar = (cov) this.w;
        CarRecyclerView carRecyclerView = covVar.a;
        View o = covVar.b.o();
        View a = nsh.a(this.w, nqo.av.NR(this.c.d));
        if (o == null || a == null) {
            return;
        }
        int Z = carRecyclerView.Z(o);
        int Z2 = carRecyclerView.Z(a);
        if (Z == -1 || Z2 == -1 || this.x.b != -1) {
            return;
        }
        cqjz<?> g = cqjz.g(a);
        if (!((g == null ? null : g.f) instanceof mdh)) {
            this.i.g(Z, Z2 + 1, true);
        } else if (Z >= Z2) {
        } else {
            this.i.g(Z, Z2, true);
        }
    }
}
