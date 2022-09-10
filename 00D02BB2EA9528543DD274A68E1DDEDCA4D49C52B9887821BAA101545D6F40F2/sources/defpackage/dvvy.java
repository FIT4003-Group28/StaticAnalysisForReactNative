package defpackage;
/* compiled from: PG */
/* renamed from: dvvy  reason: default package */
/* loaded from: classes.dex */
public final class dvvy extends dsqw<dvvy, dvvx> implements dssk {
    public static final dvvy d;
    private static volatile dssr<dvvy> f;
    public int a;
    private byte e = 2;
    public dsrj<dvyw> b = dssu.b;
    public dspd c = dspd.b;

    static {
        dvvy dvvyVar = new dvvy();
        d = dvvyVar;
        dsqw.cc(dvvy.class, dvvyVar);
    }

    private dvvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ည\u0000", new Object[]{"a", "b", dvyw.class, "c"});
            }
            if (i2 == 3) {
                return new dvvy();
            }
            if (i2 == 4) {
                return new dvvx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dvvy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvvy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
