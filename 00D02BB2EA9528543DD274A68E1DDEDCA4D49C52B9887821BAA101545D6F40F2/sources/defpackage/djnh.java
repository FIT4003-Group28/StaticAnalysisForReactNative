package defpackage;
/* compiled from: PG */
/* renamed from: djnh  reason: default package */
/* loaded from: classes6.dex */
public final class djnh extends dsqw<djnh, djng> implements dssk {
    public static final djnh c;
    private static volatile dssr<djnh> d;
    public int a;
    public dspd b = dspd.b;

    static {
        djnh djnhVar = new djnh();
        c = djnhVar;
        dsqw.cc(djnh.class, djnhVar);
    }

    private djnh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djnh();
            }
            if (i2 == 4) {
                return new djng();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djnh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djnh.class) {
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
