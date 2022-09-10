package defpackage;
/* compiled from: PG */
/* renamed from: dlws  reason: default package */
/* loaded from: classes.dex */
public final class dlws extends dsqw<dlws, dlwp> implements dssk {
    public static final dlws c;
    private static volatile dssr<dlws> d;
    public int a;
    public int b;

    static {
        dlws dlwsVar = new dlws();
        c = dlwsVar;
        dsqw.cc(dlws.class, dlwsVar);
    }

    private dlws() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dlwq.a});
            }
            if (i2 == 3) {
                return new dlws();
            }
            if (i2 == 4) {
                return new dlwp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlws> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlws.class) {
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
