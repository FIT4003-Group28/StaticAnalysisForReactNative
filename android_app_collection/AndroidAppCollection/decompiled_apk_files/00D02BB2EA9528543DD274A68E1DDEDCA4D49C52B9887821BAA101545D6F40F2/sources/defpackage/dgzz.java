package defpackage;
/* compiled from: PG */
/* renamed from: dgzz  reason: default package */
/* loaded from: classes6.dex */
public final class dgzz extends dsqw<dgzz, dgzw> implements dssk {
    public static final dgzz c;
    private static volatile dssr<dgzz> d;
    public int a;
    public int b;

    static {
        dgzz dgzzVar = new dgzz();
        c = dgzzVar;
        dsqw.cc(dgzz.class, dgzzVar);
    }

    private dgzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgzz();
            }
            if (i2 == 4) {
                return new dgzw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgzz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
