package defpackage;
/* compiled from: PG */
/* renamed from: ditg  reason: default package */
/* loaded from: classes6.dex */
public final class ditg extends dsqw<ditg, ditf> implements dssk {
    public static final ditg c;
    private static volatile dssr<ditg> d;
    public int a;
    public dqzv b;

    static {
        ditg ditgVar = new ditg();
        c = ditgVar;
        dsqw.cc(ditg.class, ditgVar);
    }

    private ditg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ditg();
            }
            if (i2 == 4) {
                return new ditf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ditg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ditg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
