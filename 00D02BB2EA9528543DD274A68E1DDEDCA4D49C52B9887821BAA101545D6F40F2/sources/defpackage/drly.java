package defpackage;
/* compiled from: PG */
/* renamed from: drly  reason: default package */
/* loaded from: classes6.dex */
public final class drly extends dsqw<drly, drlx> implements dssk {
    public static final drly c;
    private static volatile dssr<drly> d;
    public int a;
    public int b;

    static {
        drly drlyVar = new drly();
        c = drlyVar;
        dsqw.cc(drly.class, drlyVar);
    }

    private drly() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drlz.a});
            }
            if (i2 == 3) {
                return new drly();
            }
            if (i2 == 4) {
                return new drlx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drly> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drly.class) {
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
