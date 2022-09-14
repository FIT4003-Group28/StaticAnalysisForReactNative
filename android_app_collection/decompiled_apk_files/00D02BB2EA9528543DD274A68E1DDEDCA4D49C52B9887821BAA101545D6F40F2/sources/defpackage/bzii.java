package defpackage;
/* compiled from: PG */
/* renamed from: bzii  reason: default package */
/* loaded from: classes4.dex */
public final class bzii extends dsqw<bzii, bzih> implements dssk {
    public static final bzii d;
    private static volatile dssr<bzii> e;
    public int a;
    public boolean b;
    public int c;

    static {
        bzii bziiVar = new bzii();
        d = bziiVar;
        dsqw.cc(bzii.class, bziiVar);
    }

    private bzii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bzii();
            }
            if (i2 == 4) {
                return new bzih();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzii> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bzii.class) {
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
