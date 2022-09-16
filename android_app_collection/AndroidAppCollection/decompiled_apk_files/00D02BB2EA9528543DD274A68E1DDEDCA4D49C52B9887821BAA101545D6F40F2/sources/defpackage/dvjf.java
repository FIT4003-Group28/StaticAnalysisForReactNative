package defpackage;
/* compiled from: PG */
/* renamed from: dvjf  reason: default package */
/* loaded from: classes.dex */
public final class dvjf extends dsqw<dvjf, dvje> implements dssk {
    public static final dvjf f;
    private static volatile dssr<dvjf> h;
    public int a;
    public dqpe b;
    public dqpe c;
    public djyk d;
    public int e;
    private byte g = 2;

    static {
        dvjf dvjfVar = new dvjf();
        f = dvjfVar;
        dsqw.cc(dvjf.class, dvjfVar);
    }

    private dvjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ဉ\u0001\u0003ဌ\u0004\u0005ဉ\u0002\u0007ᐉ\u0003", new Object[]{"a", "b", "e", drbs.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dvjf();
            }
            if (i2 == 4) {
                return new dvje();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dvjf> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvjf.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
