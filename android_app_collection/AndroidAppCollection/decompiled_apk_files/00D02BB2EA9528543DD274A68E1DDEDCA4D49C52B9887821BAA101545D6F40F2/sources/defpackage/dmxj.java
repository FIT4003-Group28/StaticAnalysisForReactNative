package defpackage;
/* compiled from: PG */
/* renamed from: dmxj  reason: default package */
/* loaded from: classes.dex */
public final class dmxj extends dsqw<dmxj, dmxi> implements dssk {
    public static final dmxj j;
    private static volatile dssr<dmxj> l;
    public int a;
    public int b;
    public dmxh c;
    public int d;
    public dmwp i;
    private byte k = 2;
    public dsrf e = dsqz.b;
    public dsrj<dmyy> f = dssu.b;
    public int g = -1;
    public int h = -1;

    static {
        dmxj dmxjVar = new dmxj();
        j = dmxjVar;
        dsqw.cc(dmxj.class, dmxjVar);
    }

    private dmxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004'\u0005Л\u0006င\u0003\u0007င\u0004\bဉ\u0005", new Object[]{"a", "b", dmxl.c(), "c", "d", "e", "f", dmyy.class, "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dmxj();
            }
            if (i2 == 4) {
                return new dmxi();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<dmxj> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dmxj.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
