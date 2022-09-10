package defpackage;
/* compiled from: PG */
/* renamed from: drld  reason: default package */
/* loaded from: classes6.dex */
public final class drld extends dsqw<drld, drlc> implements dssk {
    public static final drld c;
    private static volatile dssr<drld> d;
    public int a;
    public long b;

    static {
        drld drldVar = new drld();
        c = drldVar;
        dsqw.cc(drld.class, drldVar);
    }

    private drld() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001စ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drld();
            }
            if (i2 == 4) {
                return new drlc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drld> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drld.class) {
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
