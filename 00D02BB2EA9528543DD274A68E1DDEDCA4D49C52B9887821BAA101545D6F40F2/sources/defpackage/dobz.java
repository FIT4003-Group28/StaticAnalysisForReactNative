package defpackage;
/* compiled from: PG */
/* renamed from: dobz  reason: default package */
/* loaded from: classes6.dex */
public final class dobz extends dsqw<dobz, doby> implements dssk {
    public static final dobz e;
    private static volatile dssr<dobz> g;
    public dnjl a;
    public int b;
    public dnpq c;
    public dnwd d;
    private int f;

    static {
        dobz dobzVar = new dobz();
        e = dobzVar;
        dsqw.cc(dobz.class, dobzVar);
    }

    private dobz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဉ\u0002\u0004င\u0003\u0006ဉ\u0005\bဉ\u0007", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dobz();
            }
            if (i2 == 4) {
                return new doby();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dobz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dobz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
