package defpackage;
/* compiled from: PG */
/* renamed from: dhyb  reason: default package */
/* loaded from: classes.dex */
public final class dhyb extends dsqw<dhyb, dhya> implements dssk {
    public static final dhyb c;
    private static volatile dssr<dhyb> d;
    public int a;
    public dhkd b;

    static {
        dhyb dhybVar = new dhyb();
        c = dhybVar;
        dsqw.cc(dhyb.class, dhybVar);
    }

    private dhyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhyb();
            }
            if (i2 == 4) {
                return new dhya();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhyb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhyb.class) {
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
