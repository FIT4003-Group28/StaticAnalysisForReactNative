package defpackage;
/* compiled from: PG */
/* renamed from: dqmz  reason: default package */
/* loaded from: classes6.dex */
public final class dqmz extends dsqw<dqmz, dqmy> implements dssk {
    public static final dqmz e;
    private static volatile dssr<dqmz> f;
    public int a;
    public dsrj<dqmx> b = dssu.b;
    public dpon c;
    public dqgu d;

    static {
        dqmz dqmzVar = new dqmz();
        e = dqmzVar;
        dsqw.cc(dqmz.class, dqmzVar);
    }

    private dqmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", dqmx.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dqmz();
            }
            if (i2 == 4) {
                return new dqmy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqmz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqmz.class) {
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
