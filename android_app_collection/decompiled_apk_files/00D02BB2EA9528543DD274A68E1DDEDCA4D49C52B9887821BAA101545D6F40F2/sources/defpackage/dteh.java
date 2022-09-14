package defpackage;
/* compiled from: PG */
/* renamed from: dteh  reason: default package */
/* loaded from: classes6.dex */
public final class dteh extends dsqw<dteh, dteg> implements dssk {
    public static final dteh a;
    private static volatile dssr<dteh> c;
    private byte b = 2;

    static {
        dteh dtehVar = new dteh();
        a = dtehVar;
        dsqw.cc(dteh.class, dtehVar);
    }

    private dteh() {
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
                return new dteh();
            }
            if (i2 == 4) {
                return new dteg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dteh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dteh.class) {
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
