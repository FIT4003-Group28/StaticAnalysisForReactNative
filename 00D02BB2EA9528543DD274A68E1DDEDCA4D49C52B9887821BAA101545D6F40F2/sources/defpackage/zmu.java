package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zmu  reason: default package */
/* loaded from: classes7.dex */
public class zmu implements zei {
    private static final dcqe g = dcqe.c("zmu");
    private final vwv B;
    @dzsi
    private bzdk C;
    @dzsi
    private qib D;
    @dzsi
    private qhy E;
    private boolean F;
    private final cqhn H;
    private final byzi I;
    @dzsi
    private znt J;
    private final ahvo K;
    private final dxio<cztz> L;
    private final dxio<dbsg<arkd>> M;
    private final dxio<afha> N;
    private final dxio<awps> O;
    private final dbsg<arkb> P;
    private final boolean Q;
    private final bzgf R;
    private final gdc S;
    private boolean U;
    private boolean V;
    @dzsi
    private qbr W;
    private final cfpe X;
    private cfoa Y;
    private final wgh Z;
    private final whs aa;
    private final wih ab;
    private final whm ac;
    private final akfa ad;
    private final ania ae;
    @dzsi
    private whr af;
    public final gga b;
    public final dxio<arly> c;
    public boolean d;
    public final qbt e;
    @dzsi
    public zck f;
    private final ahjq h;
    private final bvjj i;
    private final Executor j;
    private final btvo k;
    private final btpc l;
    private final vmw m;
    private final byyp n;
    private final bzgl o;
    private final cjck p;
    private final qho q;
    private final qfv r;
    private final qfw s;
    private final cqat t;
    private final zgy u;
    @dzsi
    private amub v;
    private boolean w;
    private boolean x;
    @dzsi
    private btpf y = null;
    private boolean z = false;
    private boolean A = false;
    private boolean G = false;

    public zmu(ahjq ahjqVar, bvjj bvjjVar, bzgl bzglVar, qho qhoVar, qfv qfvVar, qfw qfwVar, gga ggaVar, btvo btvoVar, btpc btpcVar, vwv vwvVar, byyp byypVar, cqat cqatVar, cqhn cqhnVar, byzi byziVar, ahvo ahvoVar, dxio<cztz> dxioVar, zgz zgzVar, Executor executor, gdc gdcVar, dxio<dbsg<arkd>> dxioVar2, dxio<afha> dxioVar3, dxio<awps> dxioVar4, dbsg<arkb> dbsgVar, dxio<arly> dxioVar5, qbv qbvVar, @dzsi vmv vmvVar, cfpe cfpeVar, cjck cjckVar, wgh wghVar, whs whsVar, wih wihVar, whm whmVar, qbt qbtVar, akfa akfaVar, ania aniaVar) {
        bzgf bzgfVar = new bzgf(this) { // from class: zmh
            private final zmu a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                this.a.ac();
            }
        };
        this.R = bzgfVar;
        this.d = false;
        this.U = false;
        this.V = false;
        this.af = null;
        this.f = null;
        this.h = ahjqVar;
        this.i = bvjjVar;
        this.o = bzglVar;
        this.q = qhoVar;
        this.r = qfvVar;
        this.s = qfwVar;
        this.m = new vmw(vmvVar);
        this.b = ggaVar;
        this.j = executor;
        this.k = btvoVar;
        this.l = btpcVar;
        this.n = byypVar;
        this.t = cqatVar;
        this.H = cqhnVar;
        this.I = byziVar;
        this.x = false;
        this.B = vwvVar;
        Runnable runnable = new Runnable(this) { // from class: zmi
            private final zmu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.X();
            }
        };
        btvo a = zgzVar.a.a();
        zgz.a(a, 1);
        bvjj a2 = zgzVar.b.a();
        zgz.a(a2, 2);
        cqhn a3 = zgzVar.c.a();
        zgz.a(a3, 3);
        cjqq a4 = zgzVar.d.a();
        zgz.a(a4, 4);
        Activity activity = (Activity) ((dxjd) zgzVar.e).a;
        zgz.a(activity, 5);
        pnq a5 = zgzVar.f.a();
        zgz.a(a5, 6);
        pnw a6 = zgzVar.g.a();
        zgz.a(a6, 7);
        pot a7 = zgzVar.h.a();
        zgz.a(a7, 8);
        zgz.a(runnable, 9);
        this.u = new zgy(a, a2, a3, a4, activity, a5, a6, a7, runnable);
        this.C = byypVar.c();
        bzgg.b(bzgfVar, byypVar, new bzgj(), executor);
        this.K = ahvoVar;
        this.L = dxioVar;
        this.S = gdcVar;
        this.M = dxioVar2;
        this.N = dxioVar3;
        this.O = dxioVar4;
        this.c = dxioVar5;
        this.Q = qbvVar.a();
        this.p = cjckVar;
        this.X = cfpeVar;
        cfnq cfnqVar = cfnq.DIRECTIONS;
        Resources a8 = cfpeVar.a.a();
        cfpe.b(a8, 1);
        cqhn a9 = cfpeVar.b.a();
        cfpe.b(a9, 2);
        cfns a10 = cfpeVar.c.a();
        cfpe.b(a10, 3);
        cfof a11 = cfpeVar.d.a();
        cfpe.b(a11, 4);
        cfod a12 = cfpeVar.e.a();
        cfpe.b(a12, 5);
        cfpg a13 = cfpeVar.f.a();
        cfpe.b(a13, 6);
        bvjj a14 = cfpeVar.g.a();
        cfpe.b(a14, 7);
        dxio a15 = ((dxjh) cfpeVar.h).a();
        cfpe.b(a15, 8);
        btvo a16 = cfpeVar.i.a();
        cfpe.b(a16, 9);
        cpv a17 = cfpeVar.j.a();
        cfpe.b(a17, 10);
        Executor a18 = cfpeVar.k.a();
        cfpe.b(a18, 11);
        ckcw a19 = cfpeVar.l.a();
        cfpe.b(a19, 12);
        cfpe.b(cfnqVar, 13);
        this.Y = new cfpd(a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, cfnqVar);
        this.P = dbsgVar;
        this.Z = wghVar;
        this.aa = whsVar;
        this.ab = wihVar;
        this.ac = whmVar;
        this.e = qbtVar;
        this.ad = akfaVar;
        this.ae = aniaVar;
        aj();
    }

    private final boolean af() {
        return this.z || this.m.j();
    }

    @dzsi
    private final String ag(boolean z) {
        if (this.w) {
            if (ak()) {
                return null;
            }
            if (z) {
                return this.b.getString(R.string.ACCESSIBILITY_TRANSIT_GUIDANCE_ON);
            }
            return this.b.getString(R.string.PERSISTENT_FOOTER_START_BUTTON);
        }
        qib qibVar = this.D;
        if (qibVar != null) {
            return qibVar.b();
        }
        qhy qhyVar = this.E;
        if (qhyVar == null || qhyVar.b() == null) {
            return ah(z);
        }
        if (this.E.c() != null) {
            return this.E.c();
        }
        return this.b.getString(R.string.BIKESHARING_LAUNCH_EXTERNAL_APP);
    }

    private final String ah(boolean z) {
        if (aq()) {
            return this.b.getString(R.string.BIKESHARING_MORE_OPTIONS);
        }
        if (!an(this.v) && !ap()) {
            return this.b.getString(R.string.NAVIGATION_FAB_LABEL_PREVIEW);
        }
        if (z) {
            return this.b.getString(R.string.ACCESSIBILITY_START_NAVIGATION);
        }
        return this.b.getString(R.string.PERSISTENT_FOOTER_START_BUTTON);
    }

    private final cqtd ai(cqss cqssVar) {
        if (aq()) {
            return iut.a(cqrt.g(2131232509, irg.s()));
        }
        if (an(this.v) || ap()) {
            return cqrt.g(2131232359, cqssVar);
        }
        return iut.a(cqrt.g(2131231594, cqssVar));
    }

    private final void aj() {
        if (!this.P.a()) {
            aa(false);
            return;
        }
        amub amubVar = this.v;
        if (amubVar == null) {
            aa(false);
        } else if (amubVar.h == dqvj.WALK) {
            int i = amubVar.D;
            boolean an = an(amubVar);
            if (i > 15000 || !an) {
                aa(false);
            } else {
                deha.q(this.P.b().c(), new zmt(this), this.j);
            }
        } else {
            aa(false);
        }
    }

    private final boolean ak() {
        al();
        return this.G;
    }

    private final bzdk al() {
        bzdk c = this.n.c();
        if (this.C == c) {
            return c;
        }
        this.C = c;
        amub amubVar = this.v;
        boolean z = false;
        if (amubVar != null && c.a(amubVar)) {
            z = true;
        }
        this.G = z;
        return c;
    }

    private final boolean am() {
        amub amubVar;
        return this.U && (amubVar = this.v) != null && amubVar.h == dqvj.DRIVE;
    }

    private final boolean an(@dzsi amub amubVar) {
        return zba.e(amubVar, this.h, this.i, this.B);
    }

    private final boolean ao() {
        qhy qhyVar = this.E;
        return (qhyVar == null || qhyVar.b() == null) ? false : true;
    }

    private final boolean ap() {
        amub amubVar = this.v;
        if (amubVar == null) {
            return false;
        }
        qib qibVar = this.D;
        boolean z = qibVar != null && this.r.a(amubVar, qibVar.c().a());
        qhy qhyVar = this.E;
        return z || (qhyVar != null && this.r.a(amubVar, qhyVar.d().a()));
    }

    private final boolean aq() {
        return (!this.F || this.D == null || this.W == null) ? false : true;
    }

    private final int ar(int i) {
        return kc.f(this.b.getResources().getColor(i), 102);
    }

    @Override // defpackage.izl
    public cqss A() {
        return irg.a();
    }

    @Override // defpackage.izl
    public cqss B() {
        if (!am()) {
            if (!this.d) {
                return irg.h();
            }
            if (!this.l.i()) {
                return cqta.d(ar(R.color.qu_daynight_grey_800));
            }
            return irg.l();
        }
        return irg.l();
    }

    @Override // defpackage.izl
    public cqss C() {
        if (!am()) {
            if (!this.l.i()) {
                return cqta.d(ar(R.color.qu_grey_100));
            }
            return this.d ? irg.a() : irg.d();
        }
        return irg.a();
    }

    @Override // defpackage.izl
    public cqss D() {
        if (am()) {
            return irg.g();
        }
        if (this.l.i()) {
            return irg.g();
        }
        return cqta.d(ar(R.color.qu_grey_100));
    }

    @Override // defpackage.izl
    @dzsi
    public whc E() {
        if (G().booleanValue()) {
            return null;
        }
        return this.af;
    }

    @Override // defpackage.izl
    public izk F() {
        return this.u;
    }

    @Override // defpackage.zei
    public Boolean G() {
        return Boolean.valueOf(ak());
    }

    @Override // defpackage.zei
    public Boolean H() {
        amub amubVar = this.v;
        boolean z = false;
        if (amubVar != null && amubVar.am()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zei
    public String I(bvsz bvszVar) {
        int i;
        if (this.v != null && this.w) {
            if (G().booleanValue()) {
                long b = al().d().a - this.t.b();
                if (b < 0) {
                    b = 0;
                }
                i = (int) TimeUnit.MILLISECONDS.toSeconds(b);
            } else {
                amub amubVar = this.v;
                dbsk.s(amubVar);
                dgas x = vyb.x(amubVar.d);
                i = x != null ? x.b : -1;
            }
            if (i >= 0) {
                return bvtb.e(this.b.getResources(), i, bvszVar).toString();
            }
        }
        return "";
    }

    @Override // defpackage.zei
    public String J() {
        dgaw dgawVar;
        if (this.v == null || !this.w) {
            return "";
        }
        if (G().booleanValue()) {
            return bvtb.i(this.b, TimeUnit.MILLISECONDS.toSeconds(al().d().a));
        }
        amub amubVar = this.v;
        dbsk.s(amubVar);
        dpci dpciVar = amubVar.d.b().f;
        if (dpciVar == null) {
            dpciVar = dpci.i;
        }
        if ((dpciVar.a & 32) != 0) {
            dgawVar = dpciVar.f;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = dpciVar.c;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        }
        return bvtb.h(this.b, dgawVar);
    }

    @Override // defpackage.zei
    public Boolean K() {
        boolean z = false;
        if (this.x && H().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zei
    public Boolean L() {
        amub amubVar;
        boolean z = false;
        if (ak() || ((amubVar = this.v) != null && !amubVar.am())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zei
    public cqkl M() {
        if (G().booleanValue()) {
            X();
        } else {
            this.m.i();
        }
        return cqkl.a;
    }

    @Override // defpackage.zei
    @dzsi
    public cjtd N() {
        if (G().booleanValue()) {
            amub amubVar = this.v;
            dbsk.s(amubVar);
            cjta c = cjtd.c(vyb.t(amubVar.d));
            c.d = dtyc.cO;
            bzdk al = al();
            bzdg b = al.g().b();
            ddzs bZ = ddzu.g.bZ();
            int M = b.M();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzu ddzuVar = (ddzu) bZ.b;
            ddzuVar.a |= 2;
            ddzuVar.c = M;
            int N = b.N();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzu ddzuVar2 = (ddzu) bZ.b;
            int i = 1;
            ddzuVar2.a |= 1;
            ddzuVar2.b = N;
            byzg a = this.I.a(al);
            if (a != null) {
                i = a.i;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzu ddzuVar3 = (ddzu) bZ.b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            ddzuVar3.d = i2;
            ddzuVar3.a |= 4;
            if (b.c() == dqvj.TRANSIT) {
                dgsn b2 = dgsn.b(b.d().h);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddzu ddzuVar4 = (ddzu) bZ.b;
                ddzuVar4.e = b2.v;
                ddzuVar4.a |= 8;
            }
            ddzf bZ2 = ddzg.t.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddzg ddzgVar = (ddzg) bZ2.b;
            ddzu bK = bZ.bK();
            bK.getClass();
            ddzgVar.j = bK;
            ddzgVar.a |= 1073741824;
            c.r(bZ2.bK());
            return c.a();
        }
        return null;
    }

    @Override // defpackage.zei
    public String O() {
        return G().booleanValue() ? this.b.getString(R.string.ACCESSIBILITY_TRANSIT_GUIDANCE_OFF) : "";
    }

    @Override // defpackage.zei
    public Boolean P() {
        return Boolean.valueOf(this.Q);
    }

    @Override // defpackage.zei
    public Boolean Q() {
        boolean z = false;
        if (G().booleanValue() && this.o.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zei
    public Boolean R() {
        boolean z = false;
        if (!H().booleanValue() || E() == null || btpf.c(this.b).f) {
            return false;
        }
        int i = d().intValue() != 8 ? 2 : 1;
        if (L().booleanValue()) {
            i++;
        }
        if (f().booleanValue() && e().booleanValue()) {
            i++;
        }
        if (i >= 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zei
    public cfoa S() {
        return this.Y;
    }

    @Override // defpackage.zei
    public zdq T() {
        znt zntVar = this.J;
        if (zntVar != null) {
            return zntVar;
        }
        znt zntVar2 = new znt(this.K, this.m, this.b, this.H, this.L, this.S);
        this.J = zntVar2;
        return zntVar2;
    }

    @Override // defpackage.zei
    public zfi U() {
        return new zqd(this.b, this.v);
    }

    @Override // defpackage.zei
    public Boolean V() {
        cjck cjckVar = this.p;
        amub amubVar = this.v;
        btlu j = cjckVar.b.a().j();
        boolean z = false;
        if (j != null && cjckVar.a.getDirectionsPageParameters().D && j.u() && cjckVar.c.a() && amubVar != null && cjcj.a(amubVar).a() && !Q().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zei
    @dzsi
    public zck W() {
        return this.f;
    }

    public final void X() {
        amub amubVar = this.v;
        if (amubVar != null) {
            this.m.c(amubVar.c, true);
        }
    }

    public void Y() {
        cqkx.p(this);
    }

    public void Z(vnk vnkVar, btpf btpfVar) {
        amte p;
        crmw k;
        dpum dpumVar;
        dbsg dbsgVar;
        whr whrVar;
        btpf btpfVar2;
        amte p2;
        amub amubVar;
        amte p3;
        this.y = btpfVar;
        vnu l = vnkVar.l();
        vwn d = l.d();
        zms zmsVar = null;
        this.v = (d.t() && (p = d.p()) != null) ? p.b(d.e(), this.b) : null;
        ac();
        zgy zgyVar = this.u;
        zgyVar.h = an(this.v);
        amte p4 = vnkVar.l().d().p();
        amsy amsyVar = p4 == null ? null : p4.a;
        if (amsyVar != null) {
            dwaa dwaaVar = amsyVar.a.b;
            if (dwaaVar == null) {
                dwaaVar = dwaa.g;
            }
            zgyVar.f = dwaaVar.f;
            vwn d2 = vnkVar.l().d();
            zgyVar.e = (d2.t() && (p3 = d2.p()) != null) ? p3.b(d2.e(), zgyVar.b) : null;
        } else {
            zgyVar.f = dcdc.e();
            zgyVar.e = null;
        }
        duqc i = vnkVar.i();
        if (!zgyVar.g && i != null && (i.a & 4) != 0) {
            Iterator<dqtx> it = zgyVar.f.iterator();
            while (true) {
                if (it.hasNext()) {
                    int i2 = i.d;
                    if (i2 == it.next().a) {
                        zgyVar.h(zgyVar.c.a(i2));
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        cqhn cqhnVar = zgyVar.a;
        cqkx.p(zgyVar);
        int bw = vnkVar.bw();
        dqvj a = l.a();
        dqvj dqvjVar = dqvj.TRANSIT;
        boolean z = false;
        this.w = vnkVar.t().equals(qbs.TRANSIT_TRIP_DETAILS) && (amubVar = this.v) != null && amubVar.h == dqvj.TRANSIT;
        boolean z2 = (bw == 1 || a == dqvjVar || l.a() == dqvj.TAXI || l.a() == dqvj.FLY) ? false : true;
        amub amubVar2 = this.v;
        boolean z3 = amubVar2 != null && amubVar2.h == dqvj.TAXI;
        this.F = l.a().equals(dqvj.WALK);
        amub amubVar3 = this.v;
        if (amubVar3 != null && amubVar3.h == dqvj.BIKESHARING) {
            amve amveVar = this.v.d;
            this.D = this.q.a(amveVar);
            this.E = this.q.b(amveVar);
            vwn d3 = l.d();
            this.V = (d3.t() && (p2 = d3.p()) != null) ? amsr.a(p2.a) : false;
        } else {
            this.D = null;
            this.E = null;
        }
        this.x = (z2 || this.w) && !z3 && vnkVar.bw() != 3;
        this.A = vyr.d(vnkVar.aw(), vnkVar.g(), vnkVar.bo());
        aj();
        this.U = vnkVar.k() != null && awpl.a(this.k) && this.O.a().e();
        if (vnkVar.k() == null) {
            k = crmw.f(ddom.aj, dcdc.e(), null, false, null);
        } else {
            k = vnkVar.k();
            dbsk.s(k);
        }
        dqvj a2 = vnkVar.l().a();
        dqvj c = dqvj.c(k.g().e);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        if (vnkVar.k() == null || (btpfVar2 = this.y) == null || btpfVar2.f || !cfnr.f(this.k) || !cfnr.g(a2) || a2 != c) {
            z = true;
        }
        amvh d4 = vnkVar.d();
        cfpe cfpeVar = this.X;
        boolean z4 = !z;
        cfnq cfnqVar = cfnq.DIRECTIONS;
        Handler handler = new Handler();
        Long c2 = k.c();
        boolean booleanValue = k.d().booleanValue();
        String e = k.e();
        Runnable runnable = new Runnable(this) { // from class: zmj
            private final zmu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y();
            }
        };
        String s = d4 != null ? d4.s(this.b.getResources()) : "";
        if (d4 == null || !d4.n()) {
            dpumVar = null;
        } else {
            akqq akqqVar = d4.e;
            dbsk.s(akqqVar);
            dpumVar = akqqVar.h();
        }
        this.Y = cfpeVar.a(cfnqVar, z4, handler, c2, booleanValue, e, c, runnable, null, s, null, dpumVar, null);
        vwn d5 = l.d();
        amub amubVar4 = this.v;
        if (amubVar4 == null) {
            dbsgVar = dbpy.a;
        } else {
            btlt i3 = btlu.i(this.ad.j());
            if (i3 == btlt.SIGNED_OUT || i3 == btlt.INCOGNITO) {
                dbsgVar = dbpy.a;
            } else if (!this.ae.a()) {
                dbsgVar = dbpy.a;
            } else {
                if (amubVar4.h == dqvj.TRANSIT && this.Z.a()) {
                    amub amubVar5 = this.v;
                    dbsk.s(amubVar5);
                    if (!new vxg(amubVar5.d).a()) {
                        final String r = d5.r(d5.e());
                        if (r != null) {
                            dbsg h = ((dbsg) dbsg.j(amubVar4).h(zmk.a).c(dbpy.a)).h(new dbrn(r) { // from class: zml
                                private final String a;

                                {
                                    this.a = r;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    return SavedTrip.d(this.a, (SavedTrip.Data) obj);
                                }
                            });
                            final wih wihVar = this.ab;
                            wihVar.getClass();
                            dbsgVar = h.h(new dbrn(wihVar) { // from class: zmm
                                private final wih a;

                                {
                                    this.a = wihVar;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    return this.a.a((SavedTrip) obj);
                                }
                            });
                        }
                        dbsgVar = dbpy.a;
                    }
                }
                if (amubVar4.h == dqvj.DRIVE && this.Z.b()) {
                    final whm whmVar = this.ac;
                    whmVar.getClass();
                    dbsgVar = ((dbsg) dbsg.j(amubVar4).h(zmn.a).c(dbpy.a)).h(new dbrn(whmVar) { // from class: zmo
                        private final whm a;

                        {
                            this.a = whmVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            return this.a.a((SavedTrip.Data) obj);
                        }
                    });
                }
                dbsgVar = dbpy.a;
            }
        }
        if (dbsgVar.a()) {
            zmr zmrVar = new zmr(this);
            amub amubVar6 = this.v;
            dbsk.s(amubVar6);
            whrVar = this.aa.a((wgi) dbsgVar.b(), dcbg.b(amubVar6.d.y()).p(zmp.a), zmrVar);
        } else {
            whrVar = null;
        }
        this.af = whrVar;
        if (vnkVar.bj()) {
            zmsVar = new zms(this, vnkVar);
        }
        this.f = zmsVar;
    }

    @Override // defpackage.izl
    public Boolean a() {
        btpf btpfVar = this.y;
        boolean z = false;
        boolean z2 = btpfVar == null || !btpfVar.f || y().booleanValue();
        if (this.x && this.v != null && z2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void aa(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        cqkx.p(this);
    }

    public void ab(boolean z) {
        this.z = z;
    }

    public final void ac() {
        this.C = null;
        Y();
    }

    @Override // defpackage.izl
    @dzsi
    /* renamed from: ad */
    public String u() {
        if (am()) {
            return this.b.getString(R.string.PARKING_PAYMENT_TITLE);
        }
        return this.b.getString(R.string.ARWN_START_AR_DESCRIPTION);
    }

    public void ae(@dzsi qbr qbrVar) {
        this.W = qbrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.izl
    public Boolean b() {
        amub amubVar;
        if (a().booleanValue() || (amubVar = this.v) == null) {
            return false;
        }
        dqvj dqvjVar = amubVar.h;
        dqvj dqvjVar2 = dqvj.DRIVE;
        switch (dqvjVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 8:
                return true;
            case 4:
            case 7:
                break;
            case 6:
            default:
                bvoo.h("Missed travel mode: %s", dqvjVar.name());
                break;
        }
        return false;
    }

    @Override // defpackage.izl
    public Boolean c() {
        return Boolean.valueOf(!H().booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.f(r1) != false) goto L14;
     */
    @Override // defpackage.izl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer d() {
        /*
            r4 = this;
            boolean r0 = r4.w
            if (r0 == 0) goto L2c
            java.lang.Boolean r0 = r4.G()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L25
            bzgl r0 = r4.o
            amub r1 = r4.v
            boolean r2 = r0.h(r1)
            boolean r3 = r0.g()
            if (r3 == 0) goto L25
            if (r2 != 0) goto L2c
            boolean r0 = r0.f(r1)
            if (r0 == 0) goto L25
            goto L2c
        L25:
            r0 = 8
        L27:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L2c:
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmu.d():java.lang.Integer");
    }

    @Override // defpackage.izl
    public Boolean e() {
        amub amubVar;
        boolean z = true;
        if (!am() && (!this.d || (amubVar = this.v) == null || amubVar.h != dqvj.WALK)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izl
    public Boolean f() {
        boolean z = true;
        if (!this.U && !this.d) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izl
    @dzsi
    public View.OnLayoutChangeListener g() {
        if (!am()) {
            return new View.OnLayoutChangeListener(this) { // from class: zmq
                private final zmu a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    zmu zmuVar = this.a;
                    if (view.isShown()) {
                        arly a = zmuVar.c.a();
                        a.c = view;
                        a.a.a().a(a);
                    }
                }
            };
        }
        return null;
    }

    @Override // defpackage.izl
    public cqkl h(cjqm cjqmVar) {
        qib qibVar = this.D;
        if (qibVar != null) {
            Intent b = qibVar.c().b();
            if (this.V) {
                this.s.a(qibVar.a().c());
            }
            if (b != null) {
                this.N.a().f(this.b, b, 4);
            }
            return cqkl.a;
        }
        qhy qhyVar = this.E;
        if (qhyVar != null) {
            if (this.V) {
                this.s.a(qhyVar.a().c());
            }
            Intent b2 = qhyVar.b();
            if (b2 != null) {
                this.N.a().f(this.b, b2, 4);
            } else {
                amub amubVar = this.v;
                if (amubVar != null) {
                    this.r.b(amubVar, qhyVar.d(), qhyVar.f());
                }
            }
            return cqkl.a;
        }
        X();
        return cqkl.a;
    }

    @Override // defpackage.izl
    public cqkl i(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.izl
    public Boolean j() {
        return false;
    }

    @Override // defpackage.izl
    public cqkl l() {
        amub amubVar;
        if (!am()) {
            if (!this.M.a().a() || (amubVar = this.v) == null) {
                return cqkl.a;
            }
            if (!this.l.i()) {
                View findViewById = this.b.findViewById(16908290);
                if (findViewById != null) {
                    ckos.b(findViewById, R.string.ARWN_SNACKBAR_NO_NETWORK_CONNECTIVITY, 0).c();
                }
                return cqkl.a;
            } else if (!this.d) {
                ckos.b(this.b.findViewById(16908290), R.string.ARWN_UNAVAILABLE_AREA_DIRECTIONS, 0).c();
                return cqkl.a;
            } else {
                this.n.f(bzdd.d);
                arke c = arkf.c();
                ((arkg) c).a = amubVar;
                this.M.a().b().a(c.a());
                return cqkl.a;
            }
        }
        this.O.a().f();
        return cqkl.a;
    }

    @Override // defpackage.izl
    @dzsi
    public cjtd m() {
        ddes bZ;
        amub amubVar = this.v;
        if (amubVar == null) {
            return null;
        }
        cjta c = cjtd.c(vyb.t(amubVar.d));
        if (this.w) {
            c.d = dtyc.cP;
        } else if (this.D != null) {
            c.d = this.F ? dtxn.ei : dtxn.z;
            c.a();
        } else if (this.E != null) {
            c.d = dtxn.C;
            c.a();
        } else if (!an(amubVar)) {
            c.d = dtxn.aL;
        } else {
            c.d = dtxn.ay;
            akqi akqiVar = amubVar.k().d;
            if (akqiVar != null) {
                c.g = decs.a(akqiVar.c);
            }
            akqq akqqVar = amubVar.k().e;
            if (akqqVar != null) {
                ddet e = c.e();
                if (e != null) {
                    dsqp dsqpVar = (dsqp) e.cu(5);
                    dsqpVar.bC(e);
                    bZ = (ddes) dsqpVar;
                } else {
                    bZ = ddet.D.bZ();
                }
                dcvs b = dcvs.b(akqqVar.a, akqqVar.b);
                ddep ddepVar = ((ddet) bZ.b).c;
                if (ddepVar == null) {
                    ddepVar = ddep.f;
                }
                dsqp dsqpVar2 = (dsqp) ddepVar.cu(5);
                dsqpVar2.bC(ddepVar);
                ddeo ddeoVar = (ddeo) dsqpVar2;
                int b2 = b.f().b();
                if (ddeoVar.c) {
                    ddeoVar.bF();
                    ddeoVar.c = false;
                }
                ddep ddepVar2 = (ddep) ddeoVar.b;
                ddepVar2.a |= 4;
                ddepVar2.d = b2;
                int b3 = b.h().b();
                if (ddeoVar.c) {
                    ddeoVar.bF();
                    ddeoVar.c = false;
                }
                ddep ddepVar3 = (ddep) ddeoVar.b;
                ddepVar3.a |= 8;
                ddepVar3.e = b3;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddet ddetVar = (ddet) bZ.b;
                ddep bK = ddeoVar.bK();
                bK.getClass();
                ddetVar.c = bK;
                ddetVar.a |= 1;
                c.s(bZ.bK());
            }
        }
        return c.a();
    }

    @Override // defpackage.izl
    @dzsi
    public cjtd n() {
        amub amubVar = this.v;
        if (amubVar == null) {
            return null;
        }
        cjta c = cjtd.c(vyb.t(amubVar.d));
        if (this.D != null) {
            c.d = aq() ? dtxn.eh : dtxn.A;
            return c.a();
        } else if (this.E != null) {
            c.d = dtxn.D;
            return c.a();
        } else {
            amub amubVar2 = this.v;
            dbsk.s(amubVar2);
            if (amubVar2.h.equals(dqvj.BICYCLE)) {
                c.d = dtxn.L;
                return c.a();
            }
            c.d = dtxn.av;
            return c.a();
        }
    }

    @Override // defpackage.izl
    @dzsi
    public cjtd o() {
        if (am()) {
            return cjtd.a(dtxn.az);
        }
        return cjtd.a(dtxn.ah);
    }

    @Override // defpackage.izl
    @dzsi
    public String p() {
        return ag(false);
    }

    @Override // defpackage.izl
    @dzsi
    public String q() {
        return ag(true);
    }

    @Override // defpackage.izl
    public String r() {
        if (this.w) {
            return "";
        }
        if (this.D != null) {
            return ah(false);
        }
        qhy qhyVar = this.E;
        if (qhyVar == null || qhyVar.b() == null) {
            if (this.A) {
                return this.b.getString(R.string.PERSISTENT_FOOTER_STEPS_AND_PARKING);
            }
            return this.b.getString(R.string.PERSISTENT_FOOTER_STEPS_AND_MORE);
        }
        return ah(false);
    }

    @Override // defpackage.izl
    public String s() {
        qhy qhyVar = this.E;
        boolean z = false;
        if (qhyVar != null && qhyVar.b() != null) {
            z = true;
        }
        if (this.w) {
            return "";
        }
        if (this.D != null || z) {
            return r();
        }
        return this.b.getResources().getString(R.string.BOTTOM_SHEET_SHOW_MAP);
    }

    @Override // defpackage.izl
    @dzsi
    public String t() {
        if (am()) {
            return this.b.getString(R.string.PARKING_PAYMENT_TITLE);
        }
        if (this.k.getEnableFeatureParameters().aH) {
            return this.b.getString(R.string.ARWN_LIVE_VIEW);
        }
        return this.b.getString(R.string.ARWN_START_AR);
    }

    @Override // defpackage.izl
    public cqtd v() {
        if (this.w) {
            if (!ak()) {
                return cqrt.g(2131232359, irg.a());
            }
            return iva.g(2131231700, 2131231701);
        } else if (this.D != null || ao()) {
            return iut.a(cqrt.g(2131231616, irg.a()));
        } else {
            return ai(irg.a());
        }
    }

    @Override // defpackage.zei, defpackage.izl
    public cqtd w() {
        if (G().booleanValue()) {
            return iva.g(2131231700, 2131231701);
        }
        if (this.D != null || ao()) {
            return ai(irg.s());
        }
        if (af()) {
            return cqrt.g(2131232773, irg.s());
        }
        return cqrt.g(2131232316, irg.s());
    }

    @Override // defpackage.izl
    @dzsi
    public cqtd x() {
        if (am()) {
            return cqrt.g(2131232827, ibm.x());
        }
        if (!this.d) {
            return cqrt.g(2131232776, irg.h());
        }
        if (this.l.i()) {
            return cqrt.f(2131232778);
        }
        return cqrt.i(cqrt.f(2131232778), cqta.d(ar(R.color.qu_grey_800)));
    }

    @Override // defpackage.izl
    public Boolean y() {
        return Boolean.valueOf(af());
    }

    @Override // defpackage.izl
    public Integer z() {
        return Integer.valueOf((int) R.id.start_button);
    }

    @Override // defpackage.izl
    public cqkl k() {
        amub amubVar;
        if (this.D != null && this.v != null) {
            if (aq()) {
                bvjj bvjjVar = this.i;
                bvjk bvjkVar = bvjk.bO;
                qib qibVar = this.D;
                dbsk.s(qibVar);
                bvjjVar.ac(bvjkVar, qibVar.a().c());
                qbr qbrVar = this.W;
                dbsk.s(qbrVar);
                qbrVar.g(dqvj.BICYCLE, null);
            } else {
                qfv qfvVar = this.r;
                amub amubVar2 = this.v;
                dbsk.s(amubVar2);
                qib qibVar2 = this.D;
                dbsk.s(qibVar2);
                qhu c = qibVar2.c();
                GmmLocation a = qfvVar.b.a();
                if (a == null || !qfvVar.a(amubVar2, c.a())) {
                    dccx G = dcdc.G(amubVar2.ai());
                    amvg P = amvh.P();
                    P.d = c.a();
                    String e = c.e();
                    if (e == null) {
                        e = c.c().a();
                    }
                    P.j = e;
                    G.g(P.a());
                    G.h(amubVar2.af());
                    dcdc f = G.f();
                    vum vumVar = new vum();
                    vumVar.c(f);
                    vumVar.a = qfvVar.a.b(dqvj.BICYCLE, 3, vul.NAVIGATION_ONLY);
                    qfvVar.d.a().b(vumVar.a());
                } else {
                    qfvVar.c.a().d(qfvVar.c(a, amubVar2.k()), asca.BIKESHARING);
                }
            }
            return cqkl.a;
        } else if (!ao() || (amubVar = this.v) == null) {
            this.m.i();
            return cqkl.a;
        } else {
            qfv qfvVar2 = this.r;
            qhy qhyVar = this.E;
            dbsk.s(qhyVar);
            qhq d = qhyVar.d();
            qhy qhyVar2 = this.E;
            dbsk.s(qhyVar2);
            qfvVar2.b(amubVar, d, qhyVar2.f());
            return cqkl.a;
        }
    }
}
