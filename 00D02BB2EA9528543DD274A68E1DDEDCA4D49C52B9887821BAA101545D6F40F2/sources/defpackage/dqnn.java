package defpackage;
/* compiled from: PG */
/* renamed from: dqnn  reason: default package */
/* loaded from: classes6.dex */
public final class dqnn extends dsqw<dqnn, dqni> implements dssk {
    public static final dqnn e;
    private static volatile dssr<dqnn> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dqnn dqnnVar = new dqnn();
        e = dqnnVar;
        dsqw.cc(dqnn.class, dqnnVar);
    }

    private dqnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", dqnl.a, "c", dqnj.a, "d", dqng.a});
            }
            if (i2 == 3) {
                return new dqnn();
            }
            if (i2 == 4) {
                return new dqni();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqnn.class) {
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
