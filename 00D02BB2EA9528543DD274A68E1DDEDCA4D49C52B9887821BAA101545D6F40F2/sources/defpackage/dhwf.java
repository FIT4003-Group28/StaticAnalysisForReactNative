package defpackage;
/* compiled from: PG */
/* renamed from: dhwf  reason: default package */
/* loaded from: classes6.dex */
public final class dhwf extends dsqw<dhwf, dhwe> implements dssk {
    public static final dhwf f;
    private static volatile dssr<dhwf> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        dhwf dhwfVar = new dhwf();
        f = dhwfVar;
        dsqw.cc(dhwf.class, dhwfVar);
    }

    private dhwf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dhwf();
            }
            if (i2 == 4) {
                return new dhwe();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhwf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhwf.class) {
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
