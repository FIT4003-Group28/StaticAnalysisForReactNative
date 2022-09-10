package defpackage;
/* compiled from: PG */
/* renamed from: dmrp  reason: default package */
/* loaded from: classes.dex */
public final class dmrp extends dsqw<dmrp, dmro> implements dssk {
    public static final dmrp b;
    private static volatile dssr<dmrp> d;
    private byte c = 2;
    public dsrj<dmrn> a = dssu.b;

    static {
        dmrp dmrpVar = new dmrp();
        b = dmrpVar;
        dsqw.cc(dmrp.class, dmrpVar);
    }

    private dmrp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmrn.class});
            }
            if (i2 == 3) {
                return new dmrp();
            }
            if (i2 == 4) {
                return new dmro();
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
            dssr<dmrp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmrp.class) {
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
