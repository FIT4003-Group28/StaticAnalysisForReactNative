package defpackage;
/* compiled from: PG */
/* renamed from: dpbj  reason: default package */
/* loaded from: classes6.dex */
public final class dpbj extends dsqw<dpbj, dpbi> implements dssk {
    public static final dpbj c;
    private static volatile dssr<dpbj> d;
    public int a;
    public dpaj b;

    static {
        dpbj dpbjVar = new dpbj();
        c = dpbjVar;
        dsqw.cc(dpbj.class, dpbjVar);
    }

    private dpbj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpbj();
            }
            if (i2 == 4) {
                return new dpbi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpbj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpbj.class) {
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
