package defpackage;
/* compiled from: PG */
/* renamed from: dicu  reason: default package */
/* loaded from: classes6.dex */
public final class dicu extends dsqs<dicu, dict> implements dsqt {
    public static final dicu b;
    private static volatile dssr<dicu> e;
    public diyr a;
    private int c;
    private byte d = 2;

    static {
        dicu dicuVar = new dicu();
        b = dicuVar;
        dsqw.cc(dicu.class, dicuVar);
    }

    private dicu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dicu();
            }
            if (i2 == 4) {
                return new dict();
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
            dssr<dicu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dicu.class) {
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
