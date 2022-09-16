package defpackage;
/* compiled from: PG */
/* renamed from: dlky  reason: default package */
/* loaded from: classes6.dex */
public final class dlky extends dsqw<dlky, dlkx> implements dssk {
    public static final dlky b;
    private static volatile dssr<dlky> d;
    public dspd a = dspd.b;
    private int c;

    static {
        dlky dlkyVar = new dlky();
        b = dlkyVar;
        dsqw.cc(dlky.class, dlkyVar);
    }

    private dlky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlky();
            }
            if (i2 == 4) {
                return new dlkx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlky> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlky.class) {
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
