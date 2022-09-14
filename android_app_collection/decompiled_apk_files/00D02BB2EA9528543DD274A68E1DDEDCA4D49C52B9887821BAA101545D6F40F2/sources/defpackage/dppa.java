package defpackage;
/* compiled from: PG */
/* renamed from: dppa  reason: default package */
/* loaded from: classes6.dex */
public final class dppa extends dsqw<dppa, dpoz> implements dssk {
    public static final dppa d;
    private static volatile dssr<dppa> e;
    public int a;
    public dpqh b;
    public dppp c;

    static {
        dppa dppaVar = new dppa();
        d = dppaVar;
        dsqw.cc(dppa.class, dppaVar);
    }

    private dppa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dppa();
            }
            if (i2 == 4) {
                return new dpoz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dppa.class) {
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
