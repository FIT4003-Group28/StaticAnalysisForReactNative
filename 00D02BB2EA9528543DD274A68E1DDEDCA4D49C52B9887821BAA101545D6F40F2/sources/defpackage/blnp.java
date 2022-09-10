package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: blnp  reason: default package */
/* loaded from: classes3.dex */
public class blnp implements blla {
    private boolean A;
    private boolean B;
    private final boolean C;
    public final bhhf a;
    public bwrs<ilo> b;
    public final dxio<bkpi> d;
    public boolean g;
    public final cdjk h;
    private final gga j;
    private final ceda k;
    private final blni l;
    private final ixf m;
    private final cebm n;
    private final blmp o;
    private final bhuh p;
    private final bwqv q;
    private jay r;
    private blnh s;
    private cecz t;
    private bhug u;
    private cebl v;
    private izm w;
    private int z;
    private final blno i = new blno(this);
    private cjtd x = cjtd.b;
    public bwrs<cdjd> c = bwrs.a(null);
    private int y = 0;
    public String e = "";
    public dbsg<djck> f = dbpy.a;
    private final bwrr<cdjd> D = new bwrr(this) { // from class: blnk
        private final blnp a;

        {
            this.a = this;
        }

        @Override // defpackage.bwrr
        public final void PV(Object obj) {
            blnp blnpVar = this.a;
            cdjd cdjdVar = (cdjd) obj;
            blnpVar.t();
            for (cqjz cqjzVar : cqkx.l(blnpVar)) {
                cqjzVar.k();
            }
        }
    };

    public blnp(gga ggaVar, ceda cedaVar, blni blniVar, ixf ixfVar, cebm cebmVar, blmp blmpVar, bhuh bhuhVar, dxio<bkpi> dxioVar, cqhn cqhnVar, bhhf bhhfVar, bwqv bwqvVar, cdjk cdjkVar, boolean z) {
        this.j = ggaVar;
        this.k = cedaVar;
        this.l = blniVar;
        this.m = ixfVar;
        this.n = cebmVar;
        this.o = blmpVar;
        this.p = bhuhVar;
        this.d = dxioVar;
        this.a = bhhfVar;
        this.q = bwqvVar;
        this.h = cdjkVar;
        this.C = z;
    }

    private final void u(bwrs<ilo> bwrsVar, int i, String str, dbsg<djck> dbsgVar, boolean z) {
        this.b = bwrsVar;
        this.y = i;
        this.e = str;
        this.f = dbsgVar;
        this.g = z;
        t();
    }

    private final void v() {
        this.q.f(this.c, this.D, false);
        this.B = true;
    }

    private final void w() {
        if (this.B) {
            bwqv.t(this.c, this.D);
            this.B = false;
        }
    }

    @Override // defpackage.blla
    public blkw a() {
        blnh blnhVar = this.s;
        if (blnhVar != null) {
            return blnhVar;
        }
        throw new IllegalStateException("setUserReview() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public cebx b() {
        cecz ceczVar = this.t;
        if (ceczVar != null) {
            return ceczVar;
        }
        throw new IllegalStateException("setUserReview() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public izm c() {
        izm izmVar = this.w;
        if (izmVar != null) {
            return izmVar;
        }
        throw new IllegalStateException("setUserReview() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public bhtu d() {
        bhug bhugVar = this.u;
        if (bhugVar != null) {
            return bhugVar;
        }
        throw new IllegalStateException("setUserReview() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public String e() {
        cdjd c = this.c.c();
        if (c != null) {
            return c.a().a().c("");
        }
        throw new IllegalStateException("setUserReview() must be called before viewmodel is used");
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof blnp)) {
            return false;
        }
        blnp blnpVar = (blnp) obj;
        return dbsd.a(a(), blnpVar.a()) && dbsd.a(b(), blnpVar.b()) && dbsd.a(d(), blnpVar.d()) && dbsd.a(f(), blnpVar.f());
    }

    @Override // defpackage.blla
    public cebg f() {
        cebl ceblVar = this.v;
        if (ceblVar != null) {
            return ceblVar;
        }
        throw new IllegalStateException("setUserReview() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public cjtd g() {
        return this.x;
    }

    @Override // defpackage.blla
    public Boolean h() {
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), d(), f()});
    }

    @Override // defpackage.blla
    public String i() {
        return "";
    }

    @Override // defpackage.blla
    public cqkl j() {
        return cqkl.a;
    }

    @Override // defpackage.blla
    public cjtd k() {
        return cjtd.b;
    }

    @Override // defpackage.blla
    public Boolean l() {
        return Boolean.valueOf(!this.g);
    }

    @Override // defpackage.blla, defpackage.begs
    public void m(btrm btrmVar) {
        if (this.A) {
            return;
        }
        blno blnoVar = this.i;
        dceq a = dcet.a();
        a.b(bkpe.class, new blnr(0, bkpe.class, blnoVar, bvrj.UI_THREAD));
        a.b(apuu.class, new blnr(1, apuu.class, blnoVar, bvrj.UI_THREAD));
        a.b(apuv.class, new blnr(2, apuv.class, blnoVar, bvrj.UI_THREAD));
        btrmVar.g(blnoVar, a.a());
        this.A = true;
    }

    @Override // defpackage.blla, defpackage.begs
    public void n(btrm btrmVar) {
        if (this.A) {
            btrmVar.a(this.i);
            this.A = false;
        }
        w();
    }

    @Override // defpackage.blla
    public cqkl o() {
        if (l().booleanValue() && this.b != null && this.c.c() != null) {
            bwrs<ilo> bwrsVar = this.b;
            bwrs<cdjd> bwrsVar2 = this.c;
            bkpf e = bkpg.e(this.h);
            e.b(this.e);
            e.e(this.f);
            this.d.a().f(bwrsVar, bwrsVar2, e.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.blla
    public Boolean p() {
        cdjd c = this.c.c();
        boolean z = false;
        if (c != null && cebu.a(c)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blla
    public void q(int i) {
        if (this.g) {
            return;
        }
        this.z = i;
        izm izmVar = this.w;
        if (izmVar != null) {
            izmVar.m(i);
        }
        cebl ceblVar = this.v;
        if (ceblVar != null) {
            ceblVar.e(i);
        }
        jay jayVar = this.r;
        if (jayVar == null) {
            return;
        }
        jayVar.c(i);
    }

    public void r(bwrs<cdjd> bwrsVar, bwrs<ilo> bwrsVar2, int i, String str, dbsg<djck> dbsgVar) {
        w();
        this.c = bwrsVar;
        v();
        u(bwrsVar2, 0, str, dbsgVar, true);
    }

    public void s(cdjd cdjdVar, bwrs<ilo> bwrsVar, int i, String str, dbsg<djck> dbsgVar) {
        w();
        this.c.d(cdjdVar);
        v();
        u(bwrsVar, i, str, dbsgVar, false);
    }

    public final void t() {
        dbsg<jbe> i;
        if (this.b == null) {
            return;
        }
        final cdjd c = this.c.c();
        dbsk.s(c);
        this.s = this.l.a(this.j);
        bhuh bhuhVar = this.p;
        ilo c2 = this.b.c();
        dbsk.s(c2);
        this.u = bhuhVar.a(c, c2.bf(), this.g, this.b, new cjcs(this) { // from class: blnl
            private final blnp a;

            {
                this.a = this;
            }

            @Override // defpackage.cjcs
            public final void a(boolean z) {
                blnp blnpVar = this.a;
                bwrs<cdjd> bwrsVar = blnpVar.c;
                dbsk.s(bwrsVar);
                cdjd c3 = blnpVar.c.c();
                dbsk.s(c3);
                bwrsVar.d(c3.f(z));
            }
        });
        ilo c3 = this.b.c();
        dbsk.s(c3);
        cjta c4 = cjtd.c(c3.ca());
        c4.g(c.a().h().c(""));
        c4.d = p().booleanValue() ? dtxy.mJ : dtxy.mK;
        c4.i(this.y);
        cjtd a = c4.a();
        this.x = a;
        this.t = this.k.a(a, new cjcs(this) { // from class: blnm
            private final blnp a;

            {
                this.a = this;
            }

            @Override // defpackage.cjcs
            public final void a(boolean z) {
                blnp blnpVar = this.a;
                bwrs<cdjd> bwrsVar = blnpVar.c;
                dbsk.s(bwrsVar);
                cdjd c5 = blnpVar.c.c();
                dbsk.s(c5);
                bwrsVar.d(c5.e(z));
            }
        }, this.C);
        this.w = this.m.b(this.b, c, this.h, false);
        if (dkyd.THUMBS_UP_HELPFUL.equals(this.w.i()) || dkyd.YES_OR_NO_PROMPT.equals(this.w.i())) {
            i = dbsg.i(this.w.c());
        } else {
            i = dbpy.a;
        }
        blmo a2 = this.o.a(c, null, i, this.b);
        this.r = a2;
        a2.c(this.z);
        blnh blnhVar = this.s;
        ilo c5 = this.b.c();
        dbsk.s(c5);
        blnhVar.x(c5, c, false, this.r);
        boolean z = !this.e.isEmpty() || this.g;
        boolean z2 = !z && !l().booleanValue();
        cecz ceczVar = this.t;
        String str = this.e;
        ilo c6 = this.b.c();
        dbsk.s(c6);
        ceczVar.v(c, str, c6.n(), this.f, z, z2);
        this.v = this.n.a(this.b, c, new cebe(this, c) { // from class: blnn
            private final blnp a;
            private final cdjd b;

            {
                this.a = this;
                this.b = c;
            }

            @Override // defpackage.cebe
            public final void a() {
                blnp blnpVar = this.a;
                cdjd cdjdVar = this.b;
                if (blnpVar.g) {
                    return;
                }
                bwrs<ilo> bwrsVar = blnpVar.b;
                dbsk.s(bwrsVar);
                bwrs<cdjd> a3 = bwrs.a(cdjdVar);
                bkpf e = bkpg.e(blnpVar.h);
                e.b(blnpVar.e);
                e.e(blnpVar.f);
                blnpVar.d.a().f(bwrsVar, a3, e.a());
            }
        });
        cqkx.p(this);
    }
}
