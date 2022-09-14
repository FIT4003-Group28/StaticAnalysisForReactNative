package defpackage;
/* compiled from: PG */
/* renamed from: dvfq  reason: default package */
/* loaded from: classes6.dex */
public final class dvfq extends dsqw<dvfq, dvfp> implements dssk {
    public static final dvfq e;
    private static volatile dssr<dvfq> g;
    public int a;
    public long b;
    public dmxf c;
    public dmxb d;
    private byte f = 2;

    static {
        dvfq dvfqVar = new dvfq();
        e = dvfqVar;
        dsqw.cc(dvfq.class, dvfqVar);
    }

    private dvfq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0001\u0003ဃ\u0000\u0004ᐉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvfq();
            }
            if (i2 == 4) {
                return new dvfp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dvfq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvfq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
