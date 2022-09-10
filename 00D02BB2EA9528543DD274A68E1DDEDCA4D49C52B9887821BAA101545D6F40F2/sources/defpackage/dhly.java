package defpackage;
/* compiled from: PG */
/* renamed from: dhly  reason: default package */
/* loaded from: classes.dex */
public final class dhly extends dsqw<dhly, dhlv> implements dssk {
    public static final dhly e;
    private static volatile dssr<dhly> g;
    public boolean a = true;
    public boolean b = true;
    public boolean c = true;
    public dhlx d;
    private int f;

    static {
        dhly dhlyVar = new dhly();
        e = dhlyVar;
        dsqw.cc(dhly.class, dhlyVar);
    }

    private dhly() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhly();
            }
            if (i2 == 4) {
                return new dhlv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhly> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhly.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
