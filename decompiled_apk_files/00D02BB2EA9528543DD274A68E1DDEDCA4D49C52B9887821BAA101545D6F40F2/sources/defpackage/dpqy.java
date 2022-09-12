package defpackage;
/* compiled from: PG */
/* renamed from: dpqy  reason: default package */
/* loaded from: classes6.dex */
public final class dpqy extends dsqw<dpqy, dpqx> implements dssk {
    public static final dpqy d;
    private static volatile dssr<dpqy> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dpqy dpqyVar = new dpqy();
        d = dpqyVar;
        dsqw.cc(dpqy.class, dpqyVar);
    }

    private dpqy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpqy();
            }
            if (i2 == 4) {
                return new dpqx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpqy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpqy.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
