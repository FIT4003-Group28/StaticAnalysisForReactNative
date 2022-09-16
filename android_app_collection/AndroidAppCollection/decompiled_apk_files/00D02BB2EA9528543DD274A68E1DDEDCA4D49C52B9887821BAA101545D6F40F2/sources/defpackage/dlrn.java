package defpackage;
/* compiled from: PG */
/* renamed from: dlrn  reason: default package */
/* loaded from: classes6.dex */
public final class dlrn extends dsqw<dlrn, dlrm> implements dssk {
    public static final dlrn b;
    private static volatile dssr<dlrn> d;
    private byte c = 2;
    public dsrj<dwzj> a = dssu.b;

    static {
        dlrn dlrnVar = new dlrn();
        b = dlrnVar;
        dsqw.cc(dlrn.class, dlrnVar);
    }

    private dlrn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dwzj.class});
            }
            if (i2 == 3) {
                return new dlrn();
            }
            if (i2 == 4) {
                return new dlrm();
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
            dssr<dlrn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlrn.class) {
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
