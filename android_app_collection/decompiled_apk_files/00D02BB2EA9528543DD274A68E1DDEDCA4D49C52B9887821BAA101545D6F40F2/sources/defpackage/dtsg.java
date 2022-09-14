package defpackage;
/* compiled from: PG */
/* renamed from: dtsg  reason: default package */
/* loaded from: classes6.dex */
public final class dtsg extends dsqw<dtsg, dtsf> implements dssk {
    public static final dtsg a;
    private static volatile dssr<dtsg> c;
    private byte b = 2;

    static {
        dtsg dtsgVar = new dtsg();
        a = dtsgVar;
        dsqw.cc(dtsg.class, dtsgVar);
    }

    private dtsg() {
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
                return new dtsg();
            }
            if (i2 == 4) {
                return new dtsf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtsg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtsg.class) {
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
