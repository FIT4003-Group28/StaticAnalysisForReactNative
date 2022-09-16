package defpackage;
/* compiled from: PG */
/* renamed from: ddco  reason: default package */
/* loaded from: classes5.dex */
public final class ddco extends dsqw<ddco, ddcn> implements dssk {
    public static final ddco d;
    private static volatile dssr<ddco> e;
    public int a;
    public long b;
    public int c;

    static {
        ddco ddcoVar = new ddco();
        d = ddcoVar;
        dsqw.cc(ddco.class, ddcoVar);
    }

    private ddco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddco();
            }
            if (i2 == 4) {
                return new ddcn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddco> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddco.class) {
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
