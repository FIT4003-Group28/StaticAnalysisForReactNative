package defpackage;
/* compiled from: PG */
/* renamed from: dgma  reason: default package */
/* loaded from: classes6.dex */
public final class dgma extends dsqw<dgma, dglz> implements dssk {
    public static final dgma b;
    private static volatile dssr<dgma> d;
    public float a;
    private int c;

    static {
        dgma dgmaVar = new dgma();
        b = dgmaVar;
        dsqw.cc(dgma.class, dgmaVar);
    }

    private dgma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgma();
            }
            if (i2 == 4) {
                return new dglz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgma> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgma.class) {
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
