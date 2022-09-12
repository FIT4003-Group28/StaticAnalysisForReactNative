package defpackage;
/* compiled from: PG */
/* renamed from: dtdz  reason: default package */
/* loaded from: classes6.dex */
public final class dtdz extends dsqw<dtdz, dtdy> implements dssk {
    public static final dtdz a;
    private static volatile dssr<dtdz> b;

    static {
        dtdz dtdzVar = new dtdz();
        a = dtdzVar;
        dsqw.cc(dtdz.class, dtdzVar);
    }

    private dtdz() {
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
                return new dtdz();
            }
            if (i2 == 4) {
                return new dtdy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtdz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtdz.class) {
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
