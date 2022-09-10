package defpackage;
/* compiled from: PG */
/* renamed from: dngs  reason: default package */
/* loaded from: classes6.dex */
public final class dngs extends dsqw<dngs, dngr> implements dssk {
    public static final dngs h;
    private static volatile dssr<dngs> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        dngs dngsVar = new dngs();
        h = dngsVar;
        dsqw.cc(dngs.class, dngsVar);
    }

    private dngs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dngs();
            }
            if (i3 == 4) {
                return new dngr();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dngs> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dngs.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
