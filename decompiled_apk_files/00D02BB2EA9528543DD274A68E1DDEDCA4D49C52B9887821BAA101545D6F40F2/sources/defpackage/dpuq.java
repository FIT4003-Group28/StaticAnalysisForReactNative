package defpackage;
/* compiled from: PG */
/* renamed from: dpuq  reason: default package */
/* loaded from: classes.dex */
public final class dpuq extends dsqw<dpuq, dpup> implements dssk {
    public static final dpuq d;
    private static volatile dssr<dpuq> e;
    public int a;
    public dpum b;
    public dpum c;

    static {
        dpuq dpuqVar = new dpuq();
        d = dpuqVar;
        dsqw.cc(dpuq.class, dpuqVar);
    }

    private dpuq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpuq();
            }
            if (i2 == 4) {
                return new dpup();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpuq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpuq.class) {
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
