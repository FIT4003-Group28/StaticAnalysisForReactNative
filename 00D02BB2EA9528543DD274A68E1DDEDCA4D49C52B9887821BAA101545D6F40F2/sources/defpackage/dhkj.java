package defpackage;
/* compiled from: PG */
/* renamed from: dhkj  reason: default package */
/* loaded from: classes6.dex */
public final class dhkj extends dsqw<dhkj, dhki> implements dssk {
    public static final dhkj c;
    private static volatile dssr<dhkj> d;
    public int a;
    public dqnt b;

    static {
        dhkj dhkjVar = new dhkj();
        c = dhkjVar;
        dsqw.cc(dhkj.class, dhkjVar);
    }

    private dhkj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhkj();
            }
            if (i2 == 4) {
                return new dhki();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhkj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhkj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
