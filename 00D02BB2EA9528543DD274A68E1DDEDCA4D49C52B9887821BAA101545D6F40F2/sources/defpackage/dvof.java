package defpackage;
/* compiled from: PG */
/* renamed from: dvof  reason: default package */
/* loaded from: classes6.dex */
public final class dvof extends dsqw<dvof, dvoa> implements dssk {
    public static final dvof c;
    private static volatile dssr<dvof> d;
    public int a;
    public dvoe b;

    static {
        dvof dvofVar = new dvof();
        c = dvofVar;
        dsqw.cc(dvof.class, dvofVar);
    }

    private dvof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvof();
            }
            if (i2 == 4) {
                return new dvoa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvof> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvof.class) {
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
