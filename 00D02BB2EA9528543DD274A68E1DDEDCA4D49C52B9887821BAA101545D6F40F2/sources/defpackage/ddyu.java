package defpackage;
/* compiled from: PG */
/* renamed from: ddyu  reason: default package */
/* loaded from: classes.dex */
public final class ddyu extends dsqw<ddyu, ddyt> implements dssk {
    public static final ddyu i;
    private static volatile dssr<ddyu> j;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public float f;
    public dsrf g = dsqz.b;
    public dspd h = dspd.b;

    static {
        ddyu ddyuVar = new ddyu();
        i = ddyuVar;
        dsqw.cc(ddyu.class, ddyuVar);
    }

    private ddyu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0011\u0007\u0000\u0001\u0000\u0001င\u0000\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0007ခ\u0006\nည\t\u0011\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g"});
            }
            if (i3 == 3) {
                return new ddyu();
            }
            if (i3 == 4) {
                return new ddyt();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddyu> dssrVar = j;
            if (dssrVar == null) {
                synchronized (ddyu.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
