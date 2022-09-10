package defpackage;
/* compiled from: PG */
/* renamed from: dsyj  reason: default package */
/* loaded from: classes6.dex */
public final class dsyj extends dsqw<dsyj, dsyg> implements dssk {
    public static final dsyj b;
    private static volatile dssr<dsyj> d;
    private byte c = 2;
    public dsrj<dsyi> a = dssu.b;

    static {
        dsyj dsyjVar = new dsyj();
        b = dsyjVar;
        dsqw.cc(dsyj.class, dsyjVar);
    }

    private dsyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dsyi.class});
            }
            if (i2 == 3) {
                return new dsyj();
            }
            if (i2 == 4) {
                return new dsyg();
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
            dssr<dsyj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsyj.class) {
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
