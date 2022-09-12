package defpackage;
/* compiled from: PG */
/* renamed from: djfs  reason: default package */
/* loaded from: classes6.dex */
public final class djfs extends dsqw<djfs, djfr> implements dssk {
    public static final djfs f;
    private static volatile dssr<djfs> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public dqei e;

    static {
        djfs djfsVar = new djfs();
        f = djfsVar;
        dsqw.cc(djfs.class, djfsVar);
    }

    private djfs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဈ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new djfs();
            }
            if (i2 == 4) {
                return new djfr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djfs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djfs.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
