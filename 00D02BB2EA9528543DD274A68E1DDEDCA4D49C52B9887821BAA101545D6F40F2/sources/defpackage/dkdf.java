package defpackage;
/* compiled from: PG */
/* renamed from: dkdf  reason: default package */
/* loaded from: classes6.dex */
public final class dkdf extends dsqw<dkdf, dkdc> implements dssk {
    public static final dkdf c;
    private static volatile dssr<dkdf> d;
    public int a;
    public int b = 1;

    static {
        dkdf dkdfVar = new dkdf();
        c = dkdfVar;
        dsqw.cc(dkdf.class, dkdfVar);
    }

    private dkdf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dkde.c()});
            }
            if (i2 == 3) {
                return new dkdf();
            }
            if (i2 == 4) {
                return new dkdc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkdf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkdf.class) {
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
