package defpackage;
/* compiled from: PG */
/* renamed from: dtru  reason: default package */
/* loaded from: classes6.dex */
public final class dtru extends dsqw<dtru, dtrt> implements dssk {
    public static final dtru a;
    private static volatile dssr<dtru> b;

    static {
        dtru dtruVar = new dtru();
        a = dtruVar;
        dsqw.cc(dtru.class, dtruVar);
    }

    private dtru() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtru();
            }
            if (i2 == 4) {
                return new dtrt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtru> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtru.class) {
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
