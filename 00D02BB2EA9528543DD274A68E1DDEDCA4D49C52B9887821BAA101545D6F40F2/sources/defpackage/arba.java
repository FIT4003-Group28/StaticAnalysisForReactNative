package defpackage;
/* compiled from: PG */
/* renamed from: arba  reason: default package */
/* loaded from: classes.dex */
public final class arba implements akzv {
    private static final dcqe f = dcqe.c("arba");
    @dzsi
    araz a;
    @dzsi
    public alai c;
    public boolean d;
    public int e;
    private final bvnx g;
    private final akzh h;
    private final btrm i;
    private akra l;
    private boolean m;
    private long n;
    @dzsi
    private akze o;
    @dzsi
    private akzn p;
    private int q;
    private final araq r;
    private final alaa j = alad.a();
    private final alaa k = alad.a();
    public final Object b = new Object();

    public arba(bvnx bvnxVar, akzh akzhVar, btrm btrmVar, araq araqVar) {
        dbsk.s(bvnxVar);
        this.g = bvnxVar;
        dbsk.s(akzhVar);
        this.h = akzhVar;
        dbsk.s(btrmVar);
        this.i = btrmVar;
        dbsk.s(araqVar);
        this.r = araqVar;
    }

    private final void a() {
        akra akraVar = new akra();
        boolean f2 = this.r.a.d.f(akraVar);
        synchronized (this.b) {
            this.m = f2;
            this.l = new akra(akraVar);
        }
    }

    private final void b(boolean z, float f2) {
        if (!this.m) {
            return;
        }
        alai alaiVar = this.c;
        if (alaiVar != null) {
            alaa alaaVar = this.j;
            akqq S = this.l.S();
            araz arazVar = this.a;
            if (arazVar != null) {
                if (Math.abs(arazVar.a - f2) > 20.0f) {
                    arazVar.a = f2;
                } else if (Math.abs(arazVar.a - f2) > 0.25f) {
                    float f3 = arazVar.a;
                    arazVar.a = f3 > f2 ? f3 - 0.25f : f3 + 0.25f;
                }
                f2 = arazVar.a;
            }
            float f4 = alaiVar.d;
            if (alaiVar.f == alah.LOCATION_AND_BEARING) {
                f4 += f2;
            }
            alaa a = alad.a();
            a.c(S);
            a.c = alaiVar.b;
            a.d = alaiVar.c;
            a.e = f4;
            a.f = alaiVar.e;
            alaaVar.b(a.a());
            return;
        }
        this.j.d(this.l);
        if (!z) {
            return;
        }
        this.j.e = f2;
    }

    @Override // defpackage.akzv
    public final int d() {
        int i;
        amwd a = this.r.a();
        if (a == amwd.TRACKING) {
            i = alad.c;
        } else {
            i = a == amwd.COMPASS ? alad.c | alad.f : 0;
        }
        synchronized (this.b) {
            if (this.c != null) {
                i = alad.h;
            }
        }
        return i;
    }

    @Override // defpackage.akzv
    public final int e(long j) {
        boolean z;
        int i = 0;
        if (this.r.a() == amwd.OFF) {
            return 0;
        }
        a();
        synchronized (this.b) {
            z = this.m;
        }
        if (!z) {
            araq araqVar = this.r;
            araqVar.c(amwd.OFF);
            synchronized (araqVar.a.b) {
                aras arasVar = araqVar.a;
                arasVar.i = false;
                arasVar.j = false;
            }
            return 0;
        }
        arbs j2 = this.r.a.d.j();
        arbs arbsVar = arbs.NAVIGATION;
        boolean z2 = this.r.a() == amwd.COMPASS;
        float b = this.r.b();
        synchronized (this.b) {
            int i2 = this.q;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                dbsk.s(this.o);
                dbsk.s(this.p);
                int e = this.o.e(j) | this.p.e(j);
                this.o.o(this.k);
                this.p.o(this.k);
                if (e == 0) {
                    this.q = 3;
                    this.o = null;
                    this.p = null;
                    this.i.b(ardl.FINISH);
                }
            } else if (i3 == 1) {
                b(z2, b);
                alaa alaaVar = this.k;
                alaa alaaVar2 = this.j;
                alaaVar.a = alaaVar2.a;
                alaaVar.b = alaaVar2.b;
                alaaVar.c = alaaVar2.c;
                alaaVar.d = alaaVar2.d;
                alaaVar.e = alaaVar2.e;
                alaaVar.f = alaaVar2.f;
                this.q = 3;
            } else if (i3 != 2) {
                bvoo.h("unhandled animation mode", new Object[0]);
            } else {
                b(z2, b);
                double d = j - this.n;
                Double.isNaN(d);
                float exp = (float) (1.0d - Math.exp((-d) / 500.0d));
                alad p = this.h.p();
                this.k.d(this.l);
                if (!z2 || j2 == arbsVar) {
                    float f2 = p.m;
                    float f3 = this.j.e;
                    float abs = Math.abs(f3 - f2);
                    if (abs >= 360.0f - abs) {
                        f3 = f3 < f2 ? f3 + 360.0f : f3 - 360.0f;
                    }
                    alaa alaaVar3 = this.k;
                    float f4 = p.m;
                    alaaVar3.e = f4 + ((f3 - f4) * exp);
                } else {
                    this.k.e = this.j.e;
                }
                alaa alaaVar4 = this.k;
                float f5 = p.k;
                alaa alaaVar5 = this.j;
                alaaVar4.c = f5 + ((alaaVar5.c - f5) * exp);
                float f6 = p.l;
                alaaVar4.d = f6 + ((alaaVar5.d - f6) * exp);
                alaaVar4.f = p.n.d(alaaVar5.f, exp);
                alaa alaaVar6 = this.k;
                int i4 = this.e;
                if (((alad.c & i4) == 0 || p.i.equals(alaaVar6.a)) && (((alad.d & i4) == 0 || Float.floatToIntBits(p.k) == Float.floatToIntBits(alaaVar6.c)) && (((alad.e & i4) == 0 || Float.floatToIntBits(p.l) == Float.floatToIntBits(alaaVar6.d)) && (((alad.f & i4) == 0 || Float.floatToIntBits(p.m) == Float.floatToIntBits(alaaVar6.e)) && ((i4 & alad.g) == 0 || p.n.equals(alaaVar6.f)))))) {
                    i = 2;
                }
            }
            i = 6;
        }
        this.n = j;
        return i;
    }

    @Override // defpackage.akzv
    public final long f() {
        return -1L;
    }

    @Override // defpackage.akzv
    public final boolean g() {
        return false;
    }

    @Override // defpackage.akzv
    public final boolean h() {
        return false;
    }

    @Override // defpackage.akzv
    public final void i() {
    }

    @Override // defpackage.akzv
    public final void j(int i) {
        this.e = i;
        this.n = this.g.a();
        this.j.b(this.h.p());
        this.k.b(this.h.p());
        a();
        boolean z = this.r.a() == amwd.COMPASS;
        float b = this.r.b();
        synchronized (this.b) {
            if (this.d) {
                this.q = 2;
                this.o = null;
                this.p = null;
            } else {
                this.q = 1;
                b(z, b);
                alad a = this.j.a();
                akze akzeVar = new akze(this.g, this.h);
                this.o = akzeVar;
                akzeVar.a(this.h.p(), a);
                this.o.b(eia.a);
                akze akzeVar2 = this.o;
                akzeVar2.j(akzeVar2.f);
                akzn akznVar = new akzn(this.g);
                this.p = akznVar;
                akznVar.a(this.h.p(), a);
                this.p.b(eia.a);
                this.p.p(this.o.e);
                akzn akznVar2 = this.p;
                akznVar2.j(akznVar2.f);
            }
        }
    }

    @Override // defpackage.akzv
    @dzsi
    public final Object k(int i) {
        if ((this.e & (1 << (i - 1))) != 0) {
            return this.k.e(i);
        }
        return null;
    }

    @Override // defpackage.akzv
    @dzsi
    public final Object l(int i) {
        return null;
    }

    @Override // defpackage.akzv
    public final boolean m(@dzsi akzv akzvVar, int i) {
        return true;
    }

    @Override // defpackage.akzv
    public final void n(@dzsi akzv akzvVar, int i) {
        this.e &= (1 << (i - 1)) ^ (-1);
        amwd a = this.r.a();
        if (akzvVar == null || akzvVar == this || a == amwd.OFF) {
            return;
        }
        if (i == 1) {
            synchronized (this.b) {
                if (this.q == 1) {
                    this.i.b(ardl.CANCEL);
                }
            }
            araq araqVar = this.r;
            if (akzvVar.g()) {
                synchronized (araqVar.a.b) {
                    aras arasVar = araqVar.a;
                    arbq arbqVar = arasVar.h;
                    if (arbqVar != null) {
                        amwd amwdVar = arasVar.g;
                        if (arbqVar.e && arbqVar.d && amwdVar != amwd.OFF) {
                            arbqVar.c = amwdVar;
                        }
                    }
                }
            }
            araqVar.c(amwd.OFF);
        } else if (i != 4 || a == amwd.TRACKING || !akzvVar.g()) {
        } else {
            this.r.c(amwd.TRACKING);
        }
    }
}
