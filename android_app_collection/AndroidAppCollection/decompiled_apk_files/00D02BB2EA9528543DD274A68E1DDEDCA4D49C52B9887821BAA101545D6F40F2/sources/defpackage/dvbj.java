package defpackage;
/* compiled from: PG */
/* renamed from: dvbj  reason: default package */
/* loaded from: classes6.dex */
public final class dvbj extends dsqw<dvbj, dvbe> implements dssk {
    public static final dvbj c;
    private static volatile dssr<dvbj> f;
    public int a;
    public dvbi b;
    private dnqh d;
    private byte e = 2;

    static {
        dvbj dvbjVar = new dvbj();
        c = dvbjVar;
        dsqw.cc(dvbj.class, dvbjVar);
    }

    private dvbj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0003ᐉ\u0002", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dvbj();
            }
            if (i2 == 4) {
                return new dvbe();
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
            dssr<dvbj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvbj.class) {
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
