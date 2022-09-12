package defpackage;
/* compiled from: PG */
/* renamed from: dpbl  reason: default package */
/* loaded from: classes6.dex */
public final class dpbl extends dsqw<dpbl, dpbk> implements dssk {
    public static final dpbl d;
    private static volatile dssr<dpbl> f;
    public boolean a;
    public boolean b;
    public dpzi c;
    private int e;

    static {
        dpbl dpblVar = new dpbl();
        d = dpblVar;
        dsqw.cc(dpbl.class, dpblVar);
    }

    private dpbl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0002\u0005ဇ\u0001", new Object[]{"e", "a", "c", "b"});
            }
            if (i2 == 3) {
                return new dpbl();
            }
            if (i2 == 4) {
                return new dpbk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpbl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpbl.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
