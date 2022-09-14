package defpackage;
/* compiled from: PG */
/* renamed from: dnkz  reason: default package */
/* loaded from: classes6.dex */
public final class dnkz extends dsqw<dnkz, dnky> implements dssk {
    public static final dnkz c;
    private static volatile dssr<dnkz> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dnkz dnkzVar = new dnkz();
        c = dnkzVar;
        dsqw.cc(dnkz.class, dnkzVar);
    }

    private dnkz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnkz();
            }
            if (i2 == 4) {
                return new dnky();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnkz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnkz.class) {
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
