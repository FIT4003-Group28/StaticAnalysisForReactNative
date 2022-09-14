package defpackage;
/* compiled from: PG */
/* renamed from: dtsc  reason: default package */
/* loaded from: classes6.dex */
public final class dtsc extends dsqw<dtsc, dtsb> implements dssk {
    public static final dtsc a;
    private static volatile dssr<dtsc> b;

    static {
        dtsc dtscVar = new dtsc();
        a = dtscVar;
        dsqw.cc(dtsc.class, dtscVar);
    }

    private dtsc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtsc();
            }
            if (i2 == 4) {
                return new dtsb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtsc.class) {
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
