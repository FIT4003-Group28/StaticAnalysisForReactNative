package defpackage;
/* compiled from: PG */
/* renamed from: dtsa  reason: default package */
/* loaded from: classes6.dex */
public final class dtsa extends dsqw<dtsa, dtrz> implements dssk {
    public static final dtsa b;
    private static volatile dssr<dtsa> d;
    private byte c = 2;
    public dsrj<dtrw> a = dssu.b;

    static {
        dtsa dtsaVar = new dtsa();
        b = dtsaVar;
        dsqw.cc(dtsa.class, dtsaVar);
    }

    private dtsa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dtrw.class});
            }
            if (i2 == 3) {
                return new dtsa();
            }
            if (i2 == 4) {
                return new dtrz();
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
            dssr<dtsa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtsa.class) {
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
