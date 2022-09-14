package defpackage;
/* compiled from: PG */
/* renamed from: dqlu  reason: default package */
/* loaded from: classes6.dex */
public final class dqlu extends dsqw<dqlu, dqlp> implements dssk {
    public static final dqlu c;
    private static volatile dssr<dqlu> d;
    public int a = 0;
    public Object b;

    static {
        dqlu dqluVar = new dqlu();
        c = dqluVar;
        dsqw.cc(dqlu.class, dqluVar);
    }

    private dqlu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", dqlr.class, dqlr.class, dqlt.class});
            }
            if (i2 == 3) {
                return new dqlu();
            }
            if (i2 == 4) {
                return new dqlp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqlu.class) {
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
