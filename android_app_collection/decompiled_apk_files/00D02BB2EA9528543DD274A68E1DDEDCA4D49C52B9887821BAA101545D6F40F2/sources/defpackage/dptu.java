package defpackage;
/* compiled from: PG */
/* renamed from: dptu  reason: default package */
/* loaded from: classes.dex */
public final class dptu extends dsqw<dptu, dptn> implements dssk {
    public static final dptu m;
    private static volatile dssr<dptu> n;
    public int a;
    public dqpe b;
    public int c;
    public dptp d;
    public dptt i;
    public dptt j;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String k = "";
    public String l = "";

    static {
        dptu dptuVar = new dptu();
        m = dptuVar;
        dsqw.cc(dptu.class, dptuVar);
    }

    private dptu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0002\u000e\u000b\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\tဉ\b\nဉ\t\u000bဈ\u0006\fဈ\u0007\rဈ\n\u000eဈ\u000b", new Object[]{"a", "b", "c", drbs.a, "d", "e", "f", "i", "j", "g", "h", "k", "l"});
            }
            if (i2 == 3) {
                return new dptu();
            }
            if (i2 == 4) {
                return new dptn();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dptu> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dptu.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
