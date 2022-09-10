package defpackage;
/* compiled from: PG */
/* renamed from: dowz  reason: default package */
/* loaded from: classes6.dex */
public final class dowz extends dsqw<dowz, doww> implements dssk {
    public static final dowz e;
    private static volatile dssr<dowz> g;
    public int a;
    public int c;
    public douj d;
    private byte f = 2;
    public String b = "";

    static {
        dowz dowzVar = new dowz();
        e = dowzVar;
        dsqw.cc(dowz.class, dowzVar);
    }

    private dowz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", dowx.a, "d"});
            }
            if (i2 == 3) {
                return new dowz();
            }
            if (i2 == 4) {
                return new doww();
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
            dssr<dowz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dowz.class) {
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
