package defpackage;
/* compiled from: PG */
/* renamed from: yiu  reason: default package */
/* loaded from: classes7.dex */
public final class yiu extends dsqw<yiu, yit> implements dssk {
    public static final yiu c;
    private static volatile dssr<yiu> d;
    public int a;
    public int b = 1;

    static {
        yiu yiuVar = new yiu();
        c = yiuVar;
        dsqw.cc(yiu.class, yiuVar);
    }

    private yiu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqvb.c()});
            }
            if (i2 == 3) {
                return new yiu();
            }
            if (i2 == 4) {
                return new yit();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<yiu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (yiu.class) {
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
