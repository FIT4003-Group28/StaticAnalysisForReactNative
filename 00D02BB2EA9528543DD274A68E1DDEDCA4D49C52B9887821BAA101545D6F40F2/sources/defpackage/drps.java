package defpackage;
/* compiled from: PG */
/* renamed from: drps  reason: default package */
/* loaded from: classes6.dex */
public final class drps extends dsqw<drps, drpr> implements dssk {
    public static final drps d;
    private static volatile dssr<drps> e;
    public int a;
    public double b;
    public double c;

    static {
        drps drpsVar = new drps();
        d = drpsVar;
        dsqw.cc(drps.class, drpsVar);
    }

    private drps() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drps();
            }
            if (i2 == 4) {
                return new drpr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drps> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drps.class) {
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
