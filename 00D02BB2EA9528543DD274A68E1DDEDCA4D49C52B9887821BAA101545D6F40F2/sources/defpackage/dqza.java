package defpackage;
/* compiled from: PG */
/* renamed from: dqza  reason: default package */
/* loaded from: classes.dex */
public final class dqza extends dsqw<dqza, dqyz> implements dssk {
    public static final dqza c;
    private static volatile dssr<dqza> e;
    public int a = 15000;
    public int b = 100;
    private int d;

    static {
        dqza dqzaVar = new dqza();
        c = dqzaVar;
        dsqw.cc(dqza.class, dqzaVar);
    }

    private dqza() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqza();
            }
            if (i2 == 4) {
                return new dqyz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqza> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqza.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
