package defpackage;
/* compiled from: PG */
/* renamed from: dlkz  reason: default package */
/* loaded from: classes6.dex */
public final class dlkz extends dsqw<dlkz, dlkw> implements dssk {
    public static final dlkz e;
    private static volatile dssr<dlkz> g;
    public boolean c;
    private int f;
    public dspd a = dspd.b;
    public dspd b = dspd.b;
    public dsrj<dlky> d = dssu.b;

    static {
        dlkz dlkzVar = new dlkz();
        e = dlkzVar;
        dsqw.cc(dlkz.class, dlkzVar);
    }

    private dlkz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ည\u0001\u0003\u001b\u0004ဇ\u0002", new Object[]{"f", "a", "b", "d", dlky.class, "c"});
            }
            if (i2 == 3) {
                return new dlkz();
            }
            if (i2 == 4) {
                return new dlkw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlkz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlkz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
