package defpackage;
/* compiled from: PG */
/* renamed from: dtoh  reason: default package */
/* loaded from: classes6.dex */
public final class dtoh extends dsqw<dtoh, dtog> implements dssk {
    public static final dtoh b;
    private static volatile dssr<dtoh> e;
    public dthb a;
    private int c;
    private byte d = 2;

    static {
        dtoh dtohVar = new dtoh();
        b = dtohVar;
        dsqw.cc(dtoh.class, dtohVar);
    }

    private dtoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtoh();
            }
            if (i2 == 4) {
                return new dtog();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<dtoh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtoh.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
