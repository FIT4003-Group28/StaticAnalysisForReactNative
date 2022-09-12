package defpackage;
/* compiled from: PG */
/* renamed from: ddpt  reason: default package */
/* loaded from: classes6.dex */
public final class ddpt extends dsqw<ddpt, ddps> implements dssk {
    public static final ddpt d;
    private static volatile dssr<ddpt> e;
    public int a;
    public float b;
    public int c;

    static {
        ddpt ddptVar = new ddpt();
        d = ddptVar;
        dsqw.cc(ddpt.class, ddptVar);
    }

    private ddpt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddpt();
            }
            if (i2 == 4) {
                return new ddps();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddpt.class) {
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
