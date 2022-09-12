package defpackage;
/* compiled from: PG */
/* renamed from: dgho  reason: default package */
/* loaded from: classes.dex */
public final class dgho extends dsqw<dgho, dghn> implements dssk {
    public static final dgho b;
    private static volatile dssr<dgho> d;
    public dhkd a;
    private int c;

    static {
        dgho dghoVar = new dgho();
        b = dghoVar;
        dsqw.cc(dgho.class, dghoVar);
    }

    private dgho() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgho();
            }
            if (i2 == 4) {
                return new dghn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgho> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgho.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
