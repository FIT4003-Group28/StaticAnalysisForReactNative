package defpackage;
/* compiled from: PG */
/* renamed from: dtag  reason: default package */
/* loaded from: classes6.dex */
public final class dtag extends dsqw<dtag, dtaf> implements dssk {
    public static final dtag a;
    private static volatile dssr<dtag> e;
    private int b;
    private dtro c;
    private byte d = 2;

    static {
        dtag dtagVar = new dtag();
        a = dtagVar;
        dsqw.cc(dtag.class, dtagVar);
    }

    private dtag() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0006", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtag();
            }
            if (i2 == 4) {
                return new dtaf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dtag> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtag.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}