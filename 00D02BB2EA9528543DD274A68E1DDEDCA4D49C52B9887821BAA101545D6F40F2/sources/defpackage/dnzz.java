package defpackage;
/* compiled from: PG */
/* renamed from: dnzz  reason: default package */
/* loaded from: classes6.dex */
public final class dnzz extends dsqw<dnzz, dnzy> implements dssk {
    public static final dnzz c;
    private static volatile dssr<dnzz> d;
    public int a;
    public int b;

    static {
        dnzz dnzzVar = new dnzz();
        c = dnzzVar;
        dsqw.cc(dnzz.class, dnzzVar);
    }

    private dnzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", doab.c()});
            }
            if (i2 == 3) {
                return new dnzz();
            }
            if (i2 == 4) {
                return new dnzy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnzz.class) {
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
