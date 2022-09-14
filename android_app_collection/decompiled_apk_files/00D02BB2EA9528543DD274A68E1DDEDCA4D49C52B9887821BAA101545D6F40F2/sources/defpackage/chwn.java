package defpackage;
/* compiled from: PG */
/* renamed from: chwn  reason: default package */
/* loaded from: classes4.dex */
public final class chwn extends dsqw<chwn, chwm> implements dssk {
    public static final chwn c;
    private static volatile dssr<chwn> d;
    public int a;
    public dqde b;

    static {
        chwn chwnVar = new chwn();
        c = chwnVar;
        dsqw.cc(chwn.class, chwnVar);
    }

    private chwn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chwn();
            }
            if (i2 == 4) {
                return new chwm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chwn.class) {
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
