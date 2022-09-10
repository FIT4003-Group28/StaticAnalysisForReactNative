package defpackage;
/* compiled from: PG */
/* renamed from: dvww  reason: default package */
/* loaded from: classes6.dex */
public final class dvww extends dsqw<dvww, dvwt> implements dssk {
    public static final dvww c;
    private static volatile dssr<dvww> f;
    private int d;
    private byte e = 2;
    public String a = "";
    public dsrj<dvwv> b = dssu.b;

    static {
        dvww dvwwVar = new dvww();
        c = dvwwVar;
        dsqw.cc(dvww.class, dvwwVar);
    }

    private dvww() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"d", "a", "b", dvwv.class});
            }
            if (i2 == 3) {
                return new dvww();
            }
            if (i2 == 4) {
                return new dvwt();
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
            dssr<dvww> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvww.class) {
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
