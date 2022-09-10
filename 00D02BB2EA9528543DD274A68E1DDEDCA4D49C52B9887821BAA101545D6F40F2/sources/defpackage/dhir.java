package defpackage;
/* compiled from: PG */
/* renamed from: dhir  reason: default package */
/* loaded from: classes6.dex */
public final class dhir extends dsqw<dhir, dhiq> implements dssk {
    public static final dhir a;
    private static volatile dssr<dhir> b;

    static {
        dhir dhirVar = new dhir();
        a = dhirVar;
        dsqw.cc(dhir.class, dhirVar);
    }

    private dhir() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dhir();
            }
            if (i2 == 4) {
                return new dhiq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhir> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhir.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
