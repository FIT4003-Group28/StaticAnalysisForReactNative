package defpackage;
/* compiled from: PG */
/* renamed from: dumv  reason: default package */
/* loaded from: classes.dex */
public final class dumv extends dsqw<dumv, dumu> implements dssk {
    public static final dumv c;
    private static volatile dssr<dumv> d;
    public int a;
    public int b;

    static {
        dumv dumvVar = new dumv();
        c = dumvVar;
        dsqw.cc(dumv.class, dumvVar);
    }

    private dumv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dumv();
            }
            if (i2 == 4) {
                return new dumu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dumv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dumv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
