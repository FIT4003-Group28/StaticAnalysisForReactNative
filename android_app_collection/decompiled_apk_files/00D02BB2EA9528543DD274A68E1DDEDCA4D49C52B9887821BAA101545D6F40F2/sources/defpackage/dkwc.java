package defpackage;
/* compiled from: PG */
/* renamed from: dkwc  reason: default package */
/* loaded from: classes.dex */
public final class dkwc extends dsqw<dkwc, dkwb> implements dssk {
    public static final dkwc f;
    private static volatile dssr<dkwc> g;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;

    static {
        dkwc dkwcVar = new dkwc();
        f = dkwcVar;
        dsqw.cc(dkwc.class, dkwcVar);
    }

    private dkwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkwc();
            }
            if (i2 == 4) {
                return new dkwb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkwc.class) {
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
