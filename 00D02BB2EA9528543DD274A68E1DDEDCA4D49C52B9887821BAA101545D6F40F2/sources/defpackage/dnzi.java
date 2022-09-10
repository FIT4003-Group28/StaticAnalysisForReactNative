package defpackage;
/* compiled from: PG */
/* renamed from: dnzi  reason: default package */
/* loaded from: classes6.dex */
public final class dnzi extends dsqw<dnzi, dnzh> implements dssk {
    public static final dnzi c;
    private static volatile dssr<dnzi> d;
    public int a;
    public boolean b;

    static {
        dnzi dnziVar = new dnzi();
        c = dnziVar;
        dsqw.cc(dnzi.class, dnziVar);
    }

    private dnzi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnzi();
            }
            if (i2 == 4) {
                return new dnzh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnzi.class) {
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
