package defpackage;
/* compiled from: PG */
/* renamed from: dtff  reason: default package */
/* loaded from: classes6.dex */
public final class dtff extends dsqw<dtff, dtfe> implements dssk {
    public static final dtff a;
    private static volatile dssr<dtff> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtff dtffVar = new dtff();
        a = dtffVar;
        dsqw.cc(dtff.class, dtffVar);
    }

    private dtff() {
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
                return new dtff();
            }
            if (i2 == 4) {
                return new dtfe();
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
            dssr<dtff> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtff.class) {
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
