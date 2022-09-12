package defpackage;
/* compiled from: PG */
/* renamed from: diuy  reason: default package */
/* loaded from: classes6.dex */
public final class diuy extends dsqw<diuy, diux> implements dssk {
    public static final diuy b;
    private static volatile dssr<diuy> d;
    public String a = "";
    private int c;

    static {
        diuy diuyVar = new diuy();
        b = diuyVar;
        dsqw.cc(diuy.class, diuyVar);
    }

    private diuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new diuy();
            }
            if (i2 == 4) {
                return new diux();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diuy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diuy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
