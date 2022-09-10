package defpackage;
/* compiled from: PG */
/* renamed from: dnxj  reason: default package */
/* loaded from: classes.dex */
public final class dnxj extends dsqw<dnxj, dnxi> implements dssk {
    public static final dnxj b;
    private static volatile dssr<dnxj> d;
    private byte c = 2;
    public dsrj<dnwx> a = dssu.b;

    static {
        dnxj dnxjVar = new dnxj();
        b = dnxjVar;
        dsqw.cc(dnxj.class, dnxjVar);
    }

    private dnxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dnwx.class});
            }
            if (i2 == 3) {
                return new dnxj();
            }
            if (i2 == 4) {
                return new dnxi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dnxj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnxj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
