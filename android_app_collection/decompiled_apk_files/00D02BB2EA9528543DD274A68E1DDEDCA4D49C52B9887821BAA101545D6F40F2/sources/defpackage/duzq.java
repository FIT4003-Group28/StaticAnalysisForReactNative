package defpackage;
/* compiled from: PG */
/* renamed from: duzq  reason: default package */
/* loaded from: classes6.dex */
public final class duzq extends dsqw<duzq, duzp> implements dssk {
    public static final duzq d;
    private static volatile dssr<duzq> f;
    public int a;
    public int b;
    public int c;
    private int e;

    static {
        duzq duzqVar = new duzq();
        d = duzqVar;
        dsqw.cc(duzq.class, duzqVar);
    }

    private duzq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", dqjl.c(), "b", "c"});
            }
            if (i2 == 3) {
                return new duzq();
            }
            if (i2 == 4) {
                return new duzp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duzq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duzq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
