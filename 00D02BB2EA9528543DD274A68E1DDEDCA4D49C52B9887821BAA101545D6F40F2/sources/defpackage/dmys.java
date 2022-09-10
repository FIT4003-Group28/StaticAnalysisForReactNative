package defpackage;
/* compiled from: PG */
/* renamed from: dmys  reason: default package */
/* loaded from: classes.dex */
public final class dmys extends dsqw<dmys, dmyr> implements dssk {
    public static final dmys d;
    private static volatile dssr<dmys> f;
    public int a;
    private byte e = 2;
    public String b = "";
    public String c = "";

    static {
        dmys dmysVar = new dmys();
        d = dmysVar;
        dsqw.cc(dmys.class, dmysVar);
    }

    private dmys() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmys();
            }
            if (i2 == 4) {
                return new dmyr();
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
            dssr<dmys> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmys.class) {
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
