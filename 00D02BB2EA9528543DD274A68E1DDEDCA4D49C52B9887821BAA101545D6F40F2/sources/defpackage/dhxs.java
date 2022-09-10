package defpackage;
/* compiled from: PG */
/* renamed from: dhxs  reason: default package */
/* loaded from: classes6.dex */
public final class dhxs extends dsqw<dhxs, dhxr> implements dssk {
    public static final dhxs a;
    private static volatile dssr<dhxs> b;

    static {
        dhxs dhxsVar = new dhxs();
        a = dhxsVar;
        dsqw.cc(dhxs.class, dhxsVar);
    }

    private dhxs() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhxs();
            }
            if (i2 == 4) {
                return new dhxr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhxs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhxs.class) {
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
