package defpackage;
/* compiled from: PG */
/* renamed from: dvhg  reason: default package */
/* loaded from: classes6.dex */
public final class dvhg extends dsqw<dvhg, dvhd> implements dssk {
    public static final dvhg f;
    private static volatile dssr<dvhg> h;
    public int a;
    public dqpe b;
    public dqac d;
    public int e;
    private byte g = 2;
    public dsrj<dvhf> c = dssu.b;

    static {
        dvhg dvhgVar = new dvhg();
        f = dvhgVar;
        dsqw.cc(dvhg.class, dvhgVar);
    }

    private dvhg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0001\u0002ဉ\u0000\u0003Л\u0004ဌ\u0002\u0005ဉ\u0001", new Object[]{"a", "b", "c", dvhf.class, "e", drbs.a, "d"});
            }
            if (i2 == 3) {
                return new dvhg();
            }
            if (i2 == 4) {
                return new dvhd();
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
            dssr<dvhg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvhg.class) {
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
