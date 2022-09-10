package defpackage;
/* compiled from: PG */
/* renamed from: dmrx  reason: default package */
/* loaded from: classes.dex */
public final class dmrx extends dsqw<dmrx, dmrw> implements dssk {
    public static final dmrx b;
    private static volatile dssr<dmrx> d;
    private byte c = 2;
    public dsrj<dmrt> a = dssu.b;

    static {
        dmrx dmrxVar = new dmrx();
        b = dmrxVar;
        dsqw.cc(dmrx.class, dmrxVar);
    }

    private dmrx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmrt.class});
            }
            if (i2 == 3) {
                return new dmrx();
            }
            if (i2 == 4) {
                return new dmrw();
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
            dssr<dmrx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmrx.class) {
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
