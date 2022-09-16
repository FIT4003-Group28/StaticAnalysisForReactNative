package defpackage;
/* compiled from: PG */
/* renamed from: dqot  reason: default package */
/* loaded from: classes.dex */
public final class dqot extends dsqw<dqot, dqos> implements dssk {
    public static final dqot c;
    private static volatile dssr<dqot> e;
    public dsrj<dqop> a = dssu.b;
    public int b;
    private int d;

    static {
        dqot dqotVar = new dqot();
        c = dqotVar;
        dsqw.cc(dqot.class, dqotVar);
    }

    private dqot() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဏ\u0000", new Object[]{"d", "a", dqop.class, "b"});
            }
            if (i2 == 3) {
                return new dqot();
            }
            if (i2 == 4) {
                return new dqos();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqot> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqot.class) {
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
