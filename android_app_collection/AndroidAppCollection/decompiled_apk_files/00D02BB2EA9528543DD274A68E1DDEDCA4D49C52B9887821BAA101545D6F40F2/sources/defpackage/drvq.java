package defpackage;
/* compiled from: PG */
/* renamed from: drvq  reason: default package */
/* loaded from: classes6.dex */
public final class drvq extends dsqw<drvq, drvp> implements dssk {
    public static final drvq f;
    private static volatile dssr<drvq> g;
    public int a;
    public int b;
    public int c;
    public float d = -1.0f;
    public float e;

    static {
        drvq drvqVar = new drvq();
        f = drvqVar;
        dsqw.cc(drvq.class, drvqVar);
    }

    private drvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", drvs.c(), "c", drvs.c(), "d", "e"});
            }
            if (i2 == 3) {
                return new drvq();
            }
            if (i2 == 4) {
                return new drvp();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drvq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drvq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
