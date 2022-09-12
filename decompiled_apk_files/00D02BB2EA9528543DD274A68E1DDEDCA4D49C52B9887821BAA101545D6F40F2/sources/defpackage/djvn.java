package defpackage;
/* compiled from: PG */
/* renamed from: djvn  reason: default package */
/* loaded from: classes6.dex */
public final class djvn extends dsqw<djvn, djvm> implements dssk {
    public static final djvn b;
    private static volatile dssr<djvn> d;
    public int a;
    private int c;

    static {
        djvn djvnVar = new djvn();
        b = djvnVar;
        dsqw.cc(djvn.class, djvnVar);
    }

    private djvn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", drdo.c()});
            }
            if (i2 == 3) {
                return new djvn();
            }
            if (i2 == 4) {
                return new djvm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djvn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djvn.class) {
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
