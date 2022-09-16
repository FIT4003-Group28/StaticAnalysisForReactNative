package defpackage;
/* compiled from: PG */
/* renamed from: tlc  reason: default package */
/* loaded from: classes4.dex */
public final class tlc extends tki {
    public double g;
    public double h;
    public long i;
    public final tkv j;
    public final tkv k;
    public final tkv l;
    public int m;
    public final tkv n;
    public int o;
    public int p;
    public final tkf q;
    public final tkr r;
    public final tkr s;
    public final tkr t;
    public final axoq u;
    private final boolean v;

    public tlc() {
        this.g = -1.0d;
        this.h = -1.0d;
        this.j = new tkv();
        this.k = new tkv();
        this.u = new axoq();
        this.l = new tkv();
        this.n = new tkv();
        this.o = 1;
        this.q = new tkf();
        this.r = new tkr();
        this.s = new tkr();
        this.t = new tkr();
        this.v = false;
    }

    private final boolean k(double d) {
        return this.v ? d > 0.0d : d >= 0.1d;
    }

    @Override // defpackage.tki
    protected final int a() {
        return 2000;
    }

    public final long f() {
        return this.j.b(1);
    }

    public final void g(long j, double d, double d2, double d3, boolean z, boolean z2, boolean z3, double d4) {
        tkh tkhVar;
        b(j, d, d4);
        if (z3) {
            this.e.e();
        }
        boolean z4 = true;
        if (j > 0) {
            int i = (int) j;
            long j2 = i;
            this.j.d(j2);
            boolean z5 = k(d2) && k(d3);
            if (z5) {
                this.k.d(j2);
            }
            if (z) {
                this.i += j2;
                this.m += i;
            }
            if (z5) {
                this.u.d(d, j2);
            } else {
                this.u.e();
            }
            if (d >= tkh.HALF.f) {
                this.l.d(j2);
                tkv tkvVar = this.n;
                if (true != z5) {
                    j2 = 0;
                }
                tkvVar.d(j2);
            }
        }
        this.h = Math.max(d2, this.h);
        double d5 = this.g;
        this.g = d5 == -1.0d ? d2 : Math.min(d2, d5);
        this.q.a.clear();
        this.q.b(tke.AUDIBLE_MEASURABLE);
        this.q.b(tke.BACKGROUNDED_MEASURABLE);
        this.q.b(tke.COVERAGE_MEASURABLE);
        boolean k = k(d2);
        if (d >= tkh.HALF.f) {
            this.q.b(tke.VISIBLE_50_PERCENT);
        }
        if (c()) {
            this.q.b(tke.VIEWABLE);
        }
        if (k) {
            this.q.b(tke.AUDIBLE);
        }
        if (d >= tkh.HALF.f && k) {
            this.q.b(tke.AUDIBLE_AND_VISIBLE_50_PERCENT);
        }
        if (c() && k) {
            this.q.b(tke.AUDIBLE_AND_VIEWABLE);
        }
        if (z) {
            this.q.b(tke.FULLSCREEN);
        }
        if (d > 0.0d) {
            this.q.b(tke.PARTIALLY_VIEWABLE);
        }
        if (i()) {
            this.q.b(tke.GROUPM_DURATION_REACHED);
        }
        if (d()[tkh.FULL.ordinal()].longValue() >= 2000) {
            this.q.b(tke.PMX_VIEWABLE);
        }
        if (z2) {
            this.q.b(tke.BACKGROUNDED);
        }
        int i2 = (int) j;
        if (d >= tkh.FULL.f) {
            tkhVar = tkh.FULL;
        } else {
            tkhVar = d >= tkh.THREE_QUARTER.f ? tkh.THREE_QUARTER : d >= tkh.HALF.f ? tkh.HALF : d >= tkh.QUARTER.f ? tkh.QUARTER : d > tkh.NONE.f ? tkh.NONE : null;
        }
        if (tkhVar == null) {
            this.r.a(i2, false);
            this.s.a(i2, false);
        } else {
            this.r.a(i2, tkhVar.ordinal() <= tkh.HALF.ordinal());
            tkr tkrVar = this.s;
            if (tkhVar.ordinal() > tkh.FULL.ordinal()) {
                z4 = false;
            }
            tkrVar.a(i2, z4);
        }
        this.t.a(i2, k(d2));
    }

    public final boolean h() {
        return k(this.g);
    }

    public final boolean i() {
        return j(f());
    }

    public final boolean j(long j) {
        int i;
        return j >= 15000 || ((i = this.p) > 0 && j >= ((long) (i >> 1)));
    }

    public tlc(boolean z) {
        this.g = -1.0d;
        this.h = -1.0d;
        this.j = new tkv();
        this.k = new tkv();
        this.u = new axoq();
        this.l = new tkv();
        this.n = new tkv();
        this.o = 1;
        this.q = new tkf();
        this.r = new tkr();
        this.s = new tkr();
        this.t = new tkr();
        this.v = z;
    }
}
