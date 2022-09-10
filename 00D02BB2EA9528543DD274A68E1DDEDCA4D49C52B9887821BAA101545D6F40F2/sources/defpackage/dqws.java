package defpackage;
/* compiled from: PG */
/* renamed from: dqws  reason: default package */
/* loaded from: classes.dex */
public final class dqws extends dsqw<dqws, dqwp> implements dssk {
    public static final dqws e;
    private static volatile dssr<dqws> f;
    public int a;
    public String b = "";
    public boolean c;
    public int d;

    static {
        dqws dqwsVar = new dqws();
        e = dqwsVar;
        dsqw.cc(dqws.class, dqwsVar);
    }

    private dqws() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဈ\u0000\u0004ဇ\u0001\u0005ဌ\u0002", new Object[]{"a", "b", "c", "d", dqwq.a});
            }
            if (i2 == 3) {
                return new dqws();
            }
            if (i2 == 4) {
                return new dqwp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqws> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqws.class) {
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
