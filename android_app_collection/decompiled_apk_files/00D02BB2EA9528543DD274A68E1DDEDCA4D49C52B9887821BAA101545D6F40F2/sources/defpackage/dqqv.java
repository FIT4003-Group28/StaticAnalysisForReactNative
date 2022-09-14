package defpackage;
/* compiled from: PG */
/* renamed from: dqqv  reason: default package */
/* loaded from: classes6.dex */
public final class dqqv extends dsqw<dqqv, dqqu> implements dssk {
    public static final dqqv c;
    private static volatile dssr<dqqv> e;
    public int a;
    public int b;
    private int d;

    static {
        dqqv dqqvVar = new dqqv();
        c = dqqvVar;
        dsqw.cc(dqqv.class, dqqvVar);
    }

    private dqqv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqqv();
            }
            if (i2 == 4) {
                return new dqqu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqqv.class) {
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
