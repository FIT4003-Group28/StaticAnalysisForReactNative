package defpackage;
/* compiled from: PG */
/* renamed from: dndc  reason: default package */
/* loaded from: classes.dex */
public final class dndc extends dsqw<dndc, dndb> implements dndd {
    public static final dndc f;
    private static volatile dssr<dndc> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        dndc dndcVar = new dndc();
        f = dndcVar;
        dsqw.cc(dndc.class, dndcVar);
    }

    private dndc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0001\u0002င\u0002\u0003င\u0003\u0004ဌ\u0000", new Object[]{"a", "c", "d", "e", "b", dnde.a});
            }
            if (i2 == 3) {
                return new dndc();
            }
            if (i2 == 4) {
                return new dndb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dndc.class) {
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
