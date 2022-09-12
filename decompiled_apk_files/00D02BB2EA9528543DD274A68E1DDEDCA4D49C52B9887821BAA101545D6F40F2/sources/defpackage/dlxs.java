package defpackage;
/* compiled from: PG */
/* renamed from: dlxs  reason: default package */
/* loaded from: classes.dex */
public final class dlxs extends dsqw<dlxs, dlxr> implements dssk {
    public static final dlxs b;
    private static volatile dssr<dlxs> d;
    public int a;
    private int c;

    static {
        dlxs dlxsVar = new dlxs();
        b = dlxsVar;
        dsqw.cc(dlxs.class, dlxsVar);
    }

    private dlxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlxs();
            }
            if (i2 == 4) {
                return new dlxr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlxs.class) {
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
