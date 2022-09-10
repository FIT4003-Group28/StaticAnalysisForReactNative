package defpackage;
/* compiled from: PG */
/* renamed from: dpvw  reason: default package */
/* loaded from: classes6.dex */
public final class dpvw extends dsqw<dpvw, dpvv> implements dssk {
    public static final dpvw d;
    private static volatile dssr<dpvw> e;
    public int a;
    public int b;
    public dpoj c;

    static {
        dpvw dpvwVar = new dpvw();
        d = dpvwVar;
        dsqw.cc(dpvw.class, dpvwVar);
    }

    private dpvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpvw();
            }
            if (i2 == 4) {
                return new dpvv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpvw.class) {
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
