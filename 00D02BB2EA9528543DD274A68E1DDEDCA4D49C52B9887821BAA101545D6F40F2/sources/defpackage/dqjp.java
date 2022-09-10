package defpackage;
/* compiled from: PG */
/* renamed from: dqjp  reason: default package */
/* loaded from: classes6.dex */
public final class dqjp extends dsqw<dqjp, dqjo> implements dssk {
    public static final dqjp c;
    private static volatile dssr<dqjp> d;
    public int a;
    public dprk b;

    static {
        dqjp dqjpVar = new dqjp();
        c = dqjpVar;
        dsqw.cc(dqjp.class, dqjpVar);
    }

    private dqjp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqjp();
            }
            if (i2 == 4) {
                return new dqjo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqjp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqjp.class) {
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
