package defpackage;
/* compiled from: PG */
/* renamed from: dsed  reason: default package */
/* loaded from: classes6.dex */
public final class dsed extends dsqw<dsed, dsec> implements dssk {
    public static final dsed e;
    private static volatile dssr<dsed> g;
    public int a;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        dsed dsedVar = new dsed();
        e = dsedVar;
        dsqw.cc(dsed.class, dsedVar);
    }

    private dsed() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"f", "a", dsdg.a, "b", dsck.a, "c", dsci.a, "d", dsdy.a});
            }
            if (i2 == 3) {
                return new dsed();
            }
            if (i2 == 4) {
                return new dsec();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsed> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsed.class) {
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
