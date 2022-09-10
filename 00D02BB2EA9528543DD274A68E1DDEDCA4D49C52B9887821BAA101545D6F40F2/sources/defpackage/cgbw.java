package defpackage;
/* compiled from: PG */
/* renamed from: cgbw  reason: default package */
/* loaded from: classes4.dex */
public final class cgbw extends dsqw<cgbw, cgbu> implements dssk {
    public static final cgbw c;
    private static volatile dssr<cgbw> d;
    public int a;
    public int b;

    static {
        cgbw cgbwVar = new cgbw();
        c = cgbwVar;
        dsqw.cc(cgbw.class, cgbwVar);
    }

    private cgbw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cgbv.a});
            }
            if (i2 == 3) {
                return new cgbw();
            }
            if (i2 == 4) {
                return new cgbu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgbw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cgbw.class) {
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
