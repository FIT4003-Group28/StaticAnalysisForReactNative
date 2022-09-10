package defpackage;
/* compiled from: PG */
/* renamed from: dqyn  reason: default package */
/* loaded from: classes6.dex */
public final class dqyn extends dsqw<dqyn, dqyk> implements dssk {
    public static final dqyn c;
    private static volatile dssr<dqyn> d;
    public int a;
    public int b;

    static {
        dqyn dqynVar = new dqyn();
        c = dqynVar;
        dsqw.cc(dqyn.class, dqynVar);
    }

    private dqyn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqym.c()});
            }
            if (i2 == 3) {
                return new dqyn();
            }
            if (i2 == 4) {
                return new dqyk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqyn.class) {
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
