package defpackage;
/* compiled from: PG */
/* renamed from: eaze  reason: default package */
/* loaded from: classes6.dex */
public final class eaze extends dsqw<eaze, eazd> implements dssk {
    public static final eaze g;
    private static volatile dssr<eaze> h;
    public int a;
    public int b;
    public eazl c;
    public eayz d;
    public eazi e;
    public eazc f;

    static {
        eaze eazeVar = new eaze();
        g = eazeVar;
        dsqw.cc(eaze.class, eazeVar);
    }

    private eaze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0005", new Object[]{"a", "b", eazg.a, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new eaze();
            }
            if (i2 == 4) {
                return new eazd();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaze> dssrVar = h;
            if (dssrVar == null) {
                synchronized (eaze.class) {
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
