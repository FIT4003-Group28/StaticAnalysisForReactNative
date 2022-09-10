package defpackage;
/* compiled from: PG */
/* renamed from: dpxh  reason: default package */
/* loaded from: classes6.dex */
public final class dpxh extends dsqw<dpxh, dpxg> implements dssk {
    public static final dpxh c;
    private static volatile dssr<dpxh> d;
    public int a;
    public int b;

    static {
        dpxh dpxhVar = new dpxh();
        c = dpxhVar;
        dsqw.cc(dpxh.class, dpxhVar);
    }

    private dpxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpxi.a});
            }
            if (i2 == 3) {
                return new dpxh();
            }
            if (i2 == 4) {
                return new dpxg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpxh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpxh.class) {
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
