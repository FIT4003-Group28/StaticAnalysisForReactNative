package defpackage;
/* compiled from: PG */
/* renamed from: dnig  reason: default package */
/* loaded from: classes6.dex */
public final class dnig extends dsqw<dnig, dnif> implements dssk {
    public static final dnig c;
    private static volatile dssr<dnig> d;
    public int a;
    public boolean b;

    static {
        dnig dnigVar = new dnig();
        c = dnigVar;
        dsqw.cc(dnig.class, dnigVar);
    }

    private dnig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnig();
            }
            if (i2 == 4) {
                return new dnif();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnig> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnig.class) {
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
