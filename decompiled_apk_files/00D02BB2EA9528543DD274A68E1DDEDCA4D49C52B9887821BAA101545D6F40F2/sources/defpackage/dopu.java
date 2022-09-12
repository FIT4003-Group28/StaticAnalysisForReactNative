package defpackage;
/* compiled from: PG */
/* renamed from: dopu  reason: default package */
/* loaded from: classes.dex */
public final class dopu extends dsqw<dopu, dopt> implements dssk {
    public static final dopu c;
    private static volatile dssr<dopu> d;
    public int a;
    public boolean b;

    static {
        dopu dopuVar = new dopu();
        c = dopuVar;
        dsqw.cc(dopu.class, dopuVar);
    }

    private dopu() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dopu();
            }
            if (i2 == 4) {
                return new dopt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dopu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dopu.class) {
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
