package defpackage;
/* compiled from: PG */
/* renamed from: dhkf  reason: default package */
/* loaded from: classes6.dex */
public final class dhkf extends dsqw<dhkf, dhke> implements dssk {
    public static final dhkf d;
    private static volatile dssr<dhkf> f;
    public int a;
    public dnqh b;
    private byte e = 2;
    public String c = "";

    static {
        dhkf dhkfVar = new dhkf();
        d = dhkfVar;
        dsqw.cc(dhkf.class, dhkfVar);
    }

    private dhkf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhkf();
            }
            if (i2 == 4) {
                return new dhke();
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
            dssr<dhkf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhkf.class) {
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
