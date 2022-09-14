package defpackage;
/* compiled from: PG */
/* renamed from: dqei  reason: default package */
/* loaded from: classes6.dex */
public final class dqei extends dsqw<dqei, dqeh> implements dssk {
    public static final dqei e;
    private static volatile dssr<dqei> f;
    public int a;
    public int b;
    public int c;
    public float d;

    static {
        dqei dqeiVar = new dqei();
        e = dqeiVar;
        dsqw.cc(dqei.class, dqeiVar);
    }

    private dqei() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqei();
            }
            if (i2 == 4) {
                return new dqeh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqei> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqei.class) {
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
