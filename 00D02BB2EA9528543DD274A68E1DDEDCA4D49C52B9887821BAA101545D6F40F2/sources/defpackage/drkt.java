package defpackage;
/* compiled from: PG */
/* renamed from: drkt  reason: default package */
/* loaded from: classes6.dex */
public final class drkt extends dsqw<drkt, drks> implements dssk {
    public static final drkt c;
    private static volatile dssr<drkt> d;
    public int a;
    public dspd b = dspd.b;

    static {
        drkt drktVar = new drkt();
        c = drktVar;
        dsqw.cc(drkt.class, drktVar);
    }

    private drkt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drkt();
            }
            if (i2 == 4) {
                return new drks();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drkt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drkt.class) {
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
