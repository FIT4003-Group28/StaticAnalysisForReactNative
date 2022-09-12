package defpackage;
/* compiled from: PG */
/* renamed from: dgez  reason: default package */
/* loaded from: classes6.dex */
public final class dgez extends dsqw<dgez, dgew> implements dssk {
    public static final dgez b;
    private static volatile dssr<dgez> d;
    public int a;
    private int c;

    static {
        dgez dgezVar = new dgez();
        b = dgezVar;
        dsqw.cc(dgez.class, dgezVar);
    }

    private dgez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dgex.a});
            }
            if (i2 == 3) {
                return new dgez();
            }
            if (i2 == 4) {
                return new dgew();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgez> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgez.class) {
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
