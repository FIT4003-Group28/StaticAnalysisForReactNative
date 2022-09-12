package defpackage;
/* compiled from: PG */
/* renamed from: dvbd  reason: default package */
/* loaded from: classes6.dex */
public final class dvbd extends dsqw<dvbd, dvbc> implements dssk {
    public static final dvbd d;
    private static volatile dssr<dvbd> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dvbd dvbdVar = new dvbd();
        d = dvbdVar;
        dsqw.cc(dvbd.class, dvbdVar);
    }

    private dvbd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvbd();
            }
            if (i2 == 4) {
                return new dvbc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvbd.class) {
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
