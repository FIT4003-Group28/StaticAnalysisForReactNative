package defpackage;
/* compiled from: PG */
/* renamed from: dqpm  reason: default package */
/* loaded from: classes6.dex */
public final class dqpm extends dsqw<dqpm, dqpl> implements dssk {
    public static final dqpm d;
    private static volatile dssr<dqpm> f;
    public int a;
    public String b = "";
    public dsrj<dqpq> c = dssu.b;
    private int e;

    static {
        dqpm dqpmVar = new dqpm();
        d = dqpmVar;
        dsqw.cc(dqpm.class, dqpmVar);
    }

    private dqpm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"e", "a", "b", "c", dqpq.class});
            }
            if (i2 == 3) {
                return new dqpm();
            }
            if (i2 == 4) {
                return new dqpl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqpm.class) {
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
