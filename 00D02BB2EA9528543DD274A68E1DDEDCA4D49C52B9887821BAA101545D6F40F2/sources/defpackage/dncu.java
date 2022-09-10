package defpackage;
/* compiled from: PG */
/* renamed from: dncu  reason: default package */
/* loaded from: classes6.dex */
public final class dncu extends dsqw<dncu, dnct> implements dssk {
    public static final dncu a;
    private static volatile dssr<dncu> e;
    private int b;
    private dncn c;
    private byte d = 2;

    static {
        dncu dncuVar = new dncu();
        a = dncuVar;
        dsqw.cc(dncu.class, dncuVar);
    }

    private dncu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dncu();
            }
            if (i2 == 4) {
                return new dnct();
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
            dssr<dncu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dncu.class) {
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
