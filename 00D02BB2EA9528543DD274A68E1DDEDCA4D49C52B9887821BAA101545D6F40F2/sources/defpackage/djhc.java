package defpackage;
/* compiled from: PG */
/* renamed from: djhc  reason: default package */
/* loaded from: classes6.dex */
public final class djhc extends dsqw<djhc, djhb> implements dssk {
    public static final djhc a;
    private static volatile dssr<djhc> b;

    static {
        djhc djhcVar = new djhc();
        a = djhcVar;
        dsqw.cc(djhc.class, djhcVar);
    }

    private djhc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djhc();
            }
            if (i2 == 4) {
                return new djhb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djhc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djhc.class) {
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
