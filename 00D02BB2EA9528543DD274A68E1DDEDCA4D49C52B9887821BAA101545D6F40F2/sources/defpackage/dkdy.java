package defpackage;
/* compiled from: PG */
/* renamed from: dkdy  reason: default package */
/* loaded from: classes6.dex */
public final class dkdy extends dsqw<dkdy, dkdx> implements dssk {
    public static final dkdy b;
    private static volatile dssr<dkdy> d;
    public dnwb a;
    private int c;

    static {
        dkdy dkdyVar = new dkdy();
        b = dkdyVar;
        dsqw.cc(dkdy.class, dkdyVar);
    }

    private dkdy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkdy();
            }
            if (i2 == 4) {
                return new dkdx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkdy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkdy.class) {
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
