package defpackage;
/* compiled from: PG */
/* renamed from: dmyl  reason: default package */
/* loaded from: classes.dex */
public final class dmyl extends dsqw<dmyl, dmyk> implements dssk {
    public static final dmyl b;
    private static volatile dssr<dmyl> d;
    public int a;
    private int c;

    static {
        dmyl dmylVar = new dmyl();
        b = dmylVar;
        dsqw.cc(dmyl.class, dmylVar);
    }

    private dmyl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dmyl();
            }
            if (i2 == 4) {
                return new dmyk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmyl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmyl.class) {
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