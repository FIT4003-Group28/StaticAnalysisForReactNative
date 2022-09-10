package defpackage;
/* compiled from: PG */
/* renamed from: drlt  reason: default package */
/* loaded from: classes6.dex */
public final class drlt extends dsqw<drlt, drls> implements dssk {
    public static final drlt c;
    private static volatile dssr<drlt> d;
    public int a;
    public int b;

    static {
        drlt drltVar = new drlt();
        c = drltVar;
        dsqw.cc(drlt.class, drltVar);
    }

    private drlt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drlu.a});
            }
            if (i2 == 3) {
                return new drlt();
            }
            if (i2 == 4) {
                return new drls();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drlt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drlt.class) {
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
