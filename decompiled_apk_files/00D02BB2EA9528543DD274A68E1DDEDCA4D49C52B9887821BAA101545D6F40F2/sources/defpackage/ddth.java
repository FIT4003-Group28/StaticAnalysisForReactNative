package defpackage;
/* compiled from: PG */
/* renamed from: ddth  reason: default package */
/* loaded from: classes6.dex */
public final class ddth extends dsqw<ddth, ddtg> implements dssk {
    public static final ddth d;
    private static volatile dssr<ddth> e;
    public int a;
    public int b;
    public float c;

    static {
        ddth ddthVar = new ddth();
        d = ddthVar;
        dsqw.cc(ddth.class, ddthVar);
    }

    private ddth() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddth();
            }
            if (i2 == 4) {
                return new ddtg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddth> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddth.class) {
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
