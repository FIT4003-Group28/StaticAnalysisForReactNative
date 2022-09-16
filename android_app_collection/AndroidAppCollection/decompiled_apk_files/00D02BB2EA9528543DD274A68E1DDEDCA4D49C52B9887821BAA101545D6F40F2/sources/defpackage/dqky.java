package defpackage;
/* compiled from: PG */
/* renamed from: dqky  reason: default package */
/* loaded from: classes6.dex */
public final class dqky extends dsqw<dqky, dqkx> implements dssk {
    public static final dqky c;
    private static volatile dssr<dqky> d;
    public int a;
    public int b;

    static {
        dqky dqkyVar = new dqky();
        c = dqkyVar;
        dsqw.cc(dqky.class, dqkyVar);
    }

    private dqky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqky();
            }
            if (i2 == 4) {
                return new dqkx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqky> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqky.class) {
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
