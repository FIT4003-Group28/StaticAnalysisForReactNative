package defpackage;
/* compiled from: PG */
/* renamed from: dnoh  reason: default package */
/* loaded from: classes.dex */
public final class dnoh extends dsqw<dnoh, dnog> implements dssk {
    public static final dnoh d;
    private static volatile dssr<dnoh> e;
    public int a;
    public double b;
    public double c;

    static {
        dnoh dnohVar = new dnoh();
        d = dnohVar;
        dsqw.cc(dnoh.class, dnohVar);
    }

    private dnoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003က\u0000\u0004က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnoh();
            }
            if (i2 == 4) {
                return new dnog();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnoh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnoh.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
