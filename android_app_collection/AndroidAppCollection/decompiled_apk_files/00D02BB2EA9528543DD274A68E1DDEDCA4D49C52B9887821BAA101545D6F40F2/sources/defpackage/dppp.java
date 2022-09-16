package defpackage;
/* compiled from: PG */
/* renamed from: dppp  reason: default package */
/* loaded from: classes6.dex */
public final class dppp extends dsqw<dppp, dppo> implements dssk {
    public static final dppp b;
    private static volatile dssr<dppp> c;
    public dsrj<dpox> a = dssu.b;

    static {
        dppp dpppVar = new dppp();
        b = dpppVar;
        dsqw.cc(dppp.class, dpppVar);
    }

    private dppp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpox.class});
            }
            if (i2 == 3) {
                return new dppp();
            }
            if (i2 == 4) {
                return new dppo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dppp.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
