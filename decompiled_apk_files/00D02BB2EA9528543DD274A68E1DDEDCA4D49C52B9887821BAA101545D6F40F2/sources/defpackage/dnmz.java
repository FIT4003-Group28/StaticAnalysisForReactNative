package defpackage;
/* compiled from: PG */
/* renamed from: dnmz  reason: default package */
/* loaded from: classes6.dex */
public final class dnmz extends dsqw<dnmz, dnmy> implements dssk {
    public static final dnmz c;
    private static volatile dssr<dnmz> d;
    public int a;
    public int b;

    static {
        dnmz dnmzVar = new dnmz();
        c = dnmzVar;
        dsqw.cc(dnmz.class, dnmzVar);
    }

    private dnmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpxl.a});
            }
            if (i2 == 3) {
                return new dnmz();
            }
            if (i2 == 4) {
                return new dnmy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnmz.class) {
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