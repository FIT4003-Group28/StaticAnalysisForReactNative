package defpackage;
/* compiled from: PG */
/* renamed from: dmrb  reason: default package */
/* loaded from: classes.dex */
public final class dmrb extends dsqw<dmrb, dmra> implements dssk {
    public static final dmrb n;
    private static volatile dssr<dmrb> p;
    public int a;
    public int e;
    private byte o = 2;
    public dspd b = dspd.b;
    public dsrf c = dsqz.b;
    public dsre d = dsqk.b;
    public dsrf f = dsqz.b;
    public int g = -1;
    public dsrf h = dsqz.b;
    public int i = -1;
    public dspd j = dspd.b;
    public dsrf k = dsqz.b;
    public dspd l = dspd.b;
    public dsrf m = dsqz.b;

    static {
        dmrb dmrbVar = new dmrb();
        n = dmrbVar;
        dsqw.cc(dmrb.class, dmrbVar);
    }

    private dmrb() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0006\u0000\u0001ည\u0000\u0002'\u0003'\u0004'\u0005င\u0001\u0006င\u0002\u0007င\u0003\bည\u0004\t'\nည\u0005\u000b'\f$", new Object[]{"a", "b", "f", "h", "c", "e", "g", "i", "j", "k", "l", "m", "d"});
            }
            if (i2 == 3) {
                return new dmrb();
            }
            if (i2 == 4) {
                return new dmra();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            }
            dssr<dmrb> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dmrb.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.o);
    }
}
