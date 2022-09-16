package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kwy  reason: default package */
/* loaded from: classes7.dex */
public final class kwy implements kxb {
    public final dbty<awot> A;
    public final dbty<algf> B;
    public final kma C;
    private final akpx D;
    private final anat E;
    private final ckcw F;
    private final deig<afwo> G;
    @dzsi
    private final kxg H;
    private final boolean I;
    private final crzm<Boolean> J;
    private final dzsj<duxm> K;
    private final ckme L;
    private final crzp<dbsg<Boolean>> M;
    private final crzp<aufb> N;
    @dzsi
    private ViewGroup O;
    @dzsi
    private afox P;
    @dzsi
    private anay Q;
    private View R;
    @dzsi
    private kya S;
    private long T;
    private boolean U;
    private final crzp<Boolean> V;
    private final dbty<vsk> W;
    public final Application a;
    public final Context b;
    public final amcp c;
    public final dxio<ahjq> d;
    public final cqat e;
    public final bvnx f;
    public final bvrb g;
    public final Executor h;
    public final btrm i;
    public final bvjj j;
    public final cjqy k;
    public final cjqq l;
    public final bvsl m;
    public final dxio<amfi> n;
    public final btvo o;
    public final btpa p;
    public final dxio<ahkg> q;
    public final dxio<vtn> r;
    public final jzv s;
    public final aufc t;
    public final kxa u;
    public final akpw v;
    public final vwv w;
    public final Executor x;
    public final dxio<akfa> y;
    public final dbty<aras> z;

    public kwy(long j, Application application, Context context, LayoutInflater layoutInflater, akpx akpxVar, akpw akpwVar, amcp amcpVar, dxio dxioVar, ckcw ckcwVar, ckmm ckmmVar, cqat cqatVar, bvnx bvnxVar, btmv btmvVar, bvrb bvrbVar, Executor executor, btrm btrmVar, bvjj bvjjVar, cjqy cjqyVar, cjqq cjqqVar, anat anatVar, bvkx bvkxVar, bvsl bvslVar, dxio dxioVar2, final btvo btvoVar, btpa btpaVar, dxio dxioVar3, dxio dxioVar4, jzv jzvVar, aufc aufcVar, kxg kxgVar, boolean z, vwv vwvVar, crzm crzmVar, Executor executor2, dxio dxioVar5, kma kmaVar, dzsj dzsjVar, cjvm cjvmVar, ckme ckmeVar, alja aljaVar, alrd alrdVar) {
        kwf kwfVar = new kwf(context, layoutInflater, akpxVar, akpwVar, amcpVar, dxioVar, ckcwVar, cqatVar, bvnxVar, btrmVar, bvkxVar, o(context), anatVar, cjvmVar, ckmeVar, aljaVar, dbud.a(new dbty(btvoVar) { // from class: kwh
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.getVectorMapsParameters().C);
            }
        }));
        this.G = deig.d();
        this.M = new kwl(this);
        this.N = new crzp(this) { // from class: kwi
            private final kwy a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar2) {
                kwy kwyVar = this.a;
                bvrj.UI_THREAD.c();
                aufb aufbVar = (aufb) crzmVar2.l();
                dbsk.s(aufbVar);
                kwyVar.i().a().ai(aufbVar.c);
            }
        };
        this.V = new kwn(this);
        this.z = dbud.a(new kwo(this));
        this.A = dbud.a(new kwp(this));
        this.B = dbud.a(new kwq(this));
        this.W = dbud.a(new kwx(this));
        this.T = 25L;
        this.a = application;
        dbsk.s(context);
        this.b = context;
        this.D = akpxVar;
        this.v = akpwVar;
        this.c = amcpVar;
        dbsk.s(dxioVar);
        this.d = dxioVar;
        this.e = cqatVar;
        this.f = bvnxVar;
        this.g = bvrbVar;
        this.h = executor;
        this.i = btrmVar;
        this.j = bvjjVar;
        this.k = cjqyVar;
        this.l = cjqqVar;
        this.E = anatVar;
        this.m = bvslVar;
        dbsk.s(dxioVar2);
        this.n = dxioVar2;
        this.o = btvoVar;
        this.p = btpaVar;
        dbsk.s(dxioVar3);
        this.q = dxioVar3;
        dbsk.s(dxioVar4);
        this.r = dxioVar4;
        this.s = jzvVar;
        dbsk.s(aufcVar);
        this.t = aufcVar;
        this.F = ckcwVar;
        this.u = kwfVar;
        this.H = kxgVar;
        this.I = z;
        this.w = vwvVar;
        this.J = crzmVar;
        this.x = executor2;
        this.y = dxioVar5;
        this.C = kmaVar;
        this.K = dzsjVar;
        this.L = ckmeVar;
    }

    private static Point o(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("MapManager:"));
        String concat = str.concat("  ");
        long j = this.T;
        StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 31);
        sb.append(concat);
        sb.append("frameRate: ");
        sb.append(j);
        printWriter.println(sb.toString());
        h().NX(concat, printWriter);
        j().NX(concat, printWriter);
    }

    public final void a(boolean z) {
        if (!this.I || k().d(afwm.SATELLITE) == z) {
            return;
        }
        k().c(afwm.SATELLITE, z);
    }

    @Override // defpackage.kxb
    public final void b(ViewGroup viewGroup, boolean z) {
        this.O = viewGroup;
        akox h = h();
        ((kwf) this.u).B.a().a();
        h.o = o(this.b);
        h.w = true;
        this.Q = new anbb(this.E, i(), this.i, new akxz(i(), new dxio(this) { // from class: kwj
            private final kwy a;

            {
                this.a = this;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a.h().k();
            }
        }, this.i, this.F, this.D.tf(), this.v.i(), this.D.rV(), this.E, this.K));
        this.P = new afox(new kwm(this), this.j, h, afwo.b);
        dccx F = dcdc.F();
        F.h(afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false), afwn.e(afwm.TERRAIN, false));
        if (!z) {
            F.g(afwn.e(afwm.TRAFFIC, false));
        }
        afox afoxVar = this.P;
        dbsk.s(afoxVar);
        afoxVar.b((afwn[]) dcft.e(F.f(), afwn.class));
        if (this.L == ckme.AUXILIARY_CLUSTER_MAP) {
            afox afoxVar2 = this.P;
            dbsk.s(afoxVar2);
            afoxVar2.c(afwm.TRAFFIC, false);
        } else {
            afox afoxVar3 = this.P;
            dbsk.s(afoxVar3);
            afoxVar3.c(afwm.TRAFFIC, this.j.m(bvjk.gj, false));
        }
        afox afoxVar4 = this.P;
        dbsk.s(afoxVar4);
        afoxVar4.c(afwm.SATELLITE, this.I && this.j.m(bvjk.gk, false));
        this.G.j(this.P);
        ((kwf) this.u).z.a().a(true);
        this.W.a().m();
        this.z.a().a(h, this.b.getResources());
        this.R = h.af();
        h.aj().X(this.T);
        h.aj().aF().i(kvf.a);
        h.aj().aF().f(new kvf());
        if (this.H != null) {
            h.aj().aF();
        }
        this.R.setFocusable(false);
        h.E();
        h.V(false);
        this.U = true;
        viewGroup.addView(this.R);
        this.t.i().d(this.N, this.h);
        this.j.n(bvjk.gk).a(this.M, this.h);
        a(this.j.m(bvjk.gk, false));
    }

    @Override // defpackage.kxb
    public final void d(boolean z) {
        this.J.d(this.V, this.h);
        h().d();
        aras a = this.z.a();
        afox afoxVar = this.P;
        if (afoxVar != null) {
            afoxVar.a();
        }
        anay anayVar = this.Q;
        dbsk.s(anayVar);
        anayVar.a();
        a.b(z);
        a.d.k(ardz.NAVIGATION);
        a.d.i(arbs.NAVIGATION);
        a.g(false);
        this.A.a().i();
        ViewGroup viewGroup = this.O;
        dbsk.s(viewGroup);
        kya kyaVar = new kya(viewGroup, new kxz(this) { // from class: kwk
            private final kwy a;

            {
                this.a = this;
            }

            @Override // defpackage.kxz
            public final void a(int i, int i2, int i3, int i4) {
                this.a.j().a(new Rect(i, i2, i3, i4));
            }
        });
        this.S = kyaVar;
        kyaVar.a();
    }

    @Override // defpackage.kxb
    public final void e() {
        kya kyaVar = this.S;
        if (kyaVar != null) {
            kyaVar.b();
        }
        this.S = null;
        this.z.a().c();
        this.A.a().j();
        anay anayVar = this.Q;
        dbsk.s(anayVar);
        anayVar.b();
        h().e();
        this.J.c(this.V);
    }

    @Override // defpackage.kxb
    public final void f() {
        ViewGroup viewGroup = this.O;
        if (viewGroup != null) {
            viewGroup.removeView(this.R);
        }
        this.j.n(bvjk.gk).c(this.M);
        this.t.i().c(this.N);
        this.U = false;
        this.z.a().d();
        awoi awoiVar = this.A.a().f;
        synchronized (awoiVar.d) {
            arcg arcgVar = awoiVar.e;
            for (arcb arcbVar : arcgVar.c) {
                arcbVar.b();
            }
            arcgVar.a.c();
        }
        this.B.a().a();
        this.W.a().n();
        ((kwf) this.u).z.a().a(false);
        this.P = null;
        this.Q = null;
        h().b();
        this.O = null;
        ((kwf) this.u).B.a().b();
    }

    @Override // defpackage.kxb
    public final void g(int i) {
        long j = i;
        this.T = j;
        if (this.U) {
            h().aj().X(j);
        }
    }

    @Override // defpackage.kxb
    public final akox h() {
        return ((kwf) this.u).A.a();
    }

    @Override // defpackage.kxb
    public final dxio<akox> i() {
        return ((kwf) this.u).A;
    }

    @Override // defpackage.kxb
    public final kxu j() {
        return ((kwf) this.u).q;
    }

    @Override // defpackage.kxb
    public final afwo k() {
        afox afoxVar = this.P;
        dbsk.s(afoxVar);
        return afoxVar;
    }

    @Override // defpackage.kxb
    public final arbu l() {
        return this.z.a();
    }

    @Override // defpackage.kxb
    public final qbo m() {
        return this.W.a();
    }

    @Override // defpackage.kxb
    public final void n() {
        if (!((kwf) this.u).t) {
            return;
        }
        h().m(o(this.b));
    }
}
