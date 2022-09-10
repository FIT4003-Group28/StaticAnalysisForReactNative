package defpackage;
/* compiled from: PG */
/* renamed from: dhjv  reason: default package */
/* loaded from: classes6.dex */
public final class dhjv extends dsqw<dhjv, dhju> implements dssk {
    public static final dhjv c;
    private static volatile dssr<dhjv> d;
    public dhjq a;
    public dhjt b;

    static {
        dhjv dhjvVar = new dhjv();
        c = dhjvVar;
        dsqw.cc(dhjv.class, dhjvVar);
    }

    private dhjv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhjv();
            }
            if (i2 == 4) {
                return new dhju();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhjv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhjv.class) {
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
