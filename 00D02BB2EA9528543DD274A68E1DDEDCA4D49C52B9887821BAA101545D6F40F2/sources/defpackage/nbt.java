package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nbt  reason: default package */
/* loaded from: classes7.dex */
public final class nbt implements non {
    public final ldm a;
    public final dcdc<ldm> b;
    public final ncf c;
    public final ksr d;
    public final nbs e;
    public final nog f;
    public final not g;
    @dzsi
    public non h;
    private final kdg k;
    private final nov l;
    private final asmp m;
    public final ksu i = new nbn(this);
    private final nbp o = new nbp(this);
    public final mxu j = new nbq(this);
    private final ncd n = new nbr(this);

    public nbt(kdg kdgVar, nov novVar, ldm ldmVar, dcdc dcdcVar, ncf ncfVar, ksr ksrVar, nbs nbsVar, noe noeVar, not notVar, asmp asmpVar, noh nohVar) {
        this.k = kdgVar;
        this.l = novVar;
        this.a = ldmVar;
        this.b = dcdcVar;
        this.e = nbsVar;
        this.c = ncfVar;
        this.d = ksrVar;
        this.g = notVar;
        this.m = asmpVar;
        this.f = nohVar.a(noeVar, novVar);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        this.f.NX(str, printWriter);
    }

    @Override // defpackage.non
    public final void a() {
        nog nogVar = this.f;
        nbs nbsVar = this.e;
        ldm ldmVar = this.a;
        dcdc<ldm> dcdcVar = this.b;
        ncf ncfVar = this.c;
        nbp nbpVar = this.o;
        not notVar = this.g;
        jur jurVar = (jur) nbsVar;
        jvh jvhVar = jurVar.c;
        nav navVar = jvhVar.aL;
        cqkj cqkjVar = jvhVar.v;
        kxu kxuVar = jvhVar.C;
        noo nooVar = jvhVar.y;
        lzf lzfVar = (lzf) deha.s(jvhVar.N);
        kcv kcvVar = jurVar.c.s;
        nav.a(cqkjVar, 1);
        nav.a(notVar, 2);
        nav.a(kxuVar, 3);
        btvo a = navVar.a.a();
        nav.a(a, 4);
        jzp a2 = navVar.b.a();
        nav.a(a2, 5);
        btrm a3 = navVar.c.a();
        nav.a(a3, 6);
        bvsl a4 = navVar.d.a();
        nav.a(a4, 7);
        cjqy a5 = navVar.e.a();
        nav.a(a5, 8);
        cjqq a6 = navVar.f.a();
        nav.a(a6, 9);
        nav.a(nooVar, 10);
        nav.a(lzfVar, 11);
        nav.a(ldmVar, 12);
        nav.a(dcdcVar, 13);
        nav.a(ncfVar, 14);
        nav.a(nbpVar, 15);
        nav.a(kcvVar, 16);
        Executor a7 = navVar.g.a();
        nav.a(a7, 17);
        nogVar.k(new nau(cqkjVar, notVar, kxuVar, a, a2, a3, a4, a5, a6, nooVar, lzfVar, ldmVar, dcdcVar, ncfVar, nbpVar, kcvVar, a7));
        this.d.a();
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        d();
        this.c.q(this.n);
        this.k.d(this);
        return this.f.d();
    }

    public final void d() {
        amuh k = this.c.k();
        if (k == null) {
            this.m.D(null);
            return;
        }
        asmp asmpVar = this.m;
        astf f = astg.f();
        f.e(k);
        f.d(alfa.CAR_ALTERNATES);
        asmpVar.D(f.a());
        if (!k.j()) {
            return;
        }
        this.m.A(true, new aslo(k.k(), 0, k.k().G()));
    }

    @Override // defpackage.non
    public final void e() {
        this.f.e();
        this.k.e(this);
        this.m.D(null);
        this.m.B();
        this.c.r(this.n);
    }

    @Override // defpackage.non
    public final void f() {
        this.d.b();
        this.l.a();
        while (!this.f.h()) {
            this.f.n();
        }
        this.l.b();
    }

    @Override // defpackage.non
    public final String g() {
        return "RouteSelectOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        if (this.f.j() == this.h) {
            this.f.n();
            this.h = null;
            return 1;
        }
        return 2;
    }
}
