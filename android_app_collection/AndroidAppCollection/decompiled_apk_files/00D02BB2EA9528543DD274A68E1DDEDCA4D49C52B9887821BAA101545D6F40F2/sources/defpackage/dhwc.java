package defpackage;
/* compiled from: PG */
/* renamed from: dhwc  reason: default package */
/* loaded from: classes6.dex */
public final class dhwc extends dsqw<dhwc, dhwb> implements dssk {
    public static final dhwc a;
    private static volatile dssr<dhwc> b;

    static {
        dhwc dhwcVar = new dhwc();
        a = dhwcVar;
        dsqw.cc(dhwc.class, dhwcVar);
    }

    private dhwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhwc();
            }
            if (i2 == 4) {
                return new dhwb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhwc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhwc.class) {
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
