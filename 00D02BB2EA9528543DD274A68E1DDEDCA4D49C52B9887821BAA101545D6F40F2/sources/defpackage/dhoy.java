package defpackage;
/* compiled from: PG */
/* renamed from: dhoy  reason: default package */
/* loaded from: classes6.dex */
public final class dhoy extends dsqw<dhoy, dhox> implements dssk {
    public static final dhoy d;
    private static volatile dssr<dhoy> e;
    public int a;
    public int b;
    public dqpj c;

    static {
        dhoy dhoyVar = new dhoy();
        d = dhoyVar;
        dsqw.cc(dhoy.class, dhoyVar);
    }

    private dhoy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dqph.a, "c"});
            }
            if (i2 == 3) {
                return new dhoy();
            }
            if (i2 == 4) {
                return new dhox();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhoy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhoy.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
