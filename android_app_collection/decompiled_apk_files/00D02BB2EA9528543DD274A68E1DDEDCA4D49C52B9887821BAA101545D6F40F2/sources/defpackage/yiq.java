package defpackage;
/* compiled from: PG */
/* renamed from: yiq  reason: default package */
/* loaded from: classes7.dex */
public final class yiq extends dsqw<yiq, yip> implements dssk {
    public static final yiq c;
    private static volatile dssr<yiq> d;
    public int a = 0;
    public Object b;

    static {
        yiq yiqVar = new yiq();
        c = yiqVar;
        dsqw.cc(yiq.class, yiqVar);
    }

    private yiq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", dqvh.c(), drsm.c()});
            }
            if (i2 == 3) {
                return new yiq();
            }
            if (i2 == 4) {
                return new yip();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<yiq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (yiq.class) {
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
