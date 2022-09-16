package defpackage;
/* compiled from: PG */
/* renamed from: dnah  reason: default package */
/* loaded from: classes6.dex */
public final class dnah extends dsqw<dnah, dnag> implements dssk {
    public static final dnah b;
    private static volatile dssr<dnah> c;
    public dsrj<dnal> a = dssu.b;

    static {
        dnah dnahVar = new dnah();
        b = dnahVar;
        dsqw.cc(dnah.class, dnahVar);
    }

    private dnah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnal.class});
            }
            if (i2 == 3) {
                return new dnah();
            }
            if (i2 == 4) {
                return new dnag();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnah> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnah.class) {
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
