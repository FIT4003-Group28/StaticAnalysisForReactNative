package defpackage;
/* compiled from: PG */
/* renamed from: dqzd  reason: default package */
/* loaded from: classes.dex */
public final class dqzd extends dsqw<dqzd, dqzc> implements dssk {
    public static final dqzd c;
    private static volatile dssr<dqzd> e;
    public int a = 15000;
    public int b = 1500;
    private int d;

    static {
        dqzd dqzdVar = new dqzd();
        c = dqzdVar;
        dsqw.cc(dqzd.class, dqzdVar);
    }

    private dqzd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqzd();
            }
            if (i2 == 4) {
                return new dqzc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqzd.class) {
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
