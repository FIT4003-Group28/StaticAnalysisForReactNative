package defpackage;
/* compiled from: PG */
/* renamed from: dpiy  reason: default package */
/* loaded from: classes6.dex */
public final class dpiy extends dsqw<dpiy, dpix> implements dssk {
    public static final dpiy c;
    private static volatile dssr<dpiy> f;
    private int d;
    private byte e = 2;
    public dspd a = dspd.b;
    public dsrj<dpgw> b = dssu.b;

    static {
        dpiy dpiyVar = new dpiy();
        c = dpiyVar;
        dsqw.cc(dpiy.class, dpiyVar);
    }

    private dpiy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ည\u0000\u0002Л", new Object[]{"d", "a", "b", dpgw.class});
            }
            if (i2 == 3) {
                return new dpiy();
            }
            if (i2 == 4) {
                return new dpix();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dpiy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpiy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
