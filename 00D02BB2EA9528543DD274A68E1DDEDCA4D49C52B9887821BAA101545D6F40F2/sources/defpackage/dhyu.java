package defpackage;
/* compiled from: PG */
/* renamed from: dhyu  reason: default package */
/* loaded from: classes6.dex */
public final class dhyu extends dsqs<dhyu, dhyr> implements dsqt {
    public static final dhyu d;
    private static volatile dssr<dhyu> g;
    public int a;
    public dhyt b;
    public dnwb c;
    private dnqh e;
    private byte f = 2;

    static {
        dhyu dhyuVar = new dhyu();
        d = dhyuVar;
        dsqw.cc(dhyu.class, dhyuVar);
    }

    private dhyu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "e", "b", "c"});
            }
            if (i2 == 3) {
                return new dhyu();
            }
            if (i2 == 4) {
                return new dhyr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhyu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhyu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
