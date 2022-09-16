package defpackage;
/* compiled from: PG */
/* renamed from: dkuw  reason: default package */
/* loaded from: classes.dex */
public final class dkuw extends dsqw<dkuw, dksv> implements dkux {
    public static final dkuw s;
    private static volatile dssr<dkuw> u;
    public int a;
    public dkur b;
    public int c;
    public dkut d;
    public int e;
    public dksx f;
    public dksq g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public dkuv q;
    public boolean r;
    private int t;

    static {
        dkuw dkuwVar = new dkuw();
        s = dkuwVar;
        dsqw.cc(dkuw.class, dkuwVar);
    }

    private dkuw() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(s, "\u0001\u0011\u0000\u0002\u000eB\u0011\u0000\u0000\u0000\u000eဉ\u0011\u0012င\u0012\u0016ဉ\u0016\u0018ဉ\u0018\u001cင\u001b\"ဉ\u0014#င\u0015$င\u001e*ဌ$,ဇ&3ဇ,4ဇ18ဇ0;ဇ5@ဇ9Aဉ:Bဇ;", new Object[]{"a", "t", "b", "c", "f", "g", "h", "d", "e", "i", "j", dksy.a, "k", "l", "n", "m", "o", "p", "q", "r"});
            }
            if (i2 == 3) {
                return new dkuw();
            }
            if (i2 == 4) {
                return new dksv();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkuw> dssrVar = u;
            if (dssrVar == null) {
                synchronized (dkuw.class) {
                    dssrVar = u;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        u = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.dkux
    public final dkur a() {
        dkur dkurVar = this.b;
        return dkurVar == null ? dkur.av : dkurVar;
    }

    @Override // defpackage.dkux
    public final boolean b() {
        return (this.a & 131072) != 0;
    }

    @Override // defpackage.dkux
    public final int c() {
        return this.c;
    }

    @Override // defpackage.dkux
    public final dkut d() {
        dkut dkutVar = this.d;
        return dkutVar == null ? dkut.X : dkutVar;
    }

    @Override // defpackage.dkux
    public final int e() {
        return this.e;
    }

    @Override // defpackage.dkux
    public final dksx f() {
        dksx dksxVar = this.f;
        return dksxVar == null ? dksx.c : dksxVar;
    }

    @Override // defpackage.dkux
    public final dksq g() {
        dksq dksqVar = this.g;
        return dksqVar == null ? dksq.d : dksqVar;
    }

    @Override // defpackage.dkux
    public final int h() {
        return this.h;
    }

    @Override // defpackage.dkux
    public final boolean i() {
        return (this.a & 134217728) != 0;
    }

    @Override // defpackage.dkux
    public final int j() {
        return this.i;
    }

    @Override // defpackage.dkux
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.dkux
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.dkux
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.dkux
    public final boolean n() {
        return this.n;
    }

    @Override // defpackage.dkux
    public final boolean o() {
        return this.o;
    }

    @Override // defpackage.dkux
    public final boolean p() {
        return this.p;
    }

    @Override // defpackage.dkux
    public final dkuv q() {
        dkuv dkuvVar = this.q;
        return dkuvVar == null ? dkuv.d : dkuvVar;
    }

    @Override // defpackage.dkux
    public final boolean r() {
        return this.r;
    }

    @Override // defpackage.dkux
    public final int s() {
        int a = dksz.a(this.j);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
