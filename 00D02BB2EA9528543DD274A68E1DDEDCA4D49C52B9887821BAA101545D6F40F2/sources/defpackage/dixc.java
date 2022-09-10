package defpackage;
/* compiled from: PG */
/* renamed from: dixc  reason: default package */
/* loaded from: classes6.dex */
public final class dixc extends dsqw<dixc, dixb> implements dssk {
    public static final dixc a;
    private static volatile dssr<dixc> b;

    static {
        dixc dixcVar = new dixc();
        a = dixcVar;
        dsqw.cc(dixc.class, dixcVar);
    }

    private dixc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dixc();
            }
            if (i2 == 4) {
                return new dixb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dixc.class) {
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
