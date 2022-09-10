package defpackage;
/* compiled from: PG */
/* renamed from: doup  reason: default package */
/* loaded from: classes6.dex */
public final class doup extends dsqw<doup, douo> implements dssk {
    public static final doup e;
    private static volatile dssr<doup> g;
    public int a;
    public String b;
    public String c;
    public doub d;
    private byte f = 2;

    static {
        doup doupVar = new doup();
        e = doupVar;
        dsqw.cc(doup.class, doupVar);
    }

    private doup() {
        dssu<Object> dssuVar = dssu.b;
        this.b = "";
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0000\u0000\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဉ\u0005", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new doup();
            }
            if (i2 == 4) {
                return new douo();
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
            dssr<doup> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doup.class) {
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
