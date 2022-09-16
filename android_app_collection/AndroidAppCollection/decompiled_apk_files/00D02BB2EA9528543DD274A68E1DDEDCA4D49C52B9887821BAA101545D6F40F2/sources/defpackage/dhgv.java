package defpackage;
/* compiled from: PG */
/* renamed from: dhgv  reason: default package */
/* loaded from: classes6.dex */
public final class dhgv extends dsqs<dhgv, dhgu> implements dsqt {
    public static final dhgv d;
    private static volatile dssr<dhgv> f;
    public int a;
    private byte e = 2;
    public String b = "";
    public dsrj<dhgp> c = dssu.b;

    static {
        dhgv dhgvVar = new dhgv();
        d = dhgvVar;
        dsqw.cc(dhgv.class, dhgvVar);
    }

    private dhgv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0001\u0002Л", new Object[]{"a", "b", "c", dhgp.class});
            }
            if (i2 == 3) {
                return new dhgv();
            }
            if (i2 == 4) {
                return new dhgu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dhgv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhgv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
