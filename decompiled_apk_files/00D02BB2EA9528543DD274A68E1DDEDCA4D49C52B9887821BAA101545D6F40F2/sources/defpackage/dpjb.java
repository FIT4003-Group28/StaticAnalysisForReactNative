package defpackage;
/* compiled from: PG */
/* renamed from: dpjb  reason: default package */
/* loaded from: classes6.dex */
public final class dpjb extends dsqw<dpjb, dpja> implements dssk {
    public static final dpjb e;
    private static volatile dssr<dpjb> f;
    public int a;
    public dqea b;
    public dpzb c;
    public dsrj<drhn> d = dssu.b;

    static {
        dpjb dpjbVar = new dpjb();
        e = dpjbVar;
        dsqw.cc(dpjb.class, dpjbVar);
    }

    private dpjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", drhn.class});
            }
            if (i2 == 3) {
                return new dpjb();
            }
            if (i2 == 4) {
                return new dpja();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpjb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpjb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
