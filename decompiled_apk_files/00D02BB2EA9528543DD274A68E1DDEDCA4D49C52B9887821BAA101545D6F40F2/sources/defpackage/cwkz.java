package defpackage;
/* compiled from: PG */
/* renamed from: cwkz  reason: default package */
/* loaded from: classes5.dex */
public final class cwkz extends dsqw<cwkz, cwky> implements dssk {
    public static final cwkz b;
    private static volatile dssr<cwkz> d;
    public ddfh a;
    private int c;

    static {
        cwkz cwkzVar = new cwkz();
        b = cwkzVar;
        dsqw.cc(cwkz.class, cwkzVar);
    }

    private cwkz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new cwkz();
            }
            if (i2 == 4) {
                return new cwky();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cwkz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cwkz.class) {
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
