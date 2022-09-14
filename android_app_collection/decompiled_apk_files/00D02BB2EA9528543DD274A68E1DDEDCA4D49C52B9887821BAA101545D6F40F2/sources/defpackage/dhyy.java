package defpackage;
/* compiled from: PG */
/* renamed from: dhyy  reason: default package */
/* loaded from: classes6.dex */
public final class dhyy extends dsqs<dhyy, dhyv> implements dsqt {
    public static final dhyy d;
    private static volatile dssr<dhyy> g;
    public dqae a;
    public dnwb b;
    public int c;
    private int e;
    private byte f = 2;

    static {
        dhyy dhyyVar = new dhyy();
        d = dhyyVar;
        dsqw.cc(dhyy.class, dhyyVar);
    }

    private dhyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"e", "a", "b", "c", dhyw.a});
            }
            if (i2 == 3) {
                return new dhyy();
            }
            if (i2 == 4) {
                return new dhyv();
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
            dssr<dhyy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhyy.class) {
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
