package defpackage;
/* compiled from: PG */
/* renamed from: bjfz  reason: default package */
/* loaded from: classes3.dex */
public final class bjfz extends dsqw<bjfz, bjfy> implements dssk {
    public static final bjfz e;
    private static volatile dssr<bjfz> g;
    public boolean a;
    public boolean b;
    public int c;
    public boolean d;
    private int f;

    static {
        bjfz bjfzVar = new bjfz();
        e = bjfzVar;
        dsqw.cc(bjfz.class, bjfzVar);
    }

    private bjfz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"f", "a", "b", "c", dqcj.c(), "d"});
            }
            if (i2 == 3) {
                return new bjfz();
            }
            if (i2 == 4) {
                return new bjfy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjfz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bjfz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
