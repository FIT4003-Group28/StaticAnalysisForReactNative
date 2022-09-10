package defpackage;
/* compiled from: PG */
/* renamed from: ddwy  reason: default package */
/* loaded from: classes6.dex */
public final class ddwy extends dsqw<ddwy, ddwx> implements dssk {
    public static final ddwy c;
    private static volatile dssr<ddwy> d;
    public int a;
    public boolean b;

    static {
        ddwy ddwyVar = new ddwy();
        c = ddwyVar;
        dsqw.cc(ddwy.class, ddwyVar);
    }

    private ddwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddwy();
            }
            if (i2 == 4) {
                return new ddwx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddwy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddwy.class) {
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
