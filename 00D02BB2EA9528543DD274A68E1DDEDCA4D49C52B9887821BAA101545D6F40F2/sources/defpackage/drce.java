package defpackage;
/* compiled from: PG */
/* renamed from: drce  reason: default package */
/* loaded from: classes6.dex */
public final class drce extends dsqw<drce, drcd> implements dssk {
    public static final drce c;
    private static volatile dssr<drce> d;
    public int a;
    public int b;

    static {
        drce drceVar = new drce();
        c = drceVar;
        dsqw.cc(drce.class, drceVar);
    }

    private drce() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drca.a});
            }
            if (i2 == 3) {
                return new drce();
            }
            if (i2 == 4) {
                return new drcd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drce> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drce.class) {
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
