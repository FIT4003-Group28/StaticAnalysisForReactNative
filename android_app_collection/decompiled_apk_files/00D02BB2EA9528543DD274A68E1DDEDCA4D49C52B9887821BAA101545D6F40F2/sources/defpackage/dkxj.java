package defpackage;
/* compiled from: PG */
/* renamed from: dkxj  reason: default package */
/* loaded from: classes.dex */
public final class dkxj extends dsqw<dkxj, dkxi> implements dssk {
    public static final dkxj c;
    private static volatile dssr<dkxj> e;
    public int a = 1;
    public int b = 15;
    private int d;

    static {
        dkxj dkxjVar = new dkxj();
        c = dkxjVar;
        dsqw.cc(dkxj.class, dkxjVar);
    }

    private dkxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"d", "a", doyd.c(), "b"});
            }
            if (i2 == 3) {
                return new dkxj();
            }
            if (i2 == 4) {
                return new dkxi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkxj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkxj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
