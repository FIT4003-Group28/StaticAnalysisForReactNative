package defpackage;
/* compiled from: PG */
/* renamed from: droq  reason: default package */
/* loaded from: classes6.dex */
public final class droq extends dsqw<droq, droj> implements dssk {
    public static final droq c;
    private static volatile dssr<droq> e;
    public int a;
    public drop b;
    private int d;

    static {
        droq droqVar = new droq();
        c = droqVar;
        dsqw.cc(droq.class, droqVar);
    }

    private droq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"d", "a", drok.a, "b"});
            }
            if (i2 == 3) {
                return new droq();
            }
            if (i2 == 4) {
                return new droj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<droq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (droq.class) {
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
