package defpackage;
/* compiled from: PG */
/* renamed from: dvpt  reason: default package */
/* loaded from: classes6.dex */
public final class dvpt extends dsqw<dvpt, dvps> implements dssk {
    public static final dvpt a;
    private static volatile dssr<dvpt> f;
    private int b;
    private dwzm c;
    private dwzo d;
    private byte e = 2;

    static {
        dvpt dvptVar = new dvpt();
        a = dvptVar;
        dsqw.cc(dvpt.class, dvptVar);
    }

    private dvpt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvpt();
            }
            if (i2 == 4) {
                return new dvps();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dvpt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvpt.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
