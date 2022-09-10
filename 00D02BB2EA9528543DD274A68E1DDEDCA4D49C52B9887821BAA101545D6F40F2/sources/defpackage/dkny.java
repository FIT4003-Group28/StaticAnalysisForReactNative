package defpackage;
/* compiled from: PG */
/* renamed from: dkny  reason: default package */
/* loaded from: classes6.dex */
public final class dkny extends dsqw<dkny, dknw> implements dssk {
    public static final dkny b;
    private static volatile dssr<dkny> c;
    public dssd<String, String> a = dssd.b;

    static {
        dkny dknyVar = new dkny();
        b = dknyVar;
        dsqw.cc(dkny.class, dknyVar);
    }

    private dkny() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", dknx.a});
            }
            if (i2 == 3) {
                return new dkny();
            }
            if (i2 == 4) {
                return new dknw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkny> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkny.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
