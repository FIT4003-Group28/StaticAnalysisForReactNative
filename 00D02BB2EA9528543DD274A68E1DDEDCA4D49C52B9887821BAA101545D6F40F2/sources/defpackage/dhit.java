package defpackage;
/* compiled from: PG */
/* renamed from: dhit  reason: default package */
/* loaded from: classes6.dex */
public final class dhit extends dsqw<dhit, dhis> implements dssk {
    public static final dhit a;
    private static volatile dssr<dhit> b;

    static {
        dhit dhitVar = new dhit();
        a = dhitVar;
        dsqw.cc(dhit.class, dhitVar);
    }

    private dhit() {
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
                return new dhit();
            }
            if (i2 == 4) {
                return new dhis();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhit> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhit.class) {
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
