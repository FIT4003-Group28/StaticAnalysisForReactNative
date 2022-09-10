package defpackage;
/* compiled from: PG */
/* renamed from: dvrz  reason: default package */
/* loaded from: classes.dex */
public final class dvrz extends dsqw<dvrz, dvry> implements dssk {
    public static final dvrz d;
    private static volatile dssr<dvrz> f;
    public float a = 1.5f;
    public boolean b;
    public boolean c;
    private int e;

    static {
        dvrz dvrzVar = new dvrz();
        d = dvrzVar;
        dsqw.cc(dvrz.class, dvrzVar);
    }

    private dvrz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvrz();
            }
            if (i2 == 4) {
                return new dvry();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvrz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvrz.class) {
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
