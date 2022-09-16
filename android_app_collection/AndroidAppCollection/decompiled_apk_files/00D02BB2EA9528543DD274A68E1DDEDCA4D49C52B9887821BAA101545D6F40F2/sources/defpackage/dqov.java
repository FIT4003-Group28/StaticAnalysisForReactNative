package defpackage;
/* compiled from: PG */
/* renamed from: dqov  reason: default package */
/* loaded from: classes.dex */
public final class dqov extends dsqw<dqov, dqou> implements dssk {
    public static final dqov g;
    private static volatile dssr<dqov> h;
    public int a;
    public dpum b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        dqov dqovVar = new dqov();
        g = dqovVar;
        dsqw.cc(dqov.class, dqovVar);
    }

    private dqov() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dqov();
            }
            if (i2 == 4) {
                return new dqou();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqov> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqov.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
