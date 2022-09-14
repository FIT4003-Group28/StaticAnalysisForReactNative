package defpackage;
/* compiled from: PG */
/* renamed from: dhdi  reason: default package */
/* loaded from: classes6.dex */
public final class dhdi extends dsqw<dhdi, dhdh> implements dssk {
    public static final dhdi b;
    private static volatile dssr<dhdi> d;
    private byte c = 2;
    public dsrj<dhdl> a = dssu.b;

    static {
        dhdi dhdiVar = new dhdi();
        b = dhdiVar;
        dsqw.cc(dhdi.class, dhdiVar);
    }

    private dhdi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dhdl.class});
            }
            if (i2 == 3) {
                return new dhdi();
            }
            if (i2 == 4) {
                return new dhdh();
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
            dssr<dhdi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhdi.class) {
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
