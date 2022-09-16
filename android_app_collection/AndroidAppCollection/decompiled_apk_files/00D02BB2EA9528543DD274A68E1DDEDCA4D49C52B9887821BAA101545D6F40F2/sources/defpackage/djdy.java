package defpackage;
/* compiled from: PG */
/* renamed from: djdy  reason: default package */
/* loaded from: classes6.dex */
public final class djdy extends dsqw<djdy, djdx> implements dssk {
    public static final djdy b;
    private static volatile dssr<djdy> d;
    public dinw a;
    private int c;

    static {
        djdy djdyVar = new djdy();
        b = djdyVar;
        dsqw.cc(djdy.class, djdyVar);
    }

    private djdy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djdy();
            }
            if (i2 == 4) {
                return new djdx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djdy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djdy.class) {
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
