package defpackage;
/* compiled from: PG */
/* renamed from: dqmx  reason: default package */
/* loaded from: classes6.dex */
public final class dqmx extends dsqw<dqmx, dqmw> implements dssk {
    public static final dqmx d;
    private static volatile dssr<dqmx> e;
    public int a;
    public long b;
    public dsrj<dqmv> c = dssu.b;

    static {
        dqmx dqmxVar = new dqmx();
        d = dqmxVar;
        dsqw.cc(dqmx.class, dqmxVar);
    }

    private dqmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dqmv.class});
            }
            if (i2 == 3) {
                return new dqmx();
            }
            if (i2 == 4) {
                return new dqmw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqmx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqmx.class) {
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
