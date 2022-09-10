package defpackage;
/* compiled from: PG */
/* renamed from: drbv  reason: default package */
/* loaded from: classes6.dex */
public final class drbv extends dsqw<drbv, drbu> implements dssk {
    public static final drbv d;
    private static volatile dssr<drbv> e;
    public int a;
    public dspd b = dspd.b;
    public boolean c;

    static {
        drbv drbvVar = new drbv();
        d = drbvVar;
        dsqw.cc(drbv.class, drbvVar);
    }

    private drbv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ည\u0000\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drbv();
            }
            if (i2 == 4) {
                return new drbu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drbv.class) {
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
