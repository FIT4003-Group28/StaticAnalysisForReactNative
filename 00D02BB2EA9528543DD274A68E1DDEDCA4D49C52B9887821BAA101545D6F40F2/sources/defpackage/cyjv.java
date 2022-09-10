package defpackage;
/* compiled from: PG */
/* renamed from: cyjv  reason: default package */
/* loaded from: classes5.dex */
public final class cyjv extends dsqw<cyjv, cyju> implements dssk {
    public static final cyjv b;
    private static volatile dssr<cyjv> c;
    public dsrj<String> a = dssu.b;

    static {
        cyjv cyjvVar = new cyjv();
        b = cyjvVar;
        dsqw.cc(cyjv.class, cyjvVar);
    }

    private cyjv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new cyjv();
            }
            if (i2 == 4) {
                return new cyju();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cyjv.class) {
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
