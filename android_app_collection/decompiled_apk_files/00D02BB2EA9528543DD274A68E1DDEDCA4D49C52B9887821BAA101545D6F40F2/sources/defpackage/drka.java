package defpackage;
/* compiled from: PG */
/* renamed from: drka  reason: default package */
/* loaded from: classes6.dex */
public final class drka extends dsqw<drka, drjx> implements dssk {
    public static final drka f;
    private static volatile dssr<drka> h;
    public drdg a;
    public dqfu b;
    public dqfu c;
    public int d;
    public String e = "";
    private int g;

    static {
        drka drkaVar = new drka();
        f = drkaVar;
        dsqw.cc(drka.class, drkaVar);
    }

    private drka() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဌ\u0004\u0007ဈ\u0006", new Object[]{"g", "a", "b", "c", "d", drjy.a, "e"});
            }
            if (i2 == 3) {
                return new drka();
            }
            if (i2 == 4) {
                return new drjx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drka> dssrVar = h;
            if (dssrVar == null) {
                synchronized (drka.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
