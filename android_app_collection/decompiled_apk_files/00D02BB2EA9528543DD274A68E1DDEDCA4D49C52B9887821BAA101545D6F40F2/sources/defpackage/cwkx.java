package defpackage;
/* compiled from: PG */
/* renamed from: cwkx  reason: default package */
/* loaded from: classes5.dex */
public final class cwkx extends dsqw<cwkx, cwkw> implements dssk {
    public static final cwkx b;
    private static volatile dssr<cwkx> d;
    public ddff a;
    private int c;

    static {
        cwkx cwkxVar = new cwkx();
        b = cwkxVar;
        dsqw.cc(cwkx.class, cwkxVar);
    }

    private cwkx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new cwkx();
            }
            if (i2 == 4) {
                return new cwkw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cwkx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cwkx.class) {
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
