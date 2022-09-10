package defpackage;
/* compiled from: PG */
/* renamed from: drjb  reason: default package */
/* loaded from: classes6.dex */
public final class drjb extends dsqw<drjb, drja> implements dssk {
    public static final drjb b;
    private static volatile dssr<drjb> d;
    public drdg a;
    private int c;

    static {
        drjb drjbVar = new drjb();
        b = drjbVar;
        dsqw.cc(drjb.class, drjbVar);
    }

    private drjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drjb();
            }
            if (i2 == 4) {
                return new drja();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drjb.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
