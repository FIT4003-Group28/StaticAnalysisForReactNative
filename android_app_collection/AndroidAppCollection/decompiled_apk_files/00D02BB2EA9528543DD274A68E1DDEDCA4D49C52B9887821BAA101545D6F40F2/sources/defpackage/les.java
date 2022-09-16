package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: les  reason: default package */
/* loaded from: classes7.dex */
public final class les implements non, asxu, mcn {
    private final kqm A;
    @dzsi
    private final lfk B;
    private final brlh C;
    @dzsi
    private final kye D;
    @dzsi
    private final aktm E;
    private boolean F;
    private boolean G;
    private final asxv H;
    private final ktb I;
    private final klt J;
    private final Runnable K;
    private final Runnable L;
    public final cjqy a;
    public final cjqq b;
    public final ckcw c;
    public final cqkj d;
    public final akox e;
    public final kcw f;
    public final nov g;
    public final kdi h;
    public final ler i;
    public final awpk j;
    public final nog k;
    public final not l;
    public final leb m;
    public final asxm n;
    public final kdg o;
    public final lzh p;
    public final kaj q;
    public final btvo r;
    public final ktc s;
    public final jvp t;
    private final dehq u;
    private final bvrb v;
    private final lev w;
    private final arbu x;
    private final Future<lzf> y;
    private final kxu z;

    public les(cqhn cqhnVar, cqat cqatVar, bvnx bvnxVar, cjqy cjqyVar, cjqq cjqqVar, btrm btrmVar, ckcw ckcwVar, dxio dxioVar, bvjj bvjjVar, bnwn bnwnVar, dxio dxioVar2, brlz brlzVar, jzv jzvVar, dxio dxioVar3, akfa akfaVar, bvrb bvrbVar, dehq dehqVar, Executor executor, btvo btvoVar, bvsl bvslVar, dxio dxioVar4, crem cremVar, lzh lzhVar, cqkj cqkjVar, lev levVar, arbu arbuVar, akox akoxVar, kdg kdgVar, jvp jvpVar, asvx asvxVar, kcv kcvVar, kcw kcwVar, nov novVar, noo nooVar, juf jufVar, qbo qboVar, not notVar, kxu kxuVar, awpk awpkVar, jzp jzpVar, broq broqVar, Future future, nog nogVar, asik asikVar, dxio dxioVar5, brcw brcwVar, dxio dxioVar6, ahjq ahjqVar, axwq axwqVar, btrm btrmVar2, ksr ksrVar, dzsj dzsjVar, dxio dxioVar7, crfr crfrVar, npz npzVar, kaj kajVar, brlh brlhVar, koc kocVar) {
        asxm asxmVar;
        dcdc f;
        les lesVar = this;
        lesVar.H = new lej(lesVar);
        lem lemVar = new lem(lesVar);
        lesVar.I = lemVar;
        lesVar.s = new ktc(lemVar);
        lesVar.J = new leo(lesVar);
        lesVar.K = new lep(lesVar);
        lesVar.L = new leq(lesVar);
        lesVar.u = dehqVar;
        lesVar.a = cjqyVar;
        lesVar.b = cjqqVar;
        lesVar.c = ckcwVar;
        lesVar.v = bvrbVar;
        lesVar.d = cqkjVar;
        lesVar.w = levVar;
        lesVar.x = arbuVar;
        lesVar.e = akoxVar;
        lesVar.f = kcwVar;
        lesVar.g = novVar;
        lesVar.j = awpkVar;
        lesVar.y = future;
        lesVar.k = nogVar;
        lesVar.l = notVar;
        lesVar.o = kdgVar;
        lesVar.p = lzhVar;
        lesVar.t = jvpVar;
        lesVar.q = kajVar;
        lesVar.C = brlhVar;
        lesVar.r = btvoVar;
        lesVar.z = kxuVar;
        final asxm asxmVar2 = new asxm(lesVar, btvoVar, btrmVar);
        lesVar.n = asxmVar2;
        if (jzpVar.a()) {
            asxmVar = asxmVar2;
            lesVar = this;
            lesVar.B = new lfk(cqkjVar, notVar, btrmVar, asxmVar2, bvslVar, jzpVar, this, kxuVar, kdgVar, new lec(lesVar), cjqyVar, cjqqVar, new lxh(new dbty(asxmVar2) { // from class: led
                private final asxm a;

                {
                    this.a = asxmVar2;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return this.a.t();
                }
            }, kxuVar, akoxVar, bvnxVar), btvoVar, ahjqVar, axwqVar, akfaVar, dehqVar, btrmVar2, bvjjVar, cqatVar, ksrVar, bvrbVar, dzsjVar, crfrVar, (aufc) dxioVar5.a(), npzVar, kcvVar);
        } else {
            asxmVar = asxmVar2;
            lesVar.B = null;
        }
        Context context = cqkjVar.d;
        lfk lfkVar = lesVar.B;
        if (lfkVar == null) {
            f = dcdc.e();
        } else {
            f = dcdc.f(lfkVar.b);
        }
        leb lebVar = new leb(cqhnVar, context, btrmVar, bvjjVar, dxioVar2, brlzVar, jzvVar, dxioVar3, btvoVar, ckcwVar, akfaVar, cjqyVar, cjqqVar, dehqVar, executor, cremVar, dxioVar, cqatVar, dxioVar4, bvslVar, this, broqVar, arbuVar, akoxVar, asvxVar, qboVar, kxuVar, awpkVar, jzpVar, f, asikVar, (aufc) dxioVar5.a(), brcwVar, dxioVar6, asxmVar, new lee(lesVar), kdgVar, dxioVar7, kocVar);
        this.m = lebVar;
        this.A = new kqm(this) { // from class: lef
            private final les a;

            {
                this.a = this;
            }

            @Override // defpackage.kqm
            public final void a() {
                this.a.m.b.n().w().d();
            }
        };
        final asxm asxmVar3 = asxmVar;
        dbty dbtyVar = new dbty(asxmVar3) { // from class: leg
            private final asxm a;

            {
                this.a = asxmVar3;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.t();
            }
        };
        mau mauVar = lebVar.c;
        juo juoVar = jufVar.a;
        nog nogVar2 = jufVar.b;
        jvh jvhVar = juoVar.a;
        jus jusVar = new jus(jvhVar, new jur(jvhVar, nogVar2, asxmVar3, dbtyVar, new moe()));
        this.i = jusVar;
        jur jurVar = jusVar.a;
        this.h = jurVar;
        if (!jzpVar.b()) {
            this.D = null;
            this.E = null;
            return;
        }
        this.D = new kye(btrmVar, new mis(jurVar, novVar, nogVar, nooVar, notVar), new nob(jurVar, novVar, nogVar, notVar));
        this.E = new kyc(bvjjVar, bnwnVar, new mis(jurVar, novVar, nogVar, nooVar, notVar), new nob(jurVar, novVar, nogVar, notVar), false);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("CarNavigationNotificationsController: "));
        this.p.NX(String.valueOf(str).concat("  "), printWriter);
        this.k.NX(str, printWriter);
    }

    @Override // defpackage.mcn
    public final void NY(aste asteVar, mnz mnzVar) {
        nog nogVar = this.k;
        nogVar.k(this.h.r(nogVar, asteVar, this.m.c, this.l, mnzVar, mcl.DEFAULT));
    }

    @Override // defpackage.asxu
    public final void PZ() {
    }

    @Override // defpackage.asmn
    public final void Qa() {
    }

    @Override // defpackage.asmn
    public final void Qb(aste asteVar) {
        throw null;
    }

    @Override // defpackage.asmn
    public final void Qc() {
        throw null;
    }

    @Override // defpackage.non
    public final void a() {
        lfk lfkVar = this.B;
        if (lfkVar != null) {
            this.k.k(lfkVar);
        }
        this.s.a();
        this.m.NZ(null);
        this.n.F(this.H);
        this.C.i(this.n);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        this.j.h(this.n);
        this.s.c();
        kye kyeVar = this.D;
        if (kyeVar != null) {
            btrm btrmVar = kyeVar.a;
            kyd kydVar = kyeVar.e;
            dceq a = dcet.a();
            a.b(alho.class, new kyf(0, alho.class, kydVar, bvrj.UI_THREAD));
            a.b(alhk.class, new kyf(1, alhk.class, kydVar, bvrj.UI_THREAD));
            btrmVar.g(kydVar, a.a());
        }
        if (this.E != null) {
            this.e.aj().aF().g(this.E);
        }
        this.f.d(this.A);
        this.f.f(new kql(this) { // from class: leh
            private final les a;

            {
                this.a = this;
            }

            @Override // defpackage.kql
            public final void a(akqq akqqVar, float f) {
                les lesVar = this.a;
                lesVar.n.y();
                lesVar.e.p(akyt.i(akqqVar, f));
            }
        });
        leu leuVar = this.w.a;
        leu leuVar2 = leu.ENTER_FOLLOW_MODE;
        if (leuVar.ordinal() == 0) {
            this.n.v();
        }
        this.G = true;
        this.z.o(this.L);
        return this.k.d();
    }

    @Override // defpackage.asmn
    public final boolean bb() {
        return this.s.c;
    }

    public final void d(dbsg<khw> dbsgVar) {
        if (!this.o.o()) {
            ler lerVar = this.i;
            klt kltVar = this.J;
            Runnable runnable = this.K;
            jus jusVar = (jus) lerVar;
            jvh jvhVar = jusVar.b;
            kgx kgxVar = jvhVar.am;
            Application application = jvhVar.c;
            cqkj cqkjVar = jvhVar.v;
            not notVar = jvhVar.V;
            jur jurVar = jusVar.a;
            nop nopVar = jurVar.a;
            noo nooVar = jvhVar.y;
            jty jtyVar = jvhVar.bc;
            kxu kxuVar = jvhVar.C;
            ksr a = jvhVar.ar.a(jvhVar.A, jvhVar.Y, 9);
            jvh jvhVar2 = jusVar.b;
            kcv kcvVar = jvhVar2.s;
            kdg kdgVar = jvhVar2.u;
            ncp ncpVar = jvhVar2.ab;
            Runnable runnable2 = jvhVar2.T;
            dcdc<brcl> s = jusVar.a.s();
            jvh jvhVar3 = jusVar.b;
            nfk nfkVar = jvhVar3.bf;
            axwi a2 = jvhVar3.j.a();
            kgx.a(application, 1);
            kgx.a(cqkjVar, 2);
            kgx.a(notVar, 3);
            kgx.a(nopVar, 4);
            kgx.a(nopVar, 5);
            kgx.a(nooVar, 6);
            kgx.a(jurVar, 7);
            kgx.a(jtyVar, 8);
            crzm<jzq> a3 = kgxVar.a.a();
            kgx.a(a3, 9);
            bvjj a4 = kgxVar.b.a();
            kgx.a(a4, 10);
            btvo a5 = kgxVar.c.a();
            kgx.a(a5, 11);
            kgx.a(kxuVar, 12);
            kgx.a(a, 13);
            kgx.a(kcvVar, 14);
            jzp a6 = kgxVar.d.a();
            kgx.a(a6, 15);
            kgx.a(kltVar, 16);
            kgx.a(runnable, 17);
            cjqy a7 = kgxVar.e.a();
            kgx.a(a7, 18);
            cjqq a8 = kgxVar.f.a();
            kgx.a(a8, 19);
            ckcw a9 = kgxVar.g.a();
            kgx.a(a9, 20);
            akfa a10 = kgxVar.h.a();
            kgx.a(a10, 21);
            kgx.a(kdgVar, 22);
            kgx.a(ncpVar, 23);
            kgx.a(runnable2, 24);
            kgx.a(s, 25);
            dehq a11 = kgxVar.i.a();
            kgx.a(a11, 26);
            kgx.a(nfkVar, 27);
            kgx.a(a2, 28);
            kgx.a(dbsgVar, 29);
            kgx.a(kgxVar.j.a(), 30);
            dbsg<afeg> a12 = kgxVar.k.a();
            kgx.a(a12, 31);
            w(new kgw(application, cqkjVar, notVar, nopVar, nopVar, nooVar, jurVar, jtyVar, a3, a4, a5, kxuVar, a, kcvVar, a6, kltVar, runnable, a7, a8, a9, a10, kdgVar, ncpVar, runnable2, s, a11, a2, dbsgVar, a12));
            return;
        }
        jvp jvpVar = this.t;
        int i = dmcf.OPEN_DESTINATION_INPUT.ab;
        StringBuilder sb = new StringBuilder(28);
        sb.append("google.maps:?act=");
        sb.append(i);
        jvpVar.a(Uri.parse(sb.toString()));
    }

    @Override // defpackage.non
    public final void e() {
        this.G = false;
        this.k.e();
        this.z.p(this.L);
        if (this.x.i() != amwd.OFF) {
            this.w.a(leu.ENTER_FOLLOW_MODE);
        }
        this.n.y();
        this.f.e(this.A);
        this.f.g();
        if (this.E != null) {
            this.e.aj().aF().g(kyc.a);
        }
        kye kyeVar = this.D;
        if (kyeVar != null) {
            kyeVar.a.a(kyeVar.e);
        }
        this.s.d();
    }

    @Override // defpackage.non
    public final void f() {
        this.C.i(null);
        this.n.G(this.H);
        this.k.m();
        this.m.Qp();
        this.s.b();
    }

    @Override // defpackage.non
    public final String g() {
        return "FreeNavOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return true;
    }

    @Override // defpackage.non
    public final int i() {
        if (this.F) {
            x();
            return 1;
        }
        return this.k.b();
    }

    @Override // defpackage.asxu
    public final void j(aszm aszmVar) {
    }

    @Override // defpackage.asxu
    public final void k() {
    }

    @Override // defpackage.asmn
    public final void m() {
        throw null;
    }

    @Override // defpackage.asxu
    public final void n() {
        lfk lfkVar = this.B;
        if (lfkVar == null) {
            return;
        }
        lfkVar.b.v();
    }

    @Override // defpackage.asxu
    public final void o(amvh amvhVar, amuh amuhVar, @dzsi dpfh dpfhVar) {
        ldm f = ldm.f(amvhVar, this.d.d.getResources(), null);
        if (!this.y.isDone()) {
            return;
        }
        ((lzf) deha.s(this.y)).p(f, amuhVar, dpfhVar, lyy.c(new lzc(lzb.IMPLICIT_DESTINATION)).a());
    }

    @Override // defpackage.asmn
    public final void q() {
        this.v.a(new Runnable(this) { // from class: lei
            private final les a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                les lesVar = this.a;
                if (lesVar.s.c && !lesVar.n.t().b()) {
                    bvoo.j(new IllegalStateException("Navigation didn't start after 10s in projected"));
                }
            }
        }, bvrj.UI_THREAD, 10000L);
    }

    @Override // defpackage.asmn
    public final void r() {
        if (this.G) {
            v();
        } else {
            this.u.execute(new len(this));
        }
    }

    public final void u() {
        this.k.a();
    }

    public final void v() {
        atxz m = this.m.b.m();
        if (m != null) {
            jvh jvhVar = ((jus) this.i).b;
            w(new lew(jvhVar.v, jvhVar.V, jvhVar.C, m));
            this.F = true;
        } else if (!this.F) {
        } else {
            x();
        }
    }

    public final void w(non nonVar) {
        dbsk.s(nonVar);
        dcdc f = dcdc.f(nonVar);
        dbsk.s(f);
        this.g.a();
        x();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            non nonVar2 = (non) f.get(i);
            dbsk.s(nonVar2);
            this.k.k(nonVar2);
        }
        this.g.b();
    }

    public final void x() {
        this.k.a();
        this.F = false;
    }

    @Override // defpackage.asmn
    public final void y() {
        throw null;
    }

    public final void z(ldm ldmVar, kdk kdkVar, @dzsi vup vupVar, boolean z, mnz mnzVar) {
        w(this.h.c(ldmVar, null, vupVar, kdkVar, mnzVar, false, z, dcdc.e(), null, this.l, this.k));
    }
}
