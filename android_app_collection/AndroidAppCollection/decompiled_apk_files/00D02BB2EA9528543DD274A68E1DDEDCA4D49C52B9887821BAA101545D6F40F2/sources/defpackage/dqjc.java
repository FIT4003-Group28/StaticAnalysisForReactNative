package defpackage;
/* compiled from: PG */
/* renamed from: dqjc  reason: default package */
/* loaded from: classes.dex */
public final class dqjc extends dsqw<dqjc, dqjb> implements dssk {
    public static final dqjc d;
    private static volatile dssr<dqjc> e;
    public int a;
    public int b;
    public int c;

    static {
        dqjc dqjcVar = new dqjc();
        d = dqjcVar;
        dsqw.cc(dqjc.class, dqjcVar);
    }

    private dqjc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001င\u0000\u0004ဌ\u0003", new Object[]{"a", "b", "c", dqjh.c()});
            }
            if (i2 == 3) {
                return new dqjc();
            }
            if (i2 == 4) {
                return new dqjb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqjc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqjc.class) {
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
