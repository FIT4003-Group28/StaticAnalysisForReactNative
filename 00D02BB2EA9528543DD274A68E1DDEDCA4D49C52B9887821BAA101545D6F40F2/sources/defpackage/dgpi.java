package defpackage;
/* compiled from: PG */
/* renamed from: dgpi  reason: default package */
/* loaded from: classes6.dex */
public final class dgpi extends dsqw<dgpi, dgph> implements dssk {
    public static final dgpi d;
    private static volatile dssr<dgpi> e;
    public int a;
    public int b;
    public int c;

    static {
        dgpi dgpiVar = new dgpi();
        d = dgpiVar;
        dsqw.cc(dgpi.class, dgpiVar);
    }

    private dgpi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dgpa.a});
            }
            if (i2 == 3) {
                return new dgpi();
            }
            if (i2 == 4) {
                return new dgph();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgpi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgpi.class) {
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
