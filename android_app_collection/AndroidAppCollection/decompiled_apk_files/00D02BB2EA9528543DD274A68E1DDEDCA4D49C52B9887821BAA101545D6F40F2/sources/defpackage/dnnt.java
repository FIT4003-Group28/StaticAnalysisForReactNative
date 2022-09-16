package defpackage;
/* compiled from: PG */
/* renamed from: dnnt  reason: default package */
/* loaded from: classes.dex */
public final class dnnt extends dsqw<dnnt, dnns> implements dssk {
    public static final dnnt b;
    private static volatile dssr<dnnt> d;
    public int a;
    private int c;

    static {
        dnnt dnntVar = new dnnt();
        b = dnntVar;
        dsqw.cc(dnnt.class, dnntVar);
    }

    private dnnt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnnt();
            }
            if (i2 == 4) {
                return new dnns();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnnt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnnt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
