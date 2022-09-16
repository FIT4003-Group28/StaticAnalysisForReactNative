package defpackage;
/* compiled from: PG */
/* renamed from: ddvl  reason: default package */
/* loaded from: classes6.dex */
public final class ddvl extends dsqw<ddvl, ddvk> implements dssk {
    public static final ddvl p;
    private static volatile dssr<ddvl> q;
    public int a;
    public int b;
    public boolean c;
    public dstv d;
    public duhe e;
    public long f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    static {
        ddvl ddvlVar = new ddvl();
        p = ddvlVar;
        dsqw.cc(ddvl.class, ddvlVar);
    }

    private ddvl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\u000e\u0000\u0001\u0001\u001b\u000e\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0006ဉ\u0003\u0007င\u0005\bင\u0006\tဌ\u0007\nဇ\b\fင\t\rင\n\u000eဏ\u000b\u000fင\f\u0011င\u000e\u001bဂ\u0004", new Object[]{"a", "b", ddvn.c(), "c", "d", "e", "g", "h", "i", dqvj.d(), "j", "k", "l", "m", "n", "o", "f"});
            }
            if (i2 == 3) {
                return new ddvl();
            }
            if (i2 == 4) {
                return new ddvk();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvl> dssrVar = q;
            if (dssrVar == null) {
                synchronized (ddvl.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
