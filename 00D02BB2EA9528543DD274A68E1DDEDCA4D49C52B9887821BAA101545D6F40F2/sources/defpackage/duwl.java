package defpackage;
/* compiled from: PG */
/* renamed from: duwl  reason: default package */
/* loaded from: classes.dex */
public final class duwl extends dsqw<duwl, duwe> implements duwm {
    public static final duwl q;
    private static volatile dssr<duwl> t;
    public boolean a;
    public boolean b;
    public duwi d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public duwg k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    private int r;
    private int s;
    public int c = 10;
    public long j = 7200;

    static {
        duwl duwlVar = new duwl();
        q = duwlVar;
        dsqw.cc(duwl.class, duwlVar);
    }

    private duwl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u0010\u0000\u0002\u0001!\u0010\u0000\u0000\u0000\u0001င\u0002\u0002ဉ\u0003\u0003ဇ\u0004\u0004ဇ\u0000\u0005ဇ\u0001\u0006ဂ\t\tဉ\f\fဌ\u000f\u000eဇ\u0011\u0012ဇ\u0005\u0013င\u0006\u0014ဇ\u0007\u0016ဇ\u0016\u0018ဇ\b\u001cဇ\u001b!ဇ ", new Object[]{"r", "s", "c", "d", "e", "a", "b", "j", "k", "l", duwj.a, "m", "f", "g", "h", "n", "i", "o", "p"});
            }
            if (i2 == 3) {
                return new duwl();
            }
            if (i2 == 4) {
                return new duwe();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwl> dssrVar = t;
            if (dssrVar == null) {
                synchronized (duwl.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.duwm
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.duwm
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.duwm
    public final int c() {
        return this.c;
    }

    @Override // defpackage.duwm
    public final duwi d() {
        duwi duwiVar = this.d;
        return duwiVar == null ? duwi.d : duwiVar;
    }

    @Override // defpackage.duwm
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.duwm
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.duwm
    public final int g() {
        return this.g;
    }

    @Override // defpackage.duwm
    public final boolean h() {
        return this.h;
    }

    @Override // defpackage.duwm
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.duwm
    public final long j() {
        return this.j;
    }

    @Override // defpackage.duwm
    public final duwg k() {
        duwg duwgVar = this.k;
        return duwgVar == null ? duwg.b : duwgVar;
    }

    @Override // defpackage.duwm
    public final boolean l() {
        return this.m;
    }

    @Override // defpackage.duwm
    public final boolean m() {
        return this.n;
    }

    @Override // defpackage.duwm
    public final boolean n() {
        return this.o;
    }

    @Override // defpackage.duwm
    public final boolean o() {
        return this.p;
    }

    @Override // defpackage.duwm
    public final int p() {
        int a = duwk.a(this.l);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
