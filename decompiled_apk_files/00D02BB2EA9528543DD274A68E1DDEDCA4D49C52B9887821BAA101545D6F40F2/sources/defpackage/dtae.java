package defpackage;
/* compiled from: PG */
/* renamed from: dtae  reason: default package */
/* loaded from: classes6.dex */
public final class dtae extends dsqw<dtae, dtad> implements dssk {
    public static final dtae a;
    private static volatile dssr<dtae> c;
    private byte b = 2;

    static {
        dtae dtaeVar = new dtae();
        a = dtaeVar;
        dsqw.cc(dtae.class, dtaeVar);
    }

    private dtae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtae();
            }
            if (i2 == 4) {
                return new dtad();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtae> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtae.class) {
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
