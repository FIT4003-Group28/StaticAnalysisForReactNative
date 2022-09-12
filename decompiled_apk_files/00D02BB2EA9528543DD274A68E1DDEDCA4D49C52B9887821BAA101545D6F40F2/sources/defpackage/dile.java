package defpackage;
/* compiled from: PG */
/* renamed from: dile  reason: default package */
/* loaded from: classes6.dex */
public final class dile extends dsqw<dile, dild> implements dssk {
    public static final dile d;
    private static volatile dssr<dile> f;
    public int a;
    public int b;
    public dnqh c;
    private byte e = 2;

    static {
        dile dileVar = new dile();
        d = dileVar;
        dsqw.cc(dile.class, dileVar);
    }

    private dile() {
        dssu<Object> dssuVar = dssu.b;
        this.b = 1;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0001\u0002ဌ\u0000\u0006ᐉ\u0005", new Object[]{"a", "b", dpqj.c(), "c"});
            }
            if (i2 == 3) {
                return new dile();
            }
            if (i2 == 4) {
                return new dild();
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
            dssr<dile> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dile.class) {
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
