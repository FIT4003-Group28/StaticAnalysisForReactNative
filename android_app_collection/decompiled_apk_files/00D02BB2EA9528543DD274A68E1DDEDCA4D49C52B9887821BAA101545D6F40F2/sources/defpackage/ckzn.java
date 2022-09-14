package defpackage;
/* compiled from: PG */
/* renamed from: ckzn  reason: default package */
/* loaded from: classes5.dex */
public final class ckzn extends dsqw<ckzn, ckzi> implements dssk {
    public static final ckzn b;
    private static volatile dssr<ckzn> e;
    public int a;
    private ckzm c;
    private ckzk d;

    static {
        ckzn ckznVar = new ckzn();
        b = ckznVar;
        dsqw.cc(ckzn.class, ckznVar);
    }

    private ckzn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"a", "c", "d"});
            }
            if (i2 == 3) {
                return new ckzn();
            }
            if (i2 == 4) {
                return new ckzi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckzn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
