package defpackage;
/* compiled from: PG */
/* renamed from: dosz  reason: default package */
/* loaded from: classes.dex */
public final class dosz extends dsqw<dosz, dosy> implements dssk {
    public static final dosz e;
    private static volatile dssr<dosz> f;
    public int a;
    public int b;
    public int c = 1;
    public long d;

    static {
        dosz doszVar = new dosz();
        e = doszVar;
        dsqw.cc(dosz.class, doszVar);
    }

    private dosz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", dqun.a, "c", dqup.a, "d"});
            }
            if (i2 == 3) {
                return new dosz();
            }
            if (i2 == 4) {
                return new dosy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dosz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dosz.class) {
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
