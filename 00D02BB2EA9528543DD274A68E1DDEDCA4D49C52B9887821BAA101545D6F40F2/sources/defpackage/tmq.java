package defpackage;
/* compiled from: PG */
/* renamed from: tmq  reason: default package */
/* loaded from: classes7.dex */
public final class tmq extends dsqw<tmq, tmk> implements dssk {
    public static final tmq o;
    private static volatile dssr<tmq> p;
    public int a;
    public tmp b;
    public int d;
    public int e;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public dssd<String, Integer> n = dssd.b;
    public dsrf c = dsqz.b;
    public String f = "";

    static {
        tmq tmqVar = new tmq();
        o = tmqVar;
        dsqw.cc(tmq.class, tmqVar);
    }

    private tmq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u0016\u0003င\u0001\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000bဇ\n\f2\rင\u0002", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", tml.a, "e"});
            }
            if (i2 == 3) {
                return new tmq();
            }
            if (i2 == 4) {
                return new tmk();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tmq> dssrVar = p;
            if (dssrVar == null) {
                synchronized (tmq.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
