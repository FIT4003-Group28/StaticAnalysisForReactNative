package defpackage;
/* compiled from: PG */
/* renamed from: dqnb  reason: default package */
/* loaded from: classes6.dex */
public final class dqnb extends dsqw<dqnb, dqna> implements dssk {
    public static final dqnb d;
    private static volatile dssr<dqnb> e;
    public int a;
    public long b;
    public int c;

    static {
        dqnb dqnbVar = new dqnb();
        d = dqnbVar;
        dsqw.cc(dqnb.class, dqnbVar);
    }

    private dqnb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqnb();
            }
            if (i2 == 4) {
                return new dqna();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqnb.class) {
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
