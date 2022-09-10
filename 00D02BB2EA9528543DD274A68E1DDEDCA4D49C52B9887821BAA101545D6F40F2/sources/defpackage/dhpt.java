package defpackage;
/* compiled from: PG */
/* renamed from: dhpt  reason: default package */
/* loaded from: classes.dex */
public final class dhpt extends dsqw<dhpt, dhpp> implements dssk {
    public static final dhpt w;
    private static volatile dssr<dhpt> y;
    public boolean a;
    public boolean d;
    public boolean e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public dhpr n;
    public boolean o;
    public boolean p;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    private int x;
    public boolean b = true;
    public boolean c = true;
    public dsrf f = dsqz.b;
    public dsrf q = dsqz.b;

    static {
        dhpt dhptVar = new dhpt();
        w = dhptVar;
        dsqw.cc(dhpt.class, dhptVar);
    }

    private dhpt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(w, "\u0001\u0016\u0000\u0001\u0001#\u0016\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0007ဇ\u0006\nဇ\t\u000bဇ\u000b\fဇ\f\rဇ\r\u000eဇ\u000e\u000fဇ\u000f\u0012ဉ\u0012\u0019ဇ\u0017\u001aဇ\u0019\u001cဇ\u0018\u001dဇ\u001a\u001eဌ\u001b\u001fဇ\u001c \u0016\"ဇ\u001e#\u0016", new Object[]{"x", "a", "b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "n", "o", "r", "p", "s", "t", dhpn.a, "u", "q", "v", "f"});
            }
            if (i2 == 3) {
                return new dhpt();
            }
            if (i2 == 4) {
                return new dhpp();
            }
            if (i2 == 5) {
                return w;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhpt> dssrVar = y;
            if (dssrVar == null) {
                synchronized (dhpt.class) {
                    dssrVar = y;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(w);
                        y = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
