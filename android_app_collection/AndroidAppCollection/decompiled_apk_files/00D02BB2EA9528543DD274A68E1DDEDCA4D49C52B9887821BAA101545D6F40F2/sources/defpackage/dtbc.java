package defpackage;
/* compiled from: PG */
/* renamed from: dtbc  reason: default package */
/* loaded from: classes6.dex */
public final class dtbc extends dsqw<dtbc, dtbb> implements dssk {
    public static final dtbc a;
    private static volatile dssr<dtbc> c;
    private byte b = 2;

    static {
        dtbc dtbcVar = new dtbc();
        a = dtbcVar;
        dsqw.cc(dtbc.class, dtbcVar);
    }

    private dtbc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtbc();
            }
            if (i2 == 4) {
                return new dtbb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtbc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtbc.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
