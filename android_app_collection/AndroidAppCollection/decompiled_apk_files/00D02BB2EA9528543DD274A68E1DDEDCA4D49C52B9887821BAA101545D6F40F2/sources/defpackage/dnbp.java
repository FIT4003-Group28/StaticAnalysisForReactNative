package defpackage;
/* compiled from: PG */
/* renamed from: dnbp  reason: default package */
/* loaded from: classes.dex */
public final class dnbp extends dsqw<dnbp, dnbo> implements dssk {
    public static final dnbp a;
    private static volatile dssr<dnbp> e;
    private int b;
    private dnhs c;
    private byte d = 2;

    static {
        dnbp dnbpVar = new dnbp();
        a = dnbpVar;
        dsqw.cc(dnbp.class, dnbpVar);
    }

    private dnbp() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dnbp();
            }
            if (i2 == 4) {
                return new dnbo();
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
            dssr<dnbp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnbp.class) {
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
