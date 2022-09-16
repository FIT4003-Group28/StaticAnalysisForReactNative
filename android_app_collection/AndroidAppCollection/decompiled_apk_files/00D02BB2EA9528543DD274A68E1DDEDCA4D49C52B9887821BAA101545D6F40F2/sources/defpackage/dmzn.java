package defpackage;
/* compiled from: PG */
/* renamed from: dmzn  reason: default package */
/* loaded from: classes6.dex */
public final class dmzn extends dsqw<dmzn, dmzm> implements dssk {
    public static final dmzn c;
    private static volatile dssr<dmzn> e;
    public int a;
    public int b;
    private int d;

    static {
        dmzn dmznVar = new dmzn();
        c = dmznVar;
        dsqw.cc(dmzn.class, dmznVar);
    }

    private dmzn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001င\u0000\u0005င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmzn();
            }
            if (i2 == 4) {
                return new dmzm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmzn.class) {
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
