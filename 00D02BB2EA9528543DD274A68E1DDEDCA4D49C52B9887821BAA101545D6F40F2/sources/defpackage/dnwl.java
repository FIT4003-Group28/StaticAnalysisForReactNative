package defpackage;
/* compiled from: PG */
/* renamed from: dnwl  reason: default package */
/* loaded from: classes6.dex */
public final class dnwl extends dsqw<dnwl, dnwk> implements dssk {
    public static final dnwl f;
    private static volatile dssr<dnwl> h;
    public int a;
    public dfxs c;
    public String d;
    public dnwr e;
    private byte g = 2;
    public String b = "";

    static {
        dnwl dnwlVar = new dnwl();
        f = dnwlVar;
        dsqw.cc(dnwl.class, dnwlVar);
    }

    private dnwl() {
        dssu<Object> dssuVar = dssu.b;
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0016\u0004\u0000\u0000\u0001\u0001ဈ\u0007\u0007ဉ\r\u000bဈ\u0002\u0016ᐉ\u0003", new Object[]{"a", "d", "e", "b", "c"});
            }
            if (i2 == 3) {
                return new dnwl();
            }
            if (i2 == 4) {
                return new dnwk();
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
            dssr<dnwl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnwl.class) {
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
