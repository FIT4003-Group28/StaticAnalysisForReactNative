package defpackage;
/* compiled from: PG */
/* renamed from: dvhs  reason: default package */
/* loaded from: classes.dex */
public final class dvhs extends dsqw<dvhs, dvhr> implements dssk {
    public static final dvhs d;
    private static volatile dssr<dvhs> f;
    public dqpe a;
    public dsrj<ditt> b = dssu.b;
    public int c;
    private int e;

    static {
        dvhs dvhsVar = new dvhs();
        d = dvhsVar;
        dsqw.cc(dvhs.class, dvhsVar);
    }

    private dvhs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"e", "a", "b", ditt.class, "c", drbs.a});
            }
            if (i2 == 3) {
                return new dvhs();
            }
            if (i2 == 4) {
                return new dvhr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvhs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvhs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
