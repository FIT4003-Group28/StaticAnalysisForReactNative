package defpackage;
/* compiled from: PG */
/* renamed from: dvip  reason: default package */
/* loaded from: classes.dex */
public final class dvip extends dsqw<dvip, dvio> implements dssk {
    public static final dvip c;
    private static volatile dssr<dvip> d;
    public int a;
    public dwfv b;

    static {
        dvip dvipVar = new dvip();
        c = dvipVar;
        dsqw.cc(dvip.class, dvipVar);
    }

    private dvip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvip();
            }
            if (i2 == 4) {
                return new dvio();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvip> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvip.class) {
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
