package defpackage;
/* compiled from: PG */
/* renamed from: doik  reason: default package */
/* loaded from: classes6.dex */
public final class doik extends dsqw<doik, doif> implements dssk {
    public static final doik b;
    private static volatile dssr<doik> c;
    public dsrj<doij> a = dssu.b;

    static {
        doik doikVar = new doik();
        b = doikVar;
        dsqw.cc(doik.class, doikVar);
    }

    private doik() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", doij.class});
            }
            if (i2 == 3) {
                return new doik();
            }
            if (i2 == 4) {
                return new doif();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doik> dssrVar = c;
            if (dssrVar == null) {
                synchronized (doik.class) {
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
