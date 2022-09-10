package defpackage;
/* compiled from: PG */
/* renamed from: dtfv  reason: default package */
/* loaded from: classes6.dex */
public final class dtfv extends dsqw<dtfv, dtfu> implements dssk {
    public static final dtfv a;
    private static volatile dssr<dtfv> c;
    private byte b = 2;

    static {
        dtfv dtfvVar = new dtfv();
        a = dtfvVar;
        dsqw.cc(dtfv.class, dtfvVar);
    }

    private dtfv() {
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
                return new dtfv();
            }
            if (i2 == 4) {
                return new dtfu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtfv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtfv.class) {
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
