package defpackage;
/* compiled from: PG */
/* renamed from: dvib  reason: default package */
/* loaded from: classes.dex */
public final class dvib extends dsqw<dvib, dvia> implements dssk {
    public static final dvib c;
    private static volatile dssr<dvib> d;
    public int a;
    public boolean b;

    static {
        dvib dvibVar = new dvib();
        c = dvibVar;
        dsqw.cc(dvib.class, dvibVar);
    }

    private dvib() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvib();
            }
            if (i2 == 4) {
                return new dvia();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvib> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvib.class) {
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
