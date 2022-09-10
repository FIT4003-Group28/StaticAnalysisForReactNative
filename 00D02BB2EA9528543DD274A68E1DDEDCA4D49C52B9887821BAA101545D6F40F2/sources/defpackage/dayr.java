package defpackage;
/* compiled from: PG */
/* renamed from: dayr  reason: default package */
/* loaded from: classes5.dex */
public final class dayr extends dsqw<dayr, dayq> implements dssk {
    public static final dayr c;
    private static volatile dssr<dayr> e;
    public daxu a;
    public boolean b;
    private int d;

    static {
        dayr dayrVar = new dayr();
        c = dayrVar;
        dsqw.cc(dayr.class, dayrVar);
    }

    private dayr() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဉ\u0003\u0006ဇ\u0004", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dayr();
            }
            if (i2 == 4) {
                return new dayq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dayr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dayr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
