package defpackage;
/* compiled from: PG */
/* renamed from: dvhu  reason: default package */
/* loaded from: classes.dex */
public final class dvhu extends dsqw<dvhu, dvht> implements dssk {
    public static final dvhu d;
    private static volatile dssr<dvhu> f;
    public dqpe a;
    public dsrj<dhxw> b = dssu.b;
    public int c;
    private int e;

    static {
        dvhu dvhuVar = new dvhu();
        d = dvhuVar;
        dsqw.cc(dvhu.class, dvhuVar);
    }

    private dvhu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"e", "a", "b", dhxw.class, "c", drbs.a});
            }
            if (i2 == 3) {
                return new dvhu();
            }
            if (i2 == 4) {
                return new dvht();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvhu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvhu.class) {
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
