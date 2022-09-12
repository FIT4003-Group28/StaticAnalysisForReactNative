package defpackage;
/* compiled from: PG */
/* renamed from: eavv  reason: default package */
/* loaded from: classes6.dex */
public final class eavv extends dsqw<eavv, eavt> implements dssk {
    public static final eavv b;
    private static volatile dssr<eavv> c;
    public dssd<String, eavs> a = dssd.b;

    static {
        eavv eavvVar = new eavv();
        b = eavvVar;
        dsqw.cc(eavv.class, eavvVar);
    }

    private eavv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", eavu.a});
            }
            if (i2 == 3) {
                return new eavv();
            }
            if (i2 == 4) {
                return new eavt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eavv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (eavv.class) {
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
