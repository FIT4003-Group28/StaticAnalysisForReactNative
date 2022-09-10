package defpackage;
/* compiled from: PG */
/* renamed from: cpyv  reason: default package */
/* loaded from: classes5.dex */
public final class cpyv extends dsqw<cpyv, cpyu> implements dssk {
    public static final cpyv d;
    private static volatile dssr<cpyv> f;
    public int a;
    public cpzy c;
    private byte e = 2;
    public String b = "";

    static {
        cpyv cpyvVar = new cpyv();
        d = cpyvVar;
        dsqw.cc(cpyv.class, cpyvVar);
    }

    private cpyv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cpyv();
            }
            if (i2 == 4) {
                return new cpyu();
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
            dssr<cpyv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cpyv.class) {
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
