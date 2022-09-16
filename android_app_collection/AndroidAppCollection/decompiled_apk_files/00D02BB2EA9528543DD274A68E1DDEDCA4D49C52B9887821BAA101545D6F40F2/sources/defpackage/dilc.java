package defpackage;
/* compiled from: PG */
/* renamed from: dilc  reason: default package */
/* loaded from: classes6.dex */
public final class dilc extends dsqw<dilc, dilb> implements dssk {
    public static final dilc a;
    private static volatile dssr<dilc> b;

    static {
        dilc dilcVar = new dilc();
        a = dilcVar;
        dsqw.cc(dilc.class, dilcVar);
    }

    private dilc() {
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
                return new dilc();
            }
            if (i2 == 4) {
                return new dilb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dilc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dilc.class) {
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
