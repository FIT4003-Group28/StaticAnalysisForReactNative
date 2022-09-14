package defpackage;
/* compiled from: PG */
/* renamed from: dqso  reason: default package */
/* loaded from: classes6.dex */
public final class dqso extends dsqw<dqso, dqsn> implements dssk {
    public static final dqso d;
    private static volatile dssr<dqso> f;
    public Object b;
    private int e;
    public int a = 0;
    public String c = "";

    static {
        dqso dqsoVar = new dqso();
        d = dqsoVar;
        dsqw.cc(dqso.class, dqsoVar);
    }

    private dqso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ြ\u0000\u0004ျ\u0000", new Object[]{"b", "a", "e", "c", dgbo.class});
            }
            if (i2 == 3) {
                return new dqso();
            }
            if (i2 == 4) {
                return new dqsn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqso> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqso.class) {
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
