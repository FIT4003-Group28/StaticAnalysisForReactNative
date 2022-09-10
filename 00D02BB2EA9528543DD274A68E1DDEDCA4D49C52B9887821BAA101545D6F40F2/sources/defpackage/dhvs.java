package defpackage;
/* compiled from: PG */
/* renamed from: dhvs  reason: default package */
/* loaded from: classes6.dex */
public final class dhvs extends dsqw<dhvs, dhvr> implements dssk {
    public static final dhvs c;
    private static volatile dssr<dhvs> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public String b = "";

    static {
        dhvs dhvsVar = new dhvs();
        c = dhvsVar;
        dsqw.cc(dhvs.class, dhvsVar);
    }

    private dhvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dhvs();
            }
            if (i2 == 4) {
                return new dhvr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dhvs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhvs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
