package defpackage;
/* compiled from: PG */
/* renamed from: dqsb  reason: default package */
/* loaded from: classes6.dex */
public final class dqsb extends dsqw<dqsb, dqsa> implements dssk {
    public static final dqsb d;
    private static volatile dssr<dqsb> f;
    public dqpe a;
    public int b;
    public dsrj<dqrz> c = dssu.b;
    private int e;

    static {
        dqsb dqsbVar = new dqsb();
        d = dqsbVar;
        dsqw.cc(dqsb.class, dqsbVar);
    }

    private dqsb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"e", "a", "b", drbs.a, "c", dqrz.class});
            }
            if (i2 == 3) {
                return new dqsb();
            }
            if (i2 == 4) {
                return new dqsa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqsb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqsb.class) {
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
