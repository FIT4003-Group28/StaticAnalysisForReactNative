package defpackage;
/* compiled from: PG */
/* renamed from: dkve  reason: default package */
/* loaded from: classes.dex */
public final class dkve extends dsqw<dkve, dkvd> implements dkvf {
    public static final dkve k;
    private static volatile dssr<dkve> m;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g = 3;
    public boolean h;
    public boolean i;
    public boolean j;
    private int l;

    static {
        dkve dkveVar = new dkve();
        k = dkveVar;
        dsqw.cc(dkve.class, dkveVar);
    }

    private dkve() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0002\u0012\n\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0007\u0007င\b\u000bဇ\u0006\u000eဇ\r\u000fဇ\u000e\u0012ဇ\u0010", new Object[]{"l", "a", "b", "c", "d", "f", "g", "e", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dkve();
            }
            if (i2 == 4) {
                return new dkvd();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkve> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dkve.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.dkvf
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.dkvf
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.dkvf
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.dkvf
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.dkvf
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.dkvf
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.dkvf
    public final int g() {
        return this.g;
    }

    @Override // defpackage.dkvf
    public final boolean h() {
        return this.h;
    }

    @Override // defpackage.dkvf
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.dkvf
    public final boolean j() {
        return this.j;
    }
}
