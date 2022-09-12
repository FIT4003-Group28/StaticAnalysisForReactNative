package defpackage;
/* compiled from: PG */
/* renamed from: dvpw  reason: default package */
/* loaded from: classes6.dex */
public final class dvpw extends dsqw<dvpw, dvpu> implements dssk {
    public static final dvpw a;
    private static volatile dssr<dvpw> e;
    private int b;
    private int c;
    private byte d = 2;

    static {
        dvpw dvpwVar = new dvpw();
        a = dvpwVar;
        dsqw.cc(dvpw.class, dvpwVar);
    }

    private dvpw() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", dvpv.a});
            }
            if (i2 == 3) {
                return new dvpw();
            }
            if (i2 == 4) {
                return new dvpu();
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
            dssr<dvpw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvpw.class) {
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
