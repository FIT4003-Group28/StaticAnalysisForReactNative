package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lkr  reason: default package */
/* loaded from: classes7.dex */
public final class lkr implements non {
    private static final cray[] A = new cray[0];
    private final Context B;
    private final btvo C;
    private final dxio<bvsf> D;
    private final akfa E;
    private final bvjj F;
    private final ckcw G;
    private final kdg H;
    private final kxu I;
    private final lev J;
    private final qbo K;
    private final awpk L;
    private final lnh M;
    private final crmt N;
    private final dbsg<vxn> O;
    private final atdd P;
    private final lsu Q;
    private final mxt R;
    @dzsi
    private vup S;
    private final Runnable T;
    private final ktb U;
    private final Runnable V;
    private final kqm W;
    private final kql X;
    private final atdc Y;
    private final lkf Z;
    public final Executor a;
    private final lkg aa;
    public final ahjq b;
    public final lzf c;
    public final cqkj d;
    public final akox e;
    public final kcw f;
    public final nov g;
    public final kcv h;
    public final noo i;
    public final kdi j;
    public final lkq k;
    public final lkn l;
    public final kzd m;
    public dcdc<ldm> n;
    public final nog o;
    public final ksr p;
    @dzsi
    public final llb q;
    public final Runnable r;
    public final lju s;
    public final liy t;
    public final boolean u;
    @dzsi
    public atlq v;
    public final ktc y;
    public int z = 1;
    public boolean w = false;
    public final List<Runnable> x = new ArrayList();

    public lkr(btrm btrmVar, bwqv bwqvVar, btvo btvoVar, dxio dxioVar, akfa akfaVar, bvjj bvjjVar, ckcw ckcwVar, ahjq ahjqVar, lzf lzfVar, ksr ksrVar, cqkj cqkjVar, kdg kdgVar, akox akoxVar, kxu kxuVar, lev levVar, qbo qboVar, kcw kcwVar, nov novVar, kcv kcvVar, noo nooVar, juk jukVar, lkn lknVar, awpk awpkVar, dcdc dcdcVar, lzc lzcVar, nog nogVar, lnh lnhVar, llb llbVar, lkm lkmVar, kzd kzdVar, cqat cqatVar, Executor executor, Executor executor2, jzv jzvVar, Runnable runnable, dbsg dbsgVar) {
        lkb lkbVar = new lkb(this);
        this.U = lkbVar;
        this.y = new ktc(lkbVar);
        this.V = new lkc(this);
        this.W = new lkd(this);
        this.Z = new lkf(this);
        this.aa = new lkg(this);
        this.X = new lkh(this);
        lkj lkjVar = new lkj(this);
        this.Y = lkjVar;
        dbsk.s(executor);
        this.a = executor;
        Context context = cqkjVar.d;
        this.B = context;
        dbsk.s(btvoVar);
        this.C = btvoVar;
        this.D = dxioVar;
        dbsk.s(akfaVar);
        this.E = akfaVar;
        dbsk.s(bvjjVar);
        this.F = bvjjVar;
        dbsk.s(ckcwVar);
        this.G = ckcwVar;
        dbsk.s(ahjqVar);
        this.b = ahjqVar;
        dbsk.s(lzfVar);
        this.c = lzfVar;
        dbsk.s(ksrVar);
        this.p = ksrVar;
        dbsk.s(cqkjVar);
        this.d = cqkjVar;
        dbsk.s(kdgVar);
        this.H = kdgVar;
        dbsk.s(akoxVar);
        this.e = akoxVar;
        dbsk.s(kxuVar);
        this.I = kxuVar;
        dbsk.s(levVar);
        this.J = levVar;
        dbsk.s(qboVar);
        this.K = qboVar;
        dbsk.s(kcwVar);
        this.f = kcwVar;
        dbsk.s(novVar);
        this.g = novVar;
        dbsk.s(kcvVar);
        this.h = kcvVar;
        dbsk.s(nooVar);
        this.i = nooVar;
        dbsk.s(lknVar);
        this.l = lknVar;
        dbsk.s(awpkVar);
        this.L = awpkVar;
        dbsk.s(lnhVar);
        this.M = lnhVar;
        this.q = llbVar;
        dbsk.s(nogVar);
        this.o = nogVar;
        crmt crmtVar = new crmt(bwqvVar, context.getApplicationContext(), executor, executor2, btsp.c(jzvVar), cqatVar);
        this.N = crmtVar;
        dbsk.s(kzdVar);
        this.m = kzdVar;
        dbsk.s(lzcVar);
        dbsk.s(runnable);
        this.T = runnable;
        this.O = dbsgVar;
        if (!dcdcVar.isEmpty()) {
            this.n = dcdcVar;
        } else {
            amte a = crmtVar.a();
            if (a != null) {
                this.n = ldm.i(a, context.getResources());
            } else {
                bvoo.j(new IllegalStateException("Could not determine destination list"));
                this.n = dcdc.e();
            }
        }
        lkp lkpVar = new lkp(this);
        liy a2 = lkmVar.a(lkjVar, lkpVar, new lxj(this) { // from class: ljw
            private final lkr a;

            {
                this.a = this;
            }

            @Override // defpackage.lxj
            public final void a(aryn arynVar) {
                lkr lkrVar = this.a;
                if (!lkrVar.f.i(arynVar)) {
                    lkrVar.o(ldm.c(arynVar.g(), arynVar.a()), kdk.NOTHING, null, mnz.MAP_INTERACTION_POI, false);
                }
            }
        });
        this.t = a2;
        final atdd atddVar = a2.b;
        this.P = atddVar;
        lsu lsuVar = new lsu(btrmVar, atddVar, amuh.b, A, ((amsn) amuh.b).a);
        this.Q = lsuVar;
        atddVar.getClass();
        final dbty dbtyVar = new dbty(atddVar) { // from class: ljx
            private final atdd a;

            {
                this.a = atddVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.t();
            }
        };
        lxf lxfVar = a2.e;
        juo juoVar = jukVar.a;
        nog nogVar2 = jukVar.b;
        jvh jvhVar = juoVar.a;
        jvg jvgVar = new jvg(jvhVar, new jur(jvhVar, nogVar2, atddVar, new dbty(dbtyVar) { // from class: jul
            private final dbty a;

            {
                this.a = dbtyVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return (astc) this.a.a();
            }
        }, new moe()), lsuVar, lxfVar, dbtyVar);
        this.k = jvgVar;
        this.j = jvgVar.a;
        this.R = new mxq(vxi.d(new vxa(btvoVar, dxioVar, btsp.c(bvjjVar), btsp.c(new vxo(btsp.c(bvjjVar), btsp.c(akfaVar), null, dbsgVar)), null, null, null, dbpy.a, dbpy.a, dbpy.a, dbpy.a, dbpy.a, null).c(dqvj.DRIVE, 3, vul.NAVIGATION_ONLY)));
        atdd atddVar2 = a2.b;
        atdr atdrVar = a2.f;
        dbty dbtyVar2 = new dbty(this) { // from class: ljy
            private final lkr a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.n;
            }
        };
        jvg jvgVar2 = jvgVar;
        jvh jvhVar2 = jvgVar2.e;
        ljv ljvVar = jvhVar2.ad;
        kdg kdgVar2 = jvhVar2.u;
        nov novVar2 = jvhVar2.x;
        noo nooVar2 = jvhVar2.y;
        cqkj cqkjVar2 = jvhVar2.v;
        ksi ksiVar = jvhVar2.G;
        kxu kxuVar2 = jvhVar2.C;
        ViewGroup viewGroup = jvhVar2.W;
        noe noeVar = jvhVar2.bg;
        kcv kcvVar2 = jvhVar2.s;
        crzm<Boolean> b = jvhVar2.be.b();
        kzd kzdVar2 = jvgVar2.e.D;
        jve jveVar = new jve(jvgVar2);
        noj nokVar = jvgVar2.e.u.o() ? new nok() : new noc();
        jvp jvpVar = jvgVar2.e.ba;
        noj nojVar = nokVar;
        btxv a3 = ljvVar.a.a();
        ljv.a(a3, 1);
        bvrb a4 = ljvVar.b.a();
        ljv.a(a4, 2);
        dehq a5 = ljvVar.c.a();
        ljv.a(a5, 3);
        ljv.a(ljvVar.d.a(), 4);
        btrm a6 = ljvVar.e.a();
        ljv.a(a6, 5);
        Application a7 = ljvVar.f.a();
        ljv.a(a7, 6);
        ljv.a(ljvVar.g.a(), 7);
        crem a8 = ljvVar.h.a();
        ljv.a(a8, 8);
        ljv.a(ljvVar.i.a(), 9);
        cjqq a9 = ljvVar.j.a();
        ljv.a(a9, 10);
        bvsl a10 = ljvVar.k.a();
        ljv.a(a10, 11);
        ljv.a(ljvVar.l.a(), 12);
        bvjj a11 = ljvVar.m.a();
        ljv.a(a11, 13);
        dxio a12 = ((dxjh) ljvVar.n).a();
        ljv.a(a12, 14);
        akfa a13 = ljvVar.o.a();
        ljv.a(a13, 15);
        brlz a14 = ljvVar.p.a();
        ljv.a(a14, 16);
        jzv a15 = ljvVar.q.a();
        ljv.a(a15, 17);
        dxio a16 = ((dxjh) ljvVar.r).a();
        ljv.a(a16, 18);
        dxio a17 = ((dxjh) ljvVar.s).a();
        ljv.a(a17, 19);
        dxio a18 = ((dxjh) ljvVar.t).a();
        ljv.a(a18, 20);
        ckcw a19 = ljvVar.u.a();
        ljv.a(a19, 21);
        ljv.a(ljvVar.v.a(), 22);
        ljv.a(ljvVar.w.a(), 23);
        ljv.a(ljvVar.x.a(), 24);
        lzh a20 = ljvVar.y.a();
        ljv.a(a20, 25);
        ljv.a(kdgVar2, 26);
        ljv.a(novVar2, 27);
        ljv.a(nooVar2, 28);
        ljv.a(cqkjVar2, 29);
        ljv.a(ljvVar.z.a(), 30);
        ljv.a(jvgVar, 31);
        ljv.a(ksiVar, 32);
        jzp a21 = ljvVar.A.a();
        ljv.a(a21, 33);
        ljv.a(lkpVar, 34);
        ljv.a(atddVar2, 35);
        ljv.a(kxuVar2, 37);
        ljv.a(dbtyVar2, 38);
        ljv.a(viewGroup, 39);
        ahvo a22 = ljvVar.B.a();
        ljv.a(a22, 40);
        ljv.a(noeVar, 41);
        btpc a23 = ljvVar.C.a();
        ljv.a(a23, 42);
        ljv.a(a2, 43);
        ljv.a(kcvVar2, 44);
        ljv.a(b, 45);
        ljv.a(kzdVar2, 46);
        ljv.a(jveVar, 47);
        lkz a24 = ljvVar.D.a();
        ljv.a(a24, 48);
        noh a25 = ljvVar.E.a();
        ljv.a(a25, 49);
        ckmd a26 = ljvVar.F.a();
        ljv.a(a26, 50);
        ljv.a(nojVar, 51);
        ljv.a(jvpVar, 52);
        final lju ljuVar = new lju(a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, kdgVar2, novVar2, nooVar2, cqkjVar2, jvgVar, ksiVar, a21, lkpVar, atddVar2, atdrVar, kxuVar2, dbtyVar2, viewGroup, a22, noeVar, a23, a2, kcvVar2, b, kzdVar2, jveVar, a24, a25, a26, nojVar, jvpVar);
        this.s = ljuVar;
        this.r = new Runnable(ljuVar) { // from class: ljz
            private final lju a;

            {
                this.a = ljuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lju ljuVar2 = this.a;
                ljuVar2.n.a.aw();
                ljuVar2.m();
                atxz m = ljuVar2.n.a.m();
                boolean z = false;
                if (m != null && m.n().a() == crqv.WAYPOINT_ALERT) {
                    if (ljuVar2.z) {
                        ljuVar2.t.a(1);
                    } else {
                        ljuVar2.t.a(0);
                    }
                }
                if (m != null || !ljuVar2.x || ljuVar2.y || ljuVar2.u == null || ljuVar2.p.f() != 1) {
                    if (m != null && m.n().a() == crqv.WAYPOINT_ALERT) {
                        z = true;
                    }
                    ljuVar2.x = z;
                    non j = ljuVar2.p.j();
                    lrv lrvVar = ljuVar2.u;
                    if (ljuVar2.p.f() > 1 && ljuVar2.p.j() != ljuVar2.r.b) {
                        if (j != lrvVar || !ljuVar2.x) {
                            return;
                        }
                        ljuVar2.p.n();
                    }
                    if (m != null) {
                        lsk lskVar = ljuVar2.r;
                        lskVar.a();
                        lskVar.c = m;
                        if (m.af()) {
                            m.Oa();
                        } else {
                            jvd jvdVar = lskVar.d;
                            jve jveVar2 = jvdVar.a;
                            lwq lwqVar = jvdVar.b;
                            lwn lwnVar = jvdVar.c;
                            jvh jvhVar3 = jveVar2.a.e;
                            cqkj cqkjVar3 = jvhVar3.v;
                            kxu kxuVar3 = jvhVar3.C;
                            kdg kdgVar3 = jvhVar3.u;
                            lsq.a(cqkjVar3, 1);
                            lsq.a(lwqVar, 2);
                            lsq.a(lwnVar, 3);
                            lsq.a(kxuVar3, 4);
                            lsq.a(m, 5);
                            lsq.a(kdgVar3, 6);
                            lskVar.b = new lsp(cqkjVar3, lwqVar, lwnVar, kxuVar3, m, kdgVar3);
                            lskVar.a.k(lskVar.b);
                        }
                    } else {
                        ljuVar2.r.a();
                    }
                    ljuVar2.l();
                    return;
                }
                ljuVar2.x = false;
                ljuVar2.r.a();
                nog nogVar3 = ljuVar2.p;
                lrv lrvVar2 = ljuVar2.u;
                dbsk.s(lrvVar2);
                nogVar3.k(lrvVar2);
            }
        };
        kdgVar.o();
        this.u = false;
    }

    @dzsi
    private static crqf p(atlq atlqVar) {
        if (atlqVar != null) {
            return atlqVar.m;
        }
        return null;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        int size = this.n.size();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append(str);
        sb.append("numDestinations: ");
        sb.append(size);
        printWriter.println(sb.toString());
        this.o.NX(str, printWriter);
        liy liyVar = this.t;
        printWriter.println(String.valueOf(str).concat("NavigationControllerContainer:"));
        lxf lxfVar = liyVar.e;
        printWriter.println(String.valueOf(str).concat("NavigationMapController:"));
        atlq atlqVar = lxfVar.h;
        if (atlqVar != null) {
            Iterator<amub> it = atlqVar.m.f().iterator();
            while (it.hasNext()) {
                amub next = it.next();
                Object e = dcdc.e();
                dpeq dpeqVar = next.s;
                if (dpeqVar != null && (dpeqVar.a & 16) != 0) {
                    dpep dpepVar = dpeqVar.k;
                    if (dpepVar == null) {
                        dpepVar = dpep.b;
                    }
                    e = dchl.k(dpepVar.a, atdi.a);
                }
                String valueOf = String.valueOf(next);
                String valueOf2 = String.valueOf(e);
                int length = String.valueOf(str).length();
                StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                sb2.append(str);
                sb2.append("  route:  ");
                sb2.append(valueOf);
                sb2.append("  trafficData: ");
                sb2.append(valueOf2);
                printWriter.println(sb2.toString());
            }
        }
        String n = atdm.n(lxfVar.j);
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(n).length());
        sb3.append(str);
        sb3.append("  LastDrawnPolyline: ");
        sb3.append(n);
        printWriter.println(sb3.toString());
        String n2 = atdm.n(lxfVar.i);
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(n2).length());
        sb4.append(str);
        sb4.append("  LastClearedPolyline: ");
        sb4.append(n2);
        printWriter.println(sb4.toString());
        int i = lxfVar.g;
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 30);
        sb5.append(str);
        sb5.append("  routeCountLimit: ");
        sb5.append(i);
        printWriter.println(sb5.toString());
        atdd atddVar = liyVar.b;
        printWriter.println(String.valueOf(str).concat("NavigationFragmentStateTracker:"));
        String valueOf3 = String.valueOf(atddVar.l);
        StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(valueOf3).length());
        sb6.append(str);
        sb6.append("  last NavigationServiceStateEvent: ");
        sb6.append(valueOf3);
        printWriter.println(sb6.toString());
        String valueOf4 = String.valueOf(atddVar.k);
        StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(valueOf4).length());
        sb7.append(str);
        sb7.append("  last NavigationServiceStateEvent timestamp: ");
        sb7.append(valueOf4);
        printWriter.println(sb7.toString());
        String valueOf5 = String.valueOf(((atlo) atddVar.a).c.a);
        StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(valueOf5).length());
        sb8.append(str);
        sb8.append("  CameraMode: ");
        sb8.append(valueOf5);
        printWriter.println(sb8.toString());
    }

    @Override // defpackage.non
    public final void a() {
        atlq t = this.P.t();
        k(t);
        j(t);
        this.o.k(this.s);
        liy liyVar = this.t;
        lju ljuVar = this.s;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ljuVar.n.c);
        arrayList.add(ljuVar.n.a);
        arrayList.add(new ljn(ljuVar, ljuVar.g, ljuVar.h));
        liyVar.a.addAll(arrayList);
        this.L.h(this.t.b);
        this.t.NZ(null);
        this.y.a();
        lnh lnhVar = this.M;
        btlu j = lnhVar.a.j();
        if (j != null && btlu.i(j) == btlt.GOOGLE) {
            lnhVar.c.a().b(j);
        }
        lnhVar.b.a().k();
        kty.b(this.G);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        this.y.c();
        this.H.m(kdd.GUIDED_NAV);
        this.H.i(this);
        boolean z = true;
        if (this.H.o()) {
            this.H.g(this, true);
        }
        this.f.d(this.W);
        kcw kcwVar = this.f;
        lkf lkfVar = this.Z;
        if (kcwVar.c != null) {
            z = false;
        }
        dbsk.l(z);
        kcwVar.c = lkfVar;
        kcw kcwVar2 = this.f;
        kcwVar2.d = this.aa;
        kcwVar2.f(this.X);
        this.I.o(this.V);
        return this.o.d();
    }

    public final void d() {
        this.y.e();
        this.s.j.e();
    }

    @Override // defpackage.non
    public final void e() {
        leu leuVar;
        atlq atlqVar = this.v;
        if (atlqVar != null) {
            if (atlqVar.c.a == asld.FOLLOWING) {
                leuVar = leu.ENTER_FOLLOW_MODE;
            } else {
                leuVar = leu.DO_NOTHING;
            }
            this.J.a(leuVar);
        }
        this.o.e();
        this.I.p(this.V);
        kcw kcwVar = this.f;
        boolean z = false;
        dbsk.l(kcwVar.c != null);
        kcwVar.c = null;
        this.f.e(this.W);
        kcw kcwVar2 = this.f;
        if (kcwVar2.d != null) {
            z = true;
        }
        dbsk.l(z);
        kcwVar2.d = null;
        this.f.g();
        this.K.h();
        this.H.j(this);
        if (this.H.o()) {
            this.H.h(this, true);
        }
        this.H.n(kdd.GUIDED_NAV);
        this.y.d();
        this.m.b(null);
    }

    @Override // defpackage.non
    public final void f() {
        this.o.m();
        this.t.Qp();
        this.y.b();
    }

    @Override // defpackage.non
    public final String g() {
        return "NavigationOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        return this.o.b();
    }

    public final void j(atlq atlqVar) {
        dwao c;
        crqf p = p(atlqVar);
        if (p == null || !p.f().j()) {
            c = new vxa(this.C, this.D, btsp.c(this.F), btsp.c(new vxo(btsp.c(this.F), btsp.c(this.E), null, this.O)), null, null, null, dbpy.a, dbpy.a, dbpy.a, dbpy.a, dbpy.a, null).c(dqvj.DRIVE, 3, vul.DIRECTIONS_UI);
        } else {
            c = p.f().k().J;
        }
        vup d = vxi.d(c);
        vup vupVar = this.S;
        if (vupVar == null || !vupVar.equals(d)) {
            mxq mxqVar = (mxq) this.R;
            for (vux vuxVar : mxqVar.a.a.keySet()) {
                Integer a = d.a(vuxVar);
                if (a != null) {
                    mxqVar.a.b(vuxVar, a.intValue());
                }
            }
            for (mye myeVar : mxqVar.b) {
                myf myfVar = myeVar.a;
                if (!myfVar.c) {
                    vup a2 = myfVar.a.a();
                    for (vux vuxVar2 : myeVar.a.b.a.keySet()) {
                        Integer a3 = a2.a(vuxVar2);
                        if (a3 != null) {
                            myeVar.a.b.b(vuxVar2, a3.intValue());
                        }
                    }
                    cqkx.p(myeVar.a);
                }
            }
            this.S = d;
            llb llbVar = this.q;
            if (llbVar == null || p == null) {
                return;
            }
            llbVar.a(p.g().a);
        }
    }

    public final void k(atlq atlqVar) {
        int b;
        crqf p = p(atlqVar);
        if (p == null) {
            this.Q.s(amuh.b, new cray[0], ((amsn) amuh.b).a);
            this.Q.k(false);
            return;
        }
        lsu lsuVar = this.Q;
        amuh f = p.f();
        cray[] h = p.h();
        if (atlqVar == null) {
            b = ((amsn) amuh.b).a;
        } else if (atlqVar.s) {
            b = atlqVar.t;
        } else {
            crqf crqfVar = atlqVar.m;
            b = crqfVar == null ? ((amsn) amuh.b).a : crqfVar.f().b();
        }
        lsuVar.s(f, h, b);
        this.Q.k(p.g);
    }

    public final void l() {
        this.g.a();
        while (this.o.j() != this.s) {
            this.o.n();
        }
        do {
        } while (this.s.n() == 1);
        this.g.b();
    }

    public final void m() {
        this.g.a();
        lju ljuVar = this.s;
        ljt ljtVar = ljuVar.f;
        not notVar = ljuVar.q;
        nog nogVar = ljuVar.p;
        jvg jvgVar = (jvg) ljtVar;
        final jur jurVar = jvgVar.a;
        jurVar.getClass();
        dbty<lxh> dbtyVar = new dbty(jurVar) { // from class: juz
            private final jur a;

            {
                this.a = jurVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.t();
            }
        };
        jvh jvhVar = jvgVar.e;
        nfc nfcVar = jvhVar.aQ;
        nfh nfhVar = jvhVar.S;
        kdg kdgVar = jvhVar.u;
        cqkj cqkjVar = jvhVar.v;
        kcv kcvVar = jvhVar.s;
        nem nemVar = jvhVar.ap;
        akox akoxVar = jvhVar.A;
        kxu kxuVar = jvhVar.C;
        aufc a = jvhVar.p.a();
        jvh jvhVar2 = jvgVar.e;
        nemVar.a(kcvVar, akoxVar, kxuVar, dbtyVar, kdgVar, a, jvhVar2.y, nogVar, jvgVar.a, notVar, jvhVar2.v, jvhVar2.bc, jvhVar2.n);
        jvh jvhVar3 = jvgVar.e;
        jvhVar3.aq.a(jvhVar3.C, dbtyVar, jvhVar3.u, jvhVar3.y, nogVar, jvgVar.a, jvhVar3.V, jvhVar3.v, jvhVar3.bc);
        jvh jvhVar4 = jvgVar.e;
        noo nooVar = jvhVar4.y;
        jur jurVar2 = jvgVar.a;
        ljuVar.p.k(nfcVar.a(nfhVar, kdgVar, cqkjVar, notVar, nogVar, nooVar, jurVar2, jvhVar4.bc, jvhVar4.z, jvhVar4.C, dbtyVar, jurVar2.b, false));
        ljuVar.l();
        ljuVar.D = lut.a;
        this.g.b();
    }

    public final void n() {
        this.w = false;
        for (Runnable runnable : this.x) {
            runnable.run();
        }
        this.x.clear();
    }

    public final void o(ldm ldmVar, kdk kdkVar, @dzsi vup vupVar, mnz mnzVar, boolean z) {
        lkr lkrVar;
        this.g.a();
        if (z) {
            this.i.a();
        }
        int i = mnzVar.x;
        if (i < 200 || i >= 300) {
            lkrVar = this;
            lkrVar.s.o(ldmVar, lkrVar.n, kdkVar, vupVar, mnzVar);
        } else {
            lju ljuVar = this.s;
            dcdc<ldm> dcdcVar = this.n;
            ksr ksrVar = this.p;
            ljuVar.d.a();
            ljuVar.m.a();
            ljt ljtVar = ljuVar.f;
            nog nogVar = ljuVar.p;
            not notVar = ljuVar.q;
            jvg jvgVar = (jvg) ljtVar;
            axxb a = jvgVar.e.e.getCarParameters().i ? jvgVar.e.i.a() : null;
            axwi a2 = jvgVar.e.e.getCarParameters().i ? jvgVar.e.j.a() : null;
            dbsk.l(jvgVar.e.N.isDone());
            jvh jvhVar = jvgVar.e;
            mip mipVar = jvhVar.ah;
            cqkj cqkjVar = jvhVar.v;
            Context context = cqkjVar.d;
            nov novVar = jvhVar.x;
            ksh kshVar = jvhVar.L;
            ksi ksiVar = jvhVar.G;
            qbo qboVar = jvhVar.H;
            kcw kcwVar = jvhVar.I;
            akox akoxVar = jvhVar.A;
            hwe hweVar = jvhVar.B;
            kxu kxuVar = jvhVar.C;
            lzf lzfVar = (lzf) deha.s(jvhVar.N);
            jvh jvhVar2 = jvgVar.e;
            ljuVar.p.k(mipVar.a(context, novVar, kshVar, ksiVar, qboVar, ksrVar, kcwVar, cqkjVar, notVar, akoxVar, hweVar, kxuVar, lzfVar, jvhVar2.bc, jvgVar.a, nogVar, jvhVar2.M.a(), jvgVar.a.b, ldmVar, new ncf(jvgVar.e.v.d, ldmVar), dcdcVar, null, null, kdk.NAVIGATE, mnzVar, false, jvgVar.e.Z, new mwp(jvgVar.a, nogVar), false, null, a, a2, jvgVar.a.d));
            ljuVar.d.b();
            ljuVar.l();
            lkrVar = this;
        }
        lkrVar.g.b();
    }
}
