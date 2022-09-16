package defpackage;
/* compiled from: PG */
/* renamed from: dtmb  reason: default package */
/* loaded from: classes6.dex */
public final class dtmb extends dsqw<dtmb, dtma> implements dssk {
    public static final dtmb b;
    private static volatile dssr<dtmb> f;
    private int c;
    private duyo d;
    private byte e = 2;
    public String a = "";

    static {
        dtmb dtmbVar = new dtmb();
        b = dtmbVar;
        dsqw.cc(dtmb.class, dtmbVar);
    }

    private dtmb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"c", "a", "d"});
            }
            if (i2 == 3) {
                return new dtmb();
            }
            if (i2 == 4) {
                return new dtma();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            dssr<dtmb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtmb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
