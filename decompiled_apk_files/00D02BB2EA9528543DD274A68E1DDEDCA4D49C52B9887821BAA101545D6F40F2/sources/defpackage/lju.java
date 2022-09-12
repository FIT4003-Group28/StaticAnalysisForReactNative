package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lju  reason: default package */
/* loaded from: classes7.dex */
public final class lju implements non {
    public final lwn A;
    public final noj B;
    public final crzo<noi> C;
    public int D;
    public lwo E;
    private final dehq F;
    private final lzh G;
    private final kxu H;
    private final kxs I;
    private final crzm<Boolean> J;
    private final kzd K;
    private final ckmd L;
    @dzsi
    private final atdr M;
    @dzsi
    private noq N;
    private final npk O;
    private final Runnable P;
    private final Runnable Q;
    private final crzp<Boolean> R;
    private final noe S;
    private final jvp T;
    public final bvrb a;
    public final btrm b;
    public final bvjj c;
    public final nov d;
    public final cqkj e;
    public final ljt f;
    public final atcu g;
    public final atcw h;
    public final dbty<dcdc<ldm>> i;
    public final ktc j;
    public final liy k;
    public final kdg l;
    public final noo m;
    public final lky n;
    public final View o;
    public final nog p;
    public final not q;
    public final lsk r;
    public final ckco t;
    @dzsi
    public lrv u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final Object s = new Object();
    public boolean y = false;
    public boolean z = false;

    public lju(btxv btxvVar, bvrb bvrbVar, dehq dehqVar, btrm btrmVar, Application application, crem cremVar, cjqq cjqqVar, bvsl bvslVar, bvjj bvjjVar, dxio dxioVar, akfa akfaVar, brlz brlzVar, jzv jzvVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, ckcw ckcwVar, lzh lzhVar, kdg kdgVar, nov novVar, noo nooVar, cqkj cqkjVar, ljt ljtVar, ksi ksiVar, jzp jzpVar, atcu atcuVar, atcw atcwVar, atdr atdrVar, final kxu kxuVar, dbty dbtyVar, ViewGroup viewGroup, ahvo ahvoVar, noe noeVar, btpc btpcVar, liy liyVar, kcv kcvVar, crzm crzmVar, kzd kzdVar, jve jveVar, lkz lkzVar, noh nohVar, ckmd ckmdVar, noj nojVar, jvp jvpVar) {
        crzo<noi> crzoVar = new crzo<>(noi.DEFAULT);
        this.C = crzoVar;
        this.D = -1;
        this.E = lwo.LARGE;
        new ljm(this);
        this.P = new ljo(this);
        this.Q = new ljr(this);
        this.R = new ljs(this);
        this.a = bvrbVar;
        this.F = dehqVar;
        this.b = btrmVar;
        this.G = lzhVar;
        this.c = bvjjVar;
        this.d = novVar;
        this.l = kdgVar;
        this.e = cqkjVar;
        this.f = ljtVar;
        this.g = atcuVar;
        this.h = atcwVar;
        this.M = atdrVar;
        this.i = dbtyVar;
        this.H = kxuVar;
        this.k = liyVar;
        this.K = kzdVar;
        this.S = noeVar;
        this.m = nooVar;
        this.J = crzmVar;
        this.B = nojVar;
        this.T = jvpVar;
        if (kdgVar.o()) {
            int i = cqkjVar.d.getResources().getConfiguration().screenWidthDp;
            int i2 = cqkjVar.d.getResources().getConfiguration().screenHeightDp;
            crzoVar.b(nojVar.b());
        }
        this.L = ckmdVar;
        this.t = (ckco) ckcwVar.a(ckee.as);
        this.j = new ktc(new ljl(this));
        crzn<noi> crznVar = crzoVar.a;
        lja ljaVar = new lja(this);
        lkz.a(btxvVar, 1);
        bvrb a = lkzVar.a.a();
        lkz.a(a, 2);
        dehq a2 = lkzVar.b.a();
        lkz.a(a2, 3);
        Executor a3 = lkzVar.c.a();
        lkz.a(a3, 4);
        btrm a4 = lkzVar.d.a();
        lkz.a(a4, 5);
        lkz.a(application, 6);
        cqat a5 = lkzVar.e.a();
        lkz.a(a5, 7);
        lkz.a(crznVar, 8);
        lkz.a(cremVar, 9);
        lkz.a(ljaVar, 10);
        cjqy a6 = lkzVar.f.a();
        lkz.a(a6, 11);
        lkz.a(cjqqVar, 12);
        lkz.a(bvslVar, 13);
        btvo a7 = lkzVar.g.a();
        lkz.a(a7, 14);
        bvjj a8 = lkzVar.h.a();
        lkz.a(a8, 15);
        lkz.a(dxioVar, 16);
        lkz.a(akfaVar, 17);
        lkz.a(brlzVar, 18);
        lkz.a(jzvVar, 19);
        lkz.a(dxioVar2, 20);
        lkz.a(dxioVar3, 21);
        lkz.a(dxioVar4, 22);
        ckcw a9 = lkzVar.i.a();
        lkz.a(a9, 23);
        bvly a10 = lkzVar.j.a();
        lkz.a(a10, 24);
        bvlo a11 = lkzVar.k.a();
        lkz.a(a11, 25);
        cqhn a12 = lkzVar.l.a();
        lkz.a(a12, 26);
        lkz.a(cqkjVar, 27);
        lkz.a(ksiVar, 28);
        lkz.a(jzpVar, 29);
        lkz.a(atcuVar, 30);
        lkz.a(atcwVar, 31);
        lkz.a(ahvoVar, 32);
        lkz.a(btpcVar, 33);
        lwr a13 = lkzVar.m.a();
        lkz.a(a13, 34);
        lkz.a(kcvVar, 35);
        aufc a14 = lkzVar.n.a();
        lkz.a(a14, 36);
        lky lkyVar = new lky(btxvVar, a, a2, a3, a4, application, a5, crznVar, cremVar, ljaVar, a6, cjqqVar, bvslVar, a7, a8, dxioVar, akfaVar, brlzVar, jzvVar, dxioVar2, dxioVar3, dxioVar4, a9, a10, a11, a12, cqkjVar, ksiVar, jzpVar, atcuVar, atcwVar, ahvoVar, btpcVar, a13, kcvVar, a14);
        this.n = lkyVar;
        npk npkVar = new npk(viewGroup, cqkjVar, kcvVar, crzoVar.a);
        this.O = npkVar;
        this.o = npkVar.g;
        lwn lwnVar = new lwn(cqkjVar, npkVar, lkyVar.d);
        this.A = lwnVar;
        this.q = new lis(lwnVar, lkyVar.d);
        final kxn k = kxo.k();
        k.k();
        this.I = new kxs(npkVar.h, k, new Runnable(this, kxuVar, k) { // from class: ljc
            private final lju a;
            private final kxu b;
            private final kxn c;

            {
                this.a = this;
                this.b = kxuVar;
                this.c = k;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lju ljuVar = this.a;
                this.b.k(ljuVar.s, this.c.j());
            }
        });
        nog a15 = nohVar.a(noeVar, novVar);
        this.p = a15;
        lwq lwqVar = lkyVar.d;
        lsl lslVar = jveVar.a.e.aI;
        jvd jvdVar = new jvd(jveVar, lwqVar, lwnVar);
        lsl.a(jvdVar, 1);
        lsl.a(a15, 2);
        lsl.a(lslVar.a.a(), 3);
        this.r = new lsk(jvdVar, a15);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("CarNavigationNotificationsController: "));
        this.G.NX(String.valueOf(str).concat("  "), printWriter);
        this.p.NX(str, printWriter);
    }

    @Override // defpackage.non
    public final void a() {
        npk npkVar = this.O;
        npkVar.r.a(npkVar.n, dege.a);
        lky lkyVar = this.n;
        lkyVar.e.c();
        lkyVar.f.a(lkyVar.g, dege.a);
        this.n.a.as(this.Q);
        this.J.d(this.R, this.F);
        nog nogVar = this.p;
        ljt ljtVar = this.f;
        lwq lwqVar = this.n.d;
        lwn lwnVar = this.A;
        crzn<noi> crznVar = this.C.a;
        final atcu atcuVar = this.g;
        Runnable runnable = new Runnable(this) { // from class: ljd
            private final lju a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        };
        Runnable runnable2 = new Runnable(this) { // from class: lje
            private final lju a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        };
        ljf ljfVar = new ljf(this);
        final jvg jvgVar = (jvg) ljtVar;
        jvh jvhVar = jvgVar.e;
        lvv lvvVar = jvhVar.aO;
        kdg kdgVar = jvhVar.u;
        cqkj cqkjVar = jvhVar.v;
        dbty<atlq> dbtyVar = jvgVar.d;
        kxu kxuVar = jvhVar.C;
        lnh lnhVar = jvhVar.O;
        Context context = cqkjVar.d;
        cqhn cqhnVar = jvhVar.q;
        boolean o = kdgVar.o();
        noo nooVar = jvgVar.e.y;
        atcuVar.getClass();
        Runnable runnable3 = new Runnable(atcuVar) { // from class: jut
            private final atcu a;

            {
                this.a = atcuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        atcuVar.getClass();
        lta a = lta.a(context, cqhnVar, kdgVar, !o, nooVar, runnable3, runnable, new Runnable(atcuVar) { // from class: juw
            private final atcu a;

            {
                this.a = atcuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m();
            }
        }, runnable2, new Runnable(atcuVar) { // from class: jux
            private final atcu a;

            {
                this.a = atcuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        }, new Runnable(jvgVar) { // from class: juy
            private final jvg a;

            {
                this.a = jvgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e.m.d();
            }
        }, ljfVar, false);
        boolean z = jvgVar.e.aa;
        lvv.a(lvvVar.a.a(), 1);
        lvv.a(kdgVar, 2);
        lvv.a(cqkjVar, 3);
        lvv.a(lwqVar, 4);
        lvv.a(crznVar, 5);
        lvv.a(dbtyVar, 6);
        cjqy a2 = lvvVar.b.a();
        lvv.a(a2, 7);
        cjqq a3 = lvvVar.c.a();
        lvv.a(a3, 8);
        lvv.a(lwnVar, 9);
        lvv.a(kxuVar, 10);
        lvv.a(lnhVar, 11);
        ahvo a4 = lvvVar.d.a();
        lvv.a(a4, 12);
        lwa a5 = lvvVar.e.a();
        lvv.a(a5, 13);
        lvv.a(a, 14);
        nogVar.k(new lvu(kdgVar, cqkjVar, lwqVar, crznVar, dbtyVar, a2, a3, lwnVar, kxuVar, lnhVar, a4, a5, a, z));
        this.j.a();
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        ckmd ckmdVar = this.L;
        ckmdVar.b();
        ckmdVar.a.p(ckoh.a);
        this.z = true;
        m();
        this.j.c();
        noq d = this.p.d();
        dbsk.s(d);
        this.N = d;
        this.I.a();
        atdr atdrVar = this.M;
        if (atdrVar != null) {
            atdrVar.j(false);
        }
        if (!this.l.o()) {
            this.n.d.r(this.P);
        } else {
            lwq lwqVar = this.n.d;
            final jvp jvpVar = this.T;
            jvpVar.getClass();
            lwqVar.r(new Runnable(jvpVar) { // from class: ljg
                private final jvp a;

                {
                    this.a = jvpVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(null);
                }
            });
        }
        this.K.a();
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        ljt ljtVar = this.f;
        lwq lwqVar = this.n.d;
        atcw atcwVar = this.h;
        lji ljiVar = new lji(this);
        not notVar = this.q;
        jvg jvgVar = (jvg) ljtVar;
        jvh jvhVar = jvgVar.e;
        lst lstVar = jvhVar.av;
        cqkj cqkjVar = jvhVar.v;
        kdg kdgVar = jvhVar.u;
        ksi ksiVar = jvhVar.G;
        noo nooVar = jvhVar.y;
        nce nceVar = jvgVar.b;
        lxf lxfVar = jvgVar.c;
        kxu kxuVar = jvhVar.C;
        kcv kcvVar = jvhVar.s;
        btvo a = lstVar.a.a();
        lst.a(a, 1);
        bvsl a2 = lstVar.b.a();
        lst.a(a2, 2);
        cjqy a3 = lstVar.c.a();
        lst.a(a3, 3);
        cjqq a4 = lstVar.d.a();
        lst.a(a4, 4);
        btrm a5 = lstVar.e.a();
        lst.a(a5, 5);
        lst.a(cqkjVar, 6);
        jzp a6 = lstVar.f.a();
        lst.a(a6, 7);
        lst.a(kdgVar, 8);
        lst.a(ksiVar, 9);
        lst.a(nooVar, 10);
        lst.a(atcwVar, 11);
        lst.a(nceVar, 12);
        lst.a(lxfVar, 13);
        lst.a(ljiVar, 14);
        lst.a(notVar, 15);
        lst.a(kxuVar, 16);
        lst.a(kcvVar, 17);
        Executor a7 = lstVar.g.a();
        lst.a(a7, 18);
        this.p.k(new lss(a, a2, a3, a4, a5, cqkjVar, a6, kdgVar, nooVar, atcwVar, nceVar, lxfVar, ljiVar, notVar, kxuVar, kcvVar, a7));
        l();
        this.D = lut.a;
    }

    @Override // defpackage.non
    public final void e() {
        this.N = null;
        this.z = false;
        this.n.d.r(null);
        atdr atdrVar = this.M;
        if (atdrVar != null) {
            atdrVar.j(true);
        }
        this.I.b();
        this.H.l(this.s);
        this.j.d();
        this.p.e();
    }

    @Override // defpackage.non
    public final void f() {
        this.j.b();
        this.p.m();
        this.J.c(this.R);
        this.n.a.at(this.Q);
        lky lkyVar = this.n;
        lkyVar.f.c(lkyVar.g);
        lkyVar.e.d();
        cqkf<lwp> cqkfVar = this.A.b;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.w = false;
        this.y = false;
        npk npkVar = this.O;
        npkVar.r.c(npkVar.n);
    }

    @Override // defpackage.non
    public final String g() {
        return "NavigationGuidanceOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return true;
    }

    @Override // defpackage.non
    public final int i() {
        final int i;
        int n = n();
        if (n == 3 && this.j.c) {
            this.h.v();
            this.h.x();
        }
        if (this.p.f() == 1 && (i = this.D) != -1) {
            this.o.post(new Runnable(this, i) { // from class: ljh
                private final lju a;
                private final int b;

                {
                    this.a = this;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    View findViewById;
                    lju ljuVar = this.a;
                    int i2 = this.b;
                    if (ljuVar.j.a && (findViewById = ljuVar.o.findViewById(i2)) != null) {
                        nol.b(findViewById);
                    }
                }
            });
            this.D = -1;
        }
        return n;
    }

    public final void j() {
        ljt ljtVar = this.f;
        not notVar = this.q;
        jvg jvgVar = (jvg) ljtVar;
        jvh jvhVar = jvgVar.e;
        this.p.k(jvhVar.aM.a(jvhVar.v, notVar, jvhVar.y, jvhVar.u, jvhVar.C, jvhVar.X, jvhVar.Y, new jvf(jvgVar), jva.a, true));
        l();
        this.D = lut.a;
    }

    public final void k() {
        dcdc<ldm> a = this.i.a();
        dbsk.l(!a.isEmpty());
        dbsk.s(a);
        dbsk.l(!a.isEmpty());
        ljt ljtVar = this.f;
        zcr a2 = this.n.a.ar().a();
        dbty<dcdc<ldm>> dbtyVar = this.i;
        ljp ljpVar = new ljp(this, a);
        not notVar = this.q;
        lxf lxfVar = this.k.e;
        lwq lwqVar = this.n.d;
        jvg jvgVar = (jvg) ljtVar;
        jvh jvhVar = jvgVar.e;
        lml lmlVar = jvhVar.ao;
        cqkj cqkjVar = jvhVar.v;
        kdg kdgVar = jvhVar.u;
        kxu kxuVar = jvhVar.C;
        asmp asmpVar = jvgVar.a.b;
        lml.a(cqkjVar, 1);
        lml.a(kdgVar, 2);
        lml.a(a2, 3);
        lml.a(dbtyVar, 4);
        lml.a(ljpVar, 5);
        cjqy a3 = lmlVar.a.a();
        lml.a(a3, 6);
        cjqq a4 = lmlVar.b.a();
        lml.a(a4, 7);
        lml.a(notVar, 8);
        lml.a(kxuVar, 9);
        lml.a(asmpVar, 10);
        lml.a(lxfVar, 11);
        lml.a(lwqVar, 12);
        lmr a5 = lmlVar.c.a();
        lml.a(a5, 13);
        this.p.k(new lmk(cqkjVar, kdgVar, a2, dbtyVar, ljpVar, a3, a4, notVar, kxuVar, asmpVar, lxfVar, lwqVar, a5));
        l();
        this.D = lut.a;
    }

    public final void l() {
        if (!this.j.c) {
            this.G.b(this);
        } else if (this.v || this.n.d.c() != lwo.LARGE) {
            this.G.a(this);
        } else {
            this.G.b(this);
        }
    }

    public final void m() {
        this.n.b.n().isEmpty();
        this.n.b.q();
        lwn lwnVar = this.A;
        cqkf<lwp> cqkfVar = lwnVar.b;
        if (cqkfVar == null) {
            return;
        }
        cqkfVar.e(lwnVar.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n() {
        return this.p.b() == 1 ? 1 : 3;
    }

    public final void o(ldm ldmVar, dcdc<ldm> dcdcVar, kdk kdkVar, @dzsi vup vupVar, mnz mnzVar) {
        ljt ljtVar = this.f;
        nog nogVar = this.p;
        this.p.k(((jvg) ljtVar).a.c(ldmVar, null, vupVar, kdkVar, mnzVar, false, true, dcdcVar, null, this.q, nogVar));
    }
}
