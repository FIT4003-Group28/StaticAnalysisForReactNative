package defpackage;
/* compiled from: PG */
/* renamed from: dvhf  reason: default package */
/* loaded from: classes6.dex */
public final class dvhf extends dsqw<dvhf, dvhe> implements dssk {
    public static final dvhf d;
    private static volatile dssr<dvhf> g;
    private int e;
    private byte f = 2;
    public dsrj<dlcv> a = dssu.b;
    public String b = "";
    public dspd c = dspd.b;

    static {
        dvhf dvhfVar = new dvhf();
        d = dvhfVar;
        dsqw.cc(dvhf.class, dvhfVar);
    }

    private dvhf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ည\u0001", new Object[]{"e", "a", dlcv.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dvhf();
            }
            if (i2 == 4) {
                return new dvhe();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dvhf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvhf.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
