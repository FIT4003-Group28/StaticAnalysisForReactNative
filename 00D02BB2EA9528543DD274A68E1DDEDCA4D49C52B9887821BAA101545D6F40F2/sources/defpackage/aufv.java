package defpackage;
/* compiled from: PG */
/* renamed from: aufv  reason: default package */
/* loaded from: classes.dex */
public final class aufv extends dsqw<aufv, aufp> implements dssk {
    public static final aufv b;
    private static volatile dssr<aufv> c;
    public dssd<Integer, auft> a = dssd.b;

    static {
        aufv aufvVar = new aufv();
        b = aufvVar;
        dsqw.cc(aufv.class, aufvVar);
    }

    private aufv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", aufu.a});
            }
            if (i2 == 3) {
                return new aufv();
            }
            if (i2 == 4) {
                return new aufp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aufv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (aufv.class) {
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

    public final boolean b(int i) {
        return this.a.containsKey(Integer.valueOf(i));
    }
}
