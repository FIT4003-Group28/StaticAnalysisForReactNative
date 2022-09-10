package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anrr  reason: default package */
/* loaded from: classes2.dex */
public abstract class anrr implements anha {
    private final aoiw a;
    protected final cqat b;
    public final gga c;
    protected final anhg d;
    protected final anru e;
    public final bbut f;
    public final dvay g;
    public final aoha h;
    public final aoge i;
    public final boolean j;
    public final dcdc<dvan> k;
    public final aojq l;
    @dzsi
    public String m;
    @dzsi
    public String n;
    private final aogw o;
    private final aokw p;
    @dzsi
    private aogf q;
    @dzsi
    private anrp r;
    @dzsi
    private String s;
    @dzsi
    private aoij t;
    @dzsi
    private aoiu u;
    @dzsi
    private jic v;
    @dzsi
    private jic w;
    @dzsi
    private aogm x;
    @dzsi
    private anro y;
    @dzsi
    private Boolean z;

    public anrr(dvay dvayVar, aoge aogeVar, boolean z, gga ggaVar, cqat cqatVar, anhg anhgVar, bbut bbutVar, anru anruVar, aoiw aoiwVar, aogw aogwVar, aokw aokwVar, aojq aojqVar) {
        this.b = cqatVar;
        this.c = ggaVar;
        this.d = anhgVar;
        this.f = bbutVar;
        this.g = dvayVar;
        dvap dvapVar = dvayVar.e;
        this.h = aoha.d(dvapVar == null ? dvap.d : dvapVar);
        this.i = aogeVar;
        this.j = z;
        this.e = anruVar;
        this.a = aoiwVar;
        this.k = aogwVar.a(dvayVar);
        this.o = aogwVar;
        this.p = aokwVar;
        this.l = aojqVar;
    }

    private final long o() {
        int V = V() - 1;
        if (V != 0 && V != 2 && V != 4) {
            dpop dpopVar = this.i.a().e;
            if (dpopVar == null) {
                dpopVar = dpop.d;
            }
            return dpopVar.b;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dwyn dwynVar = this.g.f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        return timeUnit.toMillis(dwynVar.b);
    }

    private final long p() {
        int V = V() - 1;
        if (V == 0 || V == 1) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            dwyn dwynVar = this.g.g;
            if (dwynVar == null) {
                dwynVar = dwyn.d;
            }
            return timeUnit.toMillis(dwynVar.b);
        } else if (V == 4 || V == 5) {
            if (Q()) {
                return r();
            }
            return this.b.b();
        } else {
            return r();
        }
    }

    private final long r() {
        dpop dpopVar = this.i.a().e;
        if (dpopVar == null) {
            dpopVar = dpop.d;
        }
        return dpopVar.c;
    }

    public final anrp A() {
        if (this.r == null) {
            this.r = q();
        }
        return this.r;
    }

    public final boolean B() {
        return !D().a().isEmpty();
    }

    public final boolean C() {
        return this.o.b(this.k) || (!this.o.a.toString().isEmpty() && !this.p.a(o(), p()).isEmpty());
    }

    public final aoij D() {
        if (this.t == null) {
            this.t = aoim.b(this.f, dcdc.r(this.g.i));
        }
        return this.t;
    }

    public final aoiu E() {
        if (this.u == null) {
            aoiw aoiwVar = this.a;
            dcdc<dvan> dcdcVar = this.k;
            dcdc<aola> a = this.p.a(o(), p());
            dqgd dqgdVar = this.g.k;
            if (dqgdVar == null) {
                dqgdVar = dqgd.c;
            }
            this.u = aoiwVar.a(dcdcVar, a, dqgdVar);
        }
        return this.u;
    }

    public final Boolean F() {
        return Boolean.valueOf(!this.g.o.isEmpty());
    }

    public final dcdc<dvay> G() {
        return dcdc.r(this.g.o);
    }

    public final boolean H() {
        return this.g.r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r3.b().intValue() >= r0.b().intValue()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (defpackage.anpx.c(r6.i.g(), r6.b) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I() {
        /*
            r6 = this;
            java.lang.Boolean r0 = r6.z
            if (r0 != 0) goto L70
            boolean r0 = r6.H()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L6a
            aoge r0 = r6.i
            dvay r3 = r6.g
            dbsg r4 = r0.j()
            boolean r5 = r4.a()
            if (r5 != 0) goto L1b
            goto L5a
        L1b:
            dvap r3 = r3.e
            if (r3 != 0) goto L21
            dvap r3 = defpackage.dvap.d
        L21:
            aoha r3 = defpackage.aoha.d(r3)
            dbsg r3 = r0.i(r3)
            java.lang.Object r4 = r4.b()
            dvay r4 = (defpackage.dvay) r4
            dvap r4 = r4.e
            if (r4 != 0) goto L35
            dvap r4 = defpackage.dvap.d
        L35:
            aoha r4 = defpackage.aoha.d(r4)
            dbsg r0 = r0.i(r4)
            boolean r4 = r3.a()
            if (r4 == 0) goto L69
            java.lang.Object r3 = r3.b()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.b()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 >= r0) goto L5a
            goto L69
        L5a:
            aoge r0 = r6.i
            aogb r0 = r0.g()
            cqat r3 = r6.b
            boolean r0 = defpackage.anpx.c(r0, r3)
            if (r0 == 0) goto L69
            goto L6a
        L69:
            r1 = 0
        L6a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.z = r0
        L70:
            java.lang.Boolean r0 = r6.z
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anrr.I():boolean");
    }

    public final jic J() {
        if (c() || e() || d()) {
            return K();
        }
        return L();
    }

    public final jic K() {
        if (this.v == null) {
            this.v = k();
        }
        return this.v;
    }

    public final jic L() {
        if (this.w == null) {
            this.w = l();
        }
        return this.w;
    }

    public final anro M() {
        if (this.y == null) {
            this.y = n();
        }
        return this.y;
    }

    public final boolean N() {
        dvat dvatVar;
        dvay dvayVar = this.g;
        if (dvayVar.b == 7) {
            dvatVar = (dvat) dvayVar.c;
        } else {
            dvatVar = dvat.g;
        }
        duzt duztVar = dvatVar.c;
        if (duztVar == null) {
            duztVar = duzt.c;
        }
        return (duztVar.a & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String O() {
        gga ggaVar = this.c;
        dwyn dwynVar = this.g.f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        return apka.a(ggaVar, dwynVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String P() {
        gga ggaVar = this.c;
        dwyn dwynVar = this.g.g;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        return apka.a(ggaVar, dwynVar);
    }

    public final boolean Q() {
        dpop dpopVar = this.i.a().e;
        if (dpopVar == null) {
            dpopVar = dpop.d;
        }
        long j = dpopVar.c;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dwyn dwynVar = this.g.g;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        return j <= timeUnit.toMillis(dwynVar.b);
    }

    public final cjtd R(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.b = w();
        b.d = ddhoVar;
        dbsg<String> v = v();
        if (v.a()) {
            b.g(v.b());
        }
        return b.a();
    }

    public final CharSequence S() {
        return cqrt.l(anfx.MAPS_ACTIVITY_TIMELINE_RECEIPT_UPLOAD_BUTTON_TEXT).a(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final aogy T() {
        return aogy.c(u(), U());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int U() {
        return H() ? 2 : 1;
    }

    public final int V() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dwyn dwynVar = this.g.f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        long millis = timeUnit.toMillis(dwynVar.b);
        dpop dpopVar = this.i.a().e;
        if (dpopVar == null) {
            dpopVar = dpop.d;
        }
        long j = dpopVar.b;
        boolean Q = Q();
        if (H()) {
            return millis <= j ? 6 : 5;
        } else if (millis <= j && Q) {
            return 4;
        } else {
            if (millis > j && !Q) {
                return 1;
            }
            return millis <= j ? 2 : 3;
        }
    }

    public abstract void a();

    @Override // defpackage.anha
    public final aogm b() {
        if (this.x == null) {
            this.x = m();
        }
        return this.x;
    }

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract String f();

    public abstract String g();

    public abstract cqsn h();

    public abstract cqsn i();

    public abstract cqsn j();

    protected abstract jic k();

    protected abstract jic l();

    protected abstract aogm m();

    protected abstract anro n();

    protected abstract anrp q();

    public abstract boolean s();

    @dzsi
    public abstract aofb t();

    public final aogf u() {
        if (this.q == null) {
            dwyn dwynVar = this.g.f;
            if (dwynVar == null) {
                dwynVar = dwyn.d;
            }
            dwyn dwynVar2 = this.g.g;
            if (dwynVar2 == null) {
                dwynVar2 = dwyn.d;
            }
            this.q = aogf.d(dwynVar, dwynVar2);
        }
        return this.q;
    }

    public final dbsg<String> v() {
        dvay dvayVar = this.g;
        return (dvayVar.a & 1) != 0 ? dbsg.i(dvayVar.d) : dbpy.a;
    }

    public final String w() {
        return this.i.a;
    }

    public final void x() {
        this.d.e(this.h);
    }

    public final void y() {
        this.d.f(this.h);
    }

    public final String z() {
        if (this.s == null) {
            gga ggaVar = this.c;
            dwyn dwynVar = this.g.f;
            if (dwynVar == null) {
                dwynVar = dwyn.d;
            }
            dwyn dwynVar2 = this.g.g;
            if (dwynVar2 == null) {
                dwynVar2 = dwyn.d;
            }
            this.s = apka.c(ggaVar, dwynVar, dwynVar2).toString();
        }
        return this.s;
    }
}
